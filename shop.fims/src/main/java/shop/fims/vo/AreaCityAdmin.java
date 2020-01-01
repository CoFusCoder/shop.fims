package shop.fims.vo;

public class AreaCityAdmin {
	
	private String areacityAdminCd;
	private String areaCd;
	private String areaCityCd;
	private String areacityAdminNm;
	
	public String getAreacityAdminCd() {
		return areacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		this.areacityAdminCd = areacityAdminCd;
	}
	public String getAreaCd() {
		return areaCd;
	}
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}
	public String getAreaCityCd() {
		return areaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		this.areaCityCd = areaCityCd;
	}
	public String getAreacityAdminNm() {
		return areacityAdminNm;
	}
	public void setAreacityAdminNm(String areacityAdminNm) {
		this.areacityAdminNm = areacityAdminNm;
	}
	@Override
	public String toString() {
		return "AreaCityAdmin [areacityAdminCd=" + areacityAdminCd + ", areaCd=" + areaCd + ", areaCityCd=" + areaCityCd
				+ ", areacityAdminNm=" + areacityAdminNm + "]";
	}
}
