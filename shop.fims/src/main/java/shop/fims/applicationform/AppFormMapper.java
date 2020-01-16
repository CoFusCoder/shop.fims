package shop.fims.applicationform;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.CommitteeApp;

@Mapper
public interface AppFormMapper {
	
	//위원회 신청서 수
	public int getComAppAllCount();
	
	//위원회 신청서 관리
	public List<CommitteeApp> getComAppList(Map<String, Integer> map);
	
	//위원회 신청서 상세보기 위원회참가신청서관리코드로 조회
	public CommitteeApp selectByComApp(String comAppCd);
	
	//위원회 신청서 등록
	public int insertCommitteeApp(CommitteeApp committeeApp);
}
