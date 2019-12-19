package shop.fims.committee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.Model;

import shop.fims.vo.Committee;
import shop.fims.vo.PrPromotion;


@Mapper
public interface CommitteeMapper {
	
	//모든 위원회 관리
	public List<Committee> selectAllCommitteeView();
	
	//위원회 상세조회 위원회 코드로 조회
	public List<Committee> selectByCommittee(String man_com_cd);
	
	//위원회 등록
	public int insertAllCommittee(Committee committee);
	
	//위원회 삭제
	public int deleteAllCommittee(Committee committee);
	
	//위원회 수정화면. 위원회 코드로 조회
	public Committee selectByAllCommittee(String man_com_cd);
}
