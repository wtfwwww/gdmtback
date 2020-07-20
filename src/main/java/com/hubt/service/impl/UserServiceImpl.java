package com.hubt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hubt.mapper.UserMapper;
import com.hubt.model.Organ;
import com.hubt.model.User;
import com.hubt.service.UserService;
import com.hubt.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper umapper;

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public User findUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * @Override public List<User> findAll() { // TODO Auto-generated method stub
	 * 
	 * List<User> lists =umapper.findAll(); for(User user:lists) {
	 * 
	 * if(user.getOrganUuid()!=null) { Organ
	 * organ=umapper.findOrgan(user.getOrganUuid()); user.setOrgan(organ); } }
	 * return lists; }
	 */

	@Override
	public List<UserVo> getUsers() {
		// TODO Auto-generated method stub
		return this.umapper.getUsers();
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
/*
	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		//UserVo u1;
		//u1=umapper.findOrgan(user.getOrgan_name());
	   // user.setOrgan_uuid(umapper.findOrgan(user.getOrgan_name()).getOrgan_uuid());
		return umapper.insert(user);
	}
*/

	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return umapper.deleteByPrimaryKey(id);
	}


	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return umapper.insert(user);
	}


	@Override
	public User getUser(String userUuid) {
		// TODO Auto-generated method stub
		return umapper.selectByPrimaryKey(userUuid);
	}


	@Override
	public boolean update(User user) {
		return umapper.updateByPrimaryKey(user);
	}


	


	

}
