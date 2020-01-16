package shop.fims.gukmin.mapper;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Member;

@Mapper
public interface GMemberMapper {
	
	//ID 가져오기?
	public Member getMemberById(String memberId);
	
	//로그인
	public Member getMemberLogin(Member member);
	
}
