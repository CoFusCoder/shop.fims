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
	
	
	//이벤트당첨자관리
	@GetMapping("/pr_eventwinnerList")
	public String selectEventWinnerByPmcd(@RequestParam(value="festpr_pro_cd")String festpr_pro_cd, Model model) {
		model.addAttribute("EveByPmcd", publicrelationsService.selectEventWinnerByPmcd(festpr_pro_cd));
		return "festival_publicrelations/pr_eventwinnerList";
	}
	
	//홍보분류 수정
	@GetMapping("/pr_updateDiv")
	public String updateDiv() {
		return "festival_publicrelations/pr_updateDiv";
	}
	
	//홍보분류 삭제
	@GetMapping("/pr_deleteDiv")
	public String deleteDiv(Model model) {
		model.addAttribute("AllDiv", publicrelationsService.seletAllPrDiv());
		return "festival_publicrelations/pr_divList";
	}
	
	//홍보분류 신규등록
	@GetMapping("/pr_insertDiv")
	public String insertDiv() {
		return "festival_publicrelations/pr_insertDiv";
	}

	
	//홍보사업삭제
	@GetMapping("/pr_deletePromotion")
	public String deletePromotion(Model model) {
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion());
		return "festival_publicrelations/pr_promotionList";	
	}
	
	//홍보사업수정 코드가져와서 다 해야됨. 
	@GetMapping("/pr_updatePromotion")
	public String updatePromotion() {
		return "festival_publicrelations/pr_updatePromotion";
	}
	
	
	//홍보사업 신규등록
	 @GetMapping("/pr_insertPromotion")
	 public String insertPromotion() {
		return "festival_publicrelations/pr_insertPromotion";
	 }
	
	
	 //홍보 프로모션코드로 세부사항조회
	 @GetMapping("/pr_promotionDetail") 
	 public String selectByPmcd(@RequestParam(value="festpr_pro_cd")String festpr_pro_cd, Model model) { 
		System.out.println("festpr_pro_cd"+festpr_pro_cd);
		model.addAttribute("selectByPmcd", publicrelationsService.selectByPmcd(festpr_pro_cd));
	 	return "festival_publicrelations/pr_promotionDetail";
	 }
	
	//홍보 월별타임테이블
	@GetMapping("/pr_timetable")
	public String Timetable() {
		return "festival_publicrelations/pr_timetable";
	}
	
	//홍보사업리스트 조회
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
