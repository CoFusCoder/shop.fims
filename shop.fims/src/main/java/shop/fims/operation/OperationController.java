package shop.fims.operation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OperationController {
	
	/*
	 * @file   AdminController.java
	 * @name   AdminController
	 * @brief  전국 지역 등록
	 * @author fims 한소연
	 */
	
	//공무원 계정 생성
	@GetMapping("/operation/officialLevelInsert")
	public String officialLevelInsert() {
		return "operation/officialLevelInsert";
	}
	
	//공무원 계정 조회
	@GetMapping("/operation/officialLevelList")
	public String officialLevelList() {
		return "operation/officialLevelList";
	}
	
	//공지사항 등록
	@GetMapping("/operation/noticeInsert")
	public String noticeInsert() {
		return "operation/noticeInsert";
	}
	
	//공지사항 조회
	@GetMapping("/operation/noticeList")
	public String noticeList() {
		return "operation/noticeList";
	}
	
}
