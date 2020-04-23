package com.kimschool.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.LoginDao;

@Service // 서비스에 붙여주는 어노테이션
public class LoginServiceImpl implements LoginService { // 구현체에 implements LoginService

	// Dao 주입
	@Autowired
	LoginDao logindao;

	@Override
	// 아이디 패스워드 시발점 : 화면
	// 화면에서 콘트롤러로, 콘트롤러에서 여기 서비스로 넘겨준 아이디 패스워드를 Dao로 넘겨줌
	public int checkLogin (String id, String password) {

		// LoginDaoImpl로부터 사이즈값 취득
		int count = logindao.findUser(id, password);

		// 콘트롤러에 리턴
		return count;
	}

}
