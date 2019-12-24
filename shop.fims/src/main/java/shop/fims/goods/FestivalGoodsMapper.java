package shop.fims.goods;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.FestivalGoodsIn;
import shop.fims.vo.FestivalGoodsOut;
import shop.fims.vo.GoodsLDiv;
import shop.fims.vo.GoodsSDiv;

@Mapper
public interface FestivalGoodsMapper {
	

	//물품 출고 조회 
	public List<FestivalGoodsOut> selectAllGoodsOut();

	//물품 입고 조회 
	public List<FestivalGoodsIn> selectAllGoodsIn();
	
	//입고코드로 물품 입고 상세조회 
	public List<FestivalGoodsIn> selectGoodsInByIncd(String festgoodsInCd);

	
	
	
	//축제물품대분류조회
	public List<GoodsLDiv> selectAllLDiv();
	//축제물품소분류조회
	public List<GoodsSDiv> selectAllSDiv();

}
