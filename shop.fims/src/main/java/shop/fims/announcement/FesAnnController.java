package shop.fims.announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.vo.Announcement;

@Controller
public class FesAnnController {

	@Autowired FesAnnService fesAnnService;
	
	//공고 관리
	@GetMapping("/announcementView")
	public String selectAnnouncementView(Model model) {
		model.addAttribute("announcementView", fesAnnService.selectAnnouncementView());
		return "announcement/announcementView";
	}
	
	//공고 상세조회 모든축제공고코드로 조회
	@GetMapping("/announcementDetail")
	public String selectByAnnouncement(@RequestParam(value="fesAnnCd")String fesAnnCd, Model model) {
		model.addAttribute("selectByAnnouncement", fesAnnService.selectByAnnouncement(fesAnnCd));
		return "announcement/announcementDetail";
	}
	
	//공고 등록화면
	@GetMapping("/insertAnnouncement")
	public String insertAnnouncement() {
		return "announcement/insertAnnouncement";
	}
	
	//공고 등록
	@PostMapping("/insertAnnouncement")
	public String insertAnnouncement(Announcement announcement) {
		fesAnnService.insertAnnouncement(announcement);
		return "redirect:/announcementView";
	}
	
	//공고 수정화면 모든축제공고코드로 조회
	@GetMapping("/updateAnnouncement")
	public String updateAnnouncement(@RequestParam(value="fesAnnCd")String fesAnnCd, Model model) {
		model.addAttribute("selectByAllAnnouncement", fesAnnService.selectByAllAnnouncement(fesAnnCd));
		return "announcement/updateAnnouncement";
	}
	
	//공고 수정
	@PostMapping("/updateAnnouncement")
	public String updateAnnouncement(Announcement announcement) {
		fesAnnService.updateAnnouncement(announcement);
		return "redirect:/announcementView";
	}
	
	//공고 삭제
	@PostMapping("/deleteAnnouncement")
	public String deleteAnnouncement(Announcement announcement) {
		fesAnnService.deleteAnnouncement(announcement);
		return "redirect:/announcementView";
	}
	
}
