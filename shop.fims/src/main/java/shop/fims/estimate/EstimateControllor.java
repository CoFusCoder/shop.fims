package shop.fims.estimate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import groovyjarjarpicocli.CommandLine.Model;

@Controller
public class EstimateControllor {
	
	@Autowired Estimateservice estimatelist;
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
	//심사지표 이동	
	@GetMapping("/examination_index")
	public String finalsetimatlist() {
		return "/estimate/examination_index";
	}
	
}
