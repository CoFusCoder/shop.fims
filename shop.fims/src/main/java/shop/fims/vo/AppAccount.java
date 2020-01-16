package shop.fims.vo;

public class AppAccount {
	
	private String catAppAccCd;	//거래처별 승인 업종 코드	//catapp_acc_cd
	private String areacityAdminCd;	//모든 행정기관코드	//areacity_admin_cd
	private String catBusAccCd;	//거래처 업종 분류코드		//catbus_acc_cd
	private String catAccCd;	//거래처코드				//cat_acc_cd
	private String areaCityCd;	//모든 지역 시군코드		//area_city_cd
	private String areaCd;	//전국지역코드				//area_cd
	private String manComCd;	//위원회코드				//man_com_cd
	private String catAccNm1;	//거래처명				//cat_acc_nm1
	private String catBusAccBus;	//거래처업종분류		//catbus_acc_bus
	private String catAppAccApp;	//승인자				//catapp_acc_app
	private String manComNm1;	//위원회명				//man_com_nm1
	private String catAppAccDt;	//승인일자				//catapp_acc_dt
	private String catAppAccCon;	//승인 상태			//catapp_acc_con
	private String catAppAccPur;	//거래처업무			//catapp_acc_pur
	
	public String getCatAppAccCd() {
		return catAppAccCd;
	}
	public void setCatAppAccCd(String catAppAccCd) {
		this.catAppAccCd = catAppAccCd;
	}
	public String getAreacityAdminCd() {
		return areacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		this.areacityAdminCd = areacityAdminCd;
	}
	public String getCatBusAccCd() {
		return catBusAccCd;
	}
	public void setCatBusAccCd(String catBusAccCd) {
		this.catBusAccCd = catBusAccCd;
	}
	public String getCatAccCd() {
		return catAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		this.catAccCd = catAccCd;
	}
	public String getAreaCityCd() {
		return areaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		this.areaCityCd = areaCityCd;
	}
	public String getAreaCd() {
		return areaCd;
	}
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}
	public String getManComCd() {
		return manComCd;
	}
	public void setManComCd(String manComCd) {
		this.manComCd = manComCd;
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
	public String getCatAppAccApp() {
		return catAppAccApp;
	}
	public void setCatAppAccApp(String catAppAccApp) {
		this.catAppAccApp = catAppAccApp;
	}
	public String getManComNm1() {
		return manComNm1;
	}
	public void setManComNm1(String manComNm1) {
		this.manComNm1 = manComNm1;
	}
	public String getCatAppAccDt() {
		return catAppAccDt;
	}
	public void setCatAppAccDt(String catAppAccDt) {
		this.catAppAccDt = catAppAccDt;
	}
	public String getCatAppAccCon() {
		return catAppAccCon;
	}
	public void setCatAppAccCon(String catAppAccCon) {
		this.catAppAccCon = catAppAccCon;
	}
	public String getCatAppAccPur() {
		return catAppAccPur;
	}
	public void setCatAppAccPur(String catAppAccPur) {
		this.catAppAccPur = catAppAccPur;
	}
	@Override
	public String toString() {
		return "AppAccount [catAppAccCd=" + catAppAccCd + ", areacityAdminCd=" + areacityAdminCd + ", catBusAccCd="
				+ catBusAccCd + ", catAccCd=" + catAccCd + ", areaCityCd=" + areaCityCd + ", areaCd=" + areaCd
				+ ", manComCd=" + manComCd + ", catAccNm1=" + catAccNm1 + ", catBusAccBus=" + catBusAccBus
				+ ", catAppAccApp=" + catAppAccApp + ", manComNm1=" + manComNm1 + ", catAppAccDt=" + catAppAccDt
				+ ", catAppAccCon=" + catAppAccCon + ", catAppAccPur=" + catAppAccPur + "]";
	}
	

	
}
