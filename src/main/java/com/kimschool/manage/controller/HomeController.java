package com.kimschool.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.LoginService;

@Controller
public class HomeController {

	// LoginService 가져오기
	@Autowired
	LoginService loginservice;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// home.jsp 화면으로
	@RequestMapping (value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		ModelAndView mv = new ModelAndView("home");

		logger.debug("초기처리");

		return mv;
	}

	@RequestMapping (value = "/logincheck")
	public ModelAndView logincheck(String id, String password) {

		logger.debug("로그인체크 처리를 시작합니다.");

		ModelAndView mv = new ModelAndView("result");

		// LoginServiceImpl한테 받은 count값을 result.jsp에 리턴
		int count = loginservice.checkLogin(id, password);

		mv.addObject("count", count);

		return mv;

	}

}
