package shop.fims.goods;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.goods_vo;

@Mapper
public interface GoodsMapper {
	//물품 전체 리스트
	public List<goods_vo> getgoodslist(); 
}
