package shop.fims.account;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Account;
import shop.fims.vo.AccountCatBus;
import shop.fims.vo.AccountMember;
import shop.fims.vo.AppAccount;

@Mapper
public interface AccountMapper {
	
	//거래처 관리
	public List<Account> selectAllAccountView();
	
	//거래처 상세조회 거래처코드로 조회
	public List<Account> selectByAccount(String catAccCd);
	
	//거래처 등록
	public int insertAllAccount(Account account);
	
	//거래처 삭제
	public int deleteAllAccount(Account account);
	
	//거래처 수정화면. 거래처코드로 조회
	public Account selectByAllAccount(String catAccCd);
	
	//거래처 검색
	public List<Account>searchAccount(String sk, String sv);
	
	//거래처 수정
	public int updateAllAccount(Account account);

	//거래처 업종 분류
	public List<AccountCatBus> selectAccountCatBusView();
	
	//거래처 업종 분류 등록
	public int insertAccountCatBus(AccountCatBus accountCatBus);
	
	//거래처업종 분류 수정화면 거래처 업종 분류코드로 조회
	public AccountCatBus selectByAccCatBus(String catBusAccCd);
	
	//거래처 업종 분류 수정
	public int updateAccountCatBus(AccountCatBus accountCatBus);
	
	//거래처 업종 분류 삭제
	public int deleteAccountCatBus(AccountCatBus accountCatBus);
	
	//거래처 업종 분류 검색
	public List<AccountCatBus> searchAccountCatBus(String sk, String sv);
	
	//승인된 거래처 관리
	public List<AppAccount> selectApprovalAccountView();
	
	//승인된 거래처 상세조회 승인된 거래처 코드로 조회
	public List<AppAccount> selectByApprovalAccount(String catAppAccCd);
	
	//승인된 거래처 등록
	public int insertApprovalAccount(AppAccount appAccount);
	
	//승인된 거래처 삭제
	public int deleteApprovalAccount(AppAccount appAccount);
	
	//승인된 거래처 수정화면. 승인된 거래처 코드로 조회
	public AppAccount selectByUpApprovalAccount(String catAppAccCd);
	
	//승인된 거래처 수정
	public int updateApprovalAccount(AppAccount appAccount);
	
	//승인된 거래처 검색
	public List<AppAccount> searchApprovalAccount(String sk, String sv);
	
	//거래처 회원 관리
	public List<AccountMember> selectAccountMemberView();
	
	//거래처 회원 상세보기 거래처 회원 코드로 조회
	public List<AccountMember> selectByAccountMember(String accMemCd);
	
	//거래처 회원 등록
	public int insertAccountMember(AccountMember accountMember);
	
	//거래처 회원 수정화면 거래처 회원 코드로 조회
	public AccountMember selectUpAccountMember(String accMemCd);

	//거래처 회원 수정
	public int updateAccountMember(AccountMember accountMember);
	
	//거래처 회원 삭제
	public int deleteAccountMember(AccountMember accountMember);
}
