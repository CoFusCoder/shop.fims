package shop.fims.publicrelations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.EventWinner;
import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;

@Service
public class PublicrelationsService {
	@Autowired PublicrelationsMapper publicrelationsMapper;
	
	
	public List<EventWinner> selectEventWinnerByPmcd(String festpr_pro_cd){
		return publicrelationsMapper.selectEventWinnerByPmcd(festpr_pro_cd);
	}
	
	//홍보코드로 상세내역조회
	public List<PrPromotion> selectByPmcd(String festpr_pro_cd){
		return publicrelationsMapper.selectByPmcd(festpr_pro_cd);
		
	}

	// 홍보상세내역조회
	public List<PrPromotion> selectAllPromotion(){
		return publicrelationsMapper.selectAllPromotion();
	}
	
	// 홍보분류조회
	public List<PrDiv> seletAllPrDiv(){
		return publicrelationsMapper.seletAllPrDiv();
		
	}
}
