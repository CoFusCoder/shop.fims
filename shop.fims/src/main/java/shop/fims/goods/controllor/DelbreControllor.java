package shop.fims.goods.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DelbreControllor {

	//계약물품 납품내역리스트
	@GetMapping("/delbrelist")
	public String delbrelist() {
		return "/delbre/delbrelist";
	}
}
