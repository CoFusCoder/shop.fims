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
	public String selectbyHuman(@RequestParam(value="humanCd") String humanCd, Model model) {
		
		System.out.println("humancd---------->" + humanCd);
		model.addAttribute("Human", humanservice.selectbyHuman(humanCd));
		
		return "/human/humanUpdate";
	}
	//인적사항수정처리
	@PostMapping("/humanUpdate")
	public String updateHuman(Human human) {
		
		System.out.println("human--------->"+human);
		
		return "redirect:/humanList";
	}
	//인적사항 삭제
	@GetMapping("/humanDelete")
	public String delectHuman() {
		
		return "/human/humanDelete";
	}
	
	//인적검색화면
	@GetMapping("/humanSearch")
	public String searchH() {
		
		return "/human/humanList";
	}
	//인적검색처리
	@PostMapping("/humanSearch")
	public String searchHuman(@RequestParam(value="fest_nm") String fest_nm, @RequestParam(value="feswork_div_nm") String feswork_div_nm,
							@RequestParam(value="fes_human_nm") String fes_human_nm, @RequestParam(value="fes_human_phone") String fes_human_phone,
							@RequestParam(value="fes_human_hour") String fes_human_hour ,@RequestParam(value="com_mem_nm2") String com_mem_nm2, Model model) {
		
		model.addAttribute("HumanList", humanservice.searchHuman(fest_nm, feswork_div_nm, com_mem_nm2, fes_human_nm, fes_human_phone, fes_human_hour));
		return "/human/humanList";
	}
	//인적사항 상세보기
	@GetMapping("/humanView")
	public String selecthumanView(@RequestParam(value="humanCd") String humanCd, Model model) {
		
		model.addAttribute("Human", humanservice.selecthumanView(humanCd));
		
		return "/human/humanView";
	}
}
