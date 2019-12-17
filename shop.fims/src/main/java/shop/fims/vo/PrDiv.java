package shop.fims.vo;

public class PrDiv {
	private String festpr_div_cd;
	private String festpr_div_nm;
	public String getFestpr_div_cd() {
		return festpr_div_cd;
	}
	public void setFestpr_div_cd(String festpr_div_cd) {
		this.festpr_div_cd = festpr_div_cd;
	}
	public String getFestpr_div_nm() {
		return festpr_div_nm;
	}
	public void setFestpr_div_nm(String festpr_div_nm) {
		this.festpr_div_nm = festpr_div_nm;
	}
	@Override
	public String toString() {
		return "PrDiv [festpr_div_cd=" + festpr_div_cd + ", festpr_div_nm=" + festpr_div_nm + "]";
	}
	
}
