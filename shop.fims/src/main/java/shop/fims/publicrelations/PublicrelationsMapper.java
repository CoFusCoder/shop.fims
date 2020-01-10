package shop.fims.publicrelations;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.EventWinner;
import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;


@Mapper
public interface PublicrelationsMapper {
	
	public List<EventWinner> selectEventWinnerByPmcd(String festprProCd);
	
	// 홍보코드로 상세조회
	public List<PrPromotion> selectByPmcd(String festprProCd);
	
	// 홍보상세조회
	public List<PrPromotion> selectAllPromotion(String festCd);
	
	
	// 홍보분류조회
	public List<PrDiv> seletAllPrDiv();
}
