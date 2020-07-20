package com.hubt.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hubt.mapper.ResourceMapper;
import com.hubt.model.Left;
import com.hubt.model.PageBean;
import com.hubt.model.ParentResource;
import com.hubt.model.Resource;
import com.hubt.service.ResourceService;
import com.hubt.vo.ResourceVo;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceMapper resmapper;

	public boolean insert(ParentResource record) {
		// TODO Auto-generated method stub
		return resmapper.insert(record);
	}

	public int insertSelective(ParentResource record) {
		// TODO Auto-generated method stub
		return resmapper.insertSelective(record);
	}

	public boolean updateByPrimaryKeySelective(ResourceVo record) {
		// TODO Auto-generated method stub
		return resmapper.updateByPrimaryKey(record);
	}

	public boolean updateByPrimaryKey(ResourceVo record) {
		// TODO Auto-generated method stub
		return resmapper.updateByPrimaryKey(record);
	}

	@Override
	public List<ResourceVo> findAll() {
		List<ResourceVo> allres = resmapper.getResources();
		for (ResourceVo revo : allres) {
			revo.setParent(resmapper.getParent(revo.getParent_id()));
		}
		return allres;
	}

	@Override
	public Map<String, Object> getResources(PageBean pageBean) {

		Map<String, Object> result = new HashMap<>(2);

		List<ResourceVo> list = resmapper.getResources();

		// System.out.println(list);
		// 遍历寻找父节点
		for (ResourceVo revo : list) {
			ResourceVo parent;
			if (revo.getParent_id().equals("root")) {
				parent = new ResourceVo();
				parent.setDir_name("root");
			} else {
				parent = resmapper.getParent(revo.getParent_id());
			}

			revo.setParent(parent);
		}
		Integer count = resmapper.total();

		result.put("total", count);
		result.put("rows", list);

		return result;
	}
	/*
	 * @Override public ParentResource getResourcesByParentId(String parentId) {
	 * 
	 * // 根节点 ParentResource root = new ParentResource(); root.setMenuId(parentId);
	 * root.setDirName(parentId); // TODO Auto-generated method stub
	 * 
	 * Stack<ParentResource> stack = new Stack<>(); stack.push(root);
	 * 
	 * while (!stack.empty()) {
	 * 
	 * ParentResource resourceMenuDirectory = stack.pop();
	 * 
	 * List<ParentResource> list =
	 * resmapper.getParentById(resourceMenuDirectory.getMenuId());
	 * resourceMenuDirectory.setChildren(list);
	 * 
	 * // 子目录入栈 for (int i = 0; i < list.size(); i++) { stack.push(list.get(i)); } }
	 * 
	 * return root; }
	 */

	@Override
	public List<Left> getResourcesByParentId(String parent_id) {
		// TODO Auto-generated method stub
		List<Resource> list = resmapper.getResByParentId(parent_id);

		List<Left> lefts = new ArrayList<Left>();

		for (Resource res : list) {
			List<Resource> children = resmapper.getResByParentId(res.getMenu_id());

			Left left = new Left();

			left.setId(res.getMenu_id());
			left.setName(res.getDir_name());
			left.setPid(res.getParent_id());
			if (children.size() != 0) {
				left.setHasChildren(true);
				List<Left> ch = getResourcesByParentId(res.getMenu_id());
				left.setChildren(ch);
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
	public ResourceVo getResource(String menuId) {
		// TODO Auto-generated method stub
		return this.resmapper.selectByPrimaryKey(menuId);
	}

	@Override
	public boolean update(ResourceVo record) {
		// TODO Auto-generated method stub
		return resmapper.updateByPrimaryKey(record);
	}

	@Override
	public boolean remove(String id) {
		// TODO Auto-generated method stub
		return resmapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteByPrimaryKey(String menuId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ParentResource selectByPrimaryKey(String menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateByPrimaryKeySelective(ParentResource record) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByPrimaryKey(ParentResource record) {
		// TODO Auto-generated method stub
		return false;
	}

}
