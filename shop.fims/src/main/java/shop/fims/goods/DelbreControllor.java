package shop.fims.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DelbreControllor {

	//계약물품 납품내역리스트
	@GetMapping("/delbreList")
	public String delbrelist() {
		return "/goods/delbreList";
	}
	// 계약물품 납품 등록화면
	@GetMapping("/insertDelbre")
	public String g_delbrelistinsert() {
		return "/goods/insertDelbre";
	}
	//계약물품 납품 수정화면
	@GetMapping("/updataDelbre")
	public String g_delbreupdata() {
		return "/goods/updataDelbre";
	}
	//계약물품 남품 등록처리
	@PostMapping("/insertDelbre")
	public String adddelbrelist() {
		return "redirect:/delbreList";
	}
	//계약물품 남품 수정처리
	@PostMapping("/updataDelbre")
	public String updataelbrelist() {
		return "redirect:/delbreList";
	}

}
