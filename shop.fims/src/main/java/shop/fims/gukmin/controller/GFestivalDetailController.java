package shop.fims.gukmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.gukmin.service.GFestivalDetailService;

@Controller
public class GFestivalDetailController {

	@Autowired
	private GFestivalDetailService gfestivalDetailService;
	/**
	 * @param 없음
	 * @file FestivalDetailController.java
	 * @name festivalDetailView
	 * @brief 국민 축제상세화면
	 * @author ksmart33 김동석
	 * @return gukminview/festivaldetail/festivalDetailView
	 */
	@GetMapping("gukminview/festivaldetail/festivalDetailView")
	public String festivalDetailView() {
		System.out.println("---국민 축제상세화면 : festivalDetailView FestivalDetailController.java-------");
		return "/gukminview/festivaldetail/festivalDetailView";
	}
	
	
	//ajax 또는 jquery로 키 : 값으로 하면 될거 같은데 나중에 시간이 되면 찾아보자 지금은 노가다로 해놓고....
	/**
	 * @param 없음
	 * @file FestivalDetailController.java
	 * @name festivalDetailView2
	 * @brief 국민 축제상세화면2
	 * @author ksmart33 김동석
	 * @return gukminview/festivaldetail/festivalDetailView2
	 */
	@GetMapping("gukminview/festivaldetail/festivalDetailView2")
	public String festivalDetailView2() {
		System.out.println("---국민 축제상세화면2 : festivalDetailView2 FestivalDetailController.java-------");
		return "/gukminview/festivaldetail/festivalDetailView2";
	}
}
