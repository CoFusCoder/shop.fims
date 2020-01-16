package shop.fims.official;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.AdminService;

@Controller
public class OfficailController {
	
	@Autowired private AdminService adminService;
	@Autowired private OfficailService officailService;
	
	/*
	 * @file   OfficailController.java
	 * @name   OfficailController
	 * @brief  공무원 관리
	 * @author fims 한소연
	 */
	
	//행정기관별 부서 및 직원 등록
	@GetMapping("/official/DepartEmployInsert")
	public String DepartEmployInsert() {
		return "official/DepartEmployInsert";
	}
	
	//행정기관별 부서 조회
	@GetMapping("/official/DepartList")
	public String DepartList(Model areaCityAdminList, Model DepartList) {
		
		areaCityAdminList.addAttribute("areaCityAdminList", adminService.areaCityAdminList());
		DepartList.addAttribute("DepartList", officailService.DepartList());
		System.out.println("부서 조회 >>>>" + DepartList.toString());
		
		return "official/DepartList";
	}
	
	//행정기관별 부서 조회
	@GetMapping("/official/DepartEmployList")
	public String DepartEmployList(Model areaList, Model areaCityList, Model areaCityAdminList, Model DepartList, Model DepartEmployList) {
		
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		areaCityAdminList.addAttribute("areaCityAdminList", adminService.areaCityAdminList());
		DepartList.addAttribute("DepartList", officailService.DepartList());
		DepartEmployList.addAttribute("DepartEmployList", officailService.DepartEmployList());
		System.out.println("부서 조회 >>>>" + DepartList.toString());
		
		return "official/DepartEmployList";
	}
	
}
