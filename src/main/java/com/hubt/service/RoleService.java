package com.hubt.service;

import java.util.List;

import com.hubt.model.Role;




public interface RoleService {
void insert(Role record);
	
	boolean updateByPrimaryKey(Role record);
	
	boolean deleteByPrimaryKey(String roleUuid);
	
	Role selectByPrimaryKey(String roleUuid);
	
	List<Role> findAll();
	
	public boolean saveRole(Role record);
	
	Role getRole(String roleUuid);
	
	boolean updateRole(Role record);
	
	public boolean removeRole(String id);

	int linkResource(String roleId, String resources);

	List<String> getResources(String roleId);
	
}
  