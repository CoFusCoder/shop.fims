package shop.fims.gukmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	 */
	@GetMapping("gukminview/festival/hostSpotRegisterForm")
	public String hostSpotRegister() {
		System.out.println("---국민 핫스팟등록 : hostSpotRegister FestivalController.java-------");
		return "/gukminview/festival/hostSpotRegisterForm";
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
