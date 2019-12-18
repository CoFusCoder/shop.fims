package shop.fims.vo;

public class ProDivTheme {
	private String festprodiv_theme_cd;
	private String areacity_admin_cd;
	private String area_city_cd;
	private String area_cd;
	private String fest_cd;
	private String fest_nm;
	private String festprodiv_theme_nm;
	
	public String getFestprodiv_theme_cd() {
		return festprodiv_theme_cd;
	}
	public void setFestprodiv_theme_cd(String festprodiv_theme_cd) {
		this.festprodiv_theme_cd = festprodiv_theme_cd;
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
	public String getFestprodiv_theme_nm() {
		return festprodiv_theme_nm;
	}
	public void setFestprodiv_theme_nm(String festprodiv_theme_nm) {
		this.festprodiv_theme_nm = festprodiv_theme_nm;
	}
	@Override
	public String toString() {
		return "ProDivTheme [festprodiv_theme_cd=" + festprodiv_theme_cd + ", areacity_admin_cd=" + areacity_admin_cd
				+ ", area_city_cd=" + area_city_cd + ", area_cd=" + area_cd + ", fest_cd=" + fest_cd + ", fest_nm="
				+ fest_nm + ", festprodiv_theme_nm=" + festprodiv_theme_nm + "]";
	}
	
}
