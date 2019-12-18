package shop.fims.committee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.fims.vo.Committee;

@Controller
public class CommitteeController {
	
	/*
	 * @file   CommitteeController.java
	 * @name   CommitteeController
	 * @brief  위원회 관련 
	 * @author ksmart33 김도민
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
	public String InsertAllCommittee(Committee committee) {
		committeeService.insertAllCommittee(committee);
		return "/committee/insertAllCommittee";
	}
	
	//위원회 수정
	@GetMapping("/updateAllCommittee")
	public String UpdateAllCommittee() {
		return "/committee/updateAllCommittee";
	}
}
