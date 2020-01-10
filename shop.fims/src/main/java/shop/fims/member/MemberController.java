package shop.fims.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@Autowired private MemberService memberService;
	
	/*
	 * @file   MemberController.java
	 * @name   MemberController
	 * @brief  모든 회원 관리
	 * @author ksmart33 한소연
	 */
	
	//모든 회원 조회
	@GetMapping("/member/MemberList")
	public String MemberList(Model memberList, Model memberLevList) {
		
		memberList.addAttribute("memberList", memberService.memberList());
		memberLevList.addAttribute("memberLevList", memberService.memberLevList());
		
		System.out.println(memberList + " : 모든 회원 조회");
		System.out.println(memberLevList + " : 회원 권한 리스트");
		
		return "member/MemberList";
	}
	
}
