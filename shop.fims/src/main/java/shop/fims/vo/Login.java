package shop.fims.vo;

/**
 * @file shop.fims.vo.Login.java
 * @name Login
 * @brief 모든 회원 로그인관리
 * @author ksmart33 김동석
 */
public class Login {

	private String LoginCd ; //아이디 
	private String MemCd ; //회원코드 
	private String MemLevCd ; //모든 회원 레벨코드 
	private String LoginPw ; //패스워드 
	private String MemNm ; //이름 
	private String MemLevNm ; //레벨명 
	
	public String getLoginCd() {
		return LoginCd;
	}
	public void setLoginCd(String loginCd) {
		LoginCd = loginCd;
	}
	public String getMemCd() {
		return MemCd;
	}
	public void setMemCd(String memCd) {
		MemCd = memCd;
	}
	public String getMemLevCd() {
		return MemLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		MemLevCd = memLevCd;
	}
	public String getLoginPw() {
		return LoginPw;
	}
	public void setLoginPw(String loginPw) {
		LoginPw = loginPw;
	}
	public String getMemNm() {
		return MemNm;
	}
	public void setMemNm(String memNm) {
		MemNm = memNm;
	}
	public String getMemLevNm() {
		return MemLevNm;
	}
	public void setMemLevNm(String memLevNm) {
		MemLevNm = memLevNm;
	}
	
	@Override
	public String toString() {
		return "Login [LoginCd=" + LoginCd + ", MemCd=" + MemCd + ", MemLevCd=" + MemLevCd + ", LoginPw=" + LoginPw
				+ ", MemNm=" + MemNm + ", MemLevNm=" + MemLevNm + "]";
	}

}
