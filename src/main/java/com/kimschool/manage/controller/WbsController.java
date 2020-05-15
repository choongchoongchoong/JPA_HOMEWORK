package com.kimschool.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WbsController {

	@RequestMapping("/")
	public ModelAndView init() {

		ModelAndView mv = new ModelAndView("wbs");

		return mv;
	}

}
