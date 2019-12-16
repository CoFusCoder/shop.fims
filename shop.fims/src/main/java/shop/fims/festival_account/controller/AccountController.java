package shop.fims.festival_account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
	
	/*
	 * @file   AccountController.java
	 * @name   AccountController
	 * @brief  거래처 관련 조회
	 * @author ksmart33 김도민
	 */
	
	
	//거래처 회원 화면 이동
	@GetMapping("/festival_account/accountMemberView")
	public String AccountMember() {
		return "festival_account/accountMemberView";
	}
	
	//모든거래처 화면 이동
	@GetMapping("/festival_account/allAccountView")
	public String AllAccountView() {
		return "festival_account/allAccountView";
	}
	
	//승인된거래처 화면 이동
	@GetMapping("/festival_account/approvalAccountView")
	public String ApprovalAccountView() {
		return "festival_account/approvalAccountView";
	}
	
}
