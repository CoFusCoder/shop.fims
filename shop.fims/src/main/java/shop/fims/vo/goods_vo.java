package shop.fims.vo;

public class goods_vo {

	private String goods_nm;
	private int goods_amt;
	private String special_note;
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
		return "goods_vo [goods_nm=" + goods_nm + ", goods_amt=" + goods_amt + ", special_note=" + special_note + "]";
	}
	
 
}
