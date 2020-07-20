package com.hubt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hubt.model.Organ;
import com.hubt.model.OrganExample;

public interface OrganMapper {

	boolean deleteByPrimaryKey(String organUuid);

	boolean insert(Organ record);

	int insertSelective(Organ record);

	//
	Organ selectByPrimaryKey(String organUuid);

	Organ updateByPrimaryKeySelective(Organ record);

	//
	boolean updateByPrimaryKey(Organ record);

	List<Organ> selectByExample(OrganExample example);

	Organ findParent(String parentUuid);

	List<Organ> findChildren(String organUuid);

	// 通过父组织id找组织
	List<Organ> getOrgsByParentId(String parentUuid);

}