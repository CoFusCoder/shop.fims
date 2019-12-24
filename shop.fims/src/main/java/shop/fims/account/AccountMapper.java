package shop.fims.account;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Account;
import shop.fims.vo.AccountCatBus;
import shop.fims.vo.AppAccount;

@Mapper
public interface AccountMapper {
	
	//모든 거래처 관리
	public List<Account> selectAllAccountView();
	
	//모든 거래처 상세조회 거래처코드로 조회
	public List<Account> selectByAccount(String catAccCd);
	
	//모든 거래처 등록
	public int insertAllAccount(Account account);
	
	//모든 거래처 삭제
	public int deleteAllAccount(Account account);
	
	//모든 거래처 수정화면. 거래처코드로 조회
	public Account selectByAllAccount(String catAccCd);
	
	//거래처 수정
	public int updateAllAccount(Account account);
	
	//승인된 거래처 관리
	public List<Account> selectApprovalAccountView();	
	

	
	//거래처 업종 분류
	public List<Account> selectAccountCatBusView();
	
	//거래처 업종 분류 등록
	public int insertAccountCatBus(AccountCatBus accountCatBus);
	
	//거래처업종 분류 수정화면 거래처 업종 분류코드로 조회
	public AccountCatBus selectByAccCatBus(String catBusAccCd);
	
}
