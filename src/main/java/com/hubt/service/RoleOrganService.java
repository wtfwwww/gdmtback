package com.hubt.service;

import java.util.List;

import com.hubt.model.Duty;
import com.hubt.model.RoleOrgan;
import com.hubt.vo.RoleOrganVo;

public interface RoleOrganService {
	
	List<RoleOrganVo> findAll();

	boolean insert(Duty duty);
	
	//void insert (Duty duty);

	void remove(String id);

	RoleOrgan getDuty(String dutyid);

	boolean update(RoleOrgan record);

	

}
