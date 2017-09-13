package com.qian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qian.service.LoginService;
import com.web.bean.Users;

@Controller
@RequestMapping("/Login")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("index")
	public String test1(){
		return "qian_index";
	}
	
	@RequestMapping("login")
	public String Login(Users users,Model model){
		List<Users> list=loginService.Login();
		for (Users u : list) {
			if (u.getUser_name().equals(users.getUser_name())||u.getUser_name()==users.getUser_name()) {
				model.addAttribute("list",list);
				return "qian_index";
			} else {
				model.addAttribute("LoginMsg","用户名或密码错误，请重新输入");
				return "login";
			}
		}
		
		return "";
	}
}
