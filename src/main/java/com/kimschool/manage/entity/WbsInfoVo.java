package com.kimschool.manage.entity;

import java.util.List;

public class WbsInfoVo {

	private String u_name;
	private String u_no;

	private String min_time;
	private String max_time;

	List<Wbs> wbslist;

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_no() {
		return u_no;
	}

	public void setU_no(String u_no) {
		this.u_no = u_no;
	}

	public String getMin_time() {
		return min_time;
	}

	public void setMin_time(String min_time) {
		this.min_time = min_time;
	}

	public String getMax_time() {
		return max_time;
	}

	public void setMax_time(String max_time) {
		this.max_time = max_time;
	}

	public List<Wbs> getWbslist() {
		return wbslist;
	}

	public void setWbslist(List<Wbs> wbslist) {
		this.wbslist = wbslist;
	}

}

