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
		return "gukminview/index";
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
	public String selectFestByFestcd(@RequestParam(value="fest_cd")String fest_cd,  
			ServletResponse response, HttpSession session) {
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("fest_cd==>"+fest_cd);
		Main main = mainService.selectFestByFestcd(fest_cd);		
		System.out.println("세션이름값 : "+main.getArea_nm()+main.getArea_city_nm()+main.getAreacity_admin_nm()+main.getFest_nm());
		System.out.println("세션코드값 : "+main.getArea_cd()+main.getArea_city_cd()+main.getAreacity_admin_cd()+main.getFest_cd());
		session.setAttribute("F_AREA_CD", main.getArea_cd());
		session.setAttribute("F_AREA_NM", main.getArea_nm());
		session.setAttribute("F_CITY_CD", main.getArea_city_cd());
		session.setAttribute("F_CITY_NM", main.getArea_city_nm());
		session.setAttribute("F_ADMIN_CD", main.getAreacity_admin_cd());
		session.setAttribute("F_ADMIN_NM", main.getAreacity_admin_nm());
		session.setAttribute("F_CD", main.getFest_cd());		
		session.setAttribute("F_NM", main.getFest_nm());		
		return "index";		
	}

	
	/**
	 * @file MainController.java
	 * @name dashboard
	 * @brief 관리자 메인화면
	 * @author ksmart33 김동석
	 * @return dashboard
	 */
	@GetMapping("/admin/main")
	public String dashboard() {
		System.out.println("---관리자 메인화면 : dashboard 메서드 MainController.java-------");
		return "/admin/main";
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
