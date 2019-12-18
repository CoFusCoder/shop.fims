package shop.fims.vo;

public class ProDivPlace {
	private String festprodiv_pla_cd;
	private String areacity_admin_cd;
	private String area_city_cd;
	private String area_cd;
	private String fest_cd;
	private String fest_nm;
	private String festprodiv_pla_nm;
	
	
	public String getFestprodiv_pla_cd() {
		return festprodiv_pla_cd;
	}
	public void setFestprodiv_pla_cd(String festprodiv_pla_cd) {
		this.festprodiv_pla_cd = festprodiv_pla_cd;
	}
	public String getAreacity_admin_cd() {
		return areacity_admin_cd;
	}
	public void setAreacity_admin_cd(String areacity_admin_cd) {
		this.areacity_admin_cd = areacity_admin_cd;
	}
	public String getArea_city_cd() {
		return area_city_cd;
	}
	public void setArea_city_cd(String area_city_cd) {
		this.area_city_cd = area_city_cd;
	}
	public String getArea_cd() {
		return area_cd;
	}
	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}
	public String getFest_cd() {
		return fest_cd;
	}
	public void setFest_cd(String fest_cd) {
		this.fest_cd = fest_cd;
	}
	public String getFest_nm() {
		return fest_nm;
	}
	public void setFest_nm(String fest_nm) {
		this.fest_nm = fest_nm;
	}
	public String getFestprodiv_pla_nm() {
		return festprodiv_pla_nm;
	}
	public void setFestprodiv_pla_nm(String festprodiv_pla_nm) {
		this.festprodiv_pla_nm = festprodiv_pla_nm;
	}
	@Override
	public String toString() {
		return "ProDivPlace [festprodiv_pla_cd=" + festprodiv_pla_cd + ", areacity_admin_cd=" + areacity_admin_cd
				+ ", area_city_cd=" + area_city_cd + ", area_cd=" + area_cd + ", fest_cd=" + fest_cd + ", fest_nm="
				+ fest_nm + ", festprodiv_pla_nm=" + festprodiv_pla_nm + "]";
	}

}
