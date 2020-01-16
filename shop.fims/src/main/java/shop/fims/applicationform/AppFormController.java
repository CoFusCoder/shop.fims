package shop.fims.applicationform;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Committee;
import shop.fims.vo.CommitteeApp;

@Controller
public class AppFormController {
	
	@Autowired AppFormService appFormService;
	
	//용역신청서 관리
	@GetMapping("/serviceAppFormView")
	public String ServiceAppFormView() {
		return "/applicationform/serviceAppFormView";
	}
	
	//용역신청서 등록
	@GetMapping("/insertServiceAppForm")
	public String InsertServiceAppForm() {
		return "/applicationform/insertServiceAppForm";
	}
	
	//부스신청서 관리
	@GetMapping("/boothAppFormView")
	public String BoothAppFormView() {
		return "/applicationform/boothAppFormView";
	}
	 
	//부스신청서 등록
	@GetMapping("/insertBoothAppForm")
	public String InsertBoothAppForm() {
		return "/applicationform/insertBoothAppForm";
	}
	
	//자원봉사신청서 관리
	@GetMapping("/volunteerAppFormView")
	public String VolunteerAppFormView() {
		return "/applicationform/volunteerAppFormView";
	}
	
	//자원봉사신청서 등록
	@GetMapping("/insertVolunteerAppForm")
	public String InsertVolunteerAppForm() {
		return "/applicationform/insertVolunteerAppForm";
	}
	
	//위원회 신청서 관리
	@GetMapping("/committeeAppFormView")
	public String committeeAppFormView(Model model
							,@RequestParam(value="currentPage"
							, required = false
							, defaultValue = "1") int currentPage) {
		Map<String, Object> map = appFormService.getComAppList(currentPage);
		
		model.addAttribute("committeeAppFormView", map.get("list"));
		model.addAttribute("currentPage", map.get("currentPage"));
		model.addAttribute("lastPage", map.get("lastPage"));
		model.addAttribute("startPageNum", map.get("startPageNum"));
		model.addAttribute("lastPageNum", map.get("lastPageNum"));
		return "applicationform/committeeAppFormView";
	}
	
	//위원회신청서 상세보기 위원회참가신청서관리로 조회
	@GetMapping("/committeeAppFormDetail")
	public String committeeAppFormDetail(@RequestParam(value="comAppCd")String comAppCd, Model model) {
		model.addAttribute("selectByComApp", appFormService.selectByComApp(comAppCd));
		return "applicationform/committeeAppFormDetail";
	}
	
	//위원회신청서 등록화면
	@GetMapping("/insertCommitteeAppForm")
	public String InsertCommitteeAppForm() {
		return "/applicationform/insertCommitteeAppForm";
	}
	
	//위원회 신청서 등록
	@PostMapping("/insertCommitteeApp")
	public String insertCommitteeApp(CommitteeApp committeeApp) {
		appFormService.insertCommitteeApp(committeeApp);
		return "redirect:/committeeAppFormView";
	}

			
}
