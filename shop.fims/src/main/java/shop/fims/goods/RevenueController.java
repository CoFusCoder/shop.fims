package shop.fims.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RevenueController {

	@Autowired RevenueService revenueservice;
	//모든 축제별 보유물품 대여관리 리스트 - 세입 리스트
	@GetMapping("/g_revenuelist")
	public String revenuelist(Model model) {
		model.addAttribute("revenuelist" , revenueservice.revenuelist());
		return "/revenue/g_revenuelist";
	}
	
	
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 등록
	@GetMapping("/g_revenueinsert")
	public String g_revenueinsert() {
		return "/revenue/g_revenueinsert";		
	}
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 등록처리
	@PostMapping("g_revenueinsert")
	public String adddelbreinsert() {
		return "redirect:/g_revenuelist";
	}
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 수정
	@GetMapping("/g_revenueupdata")
	public String selectrevenueupdata() {
		return "/revenue/g_revenueupdata";
	}
	//모든 축제별 보유물품 대여관리 리스트 - 세입 수정
	@PostMapping("/g_revenueupdata")
	public String g_revenueupdata() {
		return "redirect:/g_revenuelist";
	}
	@GetMapping("/g_revenuelistdetail")
	public String g_revenuelistdetail() {
		return "/revenue/g_revenuelistdetail";
	}
}
