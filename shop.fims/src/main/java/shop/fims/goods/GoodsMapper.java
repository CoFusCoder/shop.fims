package shop.fims.goods;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {

	public List<String> goodslist(); 
}
