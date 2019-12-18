package shop.fims.facility;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FacilityController {
	
	@Autowired
	private FacilityService facilityservice;
	
	//모든시설분류리스트
	@GetMapping("/classificationList")
	public String selectClassification(Model model) {
		
		model.addAttribute("classificationList", facilityservice.selectClassification());
		
		return "/facility/classificationList";
	}
	//모든시설분류등록
	@GetMapping("/classificationInsert")
	public String insertClassification() {
		
		return "/facility/classificationInsert";
	}
	//모든시설분류수정
	@GetMapping("/classificationUpdate")
	public String selectupdateClassification() {
		
		return "/facility/classificationUpdate";
	}
	//모든시설분류수정처리

	//모든시설분류삭제
	@GetMapping("/classificationDelete")
	public String delectClassification() {
		
		return "/facility/classificationDelete";
	}
	//보유시설리스트
	@GetMapping("/facilityList")
	public String selectFacility(Model model) {
		
		model.addAttribute("facilityList", facilityservice.selectFacility());
		
		return "/facility/facilityList";
	}
	//보유시설등록
	@GetMapping("/facilityInsert")
	public String insertFacility() {
		
		return "/facility/facilityInsert";
	}
	//보유시설수정
	@GetMapping("/facilityUpdate")
	public String selectupdateFacility() {
		
		return "/facility/facilityUpdate";
	}
	//보유시설수정처리

	//보유시설삭제
	@GetMapping("/facilityDelete")
	public String delectFacility() {
		
		return "/facility/facilityDelete";
	}
	//임시시설설치및철거리스트
	@GetMapping("/temporaryList")
	public String selectTemporary(Model model) {
		
		model.addAttribute("temporaryList", facilityservice.selectTemporary());
		
		return "/facility/temporaryList";
	}
	//임시시설설치및철거등록
	@GetMapping("/temporaryInsert")
	public String insertTemporary() {
		
		return "/facility/temporaryInsert";
	}
	//임시시설설치및철거수정
	@GetMapping("/temporaryUpdate")
	public String updateTemporary( ) {
		
		return "/facility/temporaryUpdate";
	}
	//임시시설설치및철거삭제
	@GetMapping("/temporaryDelete")
	public String delectTemporary() {
		
		return "/facility/temporaryDelete";
	}
	//시설안전점검후유지보수리스트
	@GetMapping("/maintenanceList")
	public String selectMaintenance(Model model) {
		
		model.addAttribute("MaintenanceList", facilityservice.selectMaintenance());
		
		return "/facility/maintenanceList";
	}
	//시설안전점검후유지보수등록
	@GetMapping("/maintenanceInsert")
	public String insertMaintenance() {

		return "/facility/maintenanceInsert";
	}
	//시설안전점검후유지보수수정 
	@GetMapping("/maintenanceUpdate")
	public String updateMaintenance() {
		
		return "/facility/maintenanceUpdate";
	}
	//시설안전점검후유지보수삭제 
	@GetMapping("/maintenanceDelete")
	public String delectMaintenance() {
		
		return "/facility/maintenanceDelete";
	}
	//안전점검리스트표
	@GetMapping("/checkList")
	public String selectChecklist(Model model) {
		
		
		model.addAttribute("checkList", facilityservice.selectChecklist());
		
		return "/facility/checkList";
	}
}
