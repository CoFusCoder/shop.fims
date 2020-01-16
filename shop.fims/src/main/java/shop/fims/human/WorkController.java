package shop.fims.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	//축제업무분류수정화면
	@GetMapping("/workcategoryUpdate")
	public String selectupdateWorkCategory(@RequestParam(value="workcatCd") String workcatCd, Model model) {
		
		model.addAttribute("Work", workservice.selectupdateWorkCategory(workcatCd));
		
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
	//축제업무검색
	 @PostMapping("/workdivisionSearch")
	 public String searchWorkdivision(@RequestParam(value="fest_nm") String fest_nm, @RequestParam(value="feswork_cat_nm") String feswork_cat_nm,
			 						@RequestParam(value="feswork_div_nm") String feswork_div_nm, @RequestParam(value="com_mem_nm2") String com_mem_nm2,
			 						Model model) {
		 
		 model.addAttribute("WorkdivisionList", workservice.searchWorkdivision(fest_nm, feswork_cat_nm, feswork_div_nm, com_mem_nm2));

		 return "/work/workdivisionList";
	 }
	//축제업무등록
	@GetMapping("/workdivisionInsert")
	public String insertWorkDivision() {
		
		return "/work/workdivisionInsert";
	}
	//축제업무수정
	@GetMapping("/workdivisionUpdate")
	public String selectupdateWorkDivision(@RequestParam(value="workdivCd") String workdivCd, Model model) {
		
		model.addAttribute("Work", workservice.selectupdateWorkDivision(workdivCd));
		
		return "/work/workdivisionUpdate";
	}
	//축제업무삭제
	@GetMapping("/workdivisionDelete")
	public String delectWorkDivision() {
		
		return "/work/workdivisionDelete";
	}
}
