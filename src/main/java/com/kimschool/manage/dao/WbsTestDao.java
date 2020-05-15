package com.kimschool.manage.dao;

import java.util.List;

import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Wbs_UserInfo;
import com.kimschool.manage.entity.WorkPlaceInfo;

public interface WbsTestDao {

	public List<Wbs_UserInfo> findWbsUserInfo(String u_no);
	public List<Wbs_2020> findWbsYear(String u_no);
	public List<WorkPlaceInfo> findWorkPlaceInfo(String u_no);

}
