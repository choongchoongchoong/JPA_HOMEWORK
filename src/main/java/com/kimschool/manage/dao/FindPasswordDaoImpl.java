package com.kimschool.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimschool.manage.entity.User_Info;

@Repository
public class FindPasswordDaoImpl implements FindPasswordDao {

	@Autowired
	Connection conn;

	@Override
	public String findPasswordInfo(String id, String email) {

		// Autowired Connection과 함께 Dao Set
		EntityManager em = conn.getConnection();

		List<User_Info> result = em.createNamedQuery("User_Info.findPassword", User_Info.class)
				.setParameter("email", email).setParameter("id", id)
				.getResultList();

		String PasswordResult = new String();

		if (result.size() == 0) {
			PasswordResult = null;
		} else {
			User_Info userinfo = result.get(0);
			PasswordResult = userinfo.getPassword();
		}

		return PasswordResult;
	}

}
