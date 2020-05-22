package com.kimschool.manage.service;

import org.springframework.web.servlet.ModelAndView;

public interface WbsService {

	public ModelAndView wbslogincheck(String u_no, String u_password);
	public ModelAndView wbsVoCheck(String u_no, String u_password);

}
