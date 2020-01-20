package shop.fims.gukmin.mapper;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.GMember;
import shop.fims.vo.Login;


@Mapper
public interface GMemberMapper {
	
	//ID 가져오기?
	public String getUserById(String memberId);
	
	public GMember getMemberById(String memberId);
	
	//로그인
	public GMember getMemberLogin(GMember member);
	
	//회원가입
	public int addMember(GMember member);
	
	public int addLogin(Login login);
	
	
	
}
