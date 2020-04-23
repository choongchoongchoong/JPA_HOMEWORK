package com.kimschool.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.FindPasswordDao;
import com.kimschool.manage.entity.User_Info;

@Service
public class FindPasswordServiceImpl implements FindPasswordService {

	@Autowired
	FindPasswordDao dao;

	@Override
	public String findPasswordInfo(String id, String email1, String email2) {

		User_Info userinfo = new User_Info();
		userinfo.setId(id);
		String email = email1 + "@" + email2;
		userinfo.setId(email);

		String password = dao.findPasswordInfo(id, email);
		String starmark;
		String first;
		String last;
		String result;

		// password 가운데 글자 * 처리
		if (password != null) {
			first = password.substring(0, 1);
			last = password.substring(password.length()-1, password.length());
			starmark = password.substring(1, password.length()-1);
//			int starcount = starmark.length();
			String star = "";
			for (int i = 0; i < starmark.length(); i++) {
				star = star + "*";
			}
			result = first + star + last;

		} else {
			result = password;
		}

		return result;
	}

}
