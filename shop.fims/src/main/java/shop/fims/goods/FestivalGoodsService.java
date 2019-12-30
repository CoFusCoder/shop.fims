package shop.fims.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.FestivalGoodsIn;
import shop.fims.vo.FestivalGoodsOut;
import shop.fims.vo.GoodsLDiv;
import shop.fims.vo.GoodsSDiv;

@Service
public class FestivalGoodsService {
	@Autowired FestivalGoodsMapper festivalGoodsMapper;
	
	
	
	 //축제물품 출고리스트 조회
	  public List<FestivalGoodsOut> selectAllGoodsOut(){ 
		  return festivalGoodsMapper.selectAllGoodsOut(); 
		  }
	  
	  //축제물품 입고리스트 조회
	  public List<FestivalGoodsIn> selectAllGoodsIn(){ 
		  return festivalGoodsMapper.selectAllGoodsIn(); 
		  }
	  
	  //입고코드로 축제물품 입고리스트 상세조회
	  public List<FestivalGoodsIn> selectGoodsInByIncd(String festgoodsInCd){ 
		  return festivalGoodsMapper.selectGoodsInByIncd(festgoodsInCd); 
	  }
	 
	
	//축제물품대분류조회
	public List<GoodsLDiv> selectAllLDiv(){
		return festivalGoodsMapper.selectAllLDiv();
	}
	//축제물품소분류조회
	public List<GoodsSDiv> selectAllSDiv(){
		return festivalGoodsMapper.selectAllSDiv();
	}
}
