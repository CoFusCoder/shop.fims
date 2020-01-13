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
	
	/**
	 * @file MainController.java
	 * @name gukminmainview
	 * @brief 국민 메인화면 - 처음 화면
	 * @author ksmart33 김동석
	 * @return gukminview/index
	 */
	@GetMapping("/")
	public String gukminmainview() {
		System.out.println("---국민 메인화면 : gukminmainview 메서드 MainController.java-------");
		return "/gukminview/index";
	}
	
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name gukminMainView
	 * @brief 국민메인화면
	 * @author ksmart33 김동석
	 * @return gukminview/gukminMainView
	 */
	@GetMapping("gukminview/gukminMainView")
	public String gukminMainView() {
		System.out.println("---국민메인화면 : gukminMainView MainController.java-------");
		return "/gukminview/gukminMainView";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name siteMapView
	 * @brief 국민 사이트앱
	 * @author ksmart33 김동석
	 * @return gukminview/sitemap/projectIntro
	 */
	@GetMapping("/gukminview/sitemap/siteMapView")
	public String siteMapView() {
		System.out.println("---국민 사이트앱 : siteMapView MainController.java-------");
		return "/gukminview/sitemap/siteMapView";
	}
	
		
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name commonlogin
	 * @brief 공통로그인화면(공무원/거래처/국민) - 관리자 홈페이지 클릭시 이동
	 * @author ksmart33 김동석
	 * @return login/login
	 */
	@GetMapping("/index/login")
	public String commonlogin() {
		System.out.println("---공통로그인화면(공무원/거래처/국민) : commonlogin 메서드 MainController.java-------");
		return "/login/login";
	}
	
	
	
	@GetMapping("/getSessionInfo")
	public String selectFestByFestcd(@RequestParam(value="festCd")String festCd,  
			ServletResponse response, HttpSession session) {
		response.setContentType("text/html; charset=UTF-8");

		Main main = mainService.selectFestByFestcd(festCd);		
		System.out.println("세션이름값 : "+main.getAreaCityCd()+main.getAreaCityNm()+main.getAreacityAdminCd()+main.getAreacityAdminNm());
		System.out.println("세션코드값 : "+main.getAreaCd()+main.getAreaNm()+main.getFestCd()+main.getFestNm());
		session.setAttribute("F_AREA_CD", main.getAreaCd());	//전국지역코드
		session.setAttribute("F_AREA_NM", main.getAreaNm());	//지역명
		session.setAttribute("F_CITY_CD", main.getAreaCityCd());	//모든 지역 시군코드
		session.setAttribute("F_CITY_NM", main.getAreaCityNm());	//시군명
		session.setAttribute("F_ADMIN_CD", main.getAreacityAdminCd());	//모든 행정기관코드
		session.setAttribute("F_ADMIN_NM", main.getAreacityAdminNm());	//행정기관명
		session.setAttribute("F_CD", main.getFestCd());	//축제코드		
		session.setAttribute("F_NM", main.getFestNm());	//축제명		
		return "index";		
	}

	
	/**
	 * @file MainController.java
	 * @name dashboard
	 * @brief 관리자 메인화면
	 * @author ksmart33 김동석
	 * @return /admin/main
	 */
	@GetMapping("/admin/main")
	public String index() {
		System.out.println("---관리자 메인화면 : MainController.java-------");
		return "index";
	}

	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name projectintro
	 * @brief 축제통합관리시스템 프로젝트 및 팀원 소개 화면
	 * @author ksmart33 김동석
	 * @return projectintro
	 */
	@GetMapping("/projectintro")
	public String projectintro() {
		System.out.println("---프로젝트 및 팀원 소개 화면 : projectintro 메서드 MainController.java-------");
		return "projectintro";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name allprofile
	 * @brief 관리자모드로 로그인된 프로필화면(권한 : 공무원/거래처)
	 * @author ksmart33 김동석
	 * @return allprofile
	 */
	@GetMapping("/allprofile")
	public String allprofile() {
		System.out.println("---관리자모드로 로그인된 프로필화면(권한 : 공무원/거래처) : allprofile 메서드 MainController.java-------");
		return "allprofile";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name gukmindefault
	 * @brief 국민초기화면
	 * @author ksmart33 김동석
	 * @return gukminview/gukminblank
	 */
	@GetMapping("/gukminview/gukminblank")
	public String gukmindefault() {
		System.out.println("---국민초기화면 : gukmindefault MainController.java-------");
		return "gukminview/gukminblank";
	}

}
