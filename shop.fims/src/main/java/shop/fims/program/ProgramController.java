package shop.fims.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramController {
		@Autowired ProgramService programservice;
		//프로그램 타임테이블
		@GetMapping("/pro_timetable")
		public String timetable() {
			return "festival_program/pro_timetable";
		}
		
		//대프로그램 조회 
		@GetMapping("/pro_proList")
		public String proList(Model model) {
			model.addAttribute("AllProgram", programservice.selectAllPro());		
			return "festival_program/pro_proList";
		}
		
		//세부프로그램 조회 
		@GetMapping("/pro_sProList")
		public String sProList(Model model) {
			model.addAttribute("AllSprogram", programservice.selectAllSpro());
			return "festival_program/pro_sProList";
		}
		
		//프로그램분류 조회
		@GetMapping("/pro_divList")
		public String ProDivList(Model modelDay, Model modelPlace, Model modelTheme) {
			System.out.println("프로그램분류시작");
			modelDay.addAttribute("ProDivDay", programservice.selectAllDivDay());
			modelPlace.addAttribute("ProDivPlace", programservice.selectAllDivPlace());
			modelTheme.addAttribute("ProDivTheme", programservice.selectAllDivTheme());
			//System.out.println(model);
			
			
			return "festival_program/pro_divList";
		}
		
		//프로그램 참가업체리스트조회
		@GetMapping("/pro_comList")
		public String proCompanyList() {
			return "festival_program/pro_comList";
		}
		
		//프로그램 참가자리스트조회
		@GetMapping("/pro_ParList")
		public String ParticipantsList(Model model) {
			model.addAttribute("AllParti", programservice.selectAllParticipants());
			return "festival_program/pro_ParList";
		}
		
		
}