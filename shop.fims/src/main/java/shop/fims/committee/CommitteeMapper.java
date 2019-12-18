package shop.fims.committee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Committee;


@Mapper
public interface CommitteeMapper {
	
	//모든 위원회 관리
	public List<Committee> selectAllCommitteeView();
}
