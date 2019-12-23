package shop.fims.applicationform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppFormController {
	
	/*
	 * @file   AppFormController.java
	 * @name   AppFormController
	 * @brief  신청서 관련 조회
	 * @author ksmart33 김도민
	 */
	
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
	
	//용역신청서 수정
	@GetMapping("/updateServiceAppForm")
	public String UpdateServiceAppForm() {
		return "/applicationform/updateServiceAppForm";
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
	
	//부스신청서 수정
	@GetMapping("/updateBoothAppForm")
	public String UpdateBoothAppForm() {
		return "/applicationform/updateBoothAppForm";
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
	
	//자원봉사신청서 수정
	@GetMapping("/updateVolunteerAppForm")
	public String UpdateVolunteerAppForm() {
		return "/applicationform/updateVolunteerAppForm";
	}
	
	//위원회신청서 관리
	@GetMapping("/committeeAppFormView")
	public String CommitteeAppFormView() {
		return "/applicationform/committeeAppFormView";
	}
	
	//위원회신청서 상세보기 위원회참가신청서관리로 조회
	@GetMapping("/committeeAppFormDetail")
	public String committeeAppFormDetail() {
		return "/applicationform/committeeAppFormDetail";
	}
	
	//위원회신청서 등록
	@GetMapping("/insertCommitteeAppForm")
	public String InsertCommitteeAppForm() {
		return "/applicationform/insertCommitteeAppForm";
	}
	//위원회신청서 수정
	@GetMapping("/updateCommitteeAppForm")
	public String UpdateCommitteeAppForm() {
		return "/applicationform/updateCommitteeAppForm";
	}
			
}
