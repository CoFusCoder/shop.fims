package shop.fims.vo;

public class Committee {
	private String man_com_cd;	//위원회코드
	private String areacity_admin_cd;	//모든 행정기관코드
	private String mem_cd;	//회원코드
	private String mem_lev_cd;	//모든 회원 레벨코드
	private String fest_cd;	//축제코드
	private String exa_rep_cd;	//모든 심사 결과
	private String area_city_cd;	//모든 지역 시군코드
	private String area_cd;	//전국지역코드
	private String fest_nm;	//축제명
	private String man_com_cat;	//위원회 분류
	private String man_com_nm1;	//위원회명
	private String man_com_dep;	//위원회부서
	private String man_com_rank;	//직급
	private String com_mem_nm2;	//이름
	private String man_com_job;	//소속
	private String man_com_dt1;	//작성일자
	private String man_com_app;	//승인자
	private String man_com_dt2;	//승인일자
	private String man_com_con;	//승인 상태
	
	public String getMan_com_cd() {
		return man_com_cd;
	}
	public void setMan_com_cd(String man_com_cd) {
		this.man_com_cd = man_com_cd;
	}
	public String getAreacity_admin_cd() {
		return areacity_admin_cd;
	}
	public void setAreacity_admin_cd(String areacity_admin_cd) {
		this.areacity_admin_cd = areacity_admin_cd;
	}
	public String getMem_cd() {
		return mem_cd;
	}
	public void setMem_cd(String mem_cd) {
		this.mem_cd = mem_cd;
	}
	public String getMem_lev_cd() {
		return mem_lev_cd;
	}
	public void setMem_lev_cd(String mem_lev_cd) {
		this.mem_lev_cd = mem_lev_cd;
	}
	public String getFest_cd() {
		return fest_cd;
	}
	public void setFest_cd(String fest_cd) {
		this.fest_cd = fest_cd;
	}
	public String getExa_rep_cd() {
		return exa_rep_cd;
	}
	public void setExa_rep_cd(String exa_rep_cd) {
		this.exa_rep_cd = exa_rep_cd;
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
	public String getFest_nm() {
		return fest_nm;
	}
	public void setFest_nm(String fest_nm) {
		this.fest_nm = fest_nm;
	}
	public String getMan_com_cat() {
		return man_com_cat;
	}
	public void setMan_com_cat(String man_com_cat) {
		this.man_com_cat = man_com_cat;
	}
	public String getMan_com_nm1() {
		return man_com_nm1;
	}
	public void setMan_com_nm1(String man_com_nm1) {
		this.man_com_nm1 = man_com_nm1;
	}
	public String getMan_com_dep() {
		return man_com_dep;
	}
	public void setMan_com_dep(String man_com_dep) {
		this.man_com_dep = man_com_dep;
	}
	public String getMan_com_rank() {
		return man_com_rank;
	}
	public void setMan_com_rank(String man_com_rank) {
		this.man_com_rank = man_com_rank;
	}
	public String getCom_mem_nm2() {
		return com_mem_nm2;
	}
	public void setCom_mem_nm2(String com_mem_nm2) {
		this.com_mem_nm2 = com_mem_nm2;
	}
	public String getMan_com_job() {
		return man_com_job;
	}
	public void setMan_com_job(String man_com_job) {
		this.man_com_job = man_com_job;
	}
	public String getMan_com_dt1() {
		return man_com_dt1;
	}
	public void setMan_com_dt1(String man_com_dt1) {
		this.man_com_dt1 = man_com_dt1;
	}
	public String getMan_com_app() {
		return man_com_app;
	}
	public void setMan_com_app(String man_com_app) {
		this.man_com_app = man_com_app;
	}
	public String getMan_com_dt2() {
		return man_com_dt2;
	}
	public void setMan_com_dt2(String man_com_dt2) {
		this.man_com_dt2 = man_com_dt2;
	}
	public String getMan_com_con() {
		return man_com_con;
	}
	public void setMan_com_con(String man_com_con) {
		this.man_com_con = man_com_con;
	}
	@Override
	public String toString() {
		return "Committee [man_com_cd=" + man_com_cd + ", areacity_admin_cd=" + areacity_admin_cd + ", mem_cd=" + mem_cd
				+ ", mem_lev_cd=" + mem_lev_cd + ", fest_cd=" + fest_cd + ", exa_rep_cd=" + exa_rep_cd
				+ ", area_city_cd=" + area_city_cd + ", area_cd=" + area_cd + ", fest_nm=" + fest_nm + ", man_com_cat="
				+ man_com_cat + ", man_com_nm1=" + man_com_nm1 + ", man_com_dep=" + man_com_dep + ", man_com_rank="
				+ man_com_rank + ", com_mem_nm2=" + com_mem_nm2 + ", man_com_job=" + man_com_job + ", man_com_dt1="
				+ man_com_dt1 + ", man_com_app=" + man_com_app + ", man_com_dt2=" + man_com_dt2 + ", man_com_con="
				+ man_com_con + "]";
	}
}
