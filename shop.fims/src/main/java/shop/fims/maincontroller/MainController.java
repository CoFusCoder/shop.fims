package shop.fims.maincontroller;

import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Main;

@Controller
public class MainController {
	@Autowired MainService mainService;
	
	@GetMapping("/")
	public String index() {
		
		return "/index";
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
		session.setAttribute("F_NM", main.getFest_cd());		
		session.setAttribute("F_NM", main.getFest_nm());		
		return "index";		
	}
	
	
	
	
	
	
}
