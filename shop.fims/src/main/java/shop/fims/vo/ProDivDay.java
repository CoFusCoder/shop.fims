package shop.fims.vo;

public class ProDivDay {
	private String festprodivDayCd;
	private String festprodivDayNm;
	public String getFestprodivDayCd() {
		return festprodivDayCd;
	}
	public void setFestprodivDayCd(String festprodivDayCd) {
		this.festprodivDayCd = festprodivDayCd;
	}
	public String getFestprodivDayNm() {
		return festprodivDayNm;
	}
	public void setFestprodivDayNm(String festprodivDayNm) {
		this.festprodivDayNm = festprodivDayNm;
	}
	@Override
	public String toString() {
		return "ProDivDay [festprodivDayCd=" + festprodivDayCd + ", festprodivDayNm=" + festprodivDayNm + "]";
	}
	
	
}
