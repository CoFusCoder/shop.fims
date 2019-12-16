package shop.fims.festival_announcement;

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
	
	//공고 리스트
	@GetMapping("/announcementView")
	public String AnnouncementView() {
		return "festival_announcement/announcementView";
	}
	
	//공고 등록
	@GetMapping("/insertAnnouncement")
	public String InsertAnnouncement() {
		return "festival_announcement/insertAnnouncement";
	}
	
	//공고 수정
	@GetMapping("/updateAnnouncement")
	public String UpdateAnnouncement() {
		return "festival_announcement/updateAnnouncement";
	}
}
