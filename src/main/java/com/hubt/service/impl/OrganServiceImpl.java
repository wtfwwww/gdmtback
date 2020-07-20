package com.hubt.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hubt.mapper.OrganMapper;
import com.hubt.model.Left;
import com.hubt.model.Organ;
import com.hubt.model.PageBean;
import com.hubt.service.OrganService;

@Service
public class OrganServiceImpl implements OrganService {

//	@Override
//	public Map<String, Object> getOrgs(PageBean pageBean) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Autowired
	private OrganMapper orgmapper;

	@Override
	public List<Organ> findAll() {
		// TODO Auto-generated method stub
		List<Organ> list = orgmapper.selectByExample(null);
		for (Organ organ : list) {
			Organ parent = orgmapper.findParent(organ.getParentUuid());
			organ.setParent(parent);
			List<Organ> children = orgmapper.findChildren(organ.getOrganUuid());
			organ.setChildren(children);

		}
		return list;
	}

	@Override
	public List<Left> findOrgsByParentUuid(String parentUuid) {
		// TODO Auto-generated method stub
		List<Organ> list = orgmapper.getOrgsByParentId(parentUuid);
		List<Left> lefts = new ArrayList<Left>();
		for (Organ org : list) {
			List<Organ> children = orgmapper.getOrgsByParentId(org.getOrganUuid());
			Left left = new Left();
			left.setId(org.getOrganUuid());
			left.setName(org.getOrganName());
			left.setPid(org.getParentUuid());
			if (children.size() != 0) {
				left.setHasChildren(true);
				List<Left> puid = findOrgsByParentUuid(org.getOrganUuid());
				left.setChildren(puid);
			} else {
				left.setHasChildren(false);
				left.setChildren(null);
			}
			lefts.add(left);
		}
		System.out.println(lefts);
		return lefts;
	}

	@Override
	public boolean insert(Organ org) {
		// TODO Auto-generated method stub
		return orgmapper.insert(org);
	}

	@Override
	public Organ getOrgan(String organUuid) {
		// TODO Auto-generated method stub
		return orgmapper.selectByPrimaryKey(organUuid);
	}

	@Override
	public boolean update(Organ organ) {
		// TODO Auto-generated method stub
		return orgmapper.updateByPrimaryKey(organ);
	}

	@Override
	public boolean remove(String id) {
		// TODO Auto-generated method stub
		return orgmapper.deleteByPrimaryKey(id);
	}

}
