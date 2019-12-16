package shop.fims.goods.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GoodsController {

		//물품보유현황리스트
		@GetMapping("/conditionlist")
		public String conditionlist(){
			return "/goods/conditionlist";
			
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
