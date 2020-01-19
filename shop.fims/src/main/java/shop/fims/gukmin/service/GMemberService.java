package shop.fims.gukmin.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.GMemberMapper;
import shop.fims.vo.GMember;
import shop.fims.vo.Login;


@Service
public class GMemberService {

	@Autowired
	private GMemberMapper gmemberMapper;
	
	//로그인
	public Map<String, Object> getMemberLogin(GMember member) {
		
		String result = "";
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		GMember memberCheck = gmemberMapper.getMemberLogin(member);
		System.out.println(memberCheck + "<--memberCheck 변수01  getMemberLogin 메서드 GMemberService.java");
		
		if(memberCheck == null) {
			System.out.println(memberCheck + "<--memberCheck 변수02 getMemberLogin 메서드 GMemberService.java");
			GMember memberIdCheck = gmemberMapper.getMemberById(
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
	public GMember getMemberById(String memberId) {
		
		return gmemberMapper.getMemberById(memberId);
	}
	
	//회원가입
	public int addMember(GMember member) {
		
		//String birthyear = member.getBirthYear();
		//String birthmonth = member.getBirthMonth();
		//String birthday = member.getBirthDay();
		
		//String membirth = birthyear + "-" + birthmonth + "-" + birthday ;
		
		//member.setBirthDay(membirth);
		
		//String phonefirst =  member.getPhoneFirst();
		//String phonemiddle = member.getPhoneMiddle();
		//String phonelast = member.getPhoneLast();
		
		//String memphone = phonefirst + "-" + phonemiddle + "-" + phonelast;
		
		//member.setMemPhone(memphone);
		
		
		System.out.println(member + "<--member 변수 addMember 메서드 GMemberService.java----");
		int result = gmemberMapper.addMember(member);
		System.out.println(result + "<--result 변수 addMember 메서드 GMemberService.java----");
		return result;
	}
	
	//회원가입
	public int addLogin(Login login) {
		System.out.println(login + "<--login 변수 addMember 메서드 GMemberService.java----");
		int result = gmemberMapper.addLogin(login);
		System.out.println(result + "<--result 변수 addMember 메서드 GMemberService.java----");
		return result;
	}
	
	
	
	
}