package shop.fims.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
		
		String a = area.getAreaCd();
		String b = area.getAreaNm();
		
		if(a == "" || b == "") {
			return  "redirect:/admin/areaInsert";
			
		}else {
			adminService.areaInsert(area);
			System.out.println("area >>>>>>> " + area.toString());
			System.out.println(area.getAreaCd() + "<-생성된 코드");
			
			return "redirect:/admin/areaCityList";
		}
	}
	
	//전국 지역 수정 메서드
	@PostMapping("/admin/areaUpdate")
	public String areaUpdate(Area area, ServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("area >>>> " + area);
		adminService.areaUpdate(area);
		PrintWriter out = response.getWriter();
		out.println("<script>alert('전국 지역이 수정되었습니다.'); location.href='/admin/areaCityList';</script>");
		out.flush();
		System.out.println("area 지역 수정 >>>>>>>" + area.toString());
		
		return null;
	}
	
	//전국 지역 삭제 메서드
	@GetMapping("/admin/areaDelete")
	public String areaDelete(@RequestParam(value = "areaCd") String areaCd) {

		adminService.areaDelete(areaCd);
		System.out.println(areaCd + " : 전국 지역 삭제");
		return "/admin/areaCityList";
	}
	
	//전국 지역 및 시군 조회
	@GetMapping("/admin/areaCityList")
	public String areaCityList(Model areaList, Model areaCityList) {
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		
		return "admin/areaCityList";
	}
	
	//전국 지역 시군 등록 처리 메서드
	@PostMapping("/admin/areaCityInsert")
	public String areaCityInsert(AreaCity areaCity) {
		String b = areaCity.getAreaCd();
		String c = areaCity.getAreaCityNm();
		
		if(b == "" || c == "") {
			
			return "redirect:/admin/areaInsert";
		}else {
			
			adminService.areaCityInsert(areaCity);
			System.out.println("areaCity >>>>>" + areaCity.toString());
			System.out.println(areaCity.getAreaCityCd() + "<- 생성된 코드");
			
			return "redirect:/admin/areaCityList";
		}
			
	}
	
	//전국 지역 시군 수정 메서드
	@PostMapping("/admin/areaCityUpdate")
	public String areaCityUpdate(AreaCity areaCity, ServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("areaCity >>>> " + areaCity);
		adminService.areaCityUpdate(areaCity);
		PrintWriter out = response.getWriter();
		out.println("<script>alert('지역에 대한 시군명이 수정되었습니다.'); location.href='/admin/areaCityList';</script>");
		out.flush();
		System.out.println("areaCity 지역 시군 수정 >>>>>>>" + areaCity.toString());
		
		//return "redirect:/admin/areaCityList";
		return null;
	}
	
	//전국 지역 시군 삭제 메서드
	@GetMapping("/admin/areaCityDelete")
	public String areaCityDelete(@RequestParam(value = "areaCityCd") String areaCityCd) {

		adminService.areaDelete(areaCityCd);
		System.out.println(areaCityCd + " : 전국 지역 시군 삭제");
		return "/admin/areaCityList";
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
	public String addareaCityAdmin(AreaCityAdmin areaCityAdmin) {
		
		String a = areaCityAdmin.getAreacityAdminCd();
		String b = areaCityAdmin.getAreaCd();
		String c = areaCityAdmin.getAreaCityCd();
		String d = areaCityAdmin.getAreacityAdminNm();
		
		if(a == "" || b == "" || c == "" || d == "") {
			return "redirect:/admin/areaCityAdminInsert";
		}else {
			adminService.areaCityAdminInsert(areaCityAdmin);
			System.out.println("areaCityAdmin >>>>>>> " + areaCityAdmin.toString());
			System.out.println(areaCityAdmin.getAreacityAdminCd() + "<-생성된 코드");
			
			return "redirect:/admin/areaCityAdminList";			
		}
		 
	}
	
	//행정기관 조회
	@GetMapping("/admin/areaCityAdminList")
	public String areaCityAdminList(Model areaList, Model areaCityList, Model areaCityAdminList) {
		areaList.addAttribute("areaList", adminService.areaList());
		areaCityList.addAttribute("areaCityList", adminService.areaCityList());
		areaCityAdminList.addAttribute("areaCityAdminList", adminService.areaCityAdminList());
		
		System.out.println("행정기관 >>>>" + areaCityAdminList.toString());
		return "admin/areaCityAdminList";
	}

		
}
