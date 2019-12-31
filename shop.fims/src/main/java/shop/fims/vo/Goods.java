package shop.fims.vo;

public class Goods {

	private String goodspreConCd;//모든보유물품현황코드
	private String areaCd;//전국지역코드
	private String areacityAdmCd;//모든 행정기관코드
	private String areaCityCd;//모든 지역 시군코드
	private String festCd;//축제코드
	private String adminDepCd;//모든 행정기관 부서코드
	private String goodsNm;//부서명
	private int goodsAmt;//수량
	private String specialNote;//특이사항
	
	
	public String getGoodspre_con_cd() {
		return goodspreConCd;
	}
	public void setGoodspre_con_cd(String goodspre_con_cd) {
		this.goodspreConCd = goodspre_con_cd;
	}
	public String getAreaCd() {
		return areaCd;
	}
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}
	public String getAreacityAdmCd() {
		return areacityAdmCd;
	}
	public void setAreacityAdmCd(String areacityAdmCd) {
		this.areacityAdmCd = areacityAdmCd;
	}
	public String getAreaCityCd() {
		return areaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		this.areaCityCd = areaCityCd;
	}
	public String getFestCd() {
		return festCd;
	}
	public void setFestCd(String festCd) {
		this.festCd = festCd;
	}
	public String getAdminDepCd() {
		return adminDepCd;
	}
	public void setAdminDepCd(String adminDepCd) {
		this.adminDepCd = adminDepCd;
	}
	public String getGoodsNm() {
		return goodsNm;
	}
	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}
	public int getGoodsAmt() {
		return goodsAmt;
	}
	public void setGoodsAmt(int goodsAmt) {
		this.goodsAmt = goodsAmt;
	}
	public String getSpecialNote() {
		return specialNote;
	}
	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
	}
	@Override
	public String toString() {
		return "Goods [goodspre_con_cd=" + goodspreConCd + ", areaCd=" + areaCd + ", areacityAdmCd=" + areacityAdmCd
				+ ", areaCityCd=" + areaCityCd + ", festCd=" + festCd + ", adminDepCd=" + adminDepCd + ", goodsNm="
				+ goodsNm + ", goodsAmt=" + goodsAmt + ", specialNote=" + specialNote + "]";
	}
	
	
 
}
