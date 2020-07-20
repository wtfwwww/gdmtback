package com.hubt.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hubt.model.Role;
import com.hubt.service.RoleService;
import com.hubt.service.impl.RoleServiceImpl;

public class roleServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException {
		RoleService rserviceImpl =new RoleServiceImpl();
		
		//rserviceImpl.insert();
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException {
		doGet(req,resp);
	}

}
