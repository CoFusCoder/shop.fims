package shop.fims.vo;

/**
 * @file shop.fims.vo.Member.java
 * @name Member
 * @brief 모든 회원관리
 * @author ksmart33 김동석
 */
public class GMember extends Login{

	private int memberNo; //조회수?
	private String MemCd ; //회원코드 
	private String MemLevCd ; //모든 회원 레벨코드 
	private String MemNm ; //이름 
	private String MemAddr ; //주소 
	private String MemPhone ; //전화번호
	private String PhoneFirst  ; //전화번호 처음
	private String PhoneMiddle ; //전화번호 중간
	private String PhoneLast ; //전화번호 마지막
	private String MemEmail ; //이메일 
	private String MemBirth ; //생년월일 
	private String MemJoinDt ; //가입일자 
	private String BirthYear  ; //생년월일 년도
	private String BirthMonth  ; //생년월일 월
	private String BirthDay ; // 생년월일 일자
	
	public GMember(){
		super();
		
	}
		
	
	public String getPhoneFirst() {
		return PhoneFirst;
	}



	public void setPhoneFirst(String phoneFirst) {
		System.out.println( phoneFirst + "<------ phoneFirst 변수 setBirthDay 메서드 GMember.java--- ");
		PhoneFirst = phoneFirst;
	}




	public String getPhoneMiddle() {
		return PhoneMiddle;
	}




	public void setPhoneMiddle(String phoneMiddle) {
		System.out.println( phoneMiddle + "<------ phoneMiddle 변수 setBirthDay 메서드 GMember.java--- ");
		PhoneMiddle = phoneMiddle;
	}




	public String getPhoneLast() {
		return PhoneLast;
	}




	public void setPhoneLast(String phoneLast) {
		System.out.println( phoneLast + "<------ phoneLast 변수 setBirthDay 메서드 GMember.java--- ");
		PhoneLast = phoneLast;
	}




	public String getBirthYear() {
		return BirthYear;
	}




	public void setBirthYear(String birthYear) {
		System.out.println( birthYear + "<------ birthYear 변수 setBirthDay 메서드 GMember.java--- ");
		BirthYear = birthYear;
	}




	public String getBirthMonth() {
		return BirthMonth;
	}




	public void setBirthMonth(String birthMonth) {
		System.out.println( birthMonth + "<------ birthMonth 변수 setBirthDay 메서드 GMember.java--- ");
		BirthMonth = birthMonth;
	}




	public String getBirthDay() {
		return BirthDay;
	}




	public void setBirthDay(String birthDay) {
		System.out.println( birthDay + "<------ birthDay 변수 setBirthDay 메서드 GMember.java--- ");
		BirthDay = birthDay;
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
		MemCd = memCd;
	}
	public String getMemLevCd() {
		return MemLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		MemLevCd = memLevCd;
	}
	public String getMemNm() {
		return MemNm;
	}
	public void setMemNm(String memNm) {
		MemNm = memNm;
	}
	public String getMemAddr() {
		return MemAddr;
	}
	public void setMemAddr(String memAddr) {
		MemAddr = memAddr;
	}
	
	public String getMemPhone() {
		return MemPhone;
	}
	
	
	public void setMemPhone(String memPhone) { 
		System.out.println(memPhone +	 "<--memPhone변수 setMemPhone 메서드 GMember.java----"); 
		MemPhone = memPhone;	
	}
	
	
	public void setMemPhone(String PhoneFirst, String PhoneMiddle, String PhoneLast) {
		System.out.println(PhoneFirst + PhoneMiddle + PhoneLast  + "<--폰번호 setMemPhone 메서드 GMember.java");
		if(this.MemPhone == null) {
			this.MemPhone = PhoneFirst + "-" + PhoneMiddle + "-" + PhoneLast;
		}
		
	}
	
	public String getMemEmail() {
		return MemEmail;
	}
	public void setMemEmail(String memEmail) {
		System.out.println(memEmail + "<--memEmail변수 setMemEmail 메서드 GMember.java");
		MemEmail = memEmail;
	}
	
	public String getMemBirth() {
		return MemBirth;
	}
	
	
	public void setMemBirth(String memBirth) { 
		  System.out.println(memBirth +  "<--memBirth변수 setMemBirth 메서드 GMember.java"); 
		  MemBirth = memBirth;
	}
	 
	
	public void setMemBirth(String BirthYear, String BirthMonth, String BirthDay) {
		System.out.println(BirthYear + BirthMonth + BirthDay + "<--생일 setMemBirth 메서드 GMember.java");
	
		if(this.MemBirth == null) {
			this.MemBirth =  BirthYear + "-" + BirthMonth + "-" + BirthDay;
		}
	}
	
	public String getMemJoinDt() {
		return MemJoinDt;
	}
	public void setMemJoinDt(String memJoinDt) {
		System.out.println(memJoinDt + "<--memJoinDt변수 setMemJoinDt 메서드 GMember.java");
		MemJoinDt = memJoinDt;
	}

	@Override
	public String toString() {
		return "GMember [memberNo=" + memberNo + ", MemCd=" + MemCd + ", MemLevCd=" + MemLevCd + ", MemNm=" + MemNm
				+ ", MemAddr=" + MemAddr + ", MemPhone=" + MemPhone + ", PhoneFirst=" + PhoneFirst + ", PhoneMiddle="
				+ PhoneMiddle + ", PhoneLast=" + PhoneLast + ", MemEmail=" + MemEmail + ", MemBirth=" + MemBirth
				+ ", MemJoinDt=" + MemJoinDt + ", BirthYear=" + BirthYear + ", BirthMonth=" + BirthMonth + ", BirthDay="
				+ BirthDay + "]";
	}


}
