package shop.fims.publicrelations;

import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import shop.fims.vo.EventWinner;
import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;

@Controller
public class PublicrelationsController {
	@Autowired PublicrelationsService publicrelationsService;

//=============== 홍보분류 ==========================
	
		//1. 홍보분류 등록
		@PostMapping(value="/prInsertDiv", produces = "text/html")
		public @ResponseBody String insertDiv(PrDiv prdiv, Model model, ServletResponse response){
			publicrelationsService.insertPrDiv(prdiv);
			String script = "<script>alert('홍보분류가 신규 등록되었습니다.'); location.href='/prDivList';</script>";
			return script;		
		}
		
		//2. 홍보분류 수정
		@PostMapping(value="/prUpdateDiv", produces = "text/html")
		public @ResponseBody String updateDiv(PrDiv prdiv, ServletResponse response){
			publicrelationsService.updateDiv(prdiv);
			String script = "<script>alert('홍보분류가 수정되었습니다.'); location.href='/prDivList';</script>";
			return script;		
		}
		
		//3. 홍보분류 삭제
		@GetMapping(value="/prDeleteDiv", produces = "text/html")
		public @ResponseBody String deleteDiv(@RequestParam(value="festprDivCd")String festprDivCd, ServletResponse response){
			String script=null;
			if(publicrelationsService.selectDivByCd(festprDivCd)!=null) {
				script = "<script>alert('해당 분류를 사용중인 홍보사업이 있습니다.\\n해당분류의 사업을 모두 삭제 후 분류를 삭제해주세요.'); location.href='/prDivList';</script>";
			}else{
				publicrelationsService.deleteDiv(festprDivCd);
				script = "<script>alert('홍보분류가 삭제되었습니다.'); location.href='/prDivList';</script>";			
			}
			return script;		
		}
	
		//4. 홍보 분류리스트 조회
		@GetMapping("/prDivList")
		public String divList(Model model) {
			model.addAttribute("AllDiv", publicrelationsService.selectAllPrDiv());
			return "publicrelations/prDivList";
		}		
		
	
		
		
		
//=============== 홍보사업 프로모션 ==========================	
	
		
	// 1-1. 홍보사업 신규등록 화면출력
	 @GetMapping("/prInsertPromotion")
	 public String insertPromotion(Model modelbudget, Model modelDiv, Model modelPartners, Model modelGroup, HttpSession session) {
		String festCd = (String)session.getAttribute("F_CD");
		modelDiv.addAttribute("div", publicrelationsService.selectAllPrDiv());
		modelbudget.addAttribute("budget", publicrelationsService.selectBudget(festCd));
		modelPartners.addAttribute("partners", publicrelationsService.selectParners());
		modelGroup.addAttribute("group", publicrelationsService.selectGroup(festCd));
		
		return "publicrelations/prInsertPromotion";
	 }
	
	  // 1-2. 홍보사업 신규등록 처리
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
	  
	  
		// 2-1. 홍보사업수정 화면 출력
		@GetMapping("/prUpdatePromotion")
		public String updatePromotion(@RequestParam(value="festprProCd")String festprProCd, Model model, HttpSession session) {
			//System.out.println("festprProCd"+festprProCd);	
			//System.out.println(model);
			model.addAttribute("prDetail", publicrelationsService.selectByPmcd(festprProCd));
			String festCd = (String)session.getAttribute("F_CD");
			model.addAttribute("div", publicrelationsService.selectAllPrDiv());
			model.addAttribute("budget", publicrelationsService.selectBudget(festCd));
			model.addAttribute("partners", publicrelationsService.selectParners());
			model.addAttribute("group", publicrelationsService.selectGroup(festCd));
			model.addAttribute("file", publicrelationsService.selectFile(festprProCd));
			return "publicrelations/prUpdatePromotion";
		}
		
		  // 2-2. 홍보사업 수정 처리
		  @PostMapping("/prUpdatePromotionPro") 
		  public String updatePromotionPro(@RequestParam(value="groupNm2")String groupNm2										  
										  ,PrPromotion promotion, Model model) {
			  System.out.println(promotion);	 
			  System.out.println("groupNm2"+groupNm2);
			  publicrelationsService.updatePromotionPro(promotion, groupNm2);
			  String code = promotion.getFestprProCd();
			  model.addAttribute("selectByPmcd", publicrelationsService.selectByPmcd(code));
			  model.addAttribute("file", publicrelationsService.selectFile(code));
			  return "publicrelations/prPromotionDetail";   
		  }

			// 3. 홍보사업 삭제
			@GetMapping(value="/prDeletePromotion", produces = "text/html")
			public @ResponseBody String deletePromotion(@RequestParam(value="festprProCd")String festprProCd
										,ServletResponse response)  {
				String script;
				String actionStatus = publicrelationsService.checkActionStatus(festprProCd);
				System.out.println("actionStatus"+actionStatus);
				List<EventWinner> eventwinner = publicrelationsService.selectEventWinnerByPmcd(festprProCd);
				System.out.println("eventwinner"+eventwinner);
				
				if(actionStatus.equals("Y")) {
					script = "<script>alert('해당사업이 예산마감 되어있어 삭제 할 수 없습니다.'); location.href='/prPromotionList';</script>";	
				}else if (eventwinner.size()>0) {
					script = "<script>alert('해당 이벤트사업에 당첨자가 등록되어있습니다.\n이벤트 당첨자를 삭제후 사업을 삭제 해주세요.'); location.href='/prPromotionList';</script>";	
				}else {
				publicrelationsService.deletePromotion(festprProCd);
					script = "<script>alert('홍보사업이 삭제 되었습니다.'); location.href='/prPromotionList';</script>";
				}
				return script;		
			}
			
			// 4. 홍보사업리스트 조회
			@GetMapping("/prPromotionList")
			public String detailList(Model model, HttpSession session) {
				String festCd = (String)session.getAttribute("F_CD");
				model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(festCd));
				model.addAttribute("prDiv",publicrelationsService.selectAllPrDiv());
				return "publicrelations/prPromotionList";
			}	
						
			// 5. 홍보사업 조건검색
			@PostMapping("/searchPrDetail")
			public String searchPrDetail(@RequestParam(value="festprDivNm")String festprDivNm
										,@RequestParam(value="catAccNm1")String catAccNm1
										,@RequestParam(value="festprProNm")String festprProNm
										,@RequestParam(value="date1")String date1
										,@RequestParam(value="date2")String date2
										,@RequestParam(value="actionStatus")String actionStatus
										,HttpSession session, Model model) {									
				//System.out.println("홍보분류명:"+festprDivNm+"거래처명:"+catAccNm1+"홍보매체명:"+festprProNm+"날짜1:"+date1+"날짜2:"+date2+"마감여부:"+actionStatus);
				String festCd = (String)session.getAttribute("F_CD");
				model.addAttribute("AllPromotion", publicrelationsService.searchPrDetail(festprDivNm, catAccNm1, festprProNm, date1, date2, actionStatus, festCd));
				model.addAttribute("prDiv",publicrelationsService.selectAllPrDiv());
				return "publicrelations/prPromotionList";
			}

			
			 // 6. 홍보 프로모션코드로 세부사항조회
			 @GetMapping("/prPromotionDetail") 
			 public String selectByPmcd(@RequestParam(value="festprProCd")String festprProCd, Model model) { 
				System.out.println("festprProCd"+festprProCd);
				model.addAttribute("selectByPmcd", publicrelationsService.selectByPmcd(festprProCd));
				model.addAttribute("file", publicrelationsService.selectFile(festprProCd));
			 	return "publicrelations/prPromotionDetail";
			 }
	

			// 7. 홍보 그룹코드명 수정
			@PostMapping(value= "/prGroupCdupdate", produces = "text/html")
			public @ResponseBody String updatePrGroupNm (@RequestParam(value="groupCdModal")String groupCdModal
									,@RequestParam(value="groupNmModal")String groupNmModal, ServletResponse response) {		
				//System.out.println("groupCdModal: "+groupCdModal);
				//System.out.println("groupNmModal: "+groupNmModal);
				String groupCd = groupCdModal;
				String groupNm =groupNmModal;
				publicrelationsService.updatePrGroupNm(groupCd, groupNm);
				String script = "<script>alert('그룹명이 수정되었습니다. 페이지가 리로드 됩니다.'); location.href='/prInsertPromotion';</script>";
				return script;		
			}
			// 8. 홍보 마감 등록
			@GetMapping("/actionStart")
			public String actionStart(@RequestParam(value="festprProCd")String festprProCd, Model model){
				//System.out.println("festprProCd : "+festprProCd);			
				System.out.println(publicrelationsService.selectForGroupBud(festprProCd));	
				model.addAttribute("selectByPmcd", publicrelationsService.selectByPmcd(festprProCd));
				model.addAttribute("file", publicrelationsService.selectFile(festprProCd));
				return "publicrelations/prPromotionDetail";		
			}
	
//=============== 이벤트 당첨자 ==========================		
		
			// 1. 이벤트당첨자 등록
			@GetMapping("/prInsertEventwinner")
			public String pr_insertEventwinner(@RequestParam(value="festprProCd")String festprProCd, Model model2) {
				System.out.println("festprProCd==>"+festprProCd);
				model2.addAttribute("code", festprProCd);
				return "publicrelations/prInsertEventwinner";
			}
			// 2. 이벤트당첨자 수정
			@GetMapping("/prUpdateEventwinner")
			public String pr_updateEventwinner() {
				return "publicrelations/prUpdateEventwinner";
			}
			// 3. 이벤트당첨자 삭제
			@GetMapping("/prDeleteEventwinner")
			public String deleteEventWinnerByPmcd(Model model,HttpSession session) {
				String festCd = (String)session.getAttribute("F_CD");
				model.addAttribute("AllPromotion", publicrelationsService.selectAllPromotion(festCd));
				return "publicrelations/prPromotionList";
			}
			// 4. 이벤트당첨자 조회
			@GetMapping("/prEventwinnerList")
			public String selectEventWinnerByPmcd(@RequestParam(value="festprProCd")String festprProCd, Model model) {
				System.out.println("festprProCd==>"+festprProCd);
				model.addAttribute("EveByPmcd", publicrelationsService.selectEventWinnerByPmcd(festprProCd));
				model.addAttribute("code", festprProCd);
				return "publicrelations/prEventwinnerList";
			}
		

//=============== 홍보 거래처 ==========================	
	
			// 1. 홍보 거래처리스트 전체조회
			@GetMapping("/prComList")
			public String prCompanyList(HttpSession session, Model model) {
				String festCd = (String)session.getAttribute("F_CD");
				model.addAttribute("prCom", publicrelationsService.selectPrCom(festCd));
				model.addAttribute("notappCom", publicrelationsService.searchPrComNotapproved(festCd));		
				return "publicrelations/prComList";
			}
			// 2. 홍보거래처명으로 사업리스트조회
			@GetMapping("/searchPrByCom")
			public String searchPrByCom(@RequestParam(value="catAccNm1")String catAccNm1, HttpSession session, Model model) {
				String festCd = (String)session.getAttribute("F_CD");
				model.addAttribute("AllPromotion", publicrelationsService.searchPrByCom(festCd, catAccNm1));
				model.addAttribute("prDiv",publicrelationsService.selectAllPrDiv());
				return "publicrelations/prPromotionList";	
			}
				
	
}
