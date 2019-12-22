package shop.fims.publicrelations;

import javax.servlet.http.HttpSession;

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
	
	//이벤트당첨자 등록
	@GetMapping("/pr_insertEventwinner")
	public String pr_insertEventwinner(@RequestParam(value="festpr_pro_cd")String festpr_pro_cd, Model model2) {
		System.out.println("festpr_pro_cd==>"+festpr_pro_cd);
		model2.addAttribute("code", festpr_pro_cd);
		return "publicrelations/pr_insertEventwinner";
	}
	//이벤트당첨자 수정
	@GetMapping("/pr_updateEventwinner")
	public String pr_updateEventwinner() {
		return "publicrelations/pr_updateEventwinner";
	}
	//이벤트당첨자 삭제
	@GetMapping("/pr_deleteEventwinner")
	public String deleteEventWinnerByPmcd(Model model,HttpSession session) {
		String fest_cd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(fest_cd));
		return "publicrelations/pr_promotionList";
	}
	//이벤트당첨자 조회
	@GetMapping("/pr_eventwinnerList")
	public String selectEventWinnerByPmcd(@RequestParam(value="festpr_pro_cd")String festpr_pro_cd, Model model, Model model2) {
		System.out.println("festpr_pro_cd==>"+festpr_pro_cd);
		model.addAttribute("EveByPmcd", publicrelationsService.selectEventWinnerByPmcd(festpr_pro_cd));
		model2.addAttribute("code", festpr_pro_cd);
		return "publicrelations/pr_eventwinnerList";
	}
	
	
	
	
	
	
	//홍보분류 수정
	@GetMapping("/pr_updateDiv")
	public String updateDiv() {
		return "publicrelations/pr_updateDiv";
	}
	
	//홍보분류 삭제
	@GetMapping("/pr_deleteDiv")
	public String deleteDiv(Model model) {
		model.addAttribute("AllDiv", publicrelationsService.seletAllPrDiv());
		return "publicrelations/pr_divList";
		
	}
	
	//홍보분류 신규등록
	@GetMapping("/pr_insertDiv")
	public String insertDiv() {
		return "publicrelations/pr_insertDiv";
	}

	
	//홍보사업삭제
	@GetMapping("/pr_deletePromotion")
	public String deletePromotion(Model model, HttpSession session) {
		String fest_cd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(fest_cd));
		return "publicrelations/pr_promotionList";	
	}
	
	//홍보사업수정 코드가져와서 다 해야됨. 
	@GetMapping("/pr_updatePromotion")
	public String updatePromotion() {
		return "publicrelations/pr_updatePromotion";
	}
	
	
	//홍보사업 신규등록
	 @GetMapping("/pr_insertPromotion")
	 public String insertPromotion() {
		return "publicrelations/pr_insertPromotion";
	 }
	
	
	 //홍보 프로모션코드로 세부사항조회
	 @GetMapping("/pr_promotionDetail") 
	 public String selectByPmcd(@RequestParam(value="festpr_pro_cd")String festpr_pro_cd, Model model) { 
		System.out.println("festpr_pro_cd"+festpr_pro_cd);
		model.addAttribute("selectByPmcd", publicrelationsService.selectByPmcd(festpr_pro_cd));
	 	return "publicrelations/pr_promotionDetail";
	 }
	
	//홍보 월별타임테이블
	@GetMapping("/pr_timetable")
	public String Timetable() {
		return "publicrelations/pr_timetable";
	}
	
	//홍보사업리스트 조회
	@GetMapping("/pr_promotionList")
	public String detailList(Model model,HttpSession session) {
		String fest_cd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(fest_cd));
		return "publicrelations/pr_promotionList";
	}
	
	//홍보 분류리스트
	@GetMapping("/pr_divList")
	public String divList(Model model) {
		model.addAttribute("AllDiv", publicrelationsService.seletAllPrDiv());
		return "publicrelations/pr_divList";
	}
	
	//홍보 거래처리스트
	@GetMapping("/pr_comList")
	public String prCompanyList() {
		return "publicrelations/pr_comList";
	}
	
	
	
	
	
	
}
