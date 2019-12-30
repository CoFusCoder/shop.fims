package shop.fims.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;

@Controller
public class AdminController {
	
	@Autowired private AdminService adminService;
	
	/*
	 * @file   AdminController.java
	 * @name   AdminController
	 * @brief  전국 지역 등록
	 * @author ksmart33 한소연
	 */
	
	//전국 지역 및 시군 등록
	@GetMapping("/admin/areaInsert")
	public String areaInsert(Model model) {
		model.addAttribute("areaList", adminService.areaList());
		return "admin/areaInsert";
	}
	
	//전국 지역 등록 처리 메서드
	@PostMapping("/admin/areaInsert")
	public String addArea(Area area) {
		
		adminService.areaInsert(area);
		System.out.println("area >>>>>>> " + area.toString());
		System.out.println(area.getAreaCd() + "<-생성된 코드");

		return "redirect:/admin/areaCityList";
	}
	
	//전국 지역 및 시군 조회
	@GetMapping("/admin/areaCityList")
	public String areaCityList(Model areaList, Model areaCityList) {
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		
		return "admin/areaCityList";
	}
	
	//전국 지역 등록 처리 메서드
	@PostMapping("/admin/areaCityInsert")
	public String areaCityInsert(AreaCity areaCity) {
		
		adminService.areaCityInsert(areaCity);
		System.out.println("areaCity >>>>>" + areaCity.toString());
		System.out.println(areaCity.getAreaCityCd() + "<- 생성된 코드");
		
		return "redirect:/admin/areaCityList";
	}
	
	//행정기관 등록
	@GetMapping("/admin/areaCityAdminInsert")
	public String areaCityAdminInsert(Model areaList, Model areaCityList) {
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		return "admin/areaCityAdminInsert";
	}
	
	//행정기관 등록 처리 메서드
	@PostMapping("/admin/areaCityAdminInsert")
	public String areaCityAdminInsert(AreaCityAdmin areaCityAdmin) {
		adminService.areaCityAdminInsert(areaCityAdmin);
		System.out.println("areaCityAdmin >>>>>" + areaCityAdmin.toString());
		System.out.println(areaCityAdmin.getAreacityAdminCd() + "<- 생성된 코드");
		
		return "redirect:/admin/areaCityAdminList";
	}
	
	//행정기관 조회
	@GetMapping("/admin/areaCityAdminList")
	public String areaCityAdminList(Model areaList, Model areaCityList, Model areaCityAdminList) {
		
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		areaCityAdminList.addAttribute("areaCityAdminList", adminService.areaCityAdminList());
		
		return "admin/areaCityAdminList";
	}
		
}
