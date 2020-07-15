package com.hubt.service;

import java.util.List;

import com.hubt.model.role;




public interface roleService {
void insert(role record);
	
	boolean updateByPrimaryKey(role record);
	
	boolean deleteByPrimaryKey(String roleUuid);
	
	role selectByPrimaryKey(String roleUuid);
	
	List<role> findAll();
	
}
  