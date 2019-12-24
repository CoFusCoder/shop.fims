package shop.fims.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
	@Autowired ScheduleService scheduleService;
	
	
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
	public String scheDetailList2(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/scheDetailList";
	}
	
	
	//일정확인
	@GetMapping("/scheTimetable")
	public String scheTimetable() {
		return "schedule/scheTimetable";
	}
	
	//일정리스트
	@GetMapping("/scheList")
	public String scheDetailList(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/scheList";
	}
	
	
}
