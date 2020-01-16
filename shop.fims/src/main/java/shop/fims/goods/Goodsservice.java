package shop.fims.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Goods;

@Service
public class Goodsservice {
	
	@Autowired  GoodsMapper goodsmapper;
	//물품 전체 조회
	public List<Goods> goodslist(){
		return goodsmapper.goodslist();		
	}
	//수정화면
	public List<Goods> pageupdatecondition(String goodspreConCd){
		return goodsmapper.pageupdatecondition(goodspreConCd);
	}
	//수정처리
	public int updatecondition(Goods goods) {
		System.out.println("goods1->" + goods);
		return goodsmapper.updatecondition(goods);
		
	}
}
