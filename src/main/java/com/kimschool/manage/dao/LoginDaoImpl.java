package com.kimschool.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimschool.manage.entity.User_Info;

@Repository // 다오에 붙여주는 어노테이션
public class LoginDaoImpl implements LoginDao {

	@Autowired
	Connection conn;

	@Override
	public int findUser (String id, String password) {
		EntityManager em = conn.getConnection();

		// User_Info 엔티티에서 지정한 제목의 퀘리를 가져온 후 LoginServiceImpl에 사이즈값 리턴
		List<User_Info> result = em.createNamedQuery("User_Info.findBypassword", User_Info.class)
				.setParameter("password", password).setParameter("id", id)
				.getResultList();

		int size = result.size();

		return size;
	}

}
