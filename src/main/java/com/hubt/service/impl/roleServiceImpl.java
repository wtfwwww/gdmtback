package com.hubt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hubt.mapper.roleMapper;
import com.hubt.model.role;
import com.hubt.service.roleService;

@Service
public class roleServiceImpl implements roleService {

	@Autowired
	private roleMapper rmapper;

	public List<role> findAll() {
		List<role> allrole = rmapper.findAll();
		return allrole;
	}

	@Override
	public void insert(role record) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updateByPrimaryKey(role record) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByPrimaryKey(String roleUuid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public role selectByPrimaryKey(String roleUuid) {
		// TODO Auto-generated method stub
		return null;
	}
}
