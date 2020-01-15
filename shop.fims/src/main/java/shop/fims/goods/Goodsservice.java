package shop.fims.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Goods;

@Service
public class Goodsservice {
	
	@Autowired  GoodsMapper goodsmapper;
	
	public List<Goods> goodslist(){
		return goodsmapper.goodslist();		
	}
	public List<Goods> updatecondition(String goodspreConCd){
		return goodsmapper.updatecondition(goodspreConCd);
	}
}
