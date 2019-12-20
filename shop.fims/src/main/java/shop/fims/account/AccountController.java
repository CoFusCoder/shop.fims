package shop.fims.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Account;
import shop.fims.vo.AccountCatBus;

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
	public String selectAccountMember() {
		return "/account/accountMemberView";
	}
	
	//거래처 회원 등록
	@GetMapping("/insertAccountMember")
	public String insertAccountMember() {
		return "/account/insertAccountMember";
	}
	
	//거래처 회원 수정
	@GetMapping("/updateAccountMember")
	public String updateAccountMember() {
		return "/account/updateAccountMember";
	}
	
	//모든 거래처 관리
	@GetMapping("/allAccountView")
	public String selectAllAccountView(Model model) {
		model.addAttribute("selectAllAccountView", accountService.selectAllAccountView());
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
	public String insertAllAccount() {
		return "account/insertAllAccount";
	}
	
	//모든 거래처 등록
	@PostMapping("/insertAllAccount")
	public String insertAllAccount(Account account) {
		accountService.insertAllAccount(account);
		return "redirect:/allAccountView";
	}
	
	//거래처 삭제
	@GetMapping("/deleteAllAccount")
	public String deleteAllAccount(Account account) {
		accountService.deleteAllAccount(account);
		return "redirect:/allAccountView";
	}
	
	//모든 거래처 수정화면. 거래처코드로 조회
	@GetMapping("/updateAllAccount")
	public String updateAllAccount(@RequestParam(value="cat_acc_cd", required = false)String cat_acc_cd, Model model) { 
		model.addAttribute("selectByAllAccount", accountService.selectByAllAccount(cat_acc_cd));
		return "account/updateAllAccount";
	}
	
	//승인된 거래처 관리
	@GetMapping("/approvalAccountView")
	public String selectApprovalAccountView(Model model) {
		model.addAttribute("selectApprovalAccountView", accountService.selectApprovalAccountView());
		return "account/approvalAccountView";
	}
	
	//승인된 거래처 등록
	@GetMapping("/insertApprovalAccount")
	public String insertApprovalAccount() {
		return "/account/insertApprovalAccount";
	}
	
	//승인된 거래처 수정
	@GetMapping("/updateApprovalAccount")
	public String updateApprovalAccount() {
		return "/account/updateApprovalAccount";
	}
	
	//거래처 업종 분류
	@GetMapping("/accountCatBusView")
	public String selectAccountCatBusView(Model model) {
		model.addAttribute("selectAccountCatBusView", accountService.selectAccountCatBusView());
		return "account/accountCatBusView";
	}
	
	//거래처 업종 분류 등록화면
	@GetMapping("/insertAccountCatBus")
	public String insertAccountCatBus() {
		return "account/insertAccountCatBus";
	}
	
	//거래처 업종 분류 등록
	@PostMapping("/insertAccountCatBus")
	public String insertAccountCatBus(AccountCatBus accountCatBus) {
		accountService.insertAccountCatBus(accountCatBus);
		return "redirect:/accountCatBusView";
	}
	
	//거래처업종 분류 수정화면 거래처 업종 분류코드로 조회
	@GetMapping("/updateAccountCatBus") 
	public String updateAccountCatBus(@RequestParam(value="catbus_acc_cd", required = false)String catbus_acc_cd, Model model) { 
		model.addAttribute("selectByAccCatBus", accountService.selectByAccCatBus(catbus_acc_cd));
		return "account/updateAccountCatBus";
	}
		
}
