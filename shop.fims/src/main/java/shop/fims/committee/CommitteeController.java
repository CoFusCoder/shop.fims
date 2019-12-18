package shop.fims.committee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Committee;

@Controller
public class CommitteeController {
	
	/*
	 * @file   CommitteeController.java
	 * @name   CommitteeController
	 * @brief  위원회 관련 
	 * @author fims 김도민
	 */
	
	@Autowired CommitteeService committeeService;
	
	//위원회 관리
	@GetMapping("/allCommitteeView")
	public String AllCommitteeView(Model model) {
		model.addAttribute("allCommitteeView", committeeService.selectAllCommitteeView());
		return "committee/allCommitteeView";
	}
	
	//위원회 등록화면
	@GetMapping("/insertAllCommittee")
	public String InsertAllCommittee() {
		return "/committee/insertAllCommittee";
	}
	
	//위원회 등록
	@PostMapping("/insertAllCommittee")
	public String InsertAllCommittee(Model model) {
		committeeService.insertAllCommittee(model);
		return "redirect:/allCommitteeView";
	}
	
	//위원회 삭제
	@GetMapping("/deleteAllCommittee")
	public String DeleteAllCommittee(Model model) {
		committeeService.deleteAllCommittee(model);
		return "redirect:/allCommitteeView";
	}
	
	//위원회 수정화면. 위원회 코드로 조회
	@GetMapping("/updateAllCommittee")
	public String UpdateAllCommittee(@RequestParam (value="man_com_cd") String man_com_cd, Model model) {
		model.addAttribute("getAllCommittee", committeeService.selectByAllCommittee(man_com_cd));
		return "committee/updateAllCommittee";
	}

	
	
	
	 
	 
}
