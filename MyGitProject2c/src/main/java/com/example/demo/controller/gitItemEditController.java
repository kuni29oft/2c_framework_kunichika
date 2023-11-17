package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemEditController {
	@RequestMapping(path = "/xxx", method = RequestMethod.GET)
	public String doEditGet() {
		return "gitlogin";
	}
	@RequestMapping(path = "/xxxx", method = RequestMethod.POST)
	public String doEditPost(String login,String pw) {
		if(login.equals("gitlogin")&& pw.equals("gitpw")) {
			return "gititemlist";
		}else {
		return "gitlogin";
	}
	}

}
