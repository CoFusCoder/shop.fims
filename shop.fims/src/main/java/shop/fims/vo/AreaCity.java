package shop.fims.vo;

public class AreaCity {
	
	private String areaCityCd;
	private String areaCd;
	private String areaNm;
	
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
	public String getAreaNm() {
		return areaNm;
	}
	public void setAreaNm(String areaNm) {
		this.areaNm = areaNm;
	}
	@Override
	public String toString() {
		return "AreaCity [areaCityCd=" + areaCityCd + ", areaCd=" + areaCd + ", areaNm=" + areaNm + "]";
	}

}
