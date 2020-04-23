package com.kimschool.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.FindPasswordService;

@Controller
public class FindPasswordController {

	@Autowired
	FindPasswordService service;

	private static final Logger logger = LoggerFactory.getLogger(FindPasswordController.class);

	@RequestMapping("/movefindpassword")
	public String movefindpassword() {

		logger.info("비밀번호 찾기 화면 이동처리");

		return "findpassword";
	}

	@RequestMapping("/findpassword")
	public ModelAndView findpassword(String id, String email1, String email2) {

		// 회원정보 있으면 findpassresult.jsp로 이동
		// 회원정보 없으면 findpassword.jsp로 redirect -> 내용을 확인해주세요
		ModelAndView mv = new ModelAndView();

		String result = service.findPasswordInfo(id, email1, email2);

		if (result == "") {
			mv.setViewName("redirect:/movefindpassword");
			mv.addObject("msg", "내용을 확인해주세요");
		} else {
			mv.setViewName("findpassresult");
			mv.addObject("result", result);
		}

		return mv;
	}


}
