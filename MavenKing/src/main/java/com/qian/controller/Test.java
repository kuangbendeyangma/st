package com.qian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class Test {

	@RequestMapping("/index")
	public String test(){
		return "qian_index";
	}
	
	@RequestMapping("/index1")
	public String test1(){
		return "hou_index";
	}
	@RequestMapping("/index2")
	public String test2(){
		return "account_number";
	}
	
}
