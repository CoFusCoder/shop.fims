package shop.fims.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.fims.vo.Area;

@Controller
public class AdminController {
	
	@Autowired private AdminService adminService;
	
	/*
	 * @file   AdminController.java
	 * @name   AdminController
	 * @brief  전국 지역 등록
	 * @author fims 한소연
	 */
	
	//전국 지역 등록
	@GetMapping("/admin/areaInsert")
	public String areaInsert() {
		return "admin/areaInsert";
	}
	
	//전국 지역 등록 처리 메서드
	@PostMapping("/admin/areaInsert")
	public String addArea(Area area) {
		
		adminService.areaInsert(area);
		System.out.println("area >>>>>>> " + area.toString());
		System.out.println(area.getAreaCd() + "<-생성된 코드");

		return "redirect:/admin/areaList";
	}

	
	//전국 지역 조회
	@GetMapping("/admin/areaList")
	public String areaList(Model model) {
		
		model.addAttribute("areaList", adminService.areaList());
		
		return "admin/areaList";
	}
	
	//전국 지역 시군 등록
	@GetMapping("/admin/areaCityInsert")
	public String areaCityInsert() {
		return "admin/areaCityInsert";
	}
	
	//전국 지역 시군 조회
	@GetMapping("/admin/areaCityList")
	public String areaCityList() {
		return "admin/areaCityList";
	}
	
	//행정기관 등록
	@GetMapping("/admin/administrativeInsert")
	public String administrativeInsert() {
		return "admin/administrativeInsert";
	}
	
	//행정기관 조회
	@GetMapping("/admin/administrativeList")
	public String administrativeList() {
		return "admin/administrativeList";
	}
	
	
	
}
