package shop.fims.gukmin.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.GMemberMapper;
import shop.fims.vo.Member;

@Service
public class GMemberService {

	@Autowired
	private GMemberMapper gmemberMapper;
	
	//로그인
	public Map<String, Object> getMemberLogin(Member member) {
		
		String result = "";
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		Member memberCheck = gmemberMapper.getMemberLogin(member);
		System.out.println(memberCheck + "<--memberCheck 변수01  getMemberLogin 메서드 GMemberService.java");
		
		if(memberCheck == null) {
			System.out.println(memberCheck + "<--memberCheck 변수02 getMemberLogin 메서드 GMemberService.java");
			Member memberIdCheck = gmemberMapper.getMemberById(
					member.getLoginCd());
			System.out.println(memberCheck + "<--memberCheck 변수03 getMemberLogin 메서드 GMemberService.java");
			if(memberIdCheck == null) {
				result = "등록된 아이디의 정보가 없습니다.";
				System.out.println(memberCheck + "<--memberCheck 변수04-아이디 정보 없음  getMemberLogin 메서드 GMemberService.java");
			}else {
				result = "비밀번호가 일치하지 않습니다.";
				System.out.println(memberCheck + "<--memberCheck 변수05-비밀번호 불일치 getMemberLogin 메서드 GMemberService.java");
			}

		}else {
			result = "로그인 성공";
			map.put("loginMember", memberCheck);
			System.out.println(memberCheck + "<--memberCheck 변수06 -로그인성공 getMemberLogin 메서드 GMemberService.java");
		}
		
		map.put("result", result);
		
		return map;
	}
	
	//ID가져오기?
	public Member getMemberById(String memberId) {
		
		return gmemberMapper.getMemberById(memberId);
	}
	
	
	
}
