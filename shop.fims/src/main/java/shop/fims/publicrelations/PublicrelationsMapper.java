package shop.fims.publicrelations;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

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
	
	
	
	
	
//**********홍보 프로모션 **********
	// 홍보사업 신규등록
	public int insertPromotionPro(PrPromotion promotion);
	
	// 홍보관련 승인된 거래처 조회
	public List<Map<String, Object>> selectParners();
	
	// 홍보관련 예산 계정과목 조회
	public List<Map<String, Object>> selectBudget(String festCd);
		
	// 홍보리스트 조건검색
	public List<PrPromotion> searchPrDetail(String festprDivNm, String catAccNm1, String festprProNm, String date1, String date2, String actionStatus, String festCd);
	
	// 홍보상세조회
	public List<PrPromotion> selectAllPromotion(String festCd);
	
	// 홍보코드로 상세조회
	public List<PrPromotion> selectByPmcd(String festprProCd);	
	
	// 홍보 그룹코드 조회
	public List<Map<String, Object>> selectGroup(String festCd);	
	
	// 그룹명으로 그룹코드 조회
	public String selectGroupCd(String groupNm);
	
	// 새로운 홍보예산그룹코드 생성
	public String newGroupCd();
	
	// 첨부파일 올리기
	//public int insertFiles(AttatchFiles files);
	
//**********홍보 이벤트당첨자 ***********		
	// 홍보코드로 이벤트 당첨자 조회
	public List<EventWinner> selectEventWinnerByPmcd(String festprProCd);	
	
	
	
	
	
	
	
	

	
	
}
