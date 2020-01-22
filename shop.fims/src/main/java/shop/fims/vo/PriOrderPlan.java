package shop.fims.vo;

public class PriOrderPlan extends AreaCityAdmin {

	private String PriOrderPlanCd ; //수의발주계약관리코드
	private String AreacityAdminCd ; //행정기관코드
	private String AreaCd ; //전국지역코드
	private String AreaCityCd ; //지역시군코드
	private String FesrevBudCd ; //세입세출예산관리코드
	private String FestCd ; //축제코드
	private String ManComCd ; //위원회코드
	private String ContractCla ; //계약구분
	private String EnterpriseCla ; //사업구분
	private String OrderDate ; //발주시기
	private String EnterpriseNm ; //사업명
	private int Budget ; //예산액
	private String FesNm ; //축제명
	private String StratDate ; //접수기간시작
	private String EndDate ; //접수기간끝
	private String OrganNm ; //소속
	private String RegisterNm ; //등록자
	private String RegisterDate ; //등록일자
	
	public String getPriOrderPlanCd() {
		return PriOrderPlanCd;
	}
	public void setPriOrderPlanCd(String priOrderPlanCd) {
		PriOrderPlanCd = priOrderPlanCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getAreaCd() {
		return AreaCd;
	}
	public void setAreaCd(String areaCd) {
		AreaCd = areaCd;
	}
	public String getAreaCityCd() {
		return AreaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		AreaCityCd = areaCityCd;
	}
	public String getFesrevBudCd() {
		return FesrevBudCd;
	}
	public void setFesrevBudCd(String fesrevBudCd) {
		FesrevBudCd = fesrevBudCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getContractCla() {
		return ContractCla;
	}
	public void setContractCla(String contractCla) {
		ContractCla = contractCla;
	}
	public String getEnterpriseCla() {
		return EnterpriseCla;
	}
	public void setEnterpriseCla(String enterpriseCla) {
		EnterpriseCla = enterpriseCla;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getEnterpriseNm() {
		return EnterpriseNm;
	}
	public void setEnterpriseNm(String enterpriseNm) {
		EnterpriseNm = enterpriseNm;
	}
	public int getBudget() {
		return Budget;
	}
	public void setBudget(int budget) {
		Budget = budget;
	}
	public String getFesNm() {
		return FesNm;
	}
	public void setFesNm(String fesNm) {
		FesNm = fesNm;
	}
	public String getStratDate() {
		return StratDate;
	}
	public void setStratDate(String stratDate) {
		StratDate = stratDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getOrganNm() {
		return OrganNm;
	}
	public void setOrganNm(String organNm) {
		OrganNm = organNm;
	}
	public String getRegisterNm() {
		return RegisterNm;
	}
	public void setRegisterNm(String registerNm) {
		RegisterNm = registerNm;
	}
	public String getRegisterDate() {
		return RegisterDate;
	}
	public void setRegisterDate(String registerDate) {
		RegisterDate = registerDate;
	}
	
	@Override
	public String toString() {
		return "PriOrderPlan [PriOrderPlanCd=" + PriOrderPlanCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd="
				+ AreaCd + ", AreaCityCd=" + AreaCityCd + ", FesrevBudCd=" + FesrevBudCd + ", FestCd=" + FestCd
				+ ", ManComCd=" + ManComCd + ", ContractCla=" + ContractCla + ", EnterpriseCla=" + EnterpriseCla
				+ ", OrderDate=" + OrderDate + ", EnterpriseNm=" + EnterpriseNm + ", Budget=" + Budget + ", FesNm="
				+ FesNm + ", StratDate=" + StratDate + ", EndDate=" + EndDate + ", OrganNm=" + OrganNm + ", RegisterNm="
				+ RegisterNm + ", RegisterDate=" + RegisterDate + "]";
	}
	
	
	
	
}
