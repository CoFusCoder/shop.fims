package shop.fims.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HumanController {

	//인적사항 리스트
	@GetMapping("/humanList")
	public String selectHuman() {
		
		return "/human/humanList";
	}
	//인적사항 등록
	@GetMapping("/humanInsert")
	public String insertHuman() {
		
		return "/human/humanInsert";
	}
	
	//인적사항 수정
	@GetMapping("/humanUpdate")
	public String updateHuman() {
		
		return "/human/humanUpdate";
	}
	//인적사항 삭제
	@GetMapping("/humanDelete")
	public String delectHuman() {
		
		return "/human/humanDelete";
	}
	
}
