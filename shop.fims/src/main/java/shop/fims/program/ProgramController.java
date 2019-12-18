package shop.fims.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProgramController {
		@Autowired ProgramService programservice;
		
		
		//프로그램 신규등록
		@GetMapping("/pro_insertProgram")
		public String insertProgram() {
			return "festival_program/pro_insertProgram";		
		}
		
		
		
		//프로그램 일정분류 삭제
		@GetMapping("/pro_deleteDivDay")
		public String deleteDivDay(Model modelDay, Model modelPlace, Model modelTheme) {
			modelDay.addAttribute("ProDivDay", programservice.selectAllDivDay());
			modelPlace.addAttribute("ProDivPlace", programservice.selectAllDivPlace());
			modelTheme.addAttribute("ProDivTheme", programservice.selectAllDivTheme());
			return "festival_program/pro_divList";		
		}
		//프로그램 장소분류 삭제
		@GetMapping("/pro_deleteDivPlace")
		public String deleteDivPlace(Model modelDay, Model modelPlace, Model modelTheme) {
			modelDay.addAttribute("ProDivDay", programservice.selectAllDivDay());
			modelPlace.addAttribute("ProDivPlace", programservice.selectAllDivPlace());
			modelTheme.addAttribute("ProDivTheme", programservice.selectAllDivTheme());
			return "festival_program/pro_divList";		
		}
		//프로그램 성격분류 삭제
		@GetMapping("/pro_deleteDivTheme")
		public String deleteDivTheme(Model modelDay, Model modelPlace, Model modelTheme) {
			modelDay.addAttribute("ProDivDay", programservice.selectAllDivDay());
			modelPlace.addAttribute("ProDivPlace", programservice.selectAllDivPlace());
			modelTheme.addAttribute("ProDivTheme", programservice.selectAllDivTheme());
			return "festival_program/pro_divList";		
		}
		
		//프로그램 일정분류 수정
		@GetMapping("/pro_updateDivDay")
		public String updateDivDay() {
			return "festival_program/pro_updateDivDay";		
		}
		//프로그램 장소분류 수정
		@GetMapping("/pro_updateDivPlace")
		public String updateDivPlace() {
			return "festival_program/pro_updateDivPlace";		
		}
		//프로그램 성격분류 수정
		@GetMapping("/pro_updateDivTheme")
		public String updateDivTheme() {
			return "festival_program/pro_updateDivTheme";		
		}
		
		
		//프로그램 일정분류 신규등록
		@GetMapping("/pro_insertDivDay")
		public String insertDivDay() {
			return "festival_program/pro_insertDivDay";		
		}
		//프로그램 장소분류 신규등록
		@GetMapping("/pro_insertDivPlace")
		public String insertDivPlace() {
			return "festival_program/pro_insertDivPlace";		
		}
		//프로그램 성격분류 신규등록
		@GetMapping("/pro_insertDivTheme")
		public String insertDivTheme() {
			return "festival_program/pro_insertDivTheme";		
		}
		
		
		
		
		
		
		
		
		//프로그램 타임테이블
		@GetMapping("/pro_timetable")
		public String timetable() {
			return "festival_program/pro_timetable";
		}
		
		//프로그램코드로 상세조회 및 프로그램세부조회
		@GetMapping("/pro_sProList")
		public String selectByProcd(@RequestParam(value="fest_pro_cd")String fest_pro_cd, Model modelPro, Model modelSpro) {
			modelPro.addAttribute("selectByProcd", programservice.selectByProcd(fest_pro_cd));
			modelSpro.addAttribute("AllSprogram", programservice.selectAllSpro());
			return "festival_program/pro_sProList";
		}		
		

		
		//대프로그램 조회 
		@GetMapping("/pro_proList")
		public String proList(Model model) {
			model.addAttribute("AllProgram", programservice.selectAllPro());		
			return "festival_program/pro_proList";
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