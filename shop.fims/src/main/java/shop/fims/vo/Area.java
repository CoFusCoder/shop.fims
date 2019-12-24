package shop.fims.vo;

public class Area {
	
	private String areaCd;
	private String areaNm;
	
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
		return "Area [areaCd=" + areaCd + ", areaNm=" + areaNm + "]";
	}

}
