package shop.fims.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FestivalGoodsController {
	@Autowired FestivalGoodsService festivalGoodsService;

	
	
	
	  //축제물품 대분류 등록
	  @GetMapping("/g_festivalInDetail") 
	  public String selectGoodsInByIncd(@RequestParam(value="festgoods_in_cd")String festgoods_in_cd, Model model){ 
		  model.addAttribute("GoodsInDetail", festivalGoodsService.selectGoodsInByIncd(festgoods_in_cd));
		  return "goods/g_festivalInDetail"; 
		  }
	  
	  
	  
	  //축제물품 대분류 등록
	  @GetMapping("/g_insertDivL") 
	  public String insertDivL(){ 
		  return "goods/g_insertDivL"; 
		  }
	  //축제물품 대분류 수정	
	  @GetMapping("/g_updateDivL") 
	  public String updateDivL(){ 
		  return "goods/g_updateDivL"; 
		  }
	  //축제물품 대분류 삭제	
	  @GetMapping("/g_deleteDivL") 
	  public String deleteDivL(Model model){ 
		  model.addAttribute("AllLDiv", festivalGoodsService.selectAllLDiv());
		  return "goods/g_divList"; }
	  //축제물품 소분류 등록
	  @GetMapping("/g_insertDivS") 
	  public String insertDivS(){ 
		  return "goods/g_insertDivS"; 
		  }
	  //축제물품 소분류 수정	
	  @GetMapping("/g_updateDivS") 
	  public String updateDivS(){ 
		  return "goods/g_updateDivS"; 
		  }
	  //축제물품 소분류 삭제	
	  @GetMapping("/g_deleteDivS") 
	  public String deleteDivS(Model model){ 
		  model.addAttribute("AllSDiv", festivalGoodsService.selectAllSDiv());
		  return "goods/g_divList"; 
		  }
	  
	  //축제물품입고내역수정	
	  @GetMapping("/g_updateFestivalIn") 
	  public String updateGoodsIn(){ 
		  return "goods/g_updateFestivalIn"; 
		  }
	  //축제물품입고내역삭제	
	  @GetMapping("/g_deleteFestivalIn") 
	  public String deleteGoodsIn(Model model){ 
		  model.addAttribute("GoodsIn", festivalGoodsService.selectAllGoodsIn());
		  return "goods/g_festivalInList"; 
		  }
	  
	  //축제물품출고내역수정	
	  @GetMapping("/g_updateFestivalOut") 
	  public String updateGoodsOut(){ 
		  return "goods/g_updateFestivalOut"; 
		  }
	  //축제물품출고내역삭제	
	  @GetMapping("/g_deleteFestivalOut") 
	  public String deleteGoodsOut(Model model){ 
		  model.addAttribute("GoodsOut",festivalGoodsService.selectAllGoodsOut()); 
		  return "goods/g_festivalOutList"; 
		  }
	  
	  
	  //축제물품입고등록	
	  @GetMapping("/g_insertFestivalIn") 
	  public String insertFGoodsIn(){ 
		  return "goods/g_insertFestivalIn"; 
		  }
	  
	  
	  //축제물품출고등록	
	  @GetMapping("/g_insertFestivalOut") 
	  public String insertFGoodsOut(){ 
		  return "goods/g_insertFestivalOut"; 
		  }
	  
	  
	  //축제물품입고조회	
	  @GetMapping("/g_festivalInList") 
	  public String festivalGoodsInList(Model model){ 
		  model.addAttribute("GoodsIn", festivalGoodsService.selectAllGoodsIn());
		  return "goods/g_festivalInList"; 
		  }
	  
	  //축제물품출고조회
	  
	  @GetMapping("/g_festivalOutList") public String festivalGoodsOutList(Model
	  model) { model.addAttribute("GoodsOut",festivalGoodsService.selectAllGoodsOut()); 
	  return "goods/g_festivalOutList"; 
	  }
	 
	
	//축제물품분류관리
	@GetMapping("/g_divList")
	public String festivalGoodsDivList(Model modelLDiv, Model modelSDiv) {
		modelLDiv.addAttribute("AllLDiv", festivalGoodsService.selectAllLDiv());
		modelSDiv.addAttribute("AllSDiv", festivalGoodsService.selectAllSDiv());
		return "goods/g_divList";
	}
	
	//축제거래처관리
	@GetMapping("/g_comList")
	public String gCompanyList() {
		return "goods/g_comList";
	}
	
	
	
	
}
