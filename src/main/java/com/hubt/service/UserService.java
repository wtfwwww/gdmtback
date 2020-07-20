package com.hubt.service;

import java.util.List;

import com.hubt.model.User;
import com.hubt.vo.UserVo;

public interface UserService {
	boolean saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(String id);

    User findUserById(String id);

    List<User> findAll();
    
    List<UserVo> getUsers();

	User getUser(String userUuid);

	boolean update(User user);

}
