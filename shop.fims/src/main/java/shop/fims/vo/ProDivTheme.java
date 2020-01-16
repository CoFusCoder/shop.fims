package shop.fims.vo;

public class ProDivTheme {
	private String festprodivThemeCd;
	private String areacityAdminCd;
	private String areaCityCd;
	private String areaCd;
	private String festCd;
	private String festTitle;
	private String festprodivThemeNm;
	public String getFestprodivThemeCd() {
		return festprodivThemeCd;
	}
	public void setFestprodivThemeCd(String festprodivThemeCd) {
		this.festprodivThemeCd = festprodivThemeCd;
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
	public String getFestCd() {
		return festCd;
	}
	public void setFestCd(String festCd) {
		this.festCd = festCd;
	}
	public String getFestTitle() {
		return festTitle;
	}
	public void setFestTitle(String festTitle) {
		this.festTitle = festTitle;
	}
	public String getFestprodivThemeNm() {
		return festprodivThemeNm;
	}
	public void setFestprodivThemeNm(String festprodivThemeNm) {
		this.festprodivThemeNm = festprodivThemeNm;
	}
	@Override
	public String toString() {
		return "ProDivTheme [festprodivThemeCd=" + festprodivThemeCd + ", areacityAdminCd=" + areacityAdminCd
				+ ", areaCityCd=" + areaCityCd + ", areaCd=" + areaCd + ", festCd=" + festCd + ", festTitle="
				+ festTitle + ", festprodivThemeNm=" + festprodivThemeNm + "]";
	}

}
