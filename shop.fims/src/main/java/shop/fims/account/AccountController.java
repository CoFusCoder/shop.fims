package shop.fims.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Account;
import shop.fims.vo.AccountCatBus;
import shop.fims.vo.AccountMember;
import shop.fims.vo.AppAccount;

@Controller
public class AccountController {
	
	@Autowired AccountService accountService;
	
	
	//모든 거래처 관리
	@GetMapping("/allAccountView")
	public String selectAllAccountView(Model model) {
		model.addAttribute("allAccountView", accountService.selectAllAccountView());
		return "account/allAccountView";
	}
	
	//거래처 상세조회 거래처코드로 조회
	@GetMapping("/allAccountDetail") 
		public String selectByAccount(@RequestParam(value="catAccCd")String catAccCd, Model model) { 
		model.addAttribute("selectByAccount", accountService.selectByAccount(catAccCd));
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
	
	//거래처 수정화면. 거래처코드로 조회
	@GetMapping("/updateAllAccount")
	public String updateAllAccount(@RequestParam(value="catAccCd", required=false)String catAccCd, Model model) { 
		model.addAttribute("selectByAllAccount", accountService.selectByAllAccount(catAccCd));
		return "account/updateAllAccount";
	}
	
	//거래처 수정
	@PostMapping("/updateAllAccount")
	public String updateAllAccount(Account account) {
		accountService.updateAllAccount(account);
		return "redirect:/allAccountView";
	}
	
	//거래처 검색
	@PostMapping("/searchAccount")
	public String searchAccount(	@RequestParam(value="sk")String sk,
									@RequestParam(value="sv")String sv,
									Model model) {
		model.addAttribute("allAccountView", accountService.searchAccount(sk, sv));
		return "account/allAccountView";
		
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
	
	//거래처 업종 분류 수정화면 거래처 업종 분류코드로 조회
	@GetMapping("/updateAccountCatBus") 
	public String updateAccountCatBus(@RequestParam(value="catBusAccCd", required = false)String catBusAccCd, Model model) { 
		model.addAttribute("selectByAccCatBus", accountService.selectByAccCatBus(catBusAccCd));
		return "account/updateAccountCatBus";
	}
	
	//거래처 업종 분류 수정
	@PostMapping("/updateAccountCatBus")
	public String updateAccountCatBus(AccountCatBus accountCatBus) {
		accountService.updateAccountCatBus(accountCatBus);
		return "redirect:/accountCatBusView";
	}
	
	//거래처 업종 분류 삭제
	@GetMapping("/deleteAccountCatBus")
	public String deleteAccountCatBus(AccountCatBus accountCatBus) {
		accountService.deleteAccountCatBus(accountCatBus);
		return "redirect:/accountCatBusView";
	}
	
	//거래처 업종 분류 검색
	@PostMapping("/searchAccountCatBus")
	public String searchAccountCatBus(	@RequestParam(value="sk")String sk,
										@RequestParam(value="sv")String sv,
										Model model) {
		model.addAttribute("selectAccountCatBusView", accountService.searchAccountCatBus(sk, sv));
		return "account/accountCatBusView";
	}
	
	//승인된 거래처 관리
	@GetMapping("/approvalAccountView")
	public String selectApprovalAccountView(Model model) {
		model.addAttribute("selectApprovalAccountView", accountService.selectApprovalAccountView());
		return "account/approvalAccountView";
	}
	
	//승인된 거래처 상세화면
	@GetMapping("/approvalAccountDetail") 
		public String selectByApprovalAccount(@RequestParam(value="catAppAccCd", required =false )String catAppAccCd, Model model) {
		model.addAttribute("selectByApprovalAccount", accountService.selectByApprovalAccount(catAppAccCd));
		return "account/approvalAccountDetail";
	}
	
	//승인된 거래처 등록화면
	@GetMapping("/insertApprovalAccount")
	public String insertApprovalAccount() {
		return "account/insertApprovalAccount";
	}
	
	//승인된 거래처 등록
	@PostMapping("/insertApprovalAccount")
	public String insertApprovalAccount(AppAccount appAccount) {
		accountService.insertApprovalAccount(appAccount);
		return "redirect:/approvalAccountView";
	}
	
	//승인된 거래처 삭제
	@GetMapping("/deleteApprovalAccount")
	public String deleteApprovalAccount(AppAccount appAccount) {
		accountService.deleteApprovalAccount(appAccount);
		return "redirect:/approvalAccountView";
	}
	
	//승인된 거래처 수정화면 승인된 거래처 코드로 조회
	@GetMapping("/updateApprovalAccount")
	public String updateApprovalAccount(@RequestParam(value="catAppAccCd", required=false)String catAppAccCd, Model model) {
		model.addAttribute("selectByUpApprovalAccount", accountService.selectByUpApprovalAccount(catAppAccCd));
		return "account/updateApprovalAccount";
	}
	
	//승인된 거래처 수정
	@PostMapping("/updateApprovalAccount")
	public String updateApprovalAccount(AppAccount appAccount) {
		accountService.updateApprovalAccount(appAccount);
		return "redirect:/approvalAccountView";
	}
	
	//승인된 거래처 검색
	@PostMapping("/searchApprovalAccount")
	public String searchApprovalAccount(	@RequestParam(value="sk")String sk,
											@RequestParam(value="sv")String sv,
											Model model) {
		model.addAttribute("selectApprovalAccountView", accountService.searchApprovalAccount(sk,sv));
		return "account/approvalAccountView";
	}
	
	//거래처 회원 관리
	@GetMapping("/accountMemberView")
	public String selectAccountMemberView(Model model) {
		model.addAttribute("selectAccountMemberView", accountService.selectAccountMemberView());
		return "account/accountMemberView";
	}
	
	//거래처 회원 등록화면
	@GetMapping("/insertAccountMember")
	public String insertAccountMember() {
		return "account/insertAccountMember";
	}
	
	//거래처 회원 등록
	@PostMapping("/insertAccountMember")
	public String insertAccountMember(AccountMember accountMember) {
		accountService.insertAccountMember(accountMember);
		return "redirect:/accountMemberView";
	}

	//거래처 회원 상세보기 거래처 회원 코드로 조회
	@GetMapping("/accountMemberDetail")
	public String selectByAccountMember(@RequestParam(value="accMemCd")String accMemCd, Model model) {
		model.addAttribute("selectByAccountMember", accountService.selectByAccountMember(accMemCd));
		return "account/accountMemberDetail";
	}
	
	//거래처 회원 수정화면. 거래처 회원 코드로 조회
	@GetMapping("/updateAccountMember")
	public String selectUpAccountMember(@RequestParam(value="accMemCd")String accMemCd, Model model) {
		model.addAttribute("selectUpAccountMember", accountService.selectUpAccountMember(accMemCd));
		return "account/updateAccountMember";
	}
	
	//거래처 회원 수정
	@PostMapping("/updateAccountMember")
	public String updateAccountMember(AccountMember accountMember) {
		accountService.updateAccountMember(accountMember);
		return "redirect:/accountMemberView";
	}
	
	//거래처 회원 삭제
	@GetMapping("/deleteAccountMember")
	public String deleteAccountMember(AccountMember accountMember) {
		accountService.deleteAccountMember(accountMember);
		return "redirect:/accountMemberView";
	}
}
