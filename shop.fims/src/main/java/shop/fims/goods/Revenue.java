package shop.fims.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Revenue {

	//모든 축제별 보유물품 대여관리 리스트 - 세입관리
	@GetMapping("/revenuelist/g_revenuelist")
	public String revenuelist() {
		return "/revenuelist/g_revenuelist";
	}
}
