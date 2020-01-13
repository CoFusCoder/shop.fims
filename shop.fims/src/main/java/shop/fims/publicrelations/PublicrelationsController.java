package shop.fims.publicrelations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;

@Controller
public class PublicrelationsController {
	@Autowired PublicrelationsService publicrelationsService;

//=============== 홍보분류 ==========================
	
	//홍보분류 수정
	@PostMapping(value="/prInsertDiv", produces = "text/html")
	public @ResponseBody String insertDiv(PrDiv prdiv, Model model, ServletResponse response){
		publicrelationsService.insertPrDiv(prdiv);
		String script = "<script>alert('홍보분류가 신규 등록되었습니다.'); location.href='/prDivList';</script>";
		return script;		
	}
	
	//홍보분류 수정
	@PostMapping(value="/prUpdateDiv", produces = "text/html")
	public @ResponseBody String updateDiv(PrDiv prdiv, ServletResponse response){
		publicrelationsService.updateDiv(prdiv);
		String script = "<script>alert('홍보분류가 수정되었습니다.'); location.href='/prDivList';</script>";
		return script;		
	}
	
	//홍보분류 삭제
	@GetMapping(value="/prDeleteDiv", produces = "text/html")
	public @ResponseBody String deleteDiv(@RequestParam(value="festprDivCd")String festprDivCd, ServletResponse response){
		publicrelationsService.deleteDiv(festprDivCd);
		String script = "<script>alert('홍보분류가 삭제되었습니다.'); location.href='/prDivList';</script>";
		return script;		
	}

	//홍보 분류리스트 조회
	@GetMapping("/prDivList")
	public String divList(Model model) {
		model.addAttribute("AllDiv", publicrelationsService.selectAllPrDiv());
		return "publicrelations/prDivList";
	}		
	
	
//=============== 홍보사업 프로모션 ==========================	
	
	//홍보사업상세 조건검색
	@PostMapping("/searchPrDetail")
	public String searchPrDetail(@RequestParam(value="festprDivNm")String festprDivNm
								,@RequestParam(value="catAccNm1")String catAccNm1
								,@RequestParam(value="festprProNm")String festprProNm
								,@RequestParam(value="date1")String date1
								,@RequestParam(value="date2")String date2
								,@RequestParam(value="actionStatus")String actionStatus
								,HttpSession session, Model model1, Model model2) {									
		//System.out.println("홍보분류명:"+festprDivNm+"거래처명:"+catAccNm1+"홍보매체명:"+festprProNm+"날짜1:"+date1+"날짜2:"+date2+"마감여부:"+actionStatus);
		String festCd = (String)session.getAttribute("F_CD");
		model1.addAttribute("AllPromotion", publicrelationsService.searchPrDetail(festprDivNm, catAccNm1, festprProNm, date1, date2, actionStatus, festCd));
		model2.addAttribute("prDiv",publicrelationsService.selectAllPrDiv());
		return "publicrelations/prPromotionList";
	}
	
	//홍보사업수정 화면 출력
	@GetMapping("/prUpdatePromotion")
	public String updatePromotion(@RequestParam(value="festprProCd")String festprProCd, Model modelDetail
			,Model modelbudget, Model modelDiv, Model modelPartners, Model modelGroup, HttpSession session) {
		//System.out.println("festprProCd"+festprProCd);	
		//System.out.println(model);
		modelDetail.addAttribute("prDetail", publicrelationsService.selectByPmcd(festprProCd));
		String festCd = (String)session.getAttribute("F_CD");
		modelDiv.addAttribute("div", publicrelationsService.selectAllPrDiv());
		modelbudget.addAttribute("budget", publicrelationsService.selectBudget(festCd));
		modelPartners.addAttribute("partners", publicrelationsService.selectParners());
		modelGroup.addAttribute("group", publicrelationsService.selectGroup(festCd));
		return "publicrelations/prUpdatePromotion";
	}
	
	
	//홍보사업 신규등록 화면출력
	 @GetMapping("/prInsertPromotion")
	 public String insertPromotion(Model modelbudget, Model modelDiv, Model modelPartners, Model modelGroup, HttpSession session) {
		String festCd = (String)session.getAttribute("F_CD");
		modelDiv.addAttribute("div", publicrelationsService.selectAllPrDiv());
		modelbudget.addAttribute("budget", publicrelationsService.selectBudget(festCd));
		modelPartners.addAttribute("partners", publicrelationsService.selectParners());
		modelGroup.addAttribute("group", publicrelationsService.selectGroup(festCd));
		
		return "publicrelations/prInsertPromotion";
	 }
	
	  //홍보사업 신규등록 처리
	  @PostMapping("/prInsertPromotionPro") 
	  public String insertPromotionPro(@RequestParam(value="groupNm2")String groupNm2
									  ,@RequestParam("fileUpload") MultipartFile fileUpload
									  ,PrPromotion promotion) {
		  System.out.println(promotion);	 
		  System.out.println("groupNm2"+groupNm2);
		  System.out.println("fileUpload"+fileUpload);
		  publicrelationsService.insertPromotionPro(promotion, groupNm2);
		  if(fileUpload.getSize()!=0) {
		  publicrelationsService.sendfile(fileUpload);}
		  
		  return "redirect:/prPromotionList";   
	  }
	 	
	
	 //홍보 프로모션코드로 세부사항조회
	 @GetMapping("/prPromotionDetail") 
	 public String selectByPmcd(@RequestParam(value="festprProCd")String festprProCd, Model model1, Model model2) { 
		System.out.println("festprProCd"+festprProCd);
		model1.addAttribute("selectByPmcd", publicrelationsService.selectByPmcd(festprProCd));
		model2.addAttribute("file", publicrelationsService.selectFile(festprProCd));
	 	return "publicrelations/prPromotionDetail";
	 }
	
	
	//홍보사업리스트 조회
	@GetMapping("/prPromotionList")
	public String detailList(Model model1, Model model2, HttpSession session) {
		String festCd = (String)session.getAttribute("F_CD");
		model1.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(festCd));
		model2.addAttribute("prDiv",publicrelationsService.selectAllPrDiv());
		return "publicrelations/prPromotionList";
	}	
	
	@GetMapping("/fileDown")
	public String fileDownload() {
		return null;	
	}
	
	
	//홍보사업 삭제
	@GetMapping(value="/prDeletePromotion", produces = "text/html")
	public @ResponseBody String deletePromotion(@RequestParam(value="festprProCd")String festprProCd
								,ServletResponse response)  {		
		publicrelationsService.deletePromotion(festprProCd);
		String script = "<script>alert('홍보사업이 삭제 되었습니다.'); location.href='/prPromotionList';</script>";
		return script;		
	}
	
	
//=============== 이벤트 당첨자 ==========================		
	
	//이벤트당첨자 등록
	@GetMapping("/prInsertEventwinner")
	public String pr_insertEventwinner(@RequestParam(value="festprProCd")String festprProCd, Model model2) {
		System.out.println("festprProCd==>"+festprProCd);
		model2.addAttribute("code", festprProCd);
		return "publicrelations/prInsertEventwinner";
	}
	//이벤트당첨자 수정
	@GetMapping("/prUpdateEventwinner")
	public String pr_updateEventwinner() {
		return "publicrelations/prUpdateEventwinner";
	}
	//이벤트당첨자 삭제
	@GetMapping("/prDeleteEventwinner")
	public String deleteEventWinnerByPmcd(Model model,HttpSession session) {
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(festCd));
		return "publicrelations/prPromotionList";
	}
	//이벤트당첨자 조회
	@GetMapping("/prEventwinnerList")
	public String selectEventWinnerByPmcd(@RequestParam(value="festprProCd")String festprProCd, Model model) {
		System.out.println("festprProCd==>"+festprProCd);
		model.addAttribute("EveByPmcd", publicrelationsService.selectEventWinnerByPmcd(festprProCd));
		model.addAttribute("code", festprProCd);
		return "publicrelations/prEventwinnerList";
	}
	
	
	
	
	
//=============== 기타 ==========================	


	//홍보 월별타임테이블
	@GetMapping("/prTimetable")
	public String Timetable() {
		return "publicrelations/prTimetable";
	}
	
	//홍보 거래처리스트 전체조회
	@GetMapping("/prComList")
	public String prCompanyList(HttpSession session, Model model1, Model model2) {
		String festCd = (String)session.getAttribute("F_CD");
		model1.addAttribute("prCom", publicrelationsService.selectPrCom(festCd));
		model2.addAttribute("notappCom", publicrelationsService.searchPrComNotapproved(festCd));		
		return "publicrelations/prComList";
	}
	
	@GetMapping("/searchPrByCom")
	public String searchPrByCom(@RequestParam(value="catAccNm1")String catAccNm1, HttpSession session, Model model1, Model model2) {
		String festCd = (String)session.getAttribute("F_CD");
		model1.addAttribute("AllPromotion", publicrelationsService.searchPrByCom(festCd, catAccNm1));
		model2.addAttribute("prDiv",publicrelationsService.selectAllPrDiv());
		return "publicrelations/prPromotionList";	
	}
	
	
	
	
}
