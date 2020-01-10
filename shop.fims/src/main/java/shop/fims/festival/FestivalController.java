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
	public String festivalInsert(Model areaList, Model areaCityList, Model areaCityAdminList) {
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		areaCityAdminList.addAttribute("areaCityAdminList", adminService.areaCityAdminList());
		return "festival/festivalInsert";
	}
	
	// 축제 등록 처리
	@PostMapping("/festival/festivalInsert")
	public String addfestival(Festival festival) {
		
		String fc = festival.getFestCd();
		String ac = festival.getAreaCd();
		String acc = festival.getAreaCityCd();
		String acac = festival.getAreacityAdminCd();
		String fn = festival.getFestNm();
		String fha = festival.getFestHostArea();
		String fhp = festival.getFestHostPlace();
		String fsd = festival.getFestStartDt();
		String fed = festival.getFestEndDt();
		String fcon = festival.getFestContent();
		String fsu = festival.getFestSuperAgency();
		String fiq = festival.getFestInquiry();
		
		if(fc == "" || ac == "" || acc == "" || acac == "" || fn == "" || fha == ""|| fhp == ""
			|| fsd == "" || fed == "" || fcon == "" || fsu == "" || fiq == "") {
			return "redirect:/festival/festivalInsert";
		}else {
			festivalService.festivalInsert(festival);
			System.out.println("festival >>>>>>> " + festival.toString());
			System.out.println(festival.getFestCd() + "<-생성된 코드");
			
			return "redirect:/festival/festivalList";			
		}
		 
	}
	
	
	//전국 지역 및 시군 조회
	@GetMapping("/festival/festivalList")
	public String festivalList(Model areaList, Model areaCityList, Model areaCityAdminList, Model festivalList) {
		
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		areaCityAdminList.addAttribute("areaCityAdminList", adminService.areaCityAdminList());
		festivalList.addAttribute("festivalList", festivalService.festivalList());
		
		System.out.println(festivalList + " : 축제 목록");
		System.out.println(areaList + " : 지역 목록");
		System.out.println(areaCityList + " : 지역 시군 목록");
		System.out.println(areaCityAdminList + " : 행정기관 목록");
		 
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
