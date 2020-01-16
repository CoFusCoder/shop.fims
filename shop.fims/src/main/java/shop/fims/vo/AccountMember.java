package shop.fims.vo;

public class AccountMember {

	private String accMemCd;	//하나의 거래처별 소속 회원코드	//acc_mem_cd
	private String memCd;	//회원코드	//mem_cd
	private String memLevCd;	//모든 회원 레벨코드	//mem_lev_cd
	private String catAccCd;	//거래처코드	//cat_acc_cd
	private String catBusAccCd;	//거래처 업종 분류코드	//catbus_acc_cd
	private String catAppAccCd;	//거래처별 승인 업종 코드	//catapp_acc_cd
	private String catAccNm1;	//거래처명	//cat_acc_nm1
	private String catBusAccBus;	//거래처업종분류	//catbus_acc_bus
	private String AccMemNm;	//거래처 소속 회원이름	//acc_mem_nm
	private String AccMemAddr;	//주소	//acc_mem_addr
	private String AccMemPhone;	//전화번호		//acc_mem_phone
	private String AccMemEmail;	//이메일	//acc_mem_email
	private String AccMemDt1;	//생년월일	//acc_mem_dt1
	private String AccMemDt2;	//가입일자	//acc_mem_dt2
	
	public String getAccMemCd() {
		return accMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		this.accMemCd = accMemCd;
	}
	public String getMemCd() {
		return memCd;
	}
	public void setMemCd(String memCd) {
		this.memCd = memCd;
	}
	public String getMemLevCd() {
		return memLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		this.memLevCd = memLevCd;
	}
	public String getCatAccCd() {
		return catAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		this.catAccCd = catAccCd;
	}
	public String getCatBusAccCd() {
		return catBusAccCd;
	}
	public void setCatBusAccCd(String catBusAccCd) {
		this.catBusAccCd = catBusAccCd;
	}
	public String getCatAppAccCd() {
		return catAppAccCd;
	}
	public void setCatAppAccCd(String catAppAccCd) {
		this.catAppAccCd = catAppAccCd;
	}
	public String getCatAccNm1() {
		return catAccNm1;
	}
	public void setCatAccNm1(String catAccNm1) {
		this.catAccNm1 = catAccNm1;
	}
	public String getCatBusAccBus() {
		return catBusAccBus;
	}
	public void setCatBusAccBus(String catBusAccBus) {
		this.catBusAccBus = catBusAccBus;
	}
	public String getAccMemNm() {
		return AccMemNm;
	}
	public void setAccMemNm(String accMemNm) {
		AccMemNm = accMemNm;
	}
	public String getAccMemAddr() {
		return AccMemAddr;
	}
	public void setAccMemAddr(String accMemAddr) {
		AccMemAddr = accMemAddr;
	}
	public String getAccMemPhone() {
		return AccMemPhone;
	}
	public void setAccMemPhone(String accMemPhone) {
		AccMemPhone = accMemPhone;
	}
	public String getAccMemEmail() {
		return AccMemEmail;
	}
	public void setAccMemEmail(String accMemEmail) {
		AccMemEmail = accMemEmail;
	}
	public String getAccMemDt1() {
		return AccMemDt1;
	}
	public void setAccMemDt1(String accMemDt1) {
		AccMemDt1 = accMemDt1;
	}
	public String getAccMemDt2() {
		return AccMemDt2;
	}
	public void setAccMemDt2(String accMemDt2) {
		AccMemDt2 = accMemDt2;
	}
	@Override
	public String toString() {
		return "AccountMember [accMemCd=" + accMemCd + ", memCd=" + memCd + ", memLevCd=" + memLevCd + ", catAccCd="
				+ catAccCd + ", catBusAccCd=" + catBusAccCd + ", catAppAccCd=" + catAppAccCd + ", catAccNm1="
				+ catAccNm1 + ", catBusAccBus=" + catBusAccBus + ", AccMemNm=" + AccMemNm + ", AccMemAddr=" + AccMemAddr
				+ ", AccMemPhone=" + AccMemPhone + ", AccMemEmail=" + AccMemEmail + ", AccMemDt1=" + AccMemDt1
				+ ", AccMemDt2=" + AccMemDt2 + "]";
	}
}
