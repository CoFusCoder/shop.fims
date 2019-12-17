package shop.fims.publicrelations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.PrPromotion;

@Controller
public class PublicrelationsController {
	@Autowired PublicrelationsService publicrelationsService;
	
	
	 @GetMapping("/pr_promotionDetail") 
	 public String selectByPmcd(@RequestParam(value="festpr_pro_cd")String festpr_pro_cd, Model model) { 
		//System.out.println("festpr_pro_cd"+festpr_pro_cd);
		model.addAttribute("selectByPmcd", publicrelationsService.selectByPmcd(festpr_pro_cd));
	 	return "festival_publicrelations/pr_promotionDetail";
	 }

	
	
	
	//홍보 월별타임테이블
	@GetMapping("/pr_timetable")
	public String Timetable() {
		return "festival_publicrelations/pr_timetable";
	}
	
	//홍보사업 세부리스트
	@GetMapping("/pr_promotionList")
	public String detailList(Model model) {
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion());
		return "festival_publicrelations/pr_promotionList";
	}
	
	//홍보 분류리스트
	@GetMapping("/pr_divList")
	public String divList(Model model) {
		model.addAttribute("AllDiv", publicrelationsService.seletAllPrDiv());
		return "festival_publicrelations/pr_divList";
	}
	
	//홍보 거래처리스트
	@GetMapping("/pr_comList")
	public String prCompanyList() {
		return "festival_publicrelations/pr_comList";
	}
	
	
	
	
	
	
}
