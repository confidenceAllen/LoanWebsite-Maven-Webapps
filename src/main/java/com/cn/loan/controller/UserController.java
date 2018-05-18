package com.cn.loan.controller;

import javax.annotation.Resource;
import javax.json.Json;
import javax.servlet.http.HttpServletRequest;

import com.cn.loan.pojo.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cn.loan.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request, @RequestParam(value = "id",required = false)Integer id){
		User user = new User();
		if("".equals(id) || id==null){
			 user = userService.getUserById(1);
		}else {
			user = userService.getUserById(id);
		}
		request.setAttribute("user",user);
		return "showUser";
	}
	
}
