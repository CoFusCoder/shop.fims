package shop.fims.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Board;

@Mapper
public interface BoardMapper {
	
	//공지글 총 수
	public int getBoardAllCount();

	//공지사항 관리
	public List<Board> getBoardList(Map<String, Integer> map);
}
