package shop.fims.vo;

public class AdminDepart {
	
	private String adminDepCd;
	private String areacityAdminCd;
	private String adminDepBelong;
	private String adminDepNm;
	
	public String getAdminDepCd() {
		return adminDepCd;
	}
	public void setAdminDepCd(String adminDepCd) {
		this.adminDepCd = adminDepCd;
	}
	public String getAreacityAdminCd() {
		return areacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		this.areacityAdminCd = areacityAdminCd;
	}
	public String getAdminDepBelong() {
		return adminDepBelong;
	}
	public void setAdminDepBelong(String adminDepBelong) {
		this.adminDepBelong = adminDepBelong;
	}
	public String getAdminDepNm() {
		return adminDepNm;
	}
	public void setAdminDepNm(String adminDepNm) {
		this.adminDepNm = adminDepNm;
	}
	@Override
	public String toString() {
		return "AdminDepart [adminDepCd=" + adminDepCd + ", areacityAdminCd=" + areacityAdminCd + ", adminDepBelong="
				+ adminDepBelong + ", adminDepNm=" + adminDepNm + "]";
	}
}
