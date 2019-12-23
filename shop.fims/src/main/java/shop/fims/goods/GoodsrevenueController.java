package shop.fims.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GoodsrevenueController {

	@Autowired GoodsrevenueService revenueservice;
	//모든 축제별 보유물품 대여관리 리스트 - 세입 리스트
	@GetMapping("/g_revenuelist")
	public String revenuelist(Model model) {
		model.addAttribute("revenuelist" , revenueservice.revenuelist());
		return "/revenue/g_revenuelist";
	}
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 코드로 조회
	@GetMapping("/g_revenuelistdetail")
	public String coderevenue(@RequestParam(value = "goodsren_rev_cd") String goodsren_rev_cd, Model model) {
		model.addAttribute("coderevenue", revenueservice.coderevenue(goodsren_rev_cd));
		return "/revenue/g_revenuelistdetail";
	}
	
	
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 등록
	@GetMapping("/g_revenueinsert")
	public String g_insertrevenue() {
		return "/revenue/g_revenueinsert";		
	}
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 등록처리
	@PostMapping("g_revenueinsert")
	public String addinsertdelbre() {
		return "redirect:/g_revenuelist";
	}
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 수정
	@GetMapping("/g_revenueupdata")
	public String selectrevenue() {
		return "/revenue/g_revenueupdata";
	}
	//모든 축제별 보유물품 대여관리 리스트 - 세입 수정
	@PostMapping("/g_revenueupdata")
	public String g_updatarevenue() {
		return "redirect:/g_revenuelist";
	}
	
}
