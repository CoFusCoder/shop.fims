package shop.fims.vo;

public class Festival {
	
	private String festCd;
	private String areacityAdminCd;
	private String areaCityCd;
	private String areaCd;
	private String festNm;
	private String festHostArea;
	private String festHostPlace;
	private String festStartDt;
	private String festEndDt;
	private String festContent;
	private String festSuperAgency;
	private String festSpoAgency;
	private String festAddr;
	private String festInquiry;
	public String getFestCd() {
		return festCd;
	}
	public void setFestCd(String festCd) {
		this.festCd = festCd;
	}
	public String getAreacityAdminCd() {
		return areacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		this.areacityAdminCd = areacityAdminCd;
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
	public String getFestNm() {
		return festNm;
	}
	public void setFestNm(String festNm) {
		this.festNm = festNm;
	}
	public String getFestHostArea() {
		return festHostArea;
	}
	public void setFestHostArea(String festHostArea) {
		this.festHostArea = festHostArea;
	}
	public String getFestHostPlace() {
		return festHostPlace;
	}
	public void setFestHostPlace(String festHostPlace) {
		this.festHostPlace = festHostPlace;
	}
	public String getFestStartDt() {
		return festStartDt;
	}
	public void setFestStartDt(String festStartDt) {
		this.festStartDt = festStartDt;
	}
	public String getFestEndDt() {
		return festEndDt;
	}
	public void setFestEndDt(String festEndDt) {
		this.festEndDt = festEndDt;
	}
	public String getFestContent() {
		return festContent;
	}
	public void setFestContent(String festContent) {
		this.festContent = festContent;
	}
	public String getFestSuperAgency() {
		return festSuperAgency;
	}
	public void setFestSuperAgency(String festSuperAgency) {
		this.festSuperAgency = festSuperAgency;
	}
	public String getFestSpoAgency() {
		return festSpoAgency;
	}
	public void setFestSpoAgency(String festSpoAgency) {
		this.festSpoAgency = festSpoAgency;
	}
	public String getFestAddr() {
		return festAddr;
	}
	public void setFestAddr(String festAddr) {
		this.festAddr = festAddr;
	}
	public String getFestInquiry() {
		return festInquiry;
	}
	public void setFestInquiry(String festInquiry) {
		this.festInquiry = festInquiry;
	}
	@Override
	public String toString() {
		return "Festival [festCd=" + festCd + ", areacityAdminCd=" + areacityAdminCd + ", areaCityCd=" + areaCityCd
				+ ", areaCd=" + areaCd + ", festNm=" + festNm + ", festHostArea=" + festHostArea + ", festHostPlace="
				+ festHostPlace + ", festStartDt=" + festStartDt + ", festEndDt=" + festEndDt + ", festContent="
				+ festContent + ", festSuperAgency=" + festSuperAgency + ", festSpoAgency=" + festSpoAgency
				+ ", festAddr=" + festAddr + ", festInquiry=" + festInquiry + "]";
	}
}
