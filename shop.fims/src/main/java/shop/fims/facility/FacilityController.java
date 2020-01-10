package shop.fims.facility;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
	//모든시설검색
	@PostMapping("/classificationSearch")
	public String searchClassification(@RequestParam(value="fest_nm") String fest_nm, @RequestParam(value="fac_sta_nm") String fac_sta_nm,
							@RequestParam(value="fesfac_cat_nm") String fesfac_cat_nm, @RequestParam(value="man_com_nm2") String man_com_nm2,
							@RequestParam(value="action_status") String action_status, Model model) {

		model.addAttribute("facilityList", facilityservice.searchClassification(fest_nm, fac_sta_nm, fesfac_cat_nm, man_com_nm2, action_status));
		
		return "/Facility/facilityList";
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
	//보유시설수정화면
	@GetMapping("/facilityUpdate")
	public String selectupdateFacility(@RequestParam(value="staCd") String staCd, Model model) {
		
		System.out.println("stacd---------->" + staCd);
		model.addAttribute("facility", facilityservice.selectupdateFacility(staCd));
		
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
	//임시시설설치및철거 검색
	@PostMapping("/temporarySearch")
	public String searchTemporary(@RequestParam(value="fest_nm") String fest_nm, @RequestParam(value="fac_sta_nm") String fac_sta_nm,
								@RequestParam(value="com_mem_nm2") String com_mem_nm2, @RequestParam(value="cat_acc_nm1") String cat_acc_nm1,
								Model model) {
		model.addAttribute("temporaryList", facilityservice.searchTemporary(fest_nm, fac_sta_nm, com_mem_nm2, cat_acc_nm1));
		
		return "/facility/temporaryList";
	}
	//임시시설설치및철거상세보기
	@GetMapping("/temporaryView")
	public String selectTemporaryview(@RequestParam(value="facCd") String facCd, Model model) {
		
		model.addAttribute("facility", facilityservice.selectTemporaryview(facCd));
		
		return "/facility/temporaryView";
	}
	//임시시설설치및철거등록
	@GetMapping("/temporaryInsert")
	public String insertTemporary() {
		
		return "/facility/temporaryInsert";
	}
	//임시시설설치및철거수정화면
	@GetMapping("/temporaryUpdate")
	public String selectupdateTemporary(@RequestParam(value="facCd") String facCd, Model model) {
		System.out.println("facCd---------->" + facCd);
		model.addAttribute("facility", facilityservice.selectupdateTemporary(facCd));
		return "/facility/temporaryUpdate";
	}
	//임시시설설치및철거삭제
	@GetMapping("/temporaryDelete")
	public String delectTemporary() {
		
		return "/facility/temporaryDelete";
	}
	//시설안전점검후지적관리리스트
	@GetMapping("/maintenanceList")
	public String selectMaintenance(Model model) {
		
		model.addAttribute("MaintenanceList", facilityservice.selectMaintenance());
		
		return "/facility/maintenanceList";
	}
	//시설안전점검후지적관리검색
	@PostMapping("/maintenanceSearch")
	public String searchMaintenance(@RequestParam(value="fest_nm") String fest_nm, @RequestParam(value="fac_sta_nm") String fac_sta_nm,
								@RequestParam(value="facmai_che_dt") String facmai_che_dt, @RequestParam(value="facmai_ins_in") String facmai_ins_in,
								@RequestParam(value="com_mem_nm2") String com_mem_nm2, @RequestParam(value="facmai_sta_che") String facmai_sta_che, Model model) {
		
		model.addAttribute("MaintenanceList", facilityservice.searchMaintenance(fest_nm, fac_sta_nm, facmai_che_dt, facmai_ins_in, com_mem_nm2, facmai_sta_che));
		
		return "/facility/maintenanceList";
	}
	//시설안전점검후지적관리등록
	@GetMapping("/maintenanceInsert")
	public String insertMaintenance() {

		return "/facility/maintenanceInsert";
	}
	//시설안전점검후지적관리수정 
	@GetMapping("/maintenanceUpdate")
	public String updateMaintenance(@RequestParam(value="maiCd") String maiCd, Model model) {
		
		System.out.println("staNm---------->" + maiCd);
		model.addAttribute("facility", facilityservice.selectupdateMaintenance(maiCd));
		
		return "/facility/maintenanceUpdate";
	}
	//시설안전점검후지적관리삭제 
	@GetMapping("/maintenanceDelete")
	public String delectMaintenance() {
		
		return "/facility/maintenanceDelete";
	}
	//안전점검리스트표
	@GetMapping("/checkList")
	public String selectChecklist(@RequestParam(value="staNm") String staNm, Model model) {
		
		System.out.println("staNm--------->" + staNm);
		model.addAttribute("checkList", facilityservice.selectChecklist(staNm));
		
		return "/facility/checkList";
	}
}
