package com.kimschool.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.WbsTestDao;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Wbs_UserInfo;
import com.kimschool.manage.entity.WorkPlaceInfo;

@Service
public class WbsTestServiceImpl implements WbsTestService {

	@Autowired
	WbsTestDao dao;

	@Override
	public List<Wbs_UserInfo> resultWbsUserInfo(String u_no) {

		Wbs_UserInfo wbs_userinfo = new Wbs_UserInfo();
		wbs_userinfo.setU_no(u_no);

		return dao.findWbsUserInfo(u_no);

	}

	public List<Wbs_2020> resultWbsYear(String u_no) {

		Wbs_2020 wbs_2020 = new Wbs_2020();
		wbs_2020.setU_no(u_no);

		return dao.findWbsYear(u_no);

	}

	public List<WorkPlaceInfo> resultWorkPlaceInfo(String u_no) {

		WorkPlaceInfo workplaceinfo = new WorkPlaceInfo();
		workplaceinfo.setU_no(u_no);

		return dao.findWorkPlaceInfo(u_no);

	}
//	public List findWbsUserInfo(String u_no) {
//
//		Wbs_UserInfo wbs_userinfo = new Wbs_UserInfo();
//		wbs_userinfo.setU_no(u_no);
//
//		List<Wbs_UserInfo> result = WbsTestDao.findWbsUserInfo();
//
//		return result;
//	}
//
//	@Override
//	public List findWbsYear(String u_no) {
//
//		Wbs_UserInfo wbs_userinfo = new Wbs_UserInfo();
//		wbs_userinfo.setU_no(u_no);
//
//		List<Wbs_UserInfo> result = WbsTestDao.findWbsYear(u_no);
//
//		return result;
//	}
//
//	@Override
//	public List findWorkPlaceInfo(String u_no) {
//
//		Wbs_UserInfo wbs_userinfo = new Wbs_UserInfo();
//		wbs_userinfo.setU_no(u_no);
//
//		List<Wbs_UserInfo> result = WbsTestDao.findWorkPlaceInfo(u_no);
//
//		return result;
//	}

}
