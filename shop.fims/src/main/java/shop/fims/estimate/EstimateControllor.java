package shop.fims.estimate;


import java.util.HashMap;
import java.util.List;
import java.util.Map;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import shop.fims.vo.Estimate;




@Controller
public class EstimateControllor {
	
	@Autowired Estimateservice estimateService;
	
	/**
	 * 심사 대기,결과 조회
	 * 
	 * @param model
	 * @return redirect:/estimatelist
	 */
	@GetMapping("/estimatelist")
	public String estimateList(Model model) {		
		model.addAttribute("estimatelist",estimateService.estimateList() );
		return "estimate/estimatelist";		
	}
	//담당자 화인
	@PostMapping("/estimatelist")
	public String updataexeManager(@RequestParam(value = "exeManager")String exeManager,@RequestParam(value = "exaRepCd")String exaRepCd) {
		System.out.println(exeManager +"<-----exeManager");
		System.out.println("exaRepCd-->"+exaRepCd);
		estimateService.updataexeManager(exaRepCd, exeManager);
		
		
		return "redirect:/estimatelist";
	}
	/**
	 * 신청서 내역 페이지 이동
	 * 
	 * @param exa_rep_cd
	 * @param model
	 * @return nextapply
	 */
	@GetMapping("/apply")
	public String nextApply(@RequestParam(value = "exaRepCd" ) String exa_rep_cd, Model model) {
		System.out.println(exa_rep_cd + " <-exa_rep_cd");
		List<Estimate> next =estimateService.nextApply(exa_rep_cd);
		System.out.println("next ->"+next);
		if(next.get(0).getEvaNm().equals("축제 추진위원회 심사")) {
			model.addAttribute("nextapply", estimateService.nextApply(exa_rep_cd));
			System.out.println("next.get(0).getEvaNm() ->"+next.get(0).getEvaNm());
			return  "estimate/apply";
		}else if(next.get(0).getEvaNm().equals("부스 심사")){			
			model.addAttribute("nextapply", estimateService.nextApply(exa_rep_cd));
			return "estimate/booth";
		}
		return "nextapply";
		

	}
	
	
	/**
	 * 심사지표 이동
	 * 
	 * @param exaRepCd
	 * @param model
	 * @return stimate/examinationIndex
	 */
	@GetMapping("/examinationIndex")
	public String examinationIndex(@RequestParam(value = "exaRepCd")String exaRepCd,Model model) {	
		System.out.println(exaRepCd+"<--exaRepCd" );
		model.addAttribute("examinationIndex", estimateService.examinationIndex(exaRepCd));		
		System.out.println("model >>"+model );
		return "estimate/examinationIndex";
	}	
	/**
	 * 심사표 선택
	 * @author 조윤상
	 * @param eva
	 * @return evaMap
	 */
	@PostMapping("/examinationIndex")
	public @ResponseBody Map<String,List<Estimate>> evaIndexScocd(@RequestParam(value = "eva")String eva) {
		
		Map<String,List<Estimate>> evaMap = new HashMap<String,List<Estimate>>();
		List<Estimate> indexeva = estimateService.indexEva(eva);	
		evaMap.put("indexeva", indexeva);	
		System.out.println(evaMap);		
		List<Estimate> evaList = estimateService.evaList(eva);		
		evaMap.put("evaList", evaList);	
		System.out.println(evaMap +"<--------evaMap");
		return evaMap;
	}
	
	//심사결과 상세보기
	@GetMapping("/estimatelistdetail")
	public String estimateListDetail() {
		return "estimate/estimatelistdetail";
	}
//	//설문지 페이지
//	@GetMapping("/survey")
//	public String survey() {
//		return "estimate/survey";
//	}
	
}
