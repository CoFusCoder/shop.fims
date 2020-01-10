package shop.fims.gukmin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Board;

@Mapper
public interface GCommunityMapper {

	//공지사항 총 리스트 수
	public int getBoardAllCount();
	
	//공지사항 리스트
	public List<Board> getBoardList(Map<String, Integer> map);
}
