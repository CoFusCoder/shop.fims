package shop.fims.vo;

public class Account {
	
	private String cat_acc_cd;	//거래처코드
	private String areacity_admin_cd;	//모든 행정기관코드
	private String area_city_cd;	//모든 지역 시군코드
	private String area_cd;	//전국지역코드
	private String man_com_cd;	//위원회코드
	private String cat_acc_nm1;	//거래처명
	private String cat_acc_oper;	//사업자분류
	private String cat_acc_nm2;	//거래처대표자명
	private String cat_acc_addr;	//거래처사업장주소
	private String cat_acc_no1;	//거래처사업자등록번호
	private String cat_acc_no2;	//거래처법인등록번호
	private String cat_acc_phone1;	//거래처팩스번호
	private String cat_acc_phone2;	//대표자 전화번호
	private String cat_acc_phone3;	//거래처 대표번호
	private String cat_acc_email;	//거래처이메일
	private String cat_acc_dt1;	//등록일자
	private String cat_acc_app;	//승인자
	private String man_com_nm1;	//위원회명
	private String cat_acc_dt2;	//승인일자
	private String cat_acc_con;	//승인 상태
	
	public String getCat_acc_cd() {
		return cat_acc_cd;
	}
	public void setCat_acc_cd(String cat_acc_cd) {
		this.cat_acc_cd = cat_acc_cd;
	}
	public String getAreacity_admin_cd() {
		return areacity_admin_cd;
	}
	public void setAreacity_admin_cd(String areacity_admin_cd) {
		this.areacity_admin_cd = areacity_admin_cd;
	}
	public String getArea_city_cd() {
		return area_city_cd;
	}
	public void setArea_city_cd(String area_city_cd) {
		this.area_city_cd = area_city_cd;
	}
	public String getArea_cd() {
		return area_cd;
	}
	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}
	public String getMan_com_cd() {
		return man_com_cd;
	}
	public void setMan_com_cd(String man_com_cd) {
		this.man_com_cd = man_com_cd;
	}
	public String getCat_acc_nm1() {
		return cat_acc_nm1;
	}
	public void setCat_acc_nm1(String cat_acc_nm1) {
		this.cat_acc_nm1 = cat_acc_nm1;
	}
	public String getCat_acc_oper() {
		return cat_acc_oper;
	}
	public void setCat_acc_oper(String cat_acc_oper) {
		this.cat_acc_oper = cat_acc_oper;
	}
	public String getCat_acc_nm2() {
		return cat_acc_nm2;
	}
	public void setCat_acc_nm2(String cat_acc_nm2) {
		this.cat_acc_nm2 = cat_acc_nm2;
	}
	public String getCat_acc_addr() {
		return cat_acc_addr;
	}
	public void setCat_acc_addr(String cat_acc_addr) {
		this.cat_acc_addr = cat_acc_addr;
	}
	public String getCat_acc_no1() {
		return cat_acc_no1;
	}
	public void setCat_acc_no1(String cat_acc_no1) {
		this.cat_acc_no1 = cat_acc_no1;
	}
	public String getCat_acc_no2() {
		return cat_acc_no2;
	}
	public void setCat_acc_no2(String cat_acc_no2) {
		this.cat_acc_no2 = cat_acc_no2;
	}
	public String getCat_acc_phone1() {
		return cat_acc_phone1;
	}
	public void setCat_acc_phone1(String cat_acc_phone1) {
		this.cat_acc_phone1 = cat_acc_phone1;
	}
	public String getCat_acc_phone2() {
		return cat_acc_phone2;
	}
	public void setCat_acc_phone2(String cat_acc_phone2) {
		this.cat_acc_phone2 = cat_acc_phone2;
	}
	public String getCat_acc_phone3() {
		return cat_acc_phone3;
	}
	public void setCat_acc_phone3(String cat_acc_phone3) {
		this.cat_acc_phone3 = cat_acc_phone3;
	}
	public String getCat_acc_email() {
		return cat_acc_email;
	}
	public void setCat_acc_email(String cat_acc_email) {
		this.cat_acc_email = cat_acc_email;
	}
	public String getCat_acc_dt1() {
		return cat_acc_dt1;
	}
	public void setCat_acc_dt1(String cat_acc_dt1) {
		this.cat_acc_dt1 = cat_acc_dt1;
	}
	public String getCat_acc_app() {
		return cat_acc_app;
	}
	public void setCat_acc_app(String cat_acc_app) {
		this.cat_acc_app = cat_acc_app;
	}
	public String getMan_com_nm1() {
		return man_com_nm1;
	}
	public void setMan_com_nm1(String man_com_nm1) {
		this.man_com_nm1 = man_com_nm1;
	}
	public String getCat_acc_dt2() {
		return cat_acc_dt2;
	}
	public void setCat_acc_dt2(String cat_acc_dt2) {
		this.cat_acc_dt2 = cat_acc_dt2;
	}
	public String getCat_acc_con() {
		return cat_acc_con;
	}
	public void setCat_acc_con(String cat_acc_con) {
		this.cat_acc_con = cat_acc_con;
	}
	@Override
	public String toString() {
		return "Account [cat_acc_cd=" + cat_acc_cd + ", areacity_admin_cd=" + areacity_admin_cd + ", area_city_cd="
				+ area_city_cd + ", area_cd=" + area_cd + ", man_com_cd=" + man_com_cd + ", cat_acc_nm1=" + cat_acc_nm1
				+ ", cat_acc_oper=" + cat_acc_oper + ", cat_acc_nm2=" + cat_acc_nm2 + ", cat_acc_addr=" + cat_acc_addr
				+ ", cat_acc_no1=" + cat_acc_no1 + ", cat_acc_no2=" + cat_acc_no2 + ", cat_acc_phone1=" + cat_acc_phone1
				+ ", cat_acc_phone2=" + cat_acc_phone2 + ", cat_acc_phone3=" + cat_acc_phone3 + ", cat_acc_email="
				+ cat_acc_email + ", cat_acc_dt1=" + cat_acc_dt1 + ", cat_acc_app=" + cat_acc_app + ", man_com_nm1="
				+ man_com_nm1 + ", cat_acc_dt2=" + cat_acc_dt2 + ", cat_acc_con=" + cat_acc_con + "]";
	}
	

	
}
