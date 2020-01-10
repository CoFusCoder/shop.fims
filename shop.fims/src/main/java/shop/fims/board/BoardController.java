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
	
	@GetMapping("/boardList")
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
		return "board/boardList";
	}
	
	
	//공지사항 등록
	@GetMapping("/insertBoard")
	public String InsertBoard() {
		return "board/insertBoard";
	}
	
	//공지사항 상세
	@GetMapping("/boardDetail")
	public String BoardDetail() {
		return "board/boardDetail";
	}
	
	//공지사항 수정
	@GetMapping("/updateBoard")
	public String UpdateBoard() {
		return "board/updateBoard";
	}
}
