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

	public List<Wbs_2020> findWbsYear(String u_no) {

		EntityManager em = conn.getConnection();

		List<Wbs_2020> wbsYear = em.createNamedQuery("Wbs_2020.findByYear", Wbs_2020.class)
				.setParameter("u_no", u_no)
				.getResultList();

		return wbsYear;
	}

	public List<WorkPlaceInfo> findWorkPlaceInfo(String u_no) {

		EntityManager em = conn.getConnection();

		List<WorkPlaceInfo> workPlaceInfo = em.createNamedQuery("WorkPlaceInfo.findByWP", WorkPlaceInfo.class)
				.setParameter("u_no", u_no)
				.getResultList();

		return workPlaceInfo;
	}

}
