package com.hubt.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hubt.model.role;
import com.hubt.service.roleService;


@Controller
@RequestMapping("/role")
public class roleController {
	@Autowired
	roleService rservice;

	
	//查询所有role
	@RequestMapping("roles")
	 public String getRole(Model model) {
		List<role> all = rservice.findAll();
		model.addAttribute("role", all);
		 return "role/roles";
	 }
	 
}
