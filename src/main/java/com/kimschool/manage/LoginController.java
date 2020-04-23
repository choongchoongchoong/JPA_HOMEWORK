package com.kimschool.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("login")
	public ModelAndView login() throws ClassNotFoundException, SQLException {

		// DB 연결
		Connection conn;
		PreparedStatement ps = null;
		// 리스트처럼 다수의 데이터를 담아옴
		ResultSet rs;

		String url = "jdbc:mysql://localhost:3306/pre_management";
		String id = "root";
		String password = "";
		// JDBC 연결
		Class.forName("com.mysql.jdbc.Driver");

		// DB 접속
		conn = DriverManager.getConnection(url, id, password);

		// SQL 생성 (시간 가져오기)
		String sql = "select now()";

		// DB로 전달할 SQL을 준비
		ps = conn.prepareStatement(sql);

		// SQL 실행
		// 결과값을 rs 격납
		rs = ps.executeQuery();

		// rs로부터 취득값 출력
		while(rs.next()) {
		// rs로부터 시간값 취득
		String time = rs.getString("now()");
		// 취득값 출력
		System.out.println(time);
	}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");

		return mv;
	}

}
