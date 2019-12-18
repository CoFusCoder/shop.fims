package shop.fims.committee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.account.AccountMapper;
import shop.fims.vo.Account;
import shop.fims.vo.Committee;

@Service
public class CommitteeService {
	
	@Autowired CommitteeMapper committeeMapper;
	
	//위원회 조회
	public List<Committee> selectAllCommitteeView(){
		return committeeMapper.selectAllCommitteeView();
		
	}
}
