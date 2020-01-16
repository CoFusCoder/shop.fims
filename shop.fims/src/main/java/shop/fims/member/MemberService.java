package shop.fims.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;
import shop.fims.vo.Member3;
import shop.fims.vo.MemberLev;

@Service
public class MemberService {
	
	@Autowired private MemberMapper memberMapper;
	
	
	//모든 회원 조회
	public List<Member3> memberList() {
		
		List<Member3> memberList = memberMapper.memberList();
		System.out.println(memberList + " : 모든 회원 조회 ");
		
		return memberList;
	}
	
	// 모든 회원 수정
	public int memberUpdate() {
		
		int memberUpdate = memberMapper.memberUpdate();
		System.out.println(memberUpdate + " : 전국 지역 수정");
		
		return memberUpdate;
	}
	
	// 회원 권한 조회
	public List<Member3> memberLevList(){
		
		List<Member3> memberLevList = memberMapper.memberLevList();
		System.out.println(memberLevList + " : 회원 권한 조회 ");
		
		return memberLevList;
		
	}
	
	

}
