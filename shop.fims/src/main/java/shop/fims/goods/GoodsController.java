package shop.fims.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GoodsController {

		@Autowired Goodsservice getgoodslist;
		//물품보유현황리스트
		@GetMapping("/g_conditionlist")
		public String conditionlist(Model model){
			model.addAttribute("g_conditionlist", getgoodslist.getgoodslist());
			return "/goods/g_conditionlist";
			
		}
		//물품 등록
		@GetMapping("/insertcondition")
		public String insertcondition() {
			return "/goods/insertcondition";
		}
		
		//물품등록처리
		@PostMapping("/insertcondition")
		public String addcondition() {
			return "goods/conditionlist";
		}
		
		//물품 수정
		@GetMapping("/updatecondition")
		public String selectondition() {
			return "/goods/updatecondition";
		}
		//물품 수정처리
		@PostMapping("/updatecondition")
		public String updatecondition() {
			return "goods/conditionlist";
			
		}
	
}
