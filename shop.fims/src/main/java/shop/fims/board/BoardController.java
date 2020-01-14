package shop.fims.board;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@Autowired BoardService boardService;
	
	//공지사항 관리
	@GetMapping("/gukminview/community/boardList")
	public String boardList(Model model
							,@RequestParam(value="currentPage"
							, required = false
							, defaultValue = "1") int currentPage) {
		Map<String, Object> map = boardService.getBoardList(currentPage);
		
		model.addAttribute("boardList", map.get("list"));
		model.addAttribute("currentPage", map.get("currentPage"));
		model.addAttribute("lastPage", map.get("lastPage"));
		model.addAttribute("startPageNum", map.get("startPageNum"));
		model.addAttribute("lastPageNum", map.get("lastPageNum"));
		return "gukminview/community/boardList";
	}
	
	//공지사항 상세보기 게시판코드 사용
	@GetMapping("/gukminview/community/boardDetail")
	public String boardDetail(@RequestParam(value="boardNum")int boardNum, Model model) {
		model.addAttribute("selectByBoard", boardService.selectByBoard(boardNum));
		return "gukminview/community/boardDetail";
	}
	
	//공지사항 등록
	@GetMapping("/gukminview/community/insertBoard")
	public String InsertBoard() {
		return "gukminview/community/insertBoard";
	}
	
	//공지사항 수정
	@GetMapping("/gukminview/community/updateBoard")
	public String UpdateBoard() {
		return "/gukminview/community/updateBoard";
	}
}
