package shop.fims.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Account;
import shop.fims.vo.AccountCatBus;
import shop.fims.vo.AccountMember;
import shop.fims.vo.AppAccount;

@Service
public class AccountService {
	
	@Autowired AccountMapper accountMapper;
	
	//거래처 관리
	public List<Account> selectAllAccountView(){
		return accountMapper.selectAllAccountView();
	}
	
	//거래처 상세조회 거래처코드로 조회
	public List<Account> selectByAccount(String catAccCd){
		return accountMapper.selectByAccount(catAccCd);
	}
	
	//거래처 등록
	public int insertAllAccount(Account account) {
		return accountMapper.insertAllAccount(account);
	}
	
	//거래처 삭제
	public int deleteAllAccount(Account account) {
		return accountMapper.deleteAllAccount(account);
	}
	
	//거래처 수정화면. 거래처코드로 조회
	public Account selectByAllAccount(String catAccCd) {
		return accountMapper.selectByAllAccount(catAccCd);
	}

	//거래처 수정
	public int updateAllAccount(Account account) {
		return accountMapper.updateAllAccount(account);
	}
	
	//거래처 검색
	public List<Account> searchAccount(String sk, String sv){
		return accountMapper.searchAccount(sk,sv);
	}
	
	//거래처 업종 분류
	public List<AccountCatBus> selectAccountCatBusView(){
		return accountMapper.selectAccountCatBusView();
	}
	
	//거래처 업종 분류 등록
	public int insertAccountCatBus(AccountCatBus accountCatBus) {
		return accountMapper.insertAccountCatBus(accountCatBus);
	}
	
	//거래처업종 분류 수정화면 거래처 업종 분류코드로 조회
	public AccountCatBus selectByAccCatBus(String catBusAccCd) {
		return accountMapper.selectByAccCatBus(catBusAccCd);
	}	
	
	//거래처 업종 분류 수정
	public int updateAccountCatBus(AccountCatBus accountCatBus) {
		return accountMapper.updateAccountCatBus(accountCatBus);
	}

	//거래처 업종 분류 삭제
	public int deleteAccountCatBus(AccountCatBus accountCatBus) {
		return accountMapper.deleteAccountCatBus(accountCatBus);
	}
	
	//거래처 업종 분류 검색
	public List<AccountCatBus> searchAccountCatBus(String sk, String sv){
		return accountMapper.searchAccountCatBus(sk,sv);
	}
	
	//승인된 거래처 관리
	public List<AppAccount> selectApprovalAccountView(){
		return accountMapper.selectApprovalAccountView();
	}
	
	//승인된 거래처 상세조회 승인된 거래처 코드로 조회
	public List<AppAccount> selectByApprovalAccount(String catAppAccCd){
		return accountMapper.selectByApprovalAccount(catAppAccCd);
	}
	
	//승인된 거래처 등록
	public int insertApprovalAccount(AppAccount appAccount) {
		return accountMapper.insertApprovalAccount(appAccount);
	}
	
	//승인된 거래처 삭제
	public int deleteApprovalAccount(AppAccount appAccount) {
		return accountMapper.deleteApprovalAccount(appAccount);
	}
	
	//승인된 거래처 수정화면 승인된 거래처 코드로 조회
	public AppAccount selectByUpApprovalAccount(String catAppAccCd){
		return accountMapper.selectByUpApprovalAccount(catAppAccCd);
	}
	
	//승인된 거래처 수정
	public int updateApprovalAccount(AppAccount appAccount) {
		return accountMapper.updateApprovalAccount(appAccount);
	}
	
	//승인된 거래처 검색
	public List<AppAccount> searchApprovalAccount(String sk, String sv){
		return accountMapper.searchApprovalAccount(sk, sv);
	}
	
	//거래처 회원 관리
	public List<AccountMember> selectAccountMemberView(){
		return accountMapper.selectAccountMemberView();
	}
	
	//거래처 회원 상세보기 거래처 회원 코드로 조회
	public List<AccountMember> selectByAccountMember(String accMemCd){
		return accountMapper.selectByAccountMember(accMemCd);
	}
	
	//거래처 회원 등록
	public int insertAccountMember(AccountMember accountMember) {
		return accountMapper.insertAccountMember(accountMember);
	}
	
	//거래처 회원 수정화면 거래처 회원 코드로 조회
	public AccountMember selectUpAccountMember(String accMemCd){
		return accountMapper.selectUpAccountMember(accMemCd);
	}
	
	//거래처 회원 수정
	public int updateAccountMember(AccountMember accountMember) {
		return accountMapper.updateAccountMember(accountMember);
	}
	
	//승인된 거래처 삭제
	public int deleteAccountMember(AccountMember accountMember) {
		return accountMapper.deleteAccountMember(accountMember);
	}
}
