package shop.fims.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.fims.vo.Area;
import shop.fims.vo.Member;

@Controller
public class MemberController {
	
	@Autowired private MemberService memberService;
	
	/*
	 * @file   MemberController.java
	 * @name   MemberController
	 * @brief  모든 회원 관리
	 * @author ksmart33 한소연
	 */
	
	//회원 권한 부여
	@GetMapping("/member/MemberLevInsert")
	public String MemberLevInsert() {
		
		return "member/MemberLevInsert";
	}
	
	//모든 회원 조회
	@GetMapping("/member/MemberList")
	public String MemberList(Model memberList, Model memberLevList) {
		
		memberList.addAttribute("memberList", memberService.memberList());
		memberLevList.addAttribute("memberLevList", memberService.memberLevList());
		
		System.out.println(memberList + " : 모든 회원 조회");
		System.out.println(memberLevList + " : 회원 권한 리스트");
		
		return "member/MemberList";
	}
	
	//모든 회원 수정 메서드
	@PostMapping("/member/memberUpdate")
	public String areaUpdate(Member member, ServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("member >>>> " + member);
		memberService.memberUpdate();
		PrintWriter out = response.getWriter();
		out.println("<script>alert('회원 정보가 수정되었습니다.'); location.href='/admin/areaCityList';</script>");
		out.flush();
		System.out.println("member 회원 수정 >>>>>>>" + member.toString());
		
		return null;
	}
	
}
