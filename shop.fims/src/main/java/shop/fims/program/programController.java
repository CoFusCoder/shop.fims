package shop.fims.program;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class programController {
	
		//프로그램 타임테이블
		@GetMapping("/pro_timetable")
		public String timetable() {
			return "festival_program/pro_timetable";
		}
		
		//대프로그램 조회 
		@GetMapping("/pro_proList")
		public String proList() {
			return "festival_program/pro_proList";
		}
		
		//중프로그램 조회 
		@GetMapping("/pro_sProList")
		public String sProList() {
			return "festival_program/pro_sProList";
		}
		
		//프로그램분류 조회
		@GetMapping("/pro_divList")
		public String ProDivList() {
			return "festival_program/pro_divList";
		}
		
		//프로그램 참가업체리스트조회
		@GetMapping("/pro_comList")
		public String proCompanyList() {
			return "festival_program/pro_comList";
		}
		
		//프로그램 참가자리스트조회
		@GetMapping("/pro_ParList")
		public String ParticipantsList() {
			return "festival_program/pro_ParList";
		}
		
		
}
