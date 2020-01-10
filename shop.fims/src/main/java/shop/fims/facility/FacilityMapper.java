package shop.fims.facility;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Facility;

@Mapper
public interface FacilityMapper {

	//시설분류조회
	public List<Facility> selectClassification();
	
	//--------------------------------------보유시설------------------------------------
	
	//모든보유시설조회
	public List<Facility> selectFacility();
	
	//모든보유시설검색
	
	public List<Facility> searchClassification(String fest_nm, String fac_sta_nm, 
			String fesfac_cat_nm, String man_com_nm2, String action_status);
	
	//모든보유시설수정화면
	Facility selectupdateFacility(String staCd);
	
	//모든보유시설수정처리_조회1
	String selectupdateFacility1(String comCd1, String comNm21);
	
	//모든보유시설수정처리_조회2
	String selectupdateFacility2(String FaccatNm1);
	
	//모든보유시설수정처리
	int updateFacility(Facility facility);
	
	//모든보유시설등록화면
	Facility selectInsertFacility(String festCd);
	
	//모든보유시설등록_조회1(위원회)
	String selectInsertFacility1(String ComCd1, String ComNm21);
	
	//모든보유시설등록_조회2(시설분류코드)
	String selectInsertFacility2(String CatNm1);
	
	//모든보유시설등록처리
	int insertFacility(Facility facility);
	
	//-----------------------------임시시설설치및철거관리-------------------------------
	
	//임시시설설치및철거관리조회
	public List<Facility> selectTemporary();
	
	//임시시설설치및철거관리검색
	public List<Facility> searchTemporary(String fest_nm, String fac_sta_nm,
						String com_mem_nm2, String cat_acc_nm1);
	//임시시설설치및철거관리상세보기
	Facility selectTemporaryview(String facCd);
	
	//임시시설설치및철거거래처상세보기
	Facility selectTemporaryaccountView(String accCd);
	
	//임시시설설치및철거계약상세보기
	Facility selecttemporaryconView(String fesconmanCd);
	
	//임시시설설치및철거관리수정화면
	Facility selectupdateTemporary(String facCd);
	
	//임시시설설치및철거관리수정처리_조회1
	String selectupdateTemporary1(String Comcd1, String ComNm21);
	
	//임시시설설치및철거관리수정처리
	int updateTemporary(Facility facility);
	
	//임시시설설치및철거관리등록화면
	Facility selectinsertTemporary(String festCd);
	
	//임시시설설치및철거관리등록처리_조회1(위원회)
	String selectinsertTemporary1(String ComCd1, String ComNm21);
	
	//임시시설설치및철거관리등록처리_조회2(거래처)
	String selectinsertTemporary2(String AccNm1);
	
	//임시시설설치및철거관리등록처리_조회3(계약)
	String selectinsertTemporary3(String AccNm1, String FestNm);
	
	//임시시설설치및철거관리등록처리_조회4(보유시설)
	String selectinsertTemporary4(String FestNm, String StaNm1);
	
	//임시시설설치및철거관리등록처리
	int insertTemporary(Facility facility);
	//---------------------------------안전점검후지적관리------------------------------------------
	
	//안전점검후지적관리리스트
	public List<Facility> selectMaintenance();
	
	//안전점검후지적관리검색
	public List<Facility> searchMaintenance(String fest_nm, String fac_sta_nm, String facmai_che_dt, 
			String facmai_ins_in, String com_mem_nm2, String facmai_sta_che);
	
	//안전점검후지적관리수정화면
	Facility selectupdateMaintenance(String maiCd);
	
	//안전점검후지적관리수정처리_조회1
	String selectupdateMaintenance1(String comCd1, String comNm21);
	
	//안전점검후지적관리수정처리
	int updateMaintenance(Facility facility);
	
	//안전점검후지적관리등록_공통코드조회
	Facility insertMaintenance(String festCd);
	
	//안전점검후지적관리등록처리_위원회
	String insertselectMaintenance(String comCd1, String comNm21);
	//안전점검후지적관리등록처리_보유시설
	String insertselectMaintenance2(String staNm1, String festNm1);
	//안전점검후지적관리등록처리
	int insertMaintenance1(Facility facility);
	//안전점검표조회
	public List<Facility> selectChecklist(String staNm);
}
