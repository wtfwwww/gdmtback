package com.hubt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hubt.model.ParentResource;
import com.hubt.model.Resource;
import com.hubt.vo.ResourceVo;

public interface ResourceMapper {

	boolean deleteByPrimaryKey(String menuId);

	boolean insert(ParentResource record);

	int insertSelective(ParentResource record);

	ResourceVo selectByPrimaryKey(String menuId);

	int updateByPrimaryKeySelective(ParentResource record);

	boolean updateByPrimaryKey(ResourceVo record);

	List<ParentResource> findAll();

	List<ResourceVo> getResources();

	// 根据父级资源id查询父级资源
	ResourceVo getParent(String parentId);

	// 根据父级资源id查询资源
	List<ParentResource> getParentById(String parentId);

	Integer total();

	List<Resource> getResByParentId(String parent_id);

}