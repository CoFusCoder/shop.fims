package shop.fims.schedule;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
	
	//일정확인
	@GetMapping("/sche_timetable")
	public String scheTimetable() {
		return "schedule/sche_timetable";
	}
	
	//세부일정확인
	@GetMapping("/sche_detailList")
	public String scheDetailList() {
		return "schedule/sche_detailList";
	}
	
	
}
