package shop.fims.vo;

public class Work {

	private String festNm;
	private String workcatNm;
	private String workdivNm;
	private String comNm2;
	private String workdivcd;
	
	
	public String getFestNm() {
		return festNm;
	}
	public void setFestNm(String festNm) {
		this.festNm = festNm;
	}
	public String getWorkcatNm() {
		return workcatNm;
	}
	public void setWorkcatNm(String workcatNm) {
		this.workcatNm = workcatNm;
	}
	public String getWorkdivNm() {
		return workdivNm;
	}
	public void setWorkdivNm(String workdivNm) {
		this.workdivNm = workdivNm;
	}
	public String getComNm2() {
		return comNm2;
	}
	public void setComNm2(String comNm2) {
		this.comNm2 = comNm2;
	}
	
	public String getWorkdivcd() {
		return workdivcd;
	}
	public void setWorkdivcd(String workdivcd) {
		this.workdivcd = workdivcd;
	}
	@Override
	public String toString() {
		return "Work [festNm=" + festNm + ", workcatNm=" + workcatNm + ", workdivNm=" + workdivNm + ", comNm2=" + comNm2
				+ ", workdivcd=" + workdivcd + "]";
	}

	
	
}
