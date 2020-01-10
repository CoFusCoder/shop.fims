package shop.fims.facility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Facility;

@Service
public class FacilityService {

	@Autowired
	private FacilityMapper facilitymapper;
	//시설분류조회
	public List<Facility> selectClassification() {
		
		return facilitymapper.selectClassification();
	}
	
	//----------------------------------모든보유시설-----------------------------------------
	
	//보유시설조회
	public List<Facility> selectFacility() {
		
		return facilitymapper.selectFacility();
	}
	//보유시설검색
	public List<Facility> searchClassification(String fest_nm, String fac_sta_nm, 
			String fesfac_cat_nm, String man_com_nm2, String action_status) {
		
		return facilitymapper.searchClassification(fest_nm, fac_sta_nm, fesfac_cat_nm, man_com_nm2, action_status);
	}
	//보유시설수정화면
	public Facility selectupdateFacility(String staCd) {
		
		return facilitymapper.selectupdateFacility(staCd);
	}
	//보유시설수정처리
	public int updateFacility(Facility facility) {
		
		String comCd1 = facility.getComCd();
		String comNm21 = facility.getComNm2();
		String FaccatNm1 = facility.getFaccatNm();
		
		System.out.println("comCd1 확인 :" + comCd1);
		System.out.println("comNm21 확인 :" + comNm21);
		System.out.println("FaccatNm1 확인 :" + FaccatNm1);
		
		String comCd = facilitymapper.selectupdateFacility1(comCd1, comNm21);
		String faccatCd = facilitymapper.selectupdateFacility2(FaccatNm1);
		
		facility.setComCd(comCd);
		facility.setFaccatCd(faccatCd);
		
		System.out.println("facility--------->"+facility);
		System.out.println("comCd 확인 :" + comCd);
		System.out.println("faccatCd 확인 :" + faccatCd);
		
		return  facilitymapper.updateFacility(facility);
	}
	//보유시설등록화면_공통코드조회
	public Facility selectInsertFacility(String festCd) {
		
		return facilitymapper.selectInsertFacility(festCd);
	}
	//보유시설등록처리
	public int insertFacility(Facility facility) {
		
		String ComCd1 = facility.getComCd();
		String ComNm21 = facility.getComNm2();
		String CatNm1 = facility.getCatNm();
		System.out.println("ComCd1------->" + ComCd1);
		System.out.println("ComNm21------->" + ComNm21);
		System.out.println("CatNm1------->" + CatNm1);
		
		String comCd = facilitymapper.selectInsertFacility1(ComCd1, ComNm21);
		String faccatCd = facilitymapper.selectInsertFacility2(CatNm1);
		System.out.println("comCd 값 확인 : " + comCd);
		System.out.println("faccatCd 값 확인 : " + faccatCd);
		System.out.println("facility 뭐가 있는지 보자 : " + facility);
		facility.setComCd(comCd);
		facility.setFaccatCd(faccatCd);
		
		return facilitymapper.insertFacility(facility);
	}
	
	//-----------------------------------임시시설설치및철거관리-------------------------------------
	
	//임시시설설치및철거관리조회
	public List<Facility> selectTemporary(){
		
		return facilitymapper.selectTemporary();
	}
	//임시시설설치및철거관리검색
	public List<Facility> searchTemporary(String fest_nm, String fac_sta_nm,
			String com_mem_nm2, String cat_acc_nm1){
		
		return facilitymapper.searchTemporary(fest_nm, fac_sta_nm, com_mem_nm2, cat_acc_nm1);
	}
	//임시시설설치및철거관리상세보기
	public Facility selectTemporaryview(String facCd) {
		
		return facilitymapper.selectTemporaryview(facCd);
	}
	//임시시설설치및철거관리거래처상세보기
	public Facility selectTemporaryaccountView(String accCd) {
		
		return facilitymapper.selectTemporaryaccountView(accCd);
	}
	//임시시설설치및철거관리계약상세보기
	
	public Facility selecttemporaryconView(String fesconmanCd) {
		
		return facilitymapper.selecttemporaryconView(fesconmanCd);
	}
	//임시시설설치및철거관리수정화면
	public Facility selectupdateTemporary(String facCd) {
		
		return facilitymapper.selectupdateTemporary(facCd);
	}
	//임시시설설치및철거관리수정처리
	public int updateTemporary(Facility facility) {
		String Comcd1 = facility.getComCd();
		String ComNm21 = facility.getComNm2();
		System.out.println("Comcd1 확인 :" + Comcd1);
		System.out.println("ComNm21 확인 :" + ComNm21);
		
		String Comcd = facilitymapper.selectupdateTemporary1(Comcd1, ComNm21);
		facility.setComCd(Comcd);
		System.out.println("facility----->" + facility);
		
		return facilitymapper.updateTemporary(facility); 
		
	}
	//임시시설설치및철거관리등록화면
	public Facility selectinsertTemporary(String festCd) {
		
		return facilitymapper.selectinsertTemporary(festCd);
	}
	
	//임시시설설치및철거관리등록처리
	public int insertTemporary(Facility facility) {
		String ComCd1 = facility.getComCd();
		String ComNm21 = facility.getComNm2();
		String FestNm = facility.getFestNm();
		String AccNm1 = facility.getAccNm1();
		String StaNm1 = facility.getStaNm();
		System.out.println("ComCd1 값 : " + ComCd1);
		System.out.println("ComNm21 값 : " + ComNm21);
		System.out.println("FestNm 값 : " + FestNm);
		System.out.println("AccNm1 값 : " + AccNm1);
		System.out.println("StaNm1 값 : " + StaNm1);
		
		String comCd = facilitymapper.selectinsertTemporary1(ComCd1, ComNm21);
		String accCd = facilitymapper.selectinsertTemporary2(AccNm1);
		String fesconmanCd = facilitymapper.selectinsertTemporary3(AccNm1, FestNm);
		String staCd = facilitymapper.selectinsertTemporary4(FestNm, StaNm1);
		System.out.println("comCd 값 : " + comCd);
		System.out.println("accCd 값 : " + accCd);
		System.out.println("fesconmanCd 값 : " + fesconmanCd);
		System.out.println("staCd 값 : " + staCd);
		
		facility.setComCd(comCd);
		facility.setAccCd(accCd);
		facility.setFesconmanCd(fesconmanCd);
		facility.setStaCd(staCd);
		
		return facilitymapper.insertTemporary(facility);
	}
	
	//---------------------------------------안전점검후지적관리-----------------------------------------
		
	//안전점검후지적관리리스트
	public List<Facility> selectMaintenance(){
		
		return facilitymapper.selectMaintenance();
	}
	

	//안전점검후지적관리검색
	public List<Facility> searchMaintenance(String fest_nm, String fac_sta_nm, String facmai_che_dt, 
			String facmai_ins_in, String com_mem_nm2, String facmai_sta_che){
		
		return facilitymapper.searchMaintenance(fest_nm, fac_sta_nm, facmai_che_dt, facmai_ins_in, com_mem_nm2, facmai_sta_che);
	}
	//안전점검후지적관리수정화면
	
	public Facility selectupdateMaintenance(String maiCd) {
		
		return facilitymapper.selectupdateMaintenance(maiCd);
	}
	//안전점검후지적관리수정처리
	public int selectupdateMaintenance(Facility facility) {
		String comCd1 = facility.getComCd();
		String comNm21 = facility.getComNm2();	
		System.out.println("comCd1 확인 :" + comCd1);
		System.out.println("comNm21 확인 :" + comNm21);
		
		String comCd = facilitymapper.selectupdateMaintenance1(comCd1, comNm21);
		System.out.println("comCd 확인 :" + comCd);
		facility.setComCd(comCd);
		
		return facilitymapper.updateMaintenance(facility);
	}
	//안전점검후지적관리등록화면_공통코드조회
	public Facility insertMaintenance(String festCd) {
		
		return facilitymapper.insertMaintenance(festCd);
	}
	//안전점검후지적관리등록처리
	public int insertMaintenance1(Facility facility) {
		String comCd1 = facility.getComCd();
		String comNm21 = facility.getComNm2();
		String staNm1 = facility.getStaNm();
		String festNm1 = facility.getFestNm();
		System.out.println("comCd1------------->" + comCd1);
		System.out.println("comNm21------------->" + comNm21);
		System.out.println("staNm1------------->" + staNm1);
		System.out.println("festNm1------------->" + festNm1);
		
		String comCd = facilitymapper.insertselectMaintenance(comCd1, comNm21);
		String staCd = facilitymapper.insertselectMaintenance2(staNm1, festNm1);
		System.out.println("comCd------------>" + comCd);
		System.out.println("staCd------------>" + staCd);
		
		facility.setComCd(comCd);
		facility.setStaCd(staCd);
		
		return facilitymapper.insertMaintenance1(facility);
	}
	//안전점검표조회
	public List<Facility> selectChecklist(String staNm){
		
		return facilitymapper.selectChecklist(staNm);
	}
}
