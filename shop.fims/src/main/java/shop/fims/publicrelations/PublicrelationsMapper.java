package shop.fims.publicrelations;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.AttachFiles;
import shop.fims.vo.EventWinner;
import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;


@Mapper
public interface PublicrelationsMapper {
//**********홍보 분류 ***********	
	// 홍보분류 전체조회
	public List<PrDiv> selectAllPrDiv();
	
	// 홍보분류 신규등록
	public int insertPrDiv(PrDiv prdiv); 

	// 홍보분류 수정
	public int updateDiv(PrDiv prdiv);
	
	// 홍보분류 삭제
	public int deleteDiv(String festprDivCd);	
	
	// 홍보분류코드가 홍보테이블에서 사용되고 있는지 조회 
	public String selectDivByCd(String festprDivCd);
	
	
	
//**********홍보 프로모션 **********
	// 홍보사업 신규등록
	public int insertPromotionPro(PrPromotion promotion);
	
	// 홍보사업 신규등록
	public int updatePromotionPro(PrPromotion promotion);
	
	// 홍보관련 승인된 거래처 조회
	public List<Map<String, Object>> selectParners();
	
	// 홍보관련 예산 계정과목 조회
	public List<Map<String, Object>> selectBudget(String festCd);
		
	// 홍보리스트 조건검색
	public List<PrPromotion> searchPrDetail(String festprDivNm, String catAccNm1, String festprProNm, String date1, String date2, String actionStatus, String festCd);
	
	// 홍보 리스트 조회
	public List<PrPromotion> selectAllPromotion(String festCd);
	
	// 홍보코드로 상세조회
	public List<Map<String, Object>> selectByPmcd(String festprProCd);	
	
	// 홍보 그룹코드 조회
	public List<Map<String, Object>> selectGroup(String festCd);	
	
	public int updateGroupNm (PrPromotion promotion);
	
	// 그룹명으로 그룹코드 조회
	public String selectGroupCd(String groupNm);
	
	// 새로운 홍보예산그룹코드 생성
	public String newGroupCd();
	
	// 첨부파일 올리기
	public int sendfile(AttachFiles attachFiles);
	
	//마지막 프로모션코드값 조회하기
	public String selectLastCd();
	
	//첨부파일 정보 조회
	public List<AttachFiles> selectFile (String festprProCd);
	
	
	// 홍보사업 삭제
	public int deletePromotion(String festprProCd);
	// 마감상태확인
	public String checkActionStatus (String festprProCd);		
	
	// 홍보코드로 첨부파일 삭제
	public int deleteFile(String festprProCd);
	
	public int updatePrGroupNm (String groupCd, String groupNm);
	
	// 최초 그룹예산 합산용 데이터 조회 
	public Map<String, String> selectForGroupBud (String festprProCd);
	// 최초 그룹예산 등록
	public int insertGroupBud (Map<String, String> groupdata);
	// 마감여부, 마감날짜 업데이트
	public int updateAction(String festprProCd);
	
	// 예산집행테이블에 해당 그룹코드로 된 레코드가 있는지 조회
	public String checkActionCd(String festprProCd);
	// 예산집행테이블에 해당 그룹코드로 된 레코드가 있으면 합산한 값을 계산
	public int calGroupBudExp (String festprProCd);
	// 프로모션코드로 그룹코드 조회
	public String selectGroupCdByProCd (String festprProCd);
	// 예산집행테이블에 그룹코드 합산된 값을 업데이트
	public int updateGroupCal (String groupCd ,int sum);
	
	
	
	
//**********홍보 이벤트당첨자 ***********		
	// 홍보코드로 이벤트 당첨자 조회
	public List<EventWinner> selectEventWinnerByPmcd(String festprProCd);	
	
	
	
//**********기타 ***********			
	// 축제별 승인 홍보 거래처 조회
	public List<Map<String, Object>> selectPrCom(String festCd);
	
	// 축제별 거래처명으로 사업 조회
	public List<PrPromotion> searchPrByCom (String festCd, String catAccNm1);
	
	// 축제별 미승인 홍보 거래처 조회
	public List<PrPromotion> searchPrComNotapproved (String festCd);
	
	
}
