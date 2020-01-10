package shop.fims.vo;

public class PrDiv {
	private String festprDivCd;
	private String festprDivNm;
	public String getFestprDivCd() {
		return festprDivCd;
	}
	public void setFestprDivCd(String festprDivCd) {
		this.festprDivCd = festprDivCd;
	}
	public String getFestprDivNm() {
		return festprDivNm;
	}
	public void setFestprDivNm(String festprDivNm) {
		this.festprDivNm = festprDivNm;
	}
	@Override
	public String toString() {
		return "PrDiv [festprDivCd=" + festprDivCd + ", festprDivNm=" + festprDivNm + "]";
	}
	
	
}
