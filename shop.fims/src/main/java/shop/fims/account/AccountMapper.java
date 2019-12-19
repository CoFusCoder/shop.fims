package shop.fims.account;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Account;

@Mapper
public interface AccountMapper {
	
	//모든 거래처 관리
	public List<Account> selectAllAccountView();
	
	//모든 거래처 상세조회 거래처코드로 조회
	public List<Account> selectByAccount(String cat_acc_cd);
	
	//모든 거래처 등록
	public int insertAllAccount(Account account);
	
	//모든 거래처 삭제
	public int deleteAllAccount(Account account);
	
	//모든 거래처 수정화면. 거래처코드로 조회
	public Account selectByAllAccount(String cat_acc_cd);
	
	//거래처 업종 분류
	public List<Account> accountCatBusView();
	
	//거래처 업종 분류 등록
	public int insertAccountCatBus(Account account);
}
