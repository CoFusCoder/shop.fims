package shop.fims.vo;

public class goods_vo {

	private String area_cd;
	private String areacity_adm_cd;
	private String area_city_cd;
	private String fest_cd;
	private String admin_dep_cd;
	private String goods_nm;
	private int goods_amt;
	private String special_note;
	
	public String getAreacity_adm_cd() {
		return areacity_adm_cd;
	}
	public void setAreacity_adm_cd(String areacity_adm_cd) {
		this.areacity_adm_cd = areacity_adm_cd;
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
	public String getAdmin_dep_cd() {
		return admin_dep_cd;
	}
	public void setAdmin_dep_cd(String admin_dep_cd) {
		this.admin_dep_cd = admin_dep_cd;
	}
	public String getGoods_nm() {
		return goods_nm;
	}
	public void setGoods_nm(String goods_nm) {
		this.goods_nm = goods_nm;
	}
	public int getGoods_amt() {
		return goods_amt;
	}
	public void setGoods_amt(int goods_amt) {
		this.goods_amt = goods_amt;
	}
	public String getSpecial_note() {
		return special_note;
	}
	public void setSpecial_note(String special_note) {
		this.special_note = special_note;
	}
	@Override
	public String toString() {
		return "goods_vo [areacity_adm_cd=" + areacity_adm_cd + ", area_city_cd=" + area_city_cd + ", area_cd="
				+ area_cd + ", fest_cd=" + fest_cd + ", admin_dep_cd=" + admin_dep_cd + ", goods_nm=" + goods_nm
				+ ", goods_amt=" + goods_amt + ", special_note=" + special_note + "]";
	}
	
	
 
}
