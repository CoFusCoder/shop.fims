package shop.fims.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DelbreControllor {

	//계약물품 납품내역리스트
	@GetMapping("/g_delbrelist")
	public String delbrelist() {
		return "/delbre/g_delbrelist";
	}
	// 계약물품 납품 등록화면
	@GetMapping("/g_delbreinsert")
	public String g_delbrelistinsert() {
		return "/delbre/g_delbreinsert";
	}
	//계약물품 납품 수정화면
	@GetMapping("/g_delbreupdata")
	public String g_delbreupdata() {
		return "/delbre/g_delbreupdata";
	}
	//계약물품 남품 등록처리
	@PostMapping("/g_delbreinsert")
	public String adddelbrelist() {
		return "redirect:/g_delbrelist";
	}
	//계약물품 남품 수정처리
	@PostMapping("/g_delbreupdata")
	public String updataelbrelist() {
		return "redirect:/g_delbrelist";
	}

}
