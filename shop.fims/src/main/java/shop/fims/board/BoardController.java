package shop.fims.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	/*
	 * @file   BoardController.java
	 * @name   BoardController
	 * @brief  게시판 관련
	 * @author fims 김도민
	 */
	
	//공지사항 관리
	@GetMapping("/boardList")
	public String BoardList() {
		return "board/boardList";
	}
}
