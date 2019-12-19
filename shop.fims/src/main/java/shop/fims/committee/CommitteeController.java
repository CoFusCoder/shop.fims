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
	public String selectAllCommitteeView(Model model) {
		model.addAttribute("allCommitteeView", committeeService.selectAllCommitteeView());
		return "committee/allCommitteeView";
	}
	
	//위원회 상세조회 위원회 코드로 조회
	@GetMapping("/allCommitteeDetail") 
		public String selectByCommittee(@RequestParam(value="man_com_cd", required = false)String man_com_cd, Model model) { 
		model.addAttribute("selectByCommittee", committeeService.selectByCommittee(man_com_cd));
		return "committee/allCommitteeDetail";
	}
	
	//위원회 등록화면
	@GetMapping("/insertAllCommittee")
	public String insertAllCommittee() {
		return "committee/insertAllCommittee";
	}
	
	//위원회 등록
	@PostMapping("/insertAllCommittee")
	public String insertAllCommittee(Committee committee) {
		committeeService.insertAllCommittee(committee);
		return "redirect:/allCommitteeView";
	}
	
	//위원회 삭제
	@GetMapping("/deleteAllCommittee")
	public String deleteAllCommittee(Committee committee) {
		committeeService.deleteAllCommittee(committee);
		return "redirect:/allCommitteeView";
	}
	
	//위원회 수정화면. 위원회 코드로 조회
	@GetMapping("/updateAllCommittee")
	public String updateAllCommittee(@RequestParam(value="man_com_cd", required = false)String man_com_cd, Model model) { 
		model.addAttribute("selectByAllCommittee", committeeService.selectByAllCommittee(man_com_cd));
		return "committee/updateAllCommittee";
	}

	
	
	
	 
	 
}
