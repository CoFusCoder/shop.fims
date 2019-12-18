package shop.fims.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DelbreControllor {

	//계약물품 납품내역리스트
	@GetMapping("/g_delbrelist")
	public String delbrelist() {
		return "/delbre/g_delbrelist";
	}
	// 계약물품 납품 등록
	@GetMapping("/g_delbrelistinsert")
	public String g_delbrelistinsert() {
		return "/delbre/g_delbrelistinsert";
	}

}
