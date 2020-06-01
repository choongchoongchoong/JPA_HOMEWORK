package com.kimschool.manage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.dao.WbsDao;
import com.kimschool.manage.entity.Wbs;
import com.kimschool.manage.entity.WbsInfoVo;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Wbs_UserInfo;
import com.kimschool.manage.entity.WorkPlaceInfo;
import com.kimschool.manage.service.util.DateUtil;

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
			mv.addObject("u_no", u_no);
			mv.setViewName("redirect:getwbsinfo");
		} else {
			mv.setViewName("login");
		}

		return mv;

	}

	@Override
	public ModelAndView getwbsinfo(String u_no) {

		ModelAndView mv = new ModelAndView("wbs");
		DateUtil dateUtil = new DateUtil();

		List<Wbs_UserInfo> wbs_userinfo = new ArrayList<Wbs_UserInfo>();
		List<Wbs_2020> wbs_2020 = new ArrayList<Wbs_2020>();
		List<WorkPlaceInfo> workplaceinfo = new ArrayList<WorkPlaceInfo>();

		wbs_userinfo = wbsDao.getWbsUserInfo(u_no);
		wbs_2020 = wbsDao.getWbs2020(u_no);
		workplaceinfo = wbsDao.getWorkPlaceInfo(u_no);

		WbsInfoVo vo = new WbsInfoVo();

		vo.setU_name(wbs_userinfo.get(0).getName());
		vo.setU_no(wbs_userinfo.get(0).getU_no());
		vo.setMin_time(String.valueOf(workplaceinfo.get(0).getMin_time()));
		vo.setMax_time(String.valueOf(workplaceinfo.get(0).getMax_time()));

		List<Wbs> wbslist = new ArrayList<Wbs>();

		// DTO -> VO 변환작업
		for(Wbs_2020 wbs : wbs_2020) {
			Wbs wbsvo = new Wbs();
			wbsvo.setDate(wbs.getDate());
			wbsvo.setStart_h(wbs.getStart_time().substring(0, 2));
			wbsvo.setStart_m(wbs.getStart_time().substring(2, 4));
			wbsvo.setEnd_h(wbs.getEnd_time().substring(0, 2));
			wbsvo.setEnd_m(wbs.getEnd_time().substring(2, 4));
			wbsvo.setRest_h(wbs.getRest_time().substring(0, 2));
			wbsvo.setRest_m(wbs.getRest_time().substring(2, 4));

//			wbsvo.setTotal_h("8"); //과제
			wbsvo.setTotal_h(String.valueOf(dateUtil.timeConv(wbs.getStart_time(), wbs.getEnd_time(), wbs.getRest_time())));

			wbsvo.setVacation_type(dateUtil.vacationCatConv(wbs.getVacation_type()));

//			wbsvo.setVacation_type(wbs.getVacation_type());
//			if (wbs.getVacation_type().equals("0")) {
//				wbsvo.setVacation_type("");
//			} else if (wbs.getVacation_type().equals("1")) {
//				wbsvo.setVacation_type("오전휴가");
//			} else if (wbs.getVacation_type().equals("2")) {
//				wbsvo.setVacation_type("오후휴가");
//			} else if (wbs.getVacation_type().equals("3")) {
//				wbsvo.setVacation_type("종일휴가");
//			} else if (wbs.getVacation_type().equals("4")) {
//				wbsvo.setVacation_type("조퇴");
//			}

			wbsvo.setMemo(wbs.getMemo());

			wbslist.add(wbsvo);

		}

		vo.setWbslist(wbslist);

		mv.addObject("wbsinfo", vo);

		return mv;

	}

}
