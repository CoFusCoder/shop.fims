package shop.fims.account;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Account;

@Mapper
public interface AccountMapper {
	
	//모든 거래처 관리
	public List<Account> selectAllAccountView();
	
}
