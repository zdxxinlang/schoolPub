package com.yunuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageRedirectController {

	@RequestMapping("/")
	public String showIndex(){
		return "index";	
	}
	
	@RequestMapping("/showMomentsPage")
	public String showMomentsPage(){
		return "moments";	
	}
	
	@RequestMapping("/showAddMomentPage")
	public String showAddMomentPage(){
		return "add_moment";	
	}
}
