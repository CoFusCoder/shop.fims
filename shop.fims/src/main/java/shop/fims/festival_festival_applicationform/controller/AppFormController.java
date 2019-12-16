package shop.fims.festival_festival_applicationform.controller;

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
	
	//용역신청서 화면 관련 메서드
	@GetMapping("/festival_applicationform/serviceAppFormView")
	public String ServiceAppFormView() {
		return "festival_applicationform/serviceAppFormView";
	}
	
	//부스신청서 화면 관련 메서드
	@GetMapping("/festival_applicationform/boothAppFormView")
	public String BoothAppFormView() {
		return "festival_applicationform/boothAppFormView";
	}
	
	//자원봉사신청서 화면 관련 메서드
	@GetMapping("/festival_applicationform/volunteerAppFormView")
	public String VolunteerAppFormView() {
		return "festival_applicationform/volunteerAppFormView";
	}
	
	//위원회신청서 화면 관련 메서드
	@GetMapping("/festival_applicationform/committeeAppFormView")
	public String CommitteeAppFormView() {
		return "festival_applicationform/committeeAppFormView";
	}
			
}
