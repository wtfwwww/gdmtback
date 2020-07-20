package com.hubt.mapper;

import java.util.List;

import com.hubt.model.Role;



public interface RoleMapper {
	boolean insert(Role record);
	
	boolean updateByPrimaryKey(Role record);
	
	boolean deleteByPrimaryKey(String roleUuid);
	
	Role selectByPrimaryKey(String roleUuid);
	
	List<Role> findAll();
	
	
}
