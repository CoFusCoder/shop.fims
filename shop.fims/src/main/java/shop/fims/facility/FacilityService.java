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
		
		String comCd = facilitymapper.selectupdateFacility1(comCd1, comNm21);
		String faccatCd = facilitymapper.selectupdateFacility2(FaccatNm1);
		
		facility.setComCd(comCd);
		facility.setFaccatCd(faccatCd);
		
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
		
		String comCd = facilitymapper.selectInsertFacility1(ComCd1, ComNm21);
		String faccatCd = facilitymapper.selectInsertFacility2(CatNm1);

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
		
		String comCd = facilitymapper.selectinsertTemporary1(ComCd1, ComNm21);
		String accCd = facilitymapper.selectinsertTemporary2(AccNm1);
		String fesconmanCd = facilitymapper.selectinsertTemporary3(AccNm1, FestNm);
		String staCd = facilitymapper.selectinsertTemporary4(FestNm, StaNm1);
		
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
		
		String comCd = facilitymapper.selectupdateMaintenance1(comCd1, comNm21);

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
		
		String comCd = facilitymapper.insertselectMaintenance(comCd1, comNm21);
		String staCd = facilitymapper.insertselectMaintenance2(staNm1, festNm1);
		
		facility.setComCd(comCd);
		facility.setStaCd(staCd);
		
		return facilitymapper.insertMaintenance1(facility);
	}
	//안전점검표조회
	public List<Facility> selectChecklist(String staNm){
		
		return facilitymapper.selectChecklist(staNm);
	}
}
