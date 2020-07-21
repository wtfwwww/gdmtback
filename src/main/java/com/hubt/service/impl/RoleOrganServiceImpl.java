package com.hubt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hubt.mapper.RoleOrganMapper;
import com.hubt.model.Duty;
import com.hubt.model.Organ;
import com.hubt.model.Role;
import com.hubt.model.RoleOrgan;
import com.hubt.service.RoleOrganService;
import com.hubt.vo.RoleOrganVo;

@Service
public class RoleOrganServiceImpl implements RoleOrganService {

	@Autowired
	private RoleOrganMapper rrogmapper;

	@Override
	public List<RoleOrganVo> findAll() {
		// TODO Auto-generated method stub

		List<RoleOrganVo> lists = rrogmapper.findAll();
		/*
		 * for(RoleOrganVo rgvo :lists) {
		 * 
		 * Organ organ = rrogmapper.findOrganNameByUuid(rgvo.getOrgan_name());
		 * rgvo.setOrgan(organ); Role role =
		 * rrogmapper.findRoleNameByUuid(rgvo.getRole_uuid()); rgvo.setRole(role); }
		 */

		return lists;
	}
	/*
	 * @Override public void insert(Duty duty) { // TODO Auto-generated method stub
	 * System.out.println(duty); RoleOrgan rog = new RoleOrgan(); Organ
	 * o1=rrogmapper.findOrganUuid(duty.getOrganName()); Role
	 * o2=rrogmapper.findRoleUuid(duty.getRoleName());
	 * rog.setOrganUuid(o1.getOrganUuid()); rog.setRoleUuid(o2.getRoleUuid());
	 * 
	 * rrogmapper.insert(rog);
	 * 
	 * }
	 */

	@Override
	public boolean remove(String id) {
		// TODO Auto-generated method stub
		return rrogmapper.deleteByPrimaryKey(id);
	}

	@Override
	public boolean insert(Duty duty) {
		// TODO Auto-generated method stub
		return rrogmapper.insertDuty(duty);
	}

	@Override
	public RoleOrgan getDuty(String dutyid) {
		// TODO Auto-generated method stub
		return rrogmapper.selectByPrimaryKey(dutyid);
	}

	@Override
	public boolean update(Duty record) {
		// TODO Auto-generated method stub
		return rrogmapper.updateByPrimaryKey(record);
	}

	/*
	 * 插入岗位
	 * 
	 * @Override public void insert(Duty duty) { // TODO Auto-generated method stub
	 * rrogmapper.insertRO(duty); }
	 */

}
