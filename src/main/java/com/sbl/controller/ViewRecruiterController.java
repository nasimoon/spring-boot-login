package com.sbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewRecruiterController {
    @RequestMapping("/recruiter.htm")
	public String showRecruiterConsole(Model model) {
    	
		return "recruiter";
		
	}
}
