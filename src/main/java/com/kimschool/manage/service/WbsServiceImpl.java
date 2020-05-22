package com.kimschool.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.dao.WbsDao;
import com.kimschool.manage.entity.WbsInfoVo;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Wbs_UserInfo;
import com.kimschool.manage.entity.WorkPlaceInfo;

@Service
public class WbsServiceImpl implements WbsService {

	@Autowired
	WbsDao wbsDao;

	@Override
	public ModelAndView wbslogincheck(String u_no, String u_password) {

		List<Wbs_UserInfo> result = wbsDao.wbslogincheck(u_no, u_password);

		int count = result.size(); // 취득건수 1 -> 로그인 성공, 0 -> 로그인 실패

		ModelAndView mv = new ModelAndView();

		if(count == 1) {
			mv.setViewName("redirect:/getWbsInfo?u_no="+u_no+"&u_password="+u_password);
			// 여기서 로그인 성공하면 바로 화면으로 가게 해놔서 값이 안나오는거
			// 이쪽에서 리다이렉트로 값을 가져오는 리퀘스트로 가게 해야!
		} else {
			mv.setViewName("login");
		}

		return mv;

	}

	@Override
	public ModelAndView wbsVoCheck(String u_no, String u_password) {

		WbsInfoVo wbsvo = new WbsInfoVo();

		List<Wbs_UserInfo> result1 = wbsDao.wbslogincheck(u_no, u_password);

		for (Wbs_UserInfo wbs : result1) {
			wbsvo.setU_no(wbs.getU_no());
			wbsvo.setName(wbs.getName());

		}

		List<Wbs_2020> result2 = wbsDao.findWbsYear(u_no);

		wbsvo.setList(result2);

		List<WorkPlaceInfo> result3 = wbsDao.findWorkPlaceInfo(u_no);

		for (WorkPlaceInfo wbs3 : result3) {
			wbsvo.setMin_time(wbs3.getMin_time());
			wbsvo.setMax_time(wbs3.getMax_time());

		}

		// 화면에 밑에 근무날자 시작시간 종료시간 휴가종류 메모 같은건 반복문으로 돌리니 list로

		ModelAndView mv = new ModelAndView();

		mv.setViewName("wbs");
		mv.addObject("wbsvo", wbsvo);

		return mv;


	}

}
