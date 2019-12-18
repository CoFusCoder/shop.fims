package shop.fims.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Goodsservice {
	
	@Autowired GoodsMapper goodsMapper;
	public List<String> goodslist(){
		return goodsMapper.goodslist();
		
	}
}
