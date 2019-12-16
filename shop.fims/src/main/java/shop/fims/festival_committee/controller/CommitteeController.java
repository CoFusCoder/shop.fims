package shop.fims.festival_committee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommitteeController {
	
	/*
	 * @file   CommitteeController.java
	 * @name   CommitteeController
	 * @brief  위원회 관련 
	 * @author ksmart33 김도민
	 */
	
	//위원회화면관련메서드
	@GetMapping("/festival_committee/allCommitteeView")
	public String AllCommitteeView() {
		return "festival_committee/allCommitteeView";
	}
}
