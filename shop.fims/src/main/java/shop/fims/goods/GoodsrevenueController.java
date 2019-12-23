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
	@GetMapping("/revenueList")
	public String revenuelist(Model model) {
		model.addAttribute("revenuelist" , revenueservice.revenuelist());
		return "/goods/revenueList";
	}
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 코드로 조회
	@GetMapping("/revenueListDetail")
	public String coderevenue(@RequestParam(value = "goodsren_rev_cd") String goodsren_rev_cd, Model model) {
		model.addAttribute("coderevenue", revenueservice.coderevenue(goodsren_rev_cd));
		return "/goods/revenueListDetail";
	}
	
	
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 등록
	@GetMapping("/insertRevenue")
	public String g_insertrevenue() {
		return "/goods/insertRevenue";		
	}
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 등록처리
	@PostMapping("insertRevenue")
	public String addinsertdelbre() {
		return "redirect:/revenueList";
	}
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 수정
	@GetMapping("/updataRevenue")
	public String selectrevenue() {
		return "/goods/updataRevenue";
	}
	//모든 축제별 보유물품 대여관리 리스트 - 세입 수정
	@PostMapping("/updataRevenue")
	public String g_updatarevenue() {
		return "redirect:/revenueList";
	}
	
}
