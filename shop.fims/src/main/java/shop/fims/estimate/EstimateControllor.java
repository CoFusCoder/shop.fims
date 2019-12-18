package shop.fims.estimate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import groovyjarjarpicocli.CommandLine.Model;

@Controller
public class EstimateControllor {
	
	//전체심사
	@GetMapping("/estimatelist")
	public String estimatelist() {
		return "/estimate/estimatelist";		
	}
	//신청서 내역 이동 
	@GetMapping("/apply")
	public String insertindex(Model model) {
		return "/estimate/apply";
	
	}
	//완료심사	
	@GetMapping("/finalestimatelist")
	public String finalsetimatlist() {
		return "/estimate/finalestimatelist";
	}
	
}
