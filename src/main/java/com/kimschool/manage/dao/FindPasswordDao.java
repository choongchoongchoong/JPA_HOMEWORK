package com.kimschool.manage.dao;

public interface FindPasswordDao {

	public String findPasswordInfo(String id, String email); //서비스에서 객체로 넣어주니까 다오에서도 객체로 받음

}
