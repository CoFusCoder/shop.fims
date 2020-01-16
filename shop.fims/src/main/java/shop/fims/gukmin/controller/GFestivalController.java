package shop.fims.gukmin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.fims.gukmin.service.GFestivalService;

@Controller
public class GFestivalController {

	@Autowired
	private GFestivalController gfestivalService;
	/**
	 * @param 없음
	 * @file FestivalController.java
	 * @name hostSpotRegister
	 * @brief 국민 핫스팟등록
	 * @author ksmart33 김동석
	 * @return gukminview/festival/hostSpotRegisterForm
	 * @throws IOException 
	 */
	@GetMapping("gukminview/festival/hostSpotRegisterForm")
	public String hostSpotRegister(HttpSession session, HttpServletResponse response) throws IOException {
		System.out.println("---국민 핫스팟등록 : hostSpotRegister FestivalController.java-------");
		
		response.setContentType("text/html; charset=UTF-8");
		 
		PrintWriter out = response.getWriter();
	
		String loginlevel = (String) session.getAttribute("SLEVEL");
		
		if(loginlevel == null) {
			System.out.println( loginlevel + "<--loginlevel hostSpotRegister 메서드 GFestivalController.java ");
			out.println("<script>alert('로그인을 해주세요!'); location.href='/gukminview/login/loginForm';</script>");
			out.flush();
			
		}
		
		
		return "/gukminview/festival/hostSpotRegisterForm";
	}
	

	/**
	 * @param 없음
	 * @file FestivalController.java
	 * @name festivalSearchview
	 * @brief 국민화면 -축제 검색 Open API
	 * @author ksmart33 김동석
	 * @return gukminview/festival/festivalSearch
	 */
	@GetMapping("gukminview/festival/festivalSearch")
	public String festivalSearchview() {
		System.out.println("---국민화면 -축제 검색 Open API 화면 : festivalSearch FestivalController.java-------");
		return "/gukminview/festival/festivalSearch";
	}
	
	/**
	 * @param 없음
	 * @file FestivalController.java
	 * @name festivalSearch
	 * @brief 국민화면 -축제 검색 Open API
	 * @author ksmart33 김동석
	 * @return gukminview/festival/festivalSearch
	 */
	@PostMapping("gukminview/festival/festivalSearch")
	public String festivalSearch(Model model,String tagSearch) {
		System.out.println(tagSearch+"<==tagSearch");
		model.addAttribute("TAG", tagSearch);
		
		System.out.println("---국민화면 -축제 검색 Open API : festivalSearch FestivalController.java-------");
		return "/gukminview/festival/festivalSearch";
	}
	
	
	
	
	
	
	/**
	 * @param 없음
	 * @file FestivalController.java
	 * @name festivalAndEventView
	 * @brief 국민 상단바 축제이벤트화면
	 * @author ksmart33 김동석
	 * @return gukminview/festival/festivalAndEventView
	 */
	@GetMapping("gukminview/festival/festivalAndEventView")
	public String festivalAndEventView() {
		System.out.println("---국민 상단바 축제이벤트화면 : festivalAndEventView FestivalController.java-------");
		return "/gukminview/festival/festivalAndEventView";
	}
}
