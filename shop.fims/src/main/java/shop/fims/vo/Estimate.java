package shop.fims.vo;

public class Estimate {

	private String exaRepCd;// 모든 심사 결과
	private String areacityAdminCd;// 모든 행정기관코드
	private String areaCd;// 전국지역코드
	private String areaCityCd;// 모든 지역 시군코드
	private String festCd;// 축제코드
	private String memCd;// 회원코드
	private String accMemCd;// 하나의 거래처별 소속 회원코드
	private String festProCd;// 하나의 축제내 여러개 프로그램 소개코드
	private String evaIndexCd;// 심사 평가지표명코드
	private String exaCondition;// 심사 유무
	private String exaDt;// 심사일자
	private String exaJoindt;//등록일자
	private String exaTotalScore;// 총점
	private String estClaCd;// 심사구분
	private String evaNm;// 평가명
	private String lCriteria;// 대평가항목
	private String mCriteria;// 중평가항목
	private String sCriteria;// 소평가항목
	private String scoringCriteria;// 배점기준
	private String scoring;// 배점
	private String multipleChoice;//객관식
	private String exeManager;//문제코드
	private String evaindexScoCd;//객관식문항점수표 코드
	private String evaindexItemCd;//항목코드
	
	private String areaNm;//지역 이름
	private String areaCityNm;//시군명
	private String areacityAdminNm;//행정기관명
	private String festNm;//축제명
	
	
	// 회원 정보
	private String memLevCd;//모든 회원 레벨코드
	private String memNm;//회원 이름
	private String memAddr;//주소
	private String memPhone;//전화번호
	private String memEmail;//이메일
	private String memBirth;//생년월일
	private String joinDt;//가입일자
	private String LoginCd;//로그인 코드
	private String festAnnNm;//로그인 코드
	public String getExaRepCd() {
		return exaRepCd;
	}
	public void setExaRepCd(String exaRepCd) {
		this.exaRepCd = exaRepCd;
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
	public String getMemCd() {
		return memCd;
	}
	public void setMemCd(String memCd) {
		this.memCd = memCd;
	}
	public String getAccMemCd() {
		return accMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		this.accMemCd = accMemCd;
	}
	public String getFestProCd() {
		return festProCd;
	}
	public void setFestProCd(String festProCd) {
		this.festProCd = festProCd;
	}
	public String getEvaIndexCd() {
		return evaIndexCd;
	}
	public void setEvaIndexCd(String evaIndexCd) {
		this.evaIndexCd = evaIndexCd;
	}
	public String getExaCondition() {
		return exaCondition;
	}
	public void setExaCondition(String exaCondition) {
		this.exaCondition = exaCondition;
	}
	public String getExaDt() {
		return exaDt;
	}
	public void setExaDt(String exaDt) {
		this.exaDt = exaDt;
	}
	public String getExaTotalScore() {
		return exaTotalScore;
	}
	public void setExaTotalScore(String exaTotalScore) {
		this.exaTotalScore = exaTotalScore;
	}
	public String getEstClaCd() {
		return estClaCd;
	}
	public void setEstClaCd(String estClaCd) {
		this.estClaCd = estClaCd;
	}
	public String getEvaNm() {
		return evaNm;
	}
	public void setEvaNm(String evaNm) {
		this.evaNm = evaNm;
	}
	public String getlCriteria() {
		return lCriteria;
	}
	public void setlCriteria(String lCriteria) {
		this.lCriteria = lCriteria;
	}
	public String getmCriteria() {
		return mCriteria;
	}
	public void setmCriteria(String mCriteria) {
		this.mCriteria = mCriteria;
	}
	public String getsCriteria() {
		return sCriteria;
	}
	public void setsCriteria(String sCriteria) {
		this.sCriteria = sCriteria;
	}
	public String getScoringCriteria() {
		return scoringCriteria;
	}
	public void setScoringCriteria(String scoringCriteria) {
		this.scoringCriteria = scoringCriteria;
	}
	public String getScoring() {
		return scoring;
	}
	public void setScoring(String scoring) {
		this.scoring = scoring;
	}
	public String getMultipleChoice() {
		return multipleChoice;
	}
	public void setMultipleChoice(String multipleChoice) {
		this.multipleChoice = multipleChoice;
	}
	public String getExeManager() {
		return exeManager;
	}
	public void setExeManager(String exeManager) {
		this.exeManager = exeManager;
	}
	public String getEvaindexScoCd() {
		return evaindexScoCd;
	}
	public void setEvaindexScoCd(String evaindexScoCd) {
		this.evaindexScoCd = evaindexScoCd;
	}
	public String getEvaindexItemCd() {
		return evaindexItemCd;
	}
	public void setEvaindexItemCd(String evaindexItemCd) {
		this.evaindexItemCd = evaindexItemCd;
	}
	public String getAreaNm() {
		return areaNm;
	}
	public void setAreaNm(String areaNm) {
		this.areaNm = areaNm;
	}
	public String getAreaCityNm() {
		return areaCityNm;
	}
	public void setAreaCityNm(String areaCityNm) {
		this.areaCityNm = areaCityNm;
	}
	public String getAreacityAdminNm() {
		return areacityAdminNm;
	}
	public void setAreacityAdminNm(String areacityAdminNm) {
		this.areacityAdminNm = areacityAdminNm;
	}
	public String getFestNm() {
		return festNm;
	}
	public void setFestNm(String festNm) {
		this.festNm = festNm;
	}
	public String getMemLevCd() {
		return memLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		this.memLevCd = memLevCd;
	}
	public String getMemNm() {
		return memNm;
	}
	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}
	public String getMemAddr() {
		return memAddr;
	}
	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemBirth() {
		return memBirth;
	}
	public void setMemBirth(String memBirth) {
		this.memBirth = memBirth;
	}
	public String getJoinDt() {
		return joinDt;
	}
	public void setJoinDt(String joinDt) {
		this.joinDt = joinDt;
	}
	public String getLoginCd() {
		return LoginCd;
	}
	public void setLoginCd(String loginCd) {
		LoginCd = loginCd;
	}
	public String getFestAnnNm() {
		return festAnnNm;
	}
	public void setFestAnnNm(String festAnnNm) {
		this.festAnnNm = festAnnNm;
	}
	public String getExaJoindt() {
		return exaJoindt;
	}
	public void setExaJoindt(String exaJoindt) {
		this.exaJoindt = exaJoindt;
	}
	@Override
	public String toString() {
		return "Estimate [exaRepCd=" + exaRepCd + ", areacityAdminCd=" + areacityAdminCd + ", areaCd=" + areaCd
				+ ", areaCityCd=" + areaCityCd + ", festCd=" + festCd + ", memCd=" + memCd + ", accMemCd=" + accMemCd
				+ ", festProCd=" + festProCd + ", evaIndexCd=" + evaIndexCd + ", exaCondition=" + exaCondition
				+ ", exaDt=" + exaDt + ", exaTotalScore=" + exaTotalScore + ", estClaCd=" + estClaCd + ", evaNm="
				+ evaNm + ", lCriteria=" + lCriteria + ", mCriteria=" + mCriteria + ", sCriteria=" + sCriteria
				+ ", scoringCriteria=" + scoringCriteria + ", scoring=" + scoring + ", multipleChoice=" + multipleChoice
				+ ", exeManager=" + exeManager + ", evaindexScoCd=" + evaindexScoCd + ", evaindexItemCd="
				+ evaindexItemCd + ", areaNm=" + areaNm + ", areaCityNm=" + areaCityNm + ", areacityAdminNm="
				+ areacityAdminNm + ", festNm=" + festNm + ", memLevCd=" + memLevCd + ", memNm=" + memNm + ", memAddr="
				+ memAddr + ", memPhone=" + memPhone + ", memEmail=" + memEmail + ", memBirth=" + memBirth + ", joinDt="
				+ joinDt + ", LoginCd=" + LoginCd + ", festAnnNm=" + festAnnNm + ", exaJoindt=" + exaJoindt + "]";
	}
	
	

	
	
}
