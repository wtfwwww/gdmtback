package com.hubt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hubt.model.Organ;
import com.hubt.model.User;
import com.hubt.vo.UserVo;

public interface UserMapper {

	boolean deleteByPrimaryKey(String userUuid);

	boolean insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String userUuid);

	int updateByPrimaryKeySelective(User record);

	boolean updateByPrimaryKey(User record);

	List<User> findAll();
	
	List<UserVo> getUsers();
	
	UserVo findOrgan(String organ_name);
	
	int insertUser(UserVo user);

}
