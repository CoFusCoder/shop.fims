package shop.fims.maincontroller;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Main;

@Controller
public class MainController {
	@Autowired MainService mainService;
	
	@GetMapping("/")
	public String index() {

		return "index";
	}
	
	
	@GetMapping("/getSessionInfo")
	public String selectFestByFestcd(@RequestParam(value="festCd")String festCd,  
			ServletResponse response, HttpSession session) {
		response.setContentType("text/html; charset=UTF-8");
		//System.out.println("festCd==>"+festCd);
		Main main = mainService.selectFestByFestcd(festCd);		
		session.setAttribute("F_AREA_CD", main.getAreaCd());
		session.setAttribute("F_AREA_NM", main.getAreaNm());
		session.setAttribute("F_CITY_CD", main.getAreaCityCd());
		session.setAttribute("F_CITY_NM", main.getAreaCityNm());
		session.setAttribute("F_ADMIN_CD", main.getAreacityAdminCd());
		session.setAttribute("F_ADMIN_NM", main.getAreacityAdminNm());
		session.setAttribute("F_CD", main.getFestCd());		
		session.setAttribute("F_NM", main.getFestNm());		
		return "index";		
	}
	
	
	

	
	/**
	 * @file MainController.java
	 * @name dashboard
	 * @brief 관리자 메인화면
	 * @author ksmart33 김동석
	 * @return adminisview/dashboard
	 */
	@GetMapping("/dashboard")
	public String dashboard() {
		
		return "/dashboard";
	}
	
	/**
	 * @file MainController.java
	 * @name festivalmainview
	 * @brief 국민 메인화면
	 * @author ksmart33 김동석
	 * @return festivalview/index
	 */
	@GetMapping("/festivalview/index")
	public String festivalmainview() {
		
		return "festivalview/index";
	}
	

	
	
	
}
