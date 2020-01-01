package shop.fims.mamber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	/*
	 * @file   MemberController.java
	 * @name   MemberController
	 * @brief  회원 관리
	 * @author ksmart33 한소연
	 */
	
	//회원 권한 등록
	@GetMapping("/member/MemberLevInsert")
	public String MemberLevInsert() {
		return "member/MemberLevInsert";
	}
	
	//권한별 회원 조회
	@GetMapping("/member/MemberLevList")
	public String MemberLevList() {
		return "member/MemberLevList";
	}
}
