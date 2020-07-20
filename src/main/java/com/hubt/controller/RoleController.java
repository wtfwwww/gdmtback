package com.hubt.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubt.model.Role;
import com.hubt.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	RoleService rservice;

	/*
	 * //查询所有role
	 * 
	 * @RequestMapping("roles") public String getRole(Model model) { List<role> all
	 * = rservice.findAll(); model.addAttribute("role", all); return "pages/list"; }
	 */
	@RequestMapping("/getRoles")
	@ResponseBody
	public List<Role> getRoles() {
		return this.rservice.findAll();

	}

	@RequestMapping(value = "/getRole")
	@ResponseBody
	public Role getRole(@RequestParam(required = false) String roleUuid) {
		return this.rservice.getRole(roleUuid);
	}

	// 新增岗位列表

	@RequestMapping(value = "/getRoles2")
	@ResponseBody
	public List<Role> getRoles2() {

		return this.rservice.findAll();

	}

	@RequestMapping(value = "/update")
	public boolean updateRole(@ModelAttribute Role record) {
		return this.rservice.updateRole(record);

	}

	@RequestMapping(value = "/remove")
	@ResponseBody
	public boolean removeRole(@RequestParam(required = false) String id) {
		return this.rservice.removeRole(id);

	}

	@RequestMapping(value = "/linkResource")
	@ResponseBody
	public int linResource(@RequestParam String roleId, @RequestParam String resources) {
		return this.rservice.linkResource(roleId, resources);

	}

	@RequestMapping(value = "/getResources")
	@ResponseBody
	public List<String> getResources(String roleId) {
		return this.rservice.getResources(roleId);

	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public boolean saveRoles(Role record) {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		record.setRoleUuid(uuid);
		return rservice.saveRole(record);
	}
}
