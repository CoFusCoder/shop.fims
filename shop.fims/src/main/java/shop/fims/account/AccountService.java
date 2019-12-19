package shop.fims.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Account;
import shop.fims.vo.AccountCatBus;

@Service
public class AccountService {
	
	@Autowired AccountMapper accountMapper;
	
	//모든 거래처 관리
	public List<Account> selectAllAccountView(){
		return accountMapper.selectAllAccountView();
	}
	
	//모든 거래처 상세조회 거래처코드로 조회
	public List<Account> selectByAccount(String cat_acc_cd){
		return accountMapper.selectByAccount(cat_acc_cd);
	}
	
	//모든 거래처 등록
	public int insertAllAccount(Account account) {
		return accountMapper.insertAllAccount(account);
	}
	
	//모든 거래처 삭제
	public int deleteAllAccount(Account account) {
		return accountMapper.deleteAllAccount(account);
	}
	
	//모든 거래처 수정화면. 거래처코드로 조회
	public Account selectByAllAccount(String cat_acc_cd) {
		return accountMapper.selectByAllAccount(cat_acc_cd);
	}
	
	//승인된 거래처 관리
	public List<Account> selectApprovalAccountView(){
		return accountMapper.selectApprovalAccountView();
	}	
	
	//거래처 업종 분류
	public List<Account> selectAccountCatBusView(){
		return accountMapper.selectAccountCatBusView();
	}
	
	//거래처 업종 분류 등록
	public int insertAccountCatBus(AccountCatBus accountCatBus) {
		return accountMapper.insertAccountCatBus(accountCatBus);
	}
}
