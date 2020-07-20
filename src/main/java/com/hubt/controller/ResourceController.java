package com.hubt.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubt.model.Left;
import com.hubt.model.PageBean;
import com.hubt.model.ParentResource;
import com.hubt.model.Resource;
import com.hubt.service.ResourceService;
import com.hubt.vo.ResourceVo;
import com.mysql.cj.util.StringUtils;

@Controller
@RequestMapping("/res")
public class ResourceController {

	@Autowired
	ResourceService resService;
	
	
	@RequestMapping("/getResources")
	@ResponseBody
	public List<ResourceVo> getResourses(){
		
		List<ResourceVo> lists = resService.findAll();
		
		return lists;
	}
	/*
	@RequestMapping("/getResources")
	@ResponseBody
	public Map<String, Object> getResources(Integer pageSize, Integer pageNumber){
		 PageBean pageBean = new PageBean();
	        pageBean.setPageSize(pageSize);
	        pageBean.setPageNumber(pageNumber);
	        pageBean.setOffset((pageNumber - 1) * pageSize);

	        return resService.getResources(pageBean);

		
	}*/
	//
	//获取资源树
	
	@RequestMapping("/getResourcesByParentId")
	@ResponseBody
	public Left getResourcesByParentId(@RequestParam String parent_id) {
		List<Left> res = this.resService.getResourcesByParentId(parent_id);
		return new Left("root","Root",null,true,res);
		
	}
	
	@RequestMapping(value="/insert" , method=RequestMethod.POST)
	@ResponseBody
	public boolean insert(ParentResource record ) {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		record.setMenuId(uuid);
		return resService.insert(record);
		
	}
	
	@RequestMapping("/getResource")
	@ResponseBody
	public ResourceVo getResource(@RequestParam(required = false) String menuId) {
		return this.resService.getResource(menuId);
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public boolean update(ResourceVo record) {
		return this.resService.update(record);
		
	}
	
	@RequestMapping(value="/remove")
	@ResponseBody
	public boolean remove(@RequestParam(required = false) String id) {
		return resService.remove(id);
		
	}
	
	/*public ParentResource getResourcesByParentId(String parentId) {
		if (StringUtils.isNullOrEmpty(parentId)) {
            parentId = "root";
        }
		
		return this.resService.getResourcesByParentId(parentId);
		
	}*/
	
}
