package shop.fims.goods;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Revenue;

@Mapper
public interface RevenueMapper {

	//모든 축제별 보유물품 대여관리 리스트 - 세입 리스트
	public List<Revenue> revenuelist ();
	
}
