package com.kimschool.manage.dao;

import java.util.List;

import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Wbs_UserInfo;
import com.kimschool.manage.entity.WorkPlaceInfo;

public interface WbsDao {

	public List<Wbs_UserInfo> wbslogincheck(String u_no, String u_password);

	public List<Wbs_UserInfo> getWbsUserInfo(String u_no);
	public List<Wbs_2020> getWbs2020(String u_no);
	public List<WorkPlaceInfo> getWorkPlaceInfo(String u_no);

}
