package shop.fims.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalGoodsController {
	@Autowired FestivalGoodsService festivalGoodsService;
	
	
	  @GetMapping("/g_festival_in") public String festivalGoodsInList(Model model)
	  { model.addAttribute("GoodsIn", festivalGoodsService.selectAllGoodsIn());
	  return "goods/g_festival_in"; }
	  
	  //축제물품출고관리
	  
	  @GetMapping("/g_festival_out") public String festivalGoodsOutList(Model
	  model) { model.addAttribute("GoodsOut",
	  festivalGoodsService.selectAllGoodsOut()); return "goods/g_festival_out"; }
	 
	
	//축제물품분류관리
	@GetMapping("/g_divList")
	public String festivalGoodsDivList(Model modelLDiv, Model modelMDiv, Model modelSDiv) {
		modelLDiv.addAttribute("AllLDiv", festivalGoodsService.selectAllLDiv());
		modelMDiv.addAttribute("AllMDiv", festivalGoodsService.selectAllMDiv());
		modelSDiv.addAttribute("AllSDiv", festivalGoodsService.selectAllSDiv());
		return "goods/g_divList";
	}
	
	//축제거래처관리
	@GetMapping("/g_comList")
	public String gCompanyList() {
		return "goods/g_comList";
	}
	
	
	
	
}
