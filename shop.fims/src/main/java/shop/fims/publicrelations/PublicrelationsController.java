package shop.fims.publicrelations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;

@Controller
public class PublicrelationsController {
	@Autowired PublicrelationsService publicrelationsService;
	
	//홍보사업상세 조건검색
	@PostMapping("/searchPrDetail")
	public String searchPrDetail(@RequestParam(value="festprDivNm")String festprDivNm
								,@RequestParam(value="catAccNm1")String catAccNm1
								,@RequestParam(value="festprProNm")String festprProNm
								,@RequestParam(value="date1")String date1
								,@RequestParam(value="date2")String date2
								,@RequestParam(value="actionStatus")String actionStatus
								,HttpSession session, Model model1, Model model2) {									
		//System.out.println("홍보분류명:"+festprDivNm+"거래처명:"+catAccNm1+"홍보매체명:"+festprProNm+"날짜1:"+date1+"날짜2:"+date2+"마감여부:"+actionStatus);
		String festCd = (String)session.getAttribute("F_CD");
		model1.addAttribute("AllPromotion", publicrelationsService.searchPrDetail(festprDivNm, catAccNm1, festprProNm, date1, date2, actionStatus, festCd));
		model2.addAttribute("prDiv",publicrelationsService.selectAllPrDiv());
		return "publicrelations/prPromotionList";
	}
	
	
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
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(festCd));
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
	@PostMapping("/prUpdateDiv")
	public String updateDiv(PrDiv prdiv, ServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		//System.out.println("prdiv:"+prdiv);
		publicrelationsService.updateDiv(prdiv);
		PrintWriter out = response.getWriter();
		out.println("<script>alert('홍보분류가 수정되었습니다.'); location.href='/prDivList';</script>");
		out.flush();
		return "redirect:/prDivList";
	}
	
	//홍보분류 삭제
	@GetMapping("/prDeleteDiv")
	public String deleteDiv(@RequestParam(value="festprDivCd")String festprDivCd, 
			ServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		//System.out.println("festprDivCd:"+festprDivCd);
		publicrelationsService.deleteDiv(festprDivCd);
		PrintWriter out = response.getWriter();
		out.println("<script>alert('홍보분류가 삭제되었습니다.'); location.href='/prDivList';</script>");
		out.flush();
		return "redirect:/prDivList";
		
	}
	
	//홍보분류 신규등록
	@PostMapping("/prInsertDiv")
	public String insertDiv(PrDiv prdiv, Model model, ServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("prdiv:"+prdiv);
		publicrelationsService.insertPrDiv(prdiv);
		PrintWriter out = response.getWriter();
		out.println("<script>alert('홍보분류가 등록되었습니다.'); location.href='/prDivList';</script>");
		out.flush();
		return "redirect:/prDivList";
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
		return "publicrelations/prDivList";
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
	public String detailList(Model model1, Model model2, HttpSession session) {
		String festCd = (String)session.getAttribute("F_CD");
		model1.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(festCd));
		model2.addAttribute("prDiv",publicrelationsService.selectAllPrDiv());
		return "publicrelations/prPromotionList";
	}
	
	//홍보 분류리스트
	@GetMapping("/prDivList")
	public String divList(Model model) {
		model.addAttribute("AllDiv", publicrelationsService.selectAllPrDiv());
		return "publicrelations/prDivList";
	}
	
	//홍보 거래처리스트
	@GetMapping("/prComList")
	public String prCompanyList() {
		return "publicrelations/prComList";
	}
	
	
	
	
	
	
}
