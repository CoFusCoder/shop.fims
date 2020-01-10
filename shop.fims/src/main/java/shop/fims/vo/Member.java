package shop.fims.vo;

/**
 * @file shop.fims.vo.Member.java
 * @name Member
 * @brief 모든 회원관리
 * @author ksmart33 김동석
 */
public class Member extends Login{

	private int memberNo; //조회수?
	private String MemCd ; //회원코드 
	private String MemLevCd ; //모든 회원 레벨코드 
	private String MemNm ; //이름 
	private String MemAddr ; //주소 
	private String MemPhone ; //전화번호 
	private String MemEmail ; //이메일 
	private String MemBirth ; //생년월일 
	private String MemJoinDt ; //가입일자 
	
	public Member(){
		super();
	}
	
	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemCd() {
		return MemCd;
	}
	public void setMemCd(String memCd) {
		System.out.println(memCd + "<--memCd변수 setMemCd 메서드 Member.java");
		MemCd = memCd;
	}
	public String getMemLevCd() {
		return MemLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		System.out.println(memLevCd + "<--memLevCd변수 setMemLevCd 메서드 Member.java");
		MemLevCd = memLevCd;
	}
	public String getMemNm() {
		return MemNm;
	}
	public void setMemNm(String memNm) {
		System.out.println(memNm + "<--memNm변수 setMemNm 메서드 Member.java");
		MemNm = memNm;
	}
	public String getMemAddr() {
		return MemAddr;
	}
	public void setMemAddr(String memAddr) {
		System.out.println(memAddr + "<--memAddr변수 setMemAddr 메서드 Member.java");
		MemAddr = memAddr;
	}
	public String getMemPhone() {
		return MemPhone;
	}
	public void setMemPhone(String memPhone) {
		System.out.println(memPhone + "<--memPhone변수 setMemPhone 메서드 Member.java");
		MemPhone = memPhone;
	}
	public String getMemEmail() {
		return MemEmail;
	}
	public void setMemEmail(String memEmail) {
		System.out.println(memEmail + "<--memEmail변수 setMemEmail 메서드 Member.java");
		MemEmail = memEmail;
	}
	public String getMemBirth() {
		return MemBirth;
	}
	public void setMemBirth(String memBirth) {
		System.out.println(memBirth + "<--memBirth변수 setMemBirth 메서드 Member.java");
		MemBirth = memBirth;
	}
	public String getMemJoinDt() {
		return MemJoinDt;
	}
	public void setMemJoinDt(String memJoinDt) {
		System.out.println(memJoinDt + "<--memJoinDt변수 setMemJoinDt 메서드 Member.java");
		MemJoinDt = memJoinDt;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", MemCd=" + MemCd + ", MemLevCd=" + MemLevCd + ", MemNm=" + MemNm
				+ ", MemAddr=" + MemAddr + ", MemPhone=" + MemPhone + ", MemEmail=" + MemEmail + ", MemBirth="
				+ MemBirth + ", MemJoinDt=" + MemJoinDt + "]";
	}
}
