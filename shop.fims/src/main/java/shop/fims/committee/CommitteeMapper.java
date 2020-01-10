package shop.fims.committee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Committee;


@Mapper
public interface CommitteeMapper {
	
	//위원회 관리
	public List<Committee> selectAllCommitteeView();
	
	//위원회 상세조회 위원회 코드로 조회
	public List<Committee> selectByCommittee(String manComCd);
	
	//위원회 등록
	public int insertAllCommittee(Committee committee);
	
	//위원회 삭제
	public int deleteAllCommittee(Committee committee);
	
	//위원회 수정화면. 위원회 코드로 조회
	public Committee selectByAllCommittee(String manComCd);
	
	//위원회 수정
	public int updateAllCommittee(Committee committee);
	
	//위원회 검색
	public List<Committee> searchCommittee(String sk, String sv);
	
}
