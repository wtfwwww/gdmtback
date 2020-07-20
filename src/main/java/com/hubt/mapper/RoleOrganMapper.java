package com.hubt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hubt.model.Duty;
import com.hubt.model.Organ;
import com.hubt.model.Role;
import com.hubt.model.RoleOrgan;
import com.hubt.model.RoleOrganExample;
import com.hubt.vo.RoleOrganVo;

public interface RoleOrganMapper {
	long countByExample(RoleOrganExample example);

	int deleteByExample(RoleOrganExample example);

	//
	boolean deleteByPrimaryKey(String dutyid);

	RoleOrgan insert(RoleOrgan record);

	int insertSelective(RoleOrgan record);

	List<RoleOrganVo> selectByExample(RoleOrganExample example);

	//
	RoleOrgan selectByPrimaryKey(String dutyid);

	int updateByPrimaryKeySelective(RoleOrgan record);

	//
	boolean updateByPrimaryKey(RoleOrgan record);

	List<RoleOrganVo> findAll();

	Organ findOrganNameByUuid(String organUuid);

	Role findRoleNameByUuid(String roleUuid);

	// 通过Organ_name找Organ
	Organ findOrganUuid(String organName);

	// 通过Role_name找Role
	Role findRoleUuid(String roleName);

	boolean insertDuty(Duty record);

	Duty insertRO(Duty record);
}