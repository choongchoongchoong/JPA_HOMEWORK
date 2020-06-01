package com.kimschool.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Wbs_UserInfo;
import com.kimschool.manage.entity.WorkPlaceInfo;

@Repository
public class WbsDaoImpl implements WbsDao {

	@Autowired
	Connection conn;

	@Override
	public List<Wbs_UserInfo> wbslogincheck(String u_no, String u_password) {

		EntityManager em = conn.getConnection();

		List<Wbs_UserInfo> result = em.createNamedQuery("Wbs_UserInfo.findByWbsUserInfo", Wbs_UserInfo.class)
				.setParameter("u_no", u_no)
				.setParameter("u_password", u_password)
				.getResultList();

		return result;
	}

	@Override
	public List<Wbs_UserInfo> getWbsUserInfo(String u_no) {

		EntityManager em = conn.getConnection();

		List<Wbs_UserInfo> result = em.createNamedQuery("Wbs_UserInfo.findByu_no", Wbs_UserInfo.class)
				.setParameter("u_no", u_no)
				.getResultList();

		return result;
	}

	@Override
	public List<Wbs_2020> getWbs2020(String u_no) {

		EntityManager em = conn.getConnection();

		List<Wbs_2020> result = em.createNamedQuery("Wbs_2020.findByu_no", Wbs_2020.class)
				.setParameter("u_no", u_no)
				.getResultList();

		return result;
	}

	@Override
	public List<WorkPlaceInfo> getWorkPlaceInfo(String u_no) {

		EntityManager em = conn.getConnection();

		List<WorkPlaceInfo> result = em.createNamedQuery("WorkPlaceInfo.findByu_no", WorkPlaceInfo.class)
				.setParameter("u_no", u_no)
				.getResultList();

		return result;
	}

}
