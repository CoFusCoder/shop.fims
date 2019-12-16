package shop.fims.publicrelations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicrelationsController {
	
	//홍보 월별타임테이블
	@GetMapping("/pr_timetable")
	public String Timetable() {
		return "festival_publicrelations/pr_timetable";
	}
	
	//홍보사업 세부리스트
	@GetMapping("/pr_detailList")
	public String detailList() {
		return "festival_publicrelations/pr_detailList";
	}
	
	//홍보 분류리스트
	@GetMapping("/pr_divList")
	public String divList() {
		return "festival_publicrelations/pr_divList";
	}
	
	//홍보 거래처리스트
	@GetMapping("/pr_comList")
	public String prCompanyList() {
		return "festival_publicrelations/pr_comList";
	}
	
	
	
	
	
	
}
