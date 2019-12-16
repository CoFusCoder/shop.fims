package shop.fims.festival_announcement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FesAnnController {
	
	
	/*
	 * @file   FesAnnController.java
	 * @name   FesAnnController
	 * @brief  공고 관련 
	 * @author ksmart33 김도민
	 */
	
	//공고 화면 관련 메서드
	@GetMapping("/festival_announcement/announcementView")
	public String AnnouncementView() {
		return "festival_announcement/announcementView";
	}
}
