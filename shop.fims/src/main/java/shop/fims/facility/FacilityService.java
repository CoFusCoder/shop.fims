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
	//임시시설설치및철거관리수정화면
	public Facility selectupdateTemporary(String facCd) {
		
		return facilitymapper.selectupdateTemporary(facCd);
	}
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
	//안전점검표조회
	public List<Facility> selectChecklist(String staNm){
		
		return facilitymapper.selectChecklist(staNm);
	}
}
