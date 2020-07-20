package com.hubt.service;

import java.util.List;
import java.util.Map;

import com.hubt.model.Left;
import com.hubt.model.Organ;
import com.hubt.model.PageBean;

public interface OrganService {

	//Map<String, Object> getOrgs(PageBean pageBean);

	List<Organ> findAll();

	List<Left> findOrgsByParentUuid(String parentUuid);

	boolean insert(Organ org);

	Organ getOrgan(String organUuid);

	boolean update(Organ organ);

	boolean remove(String id);

}
