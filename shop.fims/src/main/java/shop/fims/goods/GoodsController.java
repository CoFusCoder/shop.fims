package shop.fims.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Goods;

@Controller
public class GoodsController {

		@Autowired Goodsservice goodsservice;
		/**
		 * 물품보유현황리스트
		 * @author 조윤상
		 * @param model
		 * @return goods/conditionList
		 */
		@GetMapping("/conditionList")
		public String conditionlist(Model model){
			model.addAttribute("conditionList", goodsservice.goodslist());
			return "/goods/conditionList";
			
		}
		/**
		 * 물품 등록
		 * @author 조윤상
		 * @return
		 */
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
		public String pageupdatecondition(@RequestParam(value = "goodspreConCd" )String goodspreConCd
//				,@RequestParam(value = "goodsNm")String goodsNm
//				,@RequestParam(value = "goodsAmt")String goodsAmt
//				,@RequestParam(value = "specialNote")String specialNote
				,Model model ){
			model.addAttribute("updatecondition", goodsservice.pageupdatecondition(goodspreConCd));
			System.out.println("goodspreConCd->"+goodspreConCd);
			return "/goods/updateCondition";
		}
		//물품 수정처리
		@PostMapping("/updateCondition")
		public String updatecondition(Goods goods) {
			goodsservice.updatecondition(goods);
			System.out.println("goods1222->" + goods);

			return "redirect:/conditionList";
			
		}
		
		//물품 삭제
		@GetMapping("/deleteCondition")
		public String deleteCondition() {
			return "/goods/conditionList";
		}
		
	
}
