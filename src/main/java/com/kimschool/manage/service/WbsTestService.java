package com.kimschool.manage.service;

import java.util.List;

import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Wbs_UserInfo;
import com.kimschool.manage.entity.WorkPlaceInfo;

public interface WbsTestService {

	public List<Wbs_UserInfo> resultWbsUserInfo(String u_no);
	public List<Wbs_2020> resultWbsYear(String u_no);
	public List<WorkPlaceInfo> resultWorkPlaceInfo(String u_no);

}
