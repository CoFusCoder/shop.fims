package shop.fims.festival;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.fims.admin.AdminService;
import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;
import shop.fims.vo.Festival;

@Controller
public class FestivalController {
	
	@Autowired private AdminService adminService;
	@Autowired private FestivalService festivalService;
	
	/*
	 * @file   FestivalController.java
	 * @name   FestivalController
	 * @brief  축제 관리
	 * @author ksmart33 한소연
	 */
	
	//축제 등록
	@GetMapping("/festival/festivalInsert")
	public String festivalInsert(Model areaList, Model areaCityList) {
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		return "festival/festivalInsert";
	}
	
	//전국 지역 등록 처리 메서드
	@PostMapping("/festival/festivalInsert")
	public String festivalInsert(Festival festival) {
		
		festivalService.festivalInsert(festival);
		System.out.println("festival >>>>>" + festival.toString());
		System.out.println(festival.getFestCd() + "<- 생성된 코드");
		
		return "redirect:/festival/festivalList";
	}
	
	
	//전국 지역 및 시군 조회
	@GetMapping("/festival/festivalList")
	public String festivalList(Model model) {
		
		return "festival/festivalList";
		
	}
	
	//축제별 담당자 등록
	@GetMapping("/festival/festLevelMemInsert")
	public String festLevelMemInsert() {
		
		return "festival/festLevelMemInsert";
	}
	
	//축제별 담당자 조회
	@GetMapping("/festival/festLevelMemList")
	public String festLevelMemList() {
		
		return "festival/festLevelMemList";
	}
	
	//축제별 입장료 및 수량 등록
	@GetMapping("/festival/festTicRevInsert")
	public String festTicRevInsert() {
		
		return "festival/festTicRevInsert";
	}
	
	//축제별 입장료  및 수량 통계
	@GetMapping("/festival/festTicRevList")
	public String festTicRevList() {
		
		return "festival/festTicRevList";
	}
		
}
