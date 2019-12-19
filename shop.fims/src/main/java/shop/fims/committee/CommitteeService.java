package shop.fims.committee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import shop.fims.account.AccountMapper;
import shop.fims.vo.Committee;
import shop.fims.vo.PrPromotion;

@Service
public class CommitteeService {
	
	@Autowired CommitteeMapper committeeMapper;
	
	//위원회 관리
	public List<Committee> selectAllCommitteeView(){
		return committeeMapper.selectAllCommitteeView();
	}
	
	//위원회 상세조회 위원회 코드로 조회
	public List<Committee> selectByCommittee(String man_com_cd){
		return committeeMapper.selectByCommittee(man_com_cd);
	}
	
	//위원회 등록
	public int insertAllCommittee(Committee committee) {
		return committeeMapper.insertAllCommittee(committee);
	}
	
	//위원회 삭제
	public int deleteAllCommittee(Committee committee) {
		return committeeMapper.deleteAllCommittee(committee);
	}
	
	//위원회 수정화면. 위원회 코드로 조회
	public Committee selectByAllCommittee(String man_com_cd) {
		return committeeMapper.selectByAllCommittee(man_com_cd);
	}
	
}
