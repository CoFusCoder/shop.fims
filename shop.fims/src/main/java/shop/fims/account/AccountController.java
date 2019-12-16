package shop.fims.account;

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
	
	
	//거래처 회원 관리
	@GetMapping("/accountMemberView")
	public String AccountMember() {
		return "/account/accountMemberView";
	}
	
	//거래처 회원 등록
	@GetMapping("/insertAccountMember")
	public String InsertAccountMember() {
		return "/account/insertAccountMember";
	}
	
	//거래처 회원 수정
	@GetMapping("/updateAccountMember")
	public String UpdateAccountMember() {
		return "/account/updateAccountMember";
	}
	
	//모든 거래처 관리
	@GetMapping("/allAccountView")
	public String AllAccountView() {
		return "/account/allAccountView";
	}
	
	//모든 거래처 등록
	@GetMapping("/insertAllAccount")
	public String InsertAllAccount() {
		return "/account/insertAllAccount";
	}
	
	//모든 거래처 수정
	@GetMapping("/updateAllAccount")
	public String UpdateAllAccount() {
		return "/account/updateAllAccount";
	}
	
	//승인된 거래처 관리
	@GetMapping("/approvalAccountView")
	public String ApprovalAccountView() {
		return "/account/approvalAccountView";
	}
	
	//승인된 거래처 등록
	@GetMapping("/insertApprovalAccount")
	public String InsertApprovalAccount() {
		return "/account/insertApprovalAccount";
	}
	
	//승인된 거래처 수정
	@GetMapping("/updateApprovalAccount")
	public String UpdateApprovalAccount() {
		return "/account/updateApprovalAccount";
	}
	
}
