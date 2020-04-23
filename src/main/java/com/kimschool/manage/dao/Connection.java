package com.kimschool.manage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class Connection {

	public EntityManager getConnection() {

			// JPA 사용에 필요한 필수 객체 (Persistence 정보 가져오기)
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
			EntityManager em = emf.createEntityManager();

			return em;
	}

}
