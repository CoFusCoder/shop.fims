package shop.fims.vo;

public class Human {

	private String festNm;
	private String workdivNm;
	private String humanNm;
	private String humanPhone;
	private String humanHour;
	private String comNm2;
	private String mamcd;
	private String humancd;
	
	public String getFestNm() {
		return festNm;
	}
	public void setFestNm(String festNm) {
		this.festNm = festNm;
	}
	public String getWorkdivNm() {
		return workdivNm;
	}
	public void setWorkdivNm(String workdivNm) {
		this.workdivNm = workdivNm;
	}
	public String getHumanNm() {
		return humanNm;
	}
	public void setHumanNm(String humanNm) {
		this.humanNm = humanNm;
	}
	public String getHumanPhone() {
		return humanPhone;
	}
	public void setHumanPhone(String humanPhone) {
		this.humanPhone = humanPhone;
	}
	public String getHumanHour() {
		return humanHour;
	}
	public void setHumanHour(String humanHour) {
		this.humanHour = humanHour;
	}
	public String getComNm2() {
		return comNm2;
	}
	public void setComNm2(String comNm2) {
		this.comNm2 = comNm2;
	}
	public String getMamcd() {
		return mamcd;
	}
	public void setMamcd(String mamcd) {
		this.mamcd = mamcd;
	}
	public String getHumancd() {
		return humancd;
	}
	public void setHumancd(String humancd) {
		this.humancd = humancd;
	}
	@Override
	public String toString() {
		return "Human [festNm=" + festNm + ", workdivNm=" + workdivNm + ", humanNm=" + humanNm + ", humanPhone="
				+ humanPhone + ", humanHour=" + humanHour + ", comNm2=" + comNm2 + ", mamcd=" + mamcd + ", humancd="
				+ humancd + "]";
	}
	

	
}
