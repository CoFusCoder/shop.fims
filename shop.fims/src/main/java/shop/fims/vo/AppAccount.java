package shop.fims.vo;

public class AppAccount {
	
	private String catapp_acc_cd;	//거래처별 승인 업종 코드
	private String areacity_admin_cd;	//모든 행정기관코드
	private String catbus_acc_cd;	//거래처 업종 분류코드
	private String cat_acc_cd;	//거래처코드
	private String area_city_cd;	//모든 지역 시군코드
	private String area_cd;	//전국지역코드
	private String man_com_cd;	//위원회코드
	private String cat_acc_nm1;	//거래처명
	private String catbus_acc_bus;	//거래처업종분류
	private String catapp_acc_app;	//승인자
	private String man_com_nm1;	//위원회명
	private String catapp_acc_dt;	//승인일자
	private String catapp_acc_con;	//승인 상태
	private String catapp_acc_pur;	//거래처업무
	
	public String getCatapp_acc_cd() {
		return catapp_acc_cd;
	}
	public void setCatapp_acc_cd(String catapp_acc_cd) {
		this.catapp_acc_cd = catapp_acc_cd;
	}
	public String getAreacity_admin_cd() {
		return areacity_admin_cd;
	}
	public void setAreacity_admin_cd(String areacity_admin_cd) {
		this.areacity_admin_cd = areacity_admin_cd;
	}
	public String getCatbus_acc_cd() {
		return catbus_acc_cd;
	}
	public void setCatbus_acc_cd(String catbus_acc_cd) {
		this.catbus_acc_cd = catbus_acc_cd;
	}
	public String getCat_acc_cd() {
		return cat_acc_cd;
	}
	public void setCat_acc_cd(String cat_acc_cd) {
		this.cat_acc_cd = cat_acc_cd;
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
	public String getCatbus_acc_bus() {
		return catbus_acc_bus;
	}
	public void setCatbus_acc_bus(String catbus_acc_bus) {
		this.catbus_acc_bus = catbus_acc_bus;
	}
	public String getCatapp_acc_app() {
		return catapp_acc_app;
	}
	public void setCatapp_acc_app(String catapp_acc_app) {
		this.catapp_acc_app = catapp_acc_app;
	}
	public String getMan_com_nm1() {
		return man_com_nm1;
	}
	public void setMan_com_nm1(String man_com_nm1) {
		this.man_com_nm1 = man_com_nm1;
	}
	public String getCatapp_acc_dt() {
		return catapp_acc_dt;
	}
	public void setCatapp_acc_dt(String catapp_acc_dt) {
		this.catapp_acc_dt = catapp_acc_dt;
	}
	public String getCatapp_acc_con() {
		return catapp_acc_con;
	}
	public void setCatapp_acc_con(String catapp_acc_con) {
		this.catapp_acc_con = catapp_acc_con;
	}
	public String getCatapp_acc_pur() {
		return catapp_acc_pur;
	}
	public void setCatapp_acc_pur(String catapp_acc_pur) {
		this.catapp_acc_pur = catapp_acc_pur;
	}
	@Override
	public String toString() {
		return "AppAccount [catapp_acc_cd=" + catapp_acc_cd + ", areacity_admin_cd=" + areacity_admin_cd
				+ ", catbus_acc_cd=" + catbus_acc_cd + ", cat_acc_cd=" + cat_acc_cd + ", area_city_cd=" + area_city_cd
				+ ", area_cd=" + area_cd + ", man_com_cd=" + man_com_cd + ", cat_acc_nm1=" + cat_acc_nm1
				+ ", catbus_acc_bus=" + catbus_acc_bus + ", catapp_acc_app=" + catapp_acc_app + ", man_com_nm1="
				+ man_com_nm1 + ", catapp_acc_dt=" + catapp_acc_dt + ", catapp_acc_con=" + catapp_acc_con
				+ ", catapp_acc_pur=" + catapp_acc_pur + "]";
	}
	
}
