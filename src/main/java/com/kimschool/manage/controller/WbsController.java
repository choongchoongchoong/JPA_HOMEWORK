package com.kimschool.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.WbsService;

@Controller
public class WbsController {

	@Autowired
	WbsService wbsservice;

	@RequestMapping("/")
	public ModelAndView init() {

		ModelAndView mv = new ModelAndView("wbs");

		return mv;
	}

	@RequestMapping("/wbsLogincheck")
	public ModelAndView wbsLogincheck(String u_no, String u_password) {

//		ModelAndView mv = new ModelAndView(); // 괄호 안 = 뷰 목표지

		ModelAndView mv = wbsservice.wbslogincheck(u_no, u_password);

		return mv;
	}

	@RequestMapping("/getWbsInfo")
	public ModelAndView wbsVoCheck(String u_no, String u_password) {

		ModelAndView mv = wbsservice.wbsVoCheck(u_no, u_password);

		return mv;
	}

}
