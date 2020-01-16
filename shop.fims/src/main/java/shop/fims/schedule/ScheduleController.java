package shop.fims.schedule;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScheduleController {
	@Autowired ScheduleService scheduleService;
	
	
	
	@PostMapping("/scheSearch")
	public String searchSchedule(@RequestParam(value="accMemCd")String accMemCd,
								 @RequestParam(value="festScheNm")String festScheNm,
								 @RequestParam(value="date1")String date1,
								 @RequestParam(value="date2")String date2,
								 HttpSession session, Model model) {
		System.out.println("거래처:"+accMemCd+"\n"+"일정키워드 : "+festScheNm+"\n"+"날짜1 : "+date1+"\n"+"날짜2 : "+date2);
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllSchedule", scheduleService.searchSchedule(accMemCd, festScheNm, date1, date2, festCd));
		return "schedule/scheList";
	}
								 
	//코멘트 삭제
	@GetMapping("/scheDeleteComment")
	public String deleteComment(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());		
		return "schedule/scheDetailList";
	}
	//코멘트 수정
	@GetMapping("/scheUpdateComment")
	public String updateComment() {
		return "schedule/scheUpdateComment";
	}
	
	//일정 삭제
	@GetMapping("/scheDeleteSchedule")
	public String deleteSchedule(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/scheList";
	}
	//일정 수정
	@GetMapping("/scheUpdateSchedule")
	public String updateSchedule() {
		return "schedule/scheUpdateSchedule";
	}
	//신규일정 등록
	@GetMapping("/scheInsertSchedule")
	public String insertSchedule() {
		return "schedule/scheInsertSchedule";
	}
	
	
	
	//일정세부확인
	@GetMapping("/scheDetailList")
	public String scheDetail(@RequestParam(value="festSchCd")String festSchCd,
								HttpSession session, Model model) {
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("ScheDetail", scheduleService.scheDetail(festCd, festSchCd));
		return "schedule/scheDetailList";
	}
	
	
	//일정확인
	@GetMapping("/scheTimetable")
	public String scheTimetable() {
		return "schedule/scheTimetable";
	}
	
	//일정리스트
	@GetMapping("/scheList")
	public String scheList(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/scheList";
	}
	
	
}
