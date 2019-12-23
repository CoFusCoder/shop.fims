package shop.fims.estimate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EstimateControllor {
	
	@Autowired Estimateservice estimateservice;
	
	/**
	 * 심사 대기,결과 리스트
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/estimatelist")
	public String estimatelist() {
		return "estimate/estimatelist";		
	}
	//신청서 내역 이동 
	@GetMapping("/apply")
	public String insertindex(Model model) {
		return "/estimate/apply";
	
	}		
	//심사지표 이동,심사명 선택	
	@GetMapping("/examinationIndex")
	public String examinationIndex(Model model) {
		model.addAttribute("examinateionidex", estimateservice.examinationIndex());
		return "estimate/examinationIndex";
	}
	//심사결과 상세보기
	@GetMapping("/estimatelistdetail")
	public String estimatelistdetail() {
		return "estimate/estimatelistdetail";
	}
	
}
