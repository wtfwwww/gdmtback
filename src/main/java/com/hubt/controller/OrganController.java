package com.hubt.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.hubt.model.Organ;
import com.hubt.model.PageBean;
import com.hubt.service.OrganService;

@Controller
@RequestMapping("/org")
public class OrganController {
	@Autowired
	OrganService orgservice;
	/*
	public Map<String, Object> getOrgs(Integer pageSize, Integer pageNumber){
		PageBean pageBean = new PageBean();
        pageBean.setPageSize(pageSize);
        pageBean.setPageNumber(pageNumber);
        pageBean.setOffset((pageNumber - 1) * pageSize);
		return orgservice.getOrgs(pageBean);
		
	}
	*/
	
	@RequestMapping("/getOrgs")
	@ResponseBody
	public List<Organ> getOrgans() {
		return orgservice.findAll();
	}
	
	
	@RequestMapping("/getOrg")
	@ResponseBody
	public Organ getOrgan(@RequestParam(required = false) String organUuid) {
		return this.orgservice.getOrgan(organUuid);
		
	}
	@RequestMapping("/update")
	@ResponseBody
	public boolean update(Organ organ) throws ParseException {
		
		return this.orgservice.update(organ);
		
		
	}
	
	
	@RequestMapping(value="/remove")
	@ResponseBody
	public boolean remove(@RequestParam(required = false) String id) {
		return orgservice.remove(id);
		
	}
	
	@RequestMapping("/getOrgsByParentId")
	@ResponseBody
	public Left findtOrgsByParentUuid(@RequestParam String parentUuid) {
		List<Left> orgs = orgservice.findOrgsByParentUuid(parentUuid);
		
		return new Left("-1","国电集团",null,true,orgs);
		
	}
	
	
	@RequestMapping(value="/insert" , method=RequestMethod.POST)
	@ResponseBody
	public boolean insert(Organ org) throws ParseException {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		org.setOrganUuid(uuid);
		Date now = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		org.setModtime(df.parse(df.format(new Date())));
		return this.orgservice.insert(org);
	}
}
