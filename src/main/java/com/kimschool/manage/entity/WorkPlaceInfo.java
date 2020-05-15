package com.kimschool.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity // JPA 전용 필수 어노테이션
@Table (name = "workplaceinfo")
@NamedQueries({
@NamedQuery
		(name = "WorkPlaceInfo.findByWP",
		query = "select u from WorkPlaceInfo u where u.u_no = :u_no")
})
public class WorkPlaceInfo {

	@Id
	private int no;
	private String u_no;
	private String wp_name;
	@Column (insertable = false)
	private String min_time;
	@Column (insertable = false)
	private String max_time;
	private String reg_date;

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getU_no() {
		return u_no;
	}
	public void setU_no(String u_no) {
		this.u_no = u_no;
	}
	public String getWp_name() {
		return wp_name;
	}
	public void setWp_name(String wp_name) {
		this.wp_name = wp_name;
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
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "WorkPlaceInfo [no=" + no + ", u_no=" + u_no + ", wp_name=" + wp_name + ", min_time=" + min_time
				+ ", max_time=" + max_time + ", reg_date=" + reg_date + "]";
	}

}