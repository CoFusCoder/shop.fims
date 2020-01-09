package shop.fims.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;
import shop.fims.vo.Member;
import shop.fims.vo.MemberLev;

@Mapper
public interface MemberMapper {
	
	// 모든 회원 조회
	public List<Member> memberList();
	
	// 회원 권한 조회
	public List<MemberLev> memberLevList();
	

}
