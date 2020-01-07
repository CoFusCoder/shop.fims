package shop.fims.publicrelations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.EventWinner;
import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;

@Service
public class PublicrelationsService {
	@Autowired PublicrelationsMapper publicrelationsMapper;
	// 홍보 분류 수정
	public int updateDiv(PrDiv prdiv) {
		return publicrelationsMapper.updateDiv(prdiv);		
	}
	
	// 홍보 분류 삭제
	public int deleteDiv(String festprDivCd) {
		return publicrelationsMapper.deleteDiv(festprDivCd);		
	}
	
	// 홍보 분류 등록
	public int insertPrDiv(PrDiv prdiv){
		return publicrelationsMapper.insertPrDiv(prdiv);		
	}
	
	// 홍보리스트 조건검색
	public List<PrPromotion> searchPrDetail(String festprDivNm, String catAccNm1, String festprProNm, String date1, String date2
											, String actionStatus, String festCd){
		return publicrelationsMapper.searchPrDetail(festprDivNm, catAccNm1, festprProNm, date1, date2, actionStatus, festCd);
	}
	
	//홍보코드로 이벤트 당첨자 조회
	public List<EventWinner> selectEventWinnerByPmcd(String festprProCd){
		return publicrelationsMapper.selectEventWinnerByPmcd(festprProCd);
	}
	
	//홍보코드로 상세내역조회
	public List<PrPromotion> selectByPmcd(String festprProCd){
		return publicrelationsMapper.selectByPmcd(festprProCd);
		
	}

	// 홍보상세내역조회
	public List<PrPromotion> selectAllPromotion(String festCd){
		return publicrelationsMapper.selectAllPromotion(festCd);
	}

	// 홍보분류조회
	public List<PrDiv> selectAllPrDiv(){
		return publicrelationsMapper.selectAllPrDiv();
		
	}
}
