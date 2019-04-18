package com.acra.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AcraController {
	
	@GetMapping({"/","/home"})
	public ModelAndView landingPage() {
		ModelAndView m=new ModelAndView();
		m.setViewName("LandingPage.html");
		return m;
	}
	@GetMapping("/dashboard")
	public ModelAndView dashBoardPage() {
		ModelAndView m=new ModelAndView();
		m.setViewName("BizFileDashboardPage.html");
		return m;
	}
}
