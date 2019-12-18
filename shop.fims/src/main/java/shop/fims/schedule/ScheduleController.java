package shop.fims.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
	@Autowired ScheduleService scheduleService;
	//일정확인
	@GetMapping("/sche_timetable")
	public String scheTimetable() {
		return "schedule/sche_timetable";
	}
	
	//세부일정확인
	@GetMapping("/sche_detailList")
	public String scheDetailList(Model model) {
		model.addAttribute("AllSchedule", scheduleService.selectAllSchedule());
		return "schedule/sche_detailList";
	}
	
	
}
