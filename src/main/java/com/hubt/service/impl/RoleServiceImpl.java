package com.hubt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.hubt.mapper.RoleMapper;
import com.hubt.model.Role;
import com.hubt.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper rmapper;

	public List<Role> findAll() {
		List<Role> allrole = rmapper.findAll();
		
		return allrole;
	}

	

	@Override
	public boolean updateByPrimaryKey(Role record) {
		// TODO Auto-generated method stub
		return rmapper.updateByPrimaryKey(record);
	}

	@Override
	public boolean deleteByPrimaryKey(String roleUuid) {
		// TODO Auto-generated method stub
		return rmapper.deleteByPrimaryKey(roleUuid);
	}

	@Override
	public Role selectByPrimaryKey(String roleUuid) {
		// TODO Auto-generated method stub
		return rmapper.selectByPrimaryKey(roleUuid);
	}

	@Override
	public boolean saveRole(Role record) {
		// TODO Auto-generated method stub
		return rmapper.insert(record);
	}



	@Override
	public void insert(Role record) {
		// TODO Auto-generated method stub
		rmapper.insert(record);
	}



	@Override
	public Role getRole(String roleUuid) {
		// TODO Auto-generated method stub
		return rmapper.selectByPrimaryKey(roleUuid);
	}



	@Override
	public boolean updateRole(Role record) {
		// TODO Auto-generated method stub
		return rmapper.updateByPrimaryKey(record);
	}



	@Override
	public boolean removeRole(String id) {
		// TODO Auto-generated method stub
		return rmapper.deleteByPrimaryKey(id);
	}



	@Override
	public int linkResource(String roleId, String resources) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List<String> getResources(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
