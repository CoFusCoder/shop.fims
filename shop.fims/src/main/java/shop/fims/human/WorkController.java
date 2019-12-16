package shop.fims.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkController {

	//축제업무분류리스트
	@GetMapping("/workcategoryList")
	public String selectWorkCategory() {
		
		return "/work/workcategoryList";
	}
	//축제업무분류등록
	@GetMapping("/workcategoryInsert")
	public String insertWorkCategory() {
		
		return "/work/workcategoryInsert";
	}
	//축제업무분류수정
	@GetMapping("/workcategoryUpdate")
	public String updateWorkCategory() {
		
		return "/work/workcategoryUpdate";
	}
	//축제업무분류삭제
	@GetMapping("/workcategoryDelete")
	public String delectWorkCategory() {
		
		return "/work/workcategoryDelete";
	}
	//축제업무리스트
	@GetMapping("/workdivisionList")
	public String selectWorkDivision() {
		
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
