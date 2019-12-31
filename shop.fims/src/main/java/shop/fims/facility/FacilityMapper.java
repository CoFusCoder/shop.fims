package shop.fims.facility;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Facility;

@Mapper
public interface FacilityMapper {

	//시설분류조회
	public List<Facility> selectClassification();
	
	//모든보유시설조회
	public List<Facility> selectFacility();
	
	//모든보유시설검색
	
	public List<Facility> searchClassification(String fest_nm, String fac_sta_nm, 
			String fesfac_cat_nm, String man_com_nm2, String action_status);
	
	//모든보유시설수정화면
	Facility selectupdateFacility(String staCd);
	
	//임시시설설치및철거관리조회
	public List<Facility> selectTemporary();
	
	//임시시설설치및철거관리검색
	public List<Facility> searchTemporary(String fest_nm, String fac_sta_nm,
						String com_mem_nm2, String cat_acc_nm1);
	
	//임시시설설치및철거관리상세보기
	Facility selectTemporaryview(String facCd);
	
	//임시시설설치및철거관리수정화면
	Facility selectupdateTemporary(String facCd);
	
	//안전점검후지적관리리스트
	public List<Facility> selectMaintenance();
	
	//안전점검후지적관리검색
	public List<Facility> searchMaintenance(String fest_nm, String fac_sta_nm, String facmai_che_dt, 
			String facmai_ins_in, String com_mem_nm2, String facmai_sta_che);
	
	//안전점검후지적관리수정화면
	Facility selectupdateMaintenance(String maiCd);
	
	//안전점검표조회
	public List<Facility> selectChecklist(String staNm);
}
