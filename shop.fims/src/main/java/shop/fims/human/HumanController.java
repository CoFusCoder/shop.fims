package shop.fims.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Human;

@Controller
public class HumanController {

	@Autowired
	private HumanService humanservice;
	
	//인적사항 리스트
	@GetMapping("/humanList")
	public String selectHuman(Model model) {
		
		model.addAttribute("HumanList", humanservice.selectHuman());
		return "/human/humanList";
	}
	//인적사항 등록
	@GetMapping("/humanInsert")
	public String insertHuman() {
		
		return "/human/humanInsert";
	}
	//인적사항등록
	@PostMapping("/memberInsert")
	public String insertHuman(Human human) {
		
		System.out.println("humanNm---->" + human.toString());
		
		return "redirect:/humanList";
	}
	//인적사항 수정
	@GetMapping("/humanUpdate")
	public String selectbyHuman(@RequestParam(value="humancd") String humancd, Model model) {
		
		System.out.println("humancd---------->" + humancd);
		model.addAttribute("Human", humanservice.selectbyHuman(humancd));
		
		return "/human/humanUpdate";
	}
	//인적사항수정처리
	@PostMapping("/humanUpdate")
	public String updateHuman() {
		
		
		return "redirect:/humanList";
	}
	//인적사항 삭제
	@GetMapping("/humanDelete")
	public String delectHuman() {
		
		return "/human/humanDelete";
	}
	
}
