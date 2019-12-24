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
	@GetMapping("/prInsertEventwinner")
	public String pr_insertEventwinner(@RequestParam(value="festprProCd")String festprProCd, Model model2) {
		System.out.println("festprProCd==>"+festprProCd);
		model2.addAttribute("code", festprProCd);
		return "publicrelations/prInsertEventwinner";
	}
	//이벤트당첨자 수정
	@GetMapping("/prUpdateEventwinner")
	public String pr_updateEventwinner() {
		return "publicrelations/prUpdateEventwinner";
	}
	//이벤트당첨자 삭제
	@GetMapping("/prDeleteEventwinner")
	public String deleteEventWinnerByPmcd(Model model,HttpSession session) {
		String fest_cd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(fest_cd));
		return "publicrelations/prPromotionList";
	}
	//이벤트당첨자 조회
	@GetMapping("/prEventwinnerList")
	public String selectEventWinnerByPmcd(@RequestParam(value="festprProCd")String festprProCd, Model model, Model model2) {
		System.out.println("festprProCd==>"+festprProCd);
		model.addAttribute("EveByPmcd", publicrelationsService.selectEventWinnerByPmcd(festprProCd));
		model2.addAttribute("code", festprProCd);
		return "publicrelations/prEventwinnerList";
	}
	
	
	
	
	
	
	//홍보분류 수정
	@GetMapping("/prUpdateDiv")
	public String updateDiv() {
		return "publicrelations/prUpdateDiv";
	}
	
	//홍보분류 삭제
	@GetMapping("/prDeleteDiv")
	public String deleteDiv(Model model) {
		model.addAttribute("AllDiv", publicrelationsService.seletAllPrDiv());
		return "publicrelations/prDivList";
		
	}
	
	//홍보분류 신규등록
	@GetMapping("/prInsertDiv")
	public String insertDiv() {
		return "publicrelations/prInsertDiv";
	}

	
	//홍보사업삭제
	@GetMapping("/prDeletePromotion")
	public String deletePromotion(Model model, HttpSession session) {
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(festCd));
		return "publicrelations/prPromotionList";	
	}
	
	//홍보사업수정 코드가져와서 다 해야됨. 
	@GetMapping("/prUpdatePromotion")
	public String updatePromotion() {
		return "publicrelations/prUpdatePromotion";
	}
	
	
	//홍보사업 신규등록
	 @GetMapping("/prInsertPromotion")
	 public String insertPromotion() {
		return "publicrelations/prInsertPromotion";
	 }
	
	
	 //홍보 프로모션코드로 세부사항조회
	 @GetMapping("/prPromotionDetail") 
	 public String selectByPmcd(@RequestParam(value="festprProCd")String festprProCd, Model model) { 
		System.out.println("festprProCd"+festprProCd);
		model.addAttribute("selectByPmcd", publicrelationsService.selectByPmcd(festprProCd));
	 	return "publicrelations/prPromotionDetail";
	 }
	
	//홍보 월별타임테이블
	@GetMapping("/prTimetable")
	public String Timetable() {
		return "publicrelations/prTimetable";
	}
	
	//홍보사업리스트 조회
	@GetMapping("/prPromotionList")
	public String detailList(Model model,HttpSession session) {
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(festCd));
		return "publicrelations/prPromotionList";
	}
	
	//홍보 분류리스트
	@GetMapping("/prDivList")
	public String divList(Model model) {
		model.addAttribute("AllDiv", publicrelationsService.seletAllPrDiv());
		return "publicrelations/prDivList";
	}
	
	//홍보 거래처리스트
	@GetMapping("/prComList")
	public String prCompanyList() {
		return "publicrelations/prComList";
	}
	
	
	
	
	
	
}
