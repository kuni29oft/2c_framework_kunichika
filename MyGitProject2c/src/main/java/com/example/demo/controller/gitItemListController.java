package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.model.Model;

@Controller
public class gitItemListController {
	
	@RequestMapping(path = "/gititemlist", method = RequestMethod.GET)
	public String itiran(Model model) {
		return "gititemlist";
	}
	
	@RequestMapping(path = "/gititemlist", method = RequestMethod.POST)
	public String itiran2(Model model) {
		return "gititemlist";
	}

}
