package shop.fims.goods;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Revenue;

@Mapper
public interface GoodsrevenueMapper {

	//모든 축제별 보유물품 대여관리 리스트 - 세입 리스트
	public List<Revenue> revenuelist ();
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 코드로 조회
	public List<Revenue> coderevenue(String goodsren_rev_cd);
}
