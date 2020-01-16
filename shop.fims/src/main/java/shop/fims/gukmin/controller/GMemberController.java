package shop.fims.gukmin.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.fims.gukmin.service.GMemberService;
import shop.fims.vo.Member;

@Controller
public class GMemberController {

	private static final Logger log = LoggerFactory.getLogger(GMemberController.class);

	@Autowired
	private GMemberService gmemberService;
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name gukminMainLogin
	 * @brief 국민로그인
	 * @author ksmart33 김동석
	 * @return gukminview/login/loginForm
	 */
	@GetMapping("/gukminview/login/loginForm")
	public String gukminLogin() {
		System.out.println("---국민로그인 : gukminLogin MemberController.java-------");
		return "/gukminview/login/loginForm";
	}
	
	
	//국민화면 로그인하기
	@PostMapping("/gukminview/gukminMainView")
	public String login(Member member, HttpSession session, Model model) {
		//입력된 아이디 비밀번호
		System.out.println(member.toString() + "<--입력된 정보");
		log.error(member.toString());
		Map<String,Object> map = gmemberService.getMemberLogin(member);
		String result 		= (String) map.get("result"); 
		Member loginMember 	= (Member) map.get("loginMember");
		
		//로그인 실패 화면 login
		if(!result.equals("로그인 성공")) {
			model.addAttribute("result", result);
			return "/gukminview/login/loginForm";
		}
		session.setAttribute("SID"		, loginMember.getLoginCd());
		session.setAttribute("SLEVEL"	, loginMember.getMemLevNm());
		session.setAttribute("SNAME"	, loginMember.getMemNm());
		session.setAttribute("SPHONE"	, loginMember.getMemPhone());
		
		String nameseesion = (String) session.getAttribute("SNAME");
		System.out.println(nameseesion + "<----nameseesion 값 login 메서드 MemberController.java----------");
		model.addAttribute("Sname", nameseesion);
		
		
		//로그인 성공 화면 mypage
		return "redirect:/gukminview/gukminMainView";
	}
	
	//관리자 화면 로그인하기
	@PostMapping("/admin/main")
	public String adminlogin(Member member, HttpSession session, Model model) {
		//입력된 아이디 비밀번호
		System.out.println(member.toString() + "<--입력된 정보");
		log.error(member.toString());
		Map<String,Object> map = gmemberService.getMemberLogin(member);
		String result 		= (String) map.get("result"); 
		Member loginMember 	= (Member) map.get("loginMember");
		
		//로그인 실패 화면 login
		if(!result.equals("로그인 성공")) {
			model.addAttribute("result", result);
			return "/index/login";
		}
		session.setAttribute("SID"		, loginMember.getLoginCd());
		session.setAttribute("SLEVEL"	, loginMember.getMemLevNm());
		session.setAttribute("SNAME"	, loginMember.getMemNm());
		session.setAttribute("SPHONE"	, loginMember.getMemPhone());
		
		String nameseesion = (String) session.getAttribute("SNAME");
		System.out.println(nameseesion + "<----nameseesion 값 login 메서드 MemberController.java----------");
		model.addAttribute("Sname", nameseesion);
		
		
		//로그인 성공 화면 mypage
		return "redirect:/admin/main";
	}
	
	//국민 로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	//관리자 로그아웃
	@GetMapping("/admin/logout")
	public String adminlogout(HttpSession session) {
		session.invalidate();
		return "redirect:/admin/main";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name memberRegister
	 * @brief 국민회원가입
	 * @author ksmart33 김동석
	 * @return gukminview/member/memberRegisterForm
	 */
	@GetMapping("gukminview/member/memberRegisterForm")
	public String memberRegister() {
		System.out.println("---국민회원가입 : memberRegister MemberController.java-------");
		return "/gukminview/member/memberRegisterForm";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myPageView
	 * @brief 국민 마이페이지 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myPageView
	 */
	@GetMapping("gukminview/member/myPageView")
	public String myPageView() {
		System.out.println("---국민 마이페이지 화면 : myPageView MemberController.java-------");
		
		return "/gukminview/member/myPageView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name hostPageView
	 * @brief 거래처 마이페이지 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/hostPageView
	 */
	@GetMapping("gukminview/member/hostPageView")
	public String hostPageView(HttpSession session) {
		System.out.println("---거래처 마이페이지 화면 : myPageView MemberController.java-------");
		
		String loginlevel = (String) session.getAttribute("SLEVEL");
		
		if(loginlevel.equals("국민")) {
			System.out.println( loginlevel + "<--loginlevel hostPageView 메서드 GMemberController.java ");
			
			return  "/gukminview/member/myPageView";
		}
		
		return "/gukminview/member/hostPageView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myInfoEditForm
	 * @brief 국민 회원정보관리 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myInfoEditForm
	 */
	@GetMapping("gukminview/member/myInfoEditForm")
	public String myInfoEditForm() {
		System.out.println("---국민 회원정보관리 화면 : myInfoEditForm MemberController.java-------");
		return "/gukminview/member/myInfoEditForm";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myInfoEditForm
	 * @brief 거래처 회원정보관리 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/hostInfoEditForm
	 */
	@GetMapping("gukminview/member/hostInfoEditForm")
	public String hostInfoEditForm() {
		System.out.println("---거래처 회원정보관리 화면 : hostInfoEditForm MemberController.java-------");
		return "/gukminview/member/hostInfoEditForm";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name secedeForm
	 * @brief 국민 회원탈퇴 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/secedeForm
	 */
	@GetMapping("gukminview/member/secedeForm")
	public String secedeForm() {
		System.out.println("---국민 회원정보관리 화면 : secedeForm MemberController.java-------");
		return "/gukminview/member/secedeForm";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myBookmarkView
	 * @brief 국민 나의찜목록 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myBookmarkView
	 */
	@GetMapping("gukminview/member/myBookmarkView")
	public String myBookmarkView() {
		System.out.println("---국민 나의찜목록 화면 : myBookmarkView MemberController.java-------");
		return "/gukminview/member/myBookmarkView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myBookmarkSpotView
	 * @brief 국민  핫스팟찜록 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myBookmarkSpotView
	 */
	@GetMapping("gukminview/member/myBookmarkSpotView")
	public String myBookmarkSpotView() {
		System.out.println("---국민 핫스팟찜록 화면 : myBookmarkSpotView MemberController.java-------");
		return "/gukminview/member/myBookmarkSpotView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myInquiryView
	 * @brief 국민  나의문의내역 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myInquiryView
	 */
	@GetMapping("gukminview/member/myInquiryView")
	public String myInquiryView() {
		System.out.println("---국민 나의문의내역 화면 : myInquiryView MemberController.java-------");
		return "/gukminview/member/myInquiryView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myReviewView
	 * @brief 국민  나의리뷰내역 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myReviewView
	 */
	@GetMapping("gukminview/member/myReviewView")
	public String myReviewView() {
		System.out.println("---국민 나의리뷰내역 화면 : myReviewView MemberController.java-------");
		return "/gukminview/member/myReviewView";
	}
	

	
	
}













