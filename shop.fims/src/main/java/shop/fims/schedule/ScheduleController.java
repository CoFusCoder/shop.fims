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
//============= 일정 (달력) =======================	
	// 1. 일정확인
	@GetMapping("/scheTimetable")
	public String scheTimetable() {
		return "schedule/scheTimetable";
	}	

	
//============= 일정 (리스트) =======================	
	
	// 1-1. 신규일정 등록
	@GetMapping("/scheInsertSchedule")
	public String insertSchedule() {
		return "schedule/scheInsertSchedule";
	}
	
	// 1-2.일정 수정
	@GetMapping("/scheUpdateSchedule")
	public String updateSchedule() {
		return "schedule/scheUpdateSchedule";
	}
	
	// 1-3. 일정 삭제
	@GetMapping("/scheDeleteSchedule")
	public String deleteSchedule(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "redirect:/scheList";
	}	

	// 1-4. 일정리스트
	@GetMapping("/scheList")
	public String scheList(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/scheList";
	}
	
	// 1-5. 일정검색
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
	// 1-6. 일정 상세조회
	@GetMapping("/scheDetailList")
	public String scheDetail(@RequestParam(value="festSchCd")String festSchCd,
								HttpSession session, Model model) {
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("ScheDetail", scheduleService.scheDetail(festCd, festSchCd));
		return "schedule/scheDetailList";
	}
	
	// 2-1. 코멘트 등록
	@GetMapping("/scheInsertComment")
	public String insertComment() {
		return "schedule/scheDetailList";
	}	
	
	// 2-2. 코멘트 수정
	@GetMapping("/scheUpdateComment")
	public String updateComment() {
		return "schedule/scheUpdateComment";
	}
	
	// 2-3. 코멘트 삭제
	@GetMapping("/scheDeleteComment")
	public String deleteComment(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());		
		return "schedule/scheDetailList";
	}

	
}
