package shop.fims.vo;

public class Revenue {

	private String goodsrenRevCd;// 모든축제별 보유물품대여관리코드
	private String areacityAdminCd;// 모든 행정기관코드
	private String areaCd;// 전국지역코드
	private String areaCityCd;// 모든 지역 시군코드
	private String festCd; // 축제코드
	private String catbusAccCd;// 거래처 업종 분류코드
	private String catAccCd; // 거래처코드
	private String catappAccCd;// 거래처별 승인 업종 코드
	private String fesrevBudCd;// 모든축제세입세출예산관리코드
	private String manComCd;// 위원회코드
	private String deliverBre;// 보유물품사용내역
	private String money;// 대여료
	private String goodsAmt;// 수량
	private String lender;// 대여자
	private String returnSituation;// 반납유무
	private String returnDueDt;// 반납예정일
	private String returnDt;// 반납완료일
	private String groupCd;// 세입상세그룹코드
	private String actionDt;// 마감일자
	private String actionStatus;// 마감유무
	
	public String getGoodsrenRevCd() {
		return goodsrenRevCd;
	}
	public void setGoodsrenRevCd(String goodsrenRevCd) {
		this.goodsrenRevCd = goodsrenRevCd;
	}
	public String getAreacityAdminCd() {
		return areacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		this.areacityAdminCd = areacityAdminCd;
	}
	public String getAreaCd() {
		return areaCd;
	}
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
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
	public String getCatbusAccCd() {
		return catbusAccCd;
	}
	public void setCatbusAccCd(String catbusAccCd) {
		this.catbusAccCd = catbusAccCd;
	}
	public String getCatAccCd() {
		return catAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		this.catAccCd = catAccCd;
	}
	public String getCatappAccCd() {
		return catappAccCd;
	}
	public void setCatappAccCd(String catappAccCd) {
		this.catappAccCd = catappAccCd;
	}
	public String getFesrevBudCd() {
		return fesrevBudCd;
	}
	public void setFesrevBudCd(String fesrevBudCd) {
		this.fesrevBudCd = fesrevBudCd;
	}
	public String getManComCd() {
		return manComCd;
	}
	public void setManComCd(String manComCd) {
		this.manComCd = manComCd;
	}
	public String getDeliverBre() {
		return deliverBre;
	}
	public void setDeliverBre(String deliverBre) {
		this.deliverBre = deliverBre;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getGoodsAmt() {
		return goodsAmt;
	}
	public void setGoodsAmt(String goodsAmt) {
		this.goodsAmt = goodsAmt;
	}
	public String getLender() {
		return lender;
	}
	public void setLender(String lender) {
		this.lender = lender;
	}
	public String getReturnSituation() {
		return returnSituation;
	}
	public void setReturnSituation(String returnSituation) {
		this.returnSituation = returnSituation;
	}
	public String getReturnDueDt() {
		return returnDueDt;
	}
	public void setReturnDueDt(String returnDueDt) {
		this.returnDueDt = returnDueDt;
	}
	public String getReturnDt() {
		return returnDt;
	}
	public void setReturnDt(String returnDt) {
		this.returnDt = returnDt;
	}
	public String getGroupCd() {
		return groupCd;
	}
	public void setGroupCd(String groupCd) {
		this.groupCd = groupCd;
	}
	public String getActionDt() {
		return actionDt;
	}
	public void setActionDt(String actionDt) {
		this.actionDt = actionDt;
	}
	public String getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}
	@Override
	public String toString() {
		return "Revenue [goodsrenRevCd=" + goodsrenRevCd + ", areacityAdminCd=" + areacityAdminCd + ", areaCd=" + areaCd
				+ ", areaCityCd=" + areaCityCd + ", festCd=" + festCd + ", catbusAccCd=" + catbusAccCd + ", catAccCd="
				+ catAccCd + ", catappAccCd=" + catappAccCd + ", fesrevBudCd=" + fesrevBudCd + ", manComCd=" + manComCd
				+ ", deliverBre=" + deliverBre + ", money=" + money + ", goodsAmt=" + goodsAmt + ", lender=" + lender
				+ ", returnSituation=" + returnSituation + ", returnDueDt=" + returnDueDt + ", returnDt=" + returnDt
				+ ", groupCd=" + groupCd + ", actionDt=" + actionDt + ", actionStatus=" + actionStatus + "]";
	}
	
	
}
