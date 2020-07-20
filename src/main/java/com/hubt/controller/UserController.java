package com.hubt.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hubt.model.User;
import com.hubt.service.UserService;
import com.hubt.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService uservice;

	/*
	 * @RequestMapping("/getUsers")
	 * 
	 * @ResponseBody public List<User> findAll(){ return this.uservice.findAll();
	 * 
	 * }
	 */

	@RequestMapping("/getUsers")
	@ResponseBody
	public List<UserVo> findAll() {
		return this.uservice.getUsers();

	}

	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(@RequestParam(required = false) String userUuid) {
		return uservice.getUser(userUuid);

	}

	@RequestMapping("/update")
	@ResponseBody
	public boolean Update(@RequestParam(required = false) User user) {
		return uservice.update(user);

	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public boolean insert(User user) throws ParseException {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		user.setUserUuid(uuid);
		Date now = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		user.setModtime(df.parse(df.format(new Date())));
		return this.uservice.saveUser(user);
	}

	@RequestMapping("/remove")
	@ResponseBody
	public boolean remove(String id) {
		return uservice.deleteUser(id);

	}
}
