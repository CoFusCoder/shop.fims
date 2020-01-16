package shop.fims.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Board;

@Service
public class BoardService {
	
	@Autowired BoardMapper boardMapper;
	

	
	//공지사항 관리(페이징)
	public Map<String, Object> getBoardList(int currentPage){
		//페이지 구성 할 행의 갯수
		final int ROW_PER_PAGE = 10;
		
		//보여줄 첫번째 페이지번호 초기화
		int startPageNum = 1;
		
		//보여줄 페이지번호의 갯수 초기화
		int lastPageNum = ROW_PER_PAGE;
		
		
		if(currentPage > (ROW_PER_PAGE/2)) {
			startPageNum = currentPage -((lastPageNum/2)-1);
			lastPageNum += (startPageNum-1); 
		}
		
		// limit 적용될 값 startRow, 상수ROW_PER_PAGE
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int startRow = (currentPage-1)*ROW_PER_PAGE;
		
		map.put("startRow", startRow);
		map.put("rowPerPage", ROW_PER_PAGE);
		
		// 전체행의 갯수를 가져오는 쿼리
		double boardCount = boardMapper.getBoardAllCount();
		
		int lastPage = (int)(Math.ceil(boardCount/ROW_PER_PAGE));
		
		if(currentPage >= (lastPage-4)) {
			lastPageNum = lastPage;
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("list", boardMapper.getBoardList(map));
		resultMap.put("currentPage", currentPage);
		resultMap.put("lastPage", lastPage);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("lastPageNum", lastPageNum);
		
		return resultMap;
	}
	
	//공지사항 상세보기 게시판코드 사용
	public List<Board> selectByBoard(int boardNum){
		return boardMapper.selectByBoard(boardNum);
	}
	
	//공지사항 등록
	public int insertBoard(Board board) {
		return boardMapper.insertBoard(board);
	}
}
