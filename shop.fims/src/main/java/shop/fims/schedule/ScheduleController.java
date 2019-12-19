package shop.fims.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
	@Autowired ScheduleService scheduleService;
	
	
	//코멘트 삭제
	@GetMapping("/sche_deleteComment")
	public String deleteComment(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());		
		return "schedule/sche_detailList";
	}
	//코멘트 수정
	@GetMapping("/sche_updateComment")
	public String updateComment() {
		return "schedule/sche_updateComment";
	}
	
	//일정 삭제
	@GetMapping("/sche_deleteSchedule")
	public String deleteSchedule(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/sche_List";
	}
	//일정 수정
	@GetMapping("/sche_updateSchedule")
	public String updateSchedule() {
		return "schedule/sche_updateSchedule";
	}
	//신규일정 등록
	@GetMapping("/sche_insertSchedule")
	public String insertSchedule() {
		return "schedule/sche_insertSchedule";
	}
	
	
	
	//일정세부확인
	@GetMapping("/sche_detailList")
	public String scheDetailList2(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/sche_detailList";
	}
	
	
	//일정확인
	@GetMapping("/sche_timetable")
	public String scheTimetable() {
		return "schedule/sche_timetable";
	}
	
	//일정리스트
	@GetMapping("/sche_List")
	public String scheDetailList(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/sche_List";
	}
	
	
}
