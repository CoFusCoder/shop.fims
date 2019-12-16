package shop.fims.goods.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalGoods {
	
	//축제물품입고관리
	@GetMapping("/g_festival_in")
	public String festivalGoodsInList() {
		return "goods/g_festival_in";
	}
	
	//축제물품출고관리
	@GetMapping("/g_festival_out")
	public String festivalGoodsOutList() {
		return "goods/g_festival_out";
	}
	
	//축제물품분류관리
	@GetMapping("/g_divList")
	public String festivalGoodsDivList() {
		return "goods/g_divList";
	}
	
	//축제거래처관리
	@GetMapping("/g_comList")
	public String gCompanyList() {
		return "goods/g_comList";
	}
	
	
	
	
}
