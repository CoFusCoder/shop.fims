package shop.fims.vo;

public class Member3 {
	
	private String memCd;
	private MemberLev MemberLev;
	private String memNm;
	private String memAddr;
	private String memPhone;
	private String memEmail;
	private String memBirth;
	private String memJoinDt;
	public String getMemCd() {
		return memCd;
	}
	public void setMemCd(String memCd) {
		this.memCd = memCd;
	}
	public MemberLev getMemberLev() {
		return MemberLev;
	}
	public void setMemberLev(MemberLev memberLev) {
		MemberLev = memberLev;
	}
	public String getMemNm() {
		return memNm;
	}
	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}
	public String getMemAddr() {
		return memAddr;
	}
	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemBirth() {
		return memBirth;
	}
	public void setMemBirth(String memBirth) {
		this.memBirth = memBirth;
	}
	public String getMemJoinDt() {
		return memJoinDt;
	}
	public void setMemJoinDt(String memJoinDt) {
		this.memJoinDt = memJoinDt;
	}
	@Override
	public String toString() {
		return "Member3 [memCd=" + memCd + ", MemberLev=" + MemberLev + ", memNm=" + memNm + ", memAddr=" + memAddr
				+ ", memPhone=" + memPhone + ", memEmail=" + memEmail + ", memBirth=" + memBirth + ", memJoinDt="
				+ memJoinDt + "]";
	}

}
