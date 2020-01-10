package shop.fims.vo;

public class MemberLev {
	
	private String memLevCd;
	private String memLevNm;
	public String getMemLevCd() {
		return memLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		this.memLevCd = memLevCd;
	}
	public String getMemLevNm() {
		return memLevNm;
	}
	public void setMemLevNm(String memLevNm) {
		this.memLevNm = memLevNm;
	}
	@Override
	public String toString() {
		return "MemberLev [memLevCd=" + memLevCd + ", memLevNm=" + memLevNm + "]";
	}
	
}
