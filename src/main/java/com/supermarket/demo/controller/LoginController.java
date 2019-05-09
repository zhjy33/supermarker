package com.supermarket.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.model.admin.UserHolder;
import com.supermarket.demo.service.login.LoginService;
import com.supermarket.demo.util.Contants;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	

	@RequestMapping("/login")
	public String login(Admin admin,ModelMap model,HttpServletRequest request) {
		Admin login = loginService.login(admin);
		if(login == null) {
			model.put("error", "用户名或密码不正确");
			return "login";
		}
		HttpSession session = request.getSession();
		session.setAttribute(Contants.SESSION_LOGIN, login);
		return "index";
	}
	
	@RequestMapping("/tologin")
	public String tologin(Admin admin,ModelMap model,HttpServletRequest request) {
		return "login";
	}
	
	
	@RequestMapping("welcome")
	public String welcome(ModelMap model) {
		model.addAttribute("userName", UserHolder.getUser().getName());
		return "welcome";
	}
	
	@RequestMapping("/logout")
	public String login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute(Contants.SESSION_LOGIN);
		return "login";
	}
}
