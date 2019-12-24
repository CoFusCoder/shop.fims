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
	  @GetMapping("/gFestivalInDetail") 
	  public String selectGoodsInByIncd(@RequestParam(value="festgoodsInCd")String festgoodsInCd, Model model){ 
		  model.addAttribute("GoodsInDetail", festivalGoodsService.selectGoodsInByIncd(festgoodsInCd));
		  return "goods/gFestivalInDetail"; 
		  }
	  
	  
	  
	  //축제물품 대분류 등록
	  @GetMapping("/gInsertDivL") 
	  public String insertDivL(){ 
		  return "goods/gInsertDivL"; 
		  }
	  //축제물품 대분류 수정	
	  @GetMapping("/gUpdateDivL") 
	  public String updateDivL(){ 
		  return "goods/gUpdateDivL"; 
		  }
	  //축제물품 대분류 삭제	
	  @GetMapping("/gDeleteDivL") 
	  public String deleteDivL(Model model){ 
		  model.addAttribute("AllLDiv", festivalGoodsService.selectAllLDiv());
		  return "goods/gDivList"; }
	  //축제물품 소분류 등록
	  @GetMapping("/gInsertDivS") 
	  public String insertDivS(){ 
		  return "goods/gInsertDivS"; 
		  }
	  //축제물품 소분류 수정	
	  @GetMapping("/gUpdateDivS") 
	  public String updateDivS(){ 
		  return "goods/gUpdateDivS"; 
		  }
	  //축제물품 소분류 삭제	
	  @GetMapping("/gDeleteDivS") 
	  public String deleteDivS(Model model){ 
		  model.addAttribute("AllSDiv", festivalGoodsService.selectAllSDiv());
		  return "goods/gDivList"; 
		  }
	  
	  //축제물품입고내역수정	
	  @GetMapping("/gUpdateFestivalIn") 
	  public String updateGoodsIn(){ 
		  return "goods/gUpdateFestivalIn"; 
		  }
	  //축제물품입고내역삭제	
	  @GetMapping("/gDeleteFestivalIn") 
	  public String deleteGoodsIn(Model model){ 
		  model.addAttribute("GoodsIn", festivalGoodsService.selectAllGoodsIn());
		  return "goods/gFestivalInList"; 
		  }
	  
	  //축제물품출고내역수정	
	  @GetMapping("/gUpdateFestivalOut") 
	  public String updateGoodsOut(){ 
		  return "goods/gUpdateFestivalOut"; 
		  }
	  //축제물품출고내역삭제	
	  @GetMapping("/gDeleteFestivalOut") 
	  public String deleteGoodsOut(Model model){ 
		  model.addAttribute("GoodsOut",festivalGoodsService.selectAllGoodsOut()); 
		  return "goods/gFestivalOutList"; 
		  }
	  
	  
	  //축제물품입고등록	
	  @GetMapping("/gInsertFestivalIn") 
	  public String insertFGoodsIn(){ 
		  return "goods/gInsertFestivalIn"; 
		  }
	  
	  
	  //축제물품출고등록	
	  @GetMapping("/gInsertFestivalOut") 
	  public String insertFGoodsOut(){ 
		  return "goods/gInsertFestivalOut"; 
		  }
	  
	  
	  //축제물품입고조회	
	  @GetMapping("/gFestivalInList") 
	  public String festivalGoodsInList(Model model){ 
		  model.addAttribute("GoodsIn", festivalGoodsService.selectAllGoodsIn());
		  return "goods/gFestivalInList"; 
		  }
	  
	  //축제물품출고조회
	  
	  @GetMapping("/gFestivalOutList") public String festivalGoodsOutList(Model
	  model) { model.addAttribute("GoodsOut",festivalGoodsService.selectAllGoodsOut()); 
	  return "goods/gFestivalOutList"; 
	  }
	 
	
	//축제물품분류관리
	@GetMapping("/gDivList")
	public String festivalGoodsDivList(Model modelLDiv, Model modelSDiv) {
		modelLDiv.addAttribute("AllLDiv", festivalGoodsService.selectAllLDiv());
		modelSDiv.addAttribute("AllSDiv", festivalGoodsService.selectAllSDiv());
		return "goods/gDivList";
	}
	
	//축제거래처관리
	@GetMapping("/gComList")
	public String gCompanyList() {
		return "goods/gComList";
	}
	
	
	
	
}
