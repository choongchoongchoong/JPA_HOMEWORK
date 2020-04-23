package com.kimschool.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity // JPA 전용 필수 어노테이션
@Table (name = "user_info")
@NamedQueries({
@NamedQuery // 원하는 제목으로 쿼리 만들어서 테이블에서 정보 취득, Implement에서 부르기
		(name = "User_Info.findBypassword",
		query = "select u from User_Info u where u.password = :password and u.id = :id"), // * 안되고 테이블 별칭
@NamedQuery
		(name = "User_Info.findPassword",
		query = "select u from User_Info u where u.email = :email and u.id = :id")
})
public class User_Info {

	private String id;
	@Id // PK에 지정해주는 어노테이션
	private int no;
	private String password;
	// inser시 값이 들어가는 걸 방지한다 (null)
	@Column (insertable = false)
	private String auth1;
	// inser시 값이 들어가는 걸 방지한다 (null)
	@Column (insertable = false)
	private String status;
	// inser시 값이 들어가는 걸 방지한다 (null)
	@Column (insertable = false)
	private String reg_date;
	private String email;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAuth1() {
		return auth1;
	}
	public void setAuth1(String auth1) {
		this.auth1 = auth1;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override // 소스 - toString : 리스트처럼 이쁘게 값 표시
	public String toString() {
		return "User_Info [id=" + id + ", no=" + no + ", password=" + password + ", auth1=" + auth1 + ", status="
				+ status + ", reg_date=" + reg_date + ", email=" + email + "]";
	}

}
