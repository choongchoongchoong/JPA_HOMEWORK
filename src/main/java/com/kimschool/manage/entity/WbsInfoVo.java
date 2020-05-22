package com.kimschool.manage.entity;

import java.util.ArrayList;
import java.util.List;

public class WbsInfoVo {

	private String u_no;
	private String name;
	// 민 타임이랑 맥스타입은 wbsplace에서 가져오는거니까 반복 돌리는 거 X
	private int min_time;
	private int max_time;

	List<Wbs_2020> list = new ArrayList<Wbs_2020>();
	// 이걸 리스트로 담아서 리스트로 겟 셋 가능
//	private String date;
//	private String start_time;
//	private String end_time;
//	private String rest_time;
//	private String vacation_type;
//	private String memo;
//	private String wp_name;
//	private String min_time;
//	private String max_time;

	public String getU_no() {
		return u_no;
	}

	public void setU_no(String u_no) {
		this.u_no = u_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMin_time() {
		return min_time;
	}

	public void setMin_time(int min_time) {
		this.min_time = min_time;
	}

	public int getMax_time() {
		return max_time;
	}

	public void setMax_time(int max_time) {
		this.max_time = max_time;
	}

	public List<Wbs_2020> getList() {
		return list;
	}

	public void setList(List<Wbs_2020> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "WbsInfoVo [u_no=" + u_no + ", name=" + name + ", min_time=" + min_time + ", max_time=" + max_time
				+ ", list=" + list + "]";
	}



}
