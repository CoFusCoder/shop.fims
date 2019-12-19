package shop.fims.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Revenue;

@Service
public class RevenueService {

	@Autowired RevenueMapper revenuemapper;
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 리스트
	public List<Revenue> revenuelist(){
		return revenuemapper.revenuelist();
	}
	
}
