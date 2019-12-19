package shop.fims.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Account;

@Controller
public class AccountController {
	
	/*
	 * @file   AccountController.java
	 * @name   AccountController
	 * @brief  거래처 관련 조회
	 * @author fims 김도민
	 */
	
	@Autowired AccountService accountService;
	
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
	public String AllAccountView(Model model) {
		model.addAttribute("allAccountView", accountService.selectAllAccountView());
		return "/account/allAccountView";
	}
	
	//모든 거래처 상세조회 거래처코드로 조회
	@GetMapping("/allAccountDetail") 
		public String selectByAccount(@RequestParam(value="cat_acc_cd", required = false)String cat_acc_cd, Model model) { 
		model.addAttribute("selectByAccount", accountService.selectByAccount(cat_acc_cd));
		return "account/allAccountDetail";
	}
	
	//거래처 등록화면
	@GetMapping("/insertAllAccount")
	public String InsertAllCommittee() {
		return "account/insertAllAccount";
	}
	
	//모든 거래처 등록
	@PostMapping("/insertAllAccount")
	public String InsertAllAccount(Account account) {
		accountService.insertAllAccount(account);
		return "redirect:/allAccountView";
	}
	
	//거래처 삭제
	@GetMapping("/deleteAllAccount")
	public String DeleteAllAccount(Account account) {
		accountService.deleteAllAccount(account);
		return "redirect:/allAccountView";
	}
	
	//모든 거래처 수정화면. 거래처코드로 조회
	@GetMapping("/updateAllAccount")
	public String UpdateAllAccount(@RequestParam(value="cat_acc_cd", required = false)String cat_acc_cd, Model model) { 
		model.addAttribute("selectByAllAccount", accountService.selectByAllAccount(cat_acc_cd));
		return "account/updateAllAccount";
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
	
	//거래처 업종 분류
	@GetMapping("/accountCatBusView")
	public String AccountCatBusView(Model model) {
		model.addAttribute("accountCatBusView", accountService.accountCatBusView());
		return "/account/accountCatBusView";
	}
	
	//거래처 업종 분류 등록화면
	@GetMapping("/insertAccountCatBus")
	public String InsertAccountCatBus() {
		return "account/insertAccountCatBus";
	}
	
	//거래처 업종 분류 등록
	@PostMapping("/insertAccountCatBus")
	public String InsertAccountCatBus(Account account) {
		accountService.insertAccountCatBus(account);
		return "redirect:/insertAccountCatBusView";
	}	
	
}
