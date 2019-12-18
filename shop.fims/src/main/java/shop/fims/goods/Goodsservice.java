package shop.fims.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.goods_vo;

@Service
public class Goodsservice {
	
	@Autowired private GoodsMapper getgoodslist;
	
	public List<goods_vo> getgoodslist(){
		return getgoodslist.getgoodslist();
		
	}
}
