package com.hubt.service;

import java.util.List;
import java.util.Map;

import com.hubt.model.Left;
import com.hubt.model.PageBean;
import com.hubt.model.ParentResource;
import com.hubt.model.Resource;
import com.hubt.vo.ResourceVo;

public interface ResourceService {
	int deleteByPrimaryKey(String menuId);

	boolean insert(ParentResource record);

	int insertSelective(ParentResource record);

	ParentResource selectByPrimaryKey(String menuId);

	boolean updateByPrimaryKeySelective(ParentResource record);

	boolean updateByPrimaryKey(ParentResource record);
	
	List<ResourceVo> findAll();

	Map<String, Object> getResources(PageBean pageBean);

	//ParentResource getResourcesByParentId(String parentId);

	List<Left> getResourcesByParentId(String parent_id);

	ResourceVo getResource(String menuId);

	boolean update(ResourceVo record);

	boolean remove(String id);

	

}
