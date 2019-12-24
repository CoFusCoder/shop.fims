package shop.fims.committee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Committee;

@Service
public class CommitteeService {
	
	@Autowired CommitteeMapper committeeMapper;
	
	//위원회 관리
	public List<Committee> selectAllCommitteeView(){
		return committeeMapper.selectAllCommitteeView();
	}
	
	//위원회 상세조회 위원회 코드로 조회
	public List<Committee> selectByCommittee(String manComCd){
		return committeeMapper.selectByCommittee(manComCd);
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
	public Committee selectByAllCommittee(String manComCd) {
		return committeeMapper.selectByAllCommittee(manComCd);
	}
	
	//위원회 수정
	public int updateAllCommittee(Committee committee) {
		return committeeMapper.updateAllCommittee(committee);
	}
	
	//위원회 검색
	public List<Committee> searchCommittee(String sk, String sv){
		return committeeMapper.searchCommittee(sk,sv);
	}
}
