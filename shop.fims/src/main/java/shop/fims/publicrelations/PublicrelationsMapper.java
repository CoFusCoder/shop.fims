package shop.fims.publicrelations;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.EventWinner;
import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;


@Mapper
public interface PublicrelationsMapper {
	
	
	
	// 홍보분류 수정
	public int updateDiv(PrDiv prdiv);
	
	// 홍보분류 삭제
	public int deleteDiv(String festprDivCd);
	
	// 홍보분류 신규등록
	public int insertPrDiv(PrDiv prdiv); 
	
	// 홍보리스트 조건검색
	public List<PrPromotion> searchPrDetail(String festprDivNm, String catAccNm1, String festprProNm, String date1, String date2, String actionStatus, String festCd);
	
	// 홍보코드로 이벤트 당첨자 조회
	public List<EventWinner> selectEventWinnerByPmcd(String festprProCd);
	
	// 홍보코드로 상세조회
	public List<PrPromotion> selectByPmcd(String festprProCd);
	
	// 홍보상세조회
	public List<PrPromotion> selectAllPromotion(String festCd);
	
	
	// 홍보분류조회
	public List<PrDiv> selectAllPrDiv();
}
