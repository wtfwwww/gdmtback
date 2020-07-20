package com.hubt.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubt.model.Duty;
import com.hubt.model.RoleOrgan;
import com.hubt.service.RoleOrganService;
import com.hubt.vo.RoleOrganVo;

@Controller
@RequestMapping("/duty")
public class RoleOrganController {

	@Autowired
	RoleOrganService rrogservice;

	@RequestMapping("getDuties")
	@ResponseBody
	public List<RoleOrganVo> getDuties() {
		return rrogservice.findAll();
	}

	/*
	 * @RequestMapping(value="/insert")
	 * 
	 * @ResponseBody public void insert(Duty duty) { this.rrogservice.insert(duty);
	 * 
	 * }
	 */

	@RequestMapping("getDuty")
	@ResponseBody
	public RoleOrgan getDuty(@RequestParam(required = false) String dutyid) {
		return this.rrogservice.getDuty(dutyid);

	}

	@RequestMapping("/update")
	@ResponseBody
	public boolean update(RoleOrgan record) {
		return this.rrogservice.update(record);

	}

	@RequestMapping(value = "/insert")
	@ResponseBody
	public boolean insert(Duty duty) {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		duty.setDutyid(uuid);
		return this.rrogservice.insert(duty);

	}

	@RequestMapping(value = "/remove")
	public void remove(String id) {
		this.rrogservice.remove(id);

	}

}
