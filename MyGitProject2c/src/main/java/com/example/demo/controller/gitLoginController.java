package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitLoginController {
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String doLoginGet() {
		return "gitlogin";
	}
	@RequestMapping(path = "/mylogin", method = RequestMethod.POST)
	public String doLoginPost(String login,String pw) {
		if(login.equals("gitlogin")&&pw.equals("gitpw")) {
			return "gititemlist";
		}else {
		return "gitlogin";
	}
	}
	


	

}
