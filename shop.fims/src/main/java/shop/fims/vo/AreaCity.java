package shop.fims.vo;

public class AreaCity {
	
	private String areaCityCd;
	private String areaCd;
	private String areaCityNm;
	
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
	public String getAreaCityNm() {
		return areaCityNm;
	}
	public void setAreaCityNm(String areaCityNm) {
		this.areaCityNm = areaCityNm;
	}
	@Override
	public String toString() {
		return "AreaCity [areaCityCd=" + areaCityCd + ", areaCd=" + areaCd + ", areaCityNm=" + areaCityNm + "]";
	}
}
