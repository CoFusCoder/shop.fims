package shop.fims.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkController {

	@Autowired
	private WorkService workservice;
	
	//축제업무분류리스트
	@GetMapping("/workcategoryList")
	public String selectWorkCategory(Model model) {
		
		model.addAttribute("WorkCategoryList", workservice.selectWorkCategory());
		
		return "/work/workcategoryList";
	}
	//축제업무분류등록
	@GetMapping("/workcategoryInsert")
	public String insertWorkCategory() {
		
		return "/work/workcategoryInsert";
	}
	//축제업무분류수정
	@GetMapping("/workcategoryUpdate")
	public String selectbyWorkCategory() {
		
		
		return "/work/workcategoryUpdate";
	}
	//축제업무분류삭제
	@GetMapping("/workcategoryDelete")
	public String delectWorkCategory() {
		
		return "/work/workcategoryDelete";
	}
	//축제업무리스트
	@GetMapping("/workdivisionList")
	public String selectWorkDivision(Model model) {
		
		model.addAttribute("WorkdivisionList", workservice.selectWorkDivision());
		
		return "/work/workdivisionList";
	}
	//축제업무등록
	@GetMapping("/workdivisionInsert")
	public String insertWorkDivision() {
		
		return "/work/workdivisionInsert";
	}
	//축제업무수정
	@GetMapping("/workdivisionUpdate")
	public String updateWorkDivision() {
		
		return "/work/workdivisionUpdate";
	}
	//축제업무삭제
	@GetMapping("/workdivisionDelete")
	public String delectWorkDivision() {
		
		return "/work/workdivisionDelete";
	}
}
