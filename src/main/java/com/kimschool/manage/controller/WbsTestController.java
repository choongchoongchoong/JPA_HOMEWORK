package com.kimschool.manage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Wbs_UserInfo;
import com.kimschool.manage.entity.WorkPlaceInfo;
import com.kimschool.manage.service.WbsTestService;

@Controller
public class WbsTestController {

	@Autowired
	WbsTestService service;

	private static final Logger logger = LoggerFactory.getLogger(WbsTestController.class);

	@RequestMapping("/movefindwbs")
	public String movefindwbs() {

		logger.info("회원정보관리 화면 이동처리");

		return "findwbs";
	}

	@RequestMapping("/findwbs")
	public ModelAndView webtest(String u_no) {

		ModelAndView mv = new ModelAndView();

		List<Wbs_UserInfo> wbsUserInfo = service.resultWbsUserInfo(u_no);
		List<Wbs_2020> wbsYear = service.resultWbsYear(u_no);
		List<WorkPlaceInfo> workPlaceInfo = service.resultWorkPlaceInfo(u_no);

		if (wbsUserInfo.size() == 0) {
			mv.setViewName("redirect:/");
			mv.addObject("msg", "내용을 확인해주세요");
		} else {
			mv.setViewName("wbs_test");
			mv.addObject("wbsUserInfo", wbsUserInfo);
			mv.addObject("wbsYear", wbsYear);
			mv.addObject("workPlaceInfo", workPlaceInfo);
		}

		return mv;
	}

}
