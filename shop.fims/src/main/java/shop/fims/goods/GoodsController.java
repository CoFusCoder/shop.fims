package shop.fims.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GoodsController {

		@Autowired Goodsservice goodsservice;
		//물품보유현황리스트
		@GetMapping("/conditionList")
		public String conditionlist(Model model){
			model.addAttribute("conditionList", goodsservice.goodslist());
			return "/goods/conditionList";
			
		}
		//물품 등록
		@GetMapping("/insertCondition")
		public String insertcondition() {
			return "/goods/insertCondition";
		}
		
		//물품등록처리
		@PostMapping("/insertCondition")
		public String addcondition() {
			return "redirect:/conditionList";
		}
		
		//물품 수정
		@GetMapping("/updateCondition")
		public String selectondition() {
			return "/goods/updateCondition";
		}
		//물품 수정처리
		@PostMapping("/updateCondition")
		public String updatecondition() {
			return "redirect:/conditionList	";
			
		}
		
	
}
