package shop.fims.program;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.fims.vo.ProDivDay;
import shop.fims.vo.ProDivPlace;
import shop.fims.vo.ProDivTheme;

@Controller
public class ProgramController {
		@Autowired ProgramService programservice;
//==============프로그램 시간표=================		
				
		//프로그램 타임테이블
		@GetMapping("/proTimetable")
		public String timetable() {
			return "program/proTimetable";
		}
				
//==============프로그램 분류 관리=================		

		//프로그램 일자분류 신규등록
		@PostMapping(value="/proInsertDivDay" , produces = "text/html")
		public @ResponseBody String insertDivDay(ProDivDay prodivday, ServletResponse response) {
			System.out.println("prodivday :"+prodivday);
			programservice.insertDivDay(prodivday);
			String script = "<script>alert('프로그램 일자분류가 신규 등록되었습니다.'); location.href='/proDivList';</script>";
			return script;		
		}
		//프로그램 장소분류 신규등록
		@PostMapping(value="/proInsertDivPlace", produces = "text/html")
		public @ResponseBody String insertDivPlace(ProDivPlace proDivPlace, HttpSession session) {
			System.out.println(proDivPlace);
			proDivPlace.setAreaCd((String)session.getAttribute("F_AREA_CD"));
			proDivPlace.setAreaCityCd((String)session.getAttribute("F_CITY_CD"));
			proDivPlace.setAreacityAdminCd((String)session.getAttribute("F_ADMIN_CD"));
			proDivPlace.setFestCd((String)session.getAttribute("F_CD"));
			proDivPlace.setFestTitle((String)session.getAttribute("F_NM"));
			programservice.insertDivPlace(proDivPlace);
			String script = "<script>alert('프로그램 장소분류가 신규 등록되었습니다.'); location.href='/proDivList';</script>";
			return script;		
		}
		//프로그램 성격분류 신규등록
		@PostMapping(value="/proInsertDivTheme", produces = "text/html")
		public @ResponseBody String insertDivTheme(ProDivTheme proDivTheme, HttpSession session) {
			proDivTheme.setAreaCd((String)session.getAttribute("F_AREA_CD"));
			proDivTheme.setAreaCityCd((String)session.getAttribute("F_CITY_CD"));
			proDivTheme.setAreacityAdminCd((String)session.getAttribute("F_ADMIN_CD"));
			proDivTheme.setFestCd((String)session.getAttribute("F_CD"));
			proDivTheme.setFestTitle((String)session.getAttribute("F_NM"));
			programservice.insertDivTheme(proDivTheme);
			String script = "<script>alert('프로그램 성격분류가 신규 등록되었습니다.'); location.href='/proDivList';</script>";
			return script;		
		}	
		
		//프로그램 일정분류 수정
		@GetMapping("/proUpdateDivDay")
		public String updateDivDay() {
			return "redirect:/proDivList";			
		}
		//프로그램 장소분류 수정
		@GetMapping("/proUpdateDivPlace")
		public String updateDivPlace() {
			return "redirect:/proDivList";		
		}
		//프로그램 성격분류 수정
		@GetMapping("/proUpdateDivTheme")
		public String updateDivTheme() {
			return "redirect:/proDivList";			
		}
		
		//프로그램 일정분류 삭제
		@GetMapping("/proDeleteDivDay")
		public String deleteDivDay() {
			return "redirect:/proDivList";		
		}
		//프로그램 장소분류 삭제
		@GetMapping("/proDeleteDivPlace")
		public String deleteDivPlace() {			
			return "redirect:/proDivList";		
		}
		//프로그램 성격분류 삭제
		@GetMapping("/proDeleteDivTheme")
		public String deleteDivTheme() {
			return "redirect:/proDivList";				
		}		
	
		//프로그램분류 조회
		@GetMapping("/proDivList")
		public String ProDivList(HttpSession session, Model modelDay, Model modelPlace, Model modelTheme) {
			String festCd = (String)session.getAttribute("F_CD");
			//System.out.println("프로그램분류시작");
			modelDay.addAttribute("ProDivDay", programservice.selectAllDivDay());
			modelPlace.addAttribute("ProDivPlace", programservice.selectAllDivPlace(festCd));
			modelTheme.addAttribute("ProDivTheme", programservice.selectAllDivTheme(festCd));
			//System.out.println(model);
			
			
			return "program/proDivList";
		}
		
//==============프로그램 관리=================		

		// 1-1. 프로그램 신규등록
		@GetMapping("/proInsertProgram")
		public String insertProgram() {
			return "program/proInsertProgram";		
		}

		// 1-2. 프로그램 수정
		@GetMapping("/proUpdateProgram")
		public String updateProgram() {
			return "program/proUpdateProgram";		
		}
		
		// 1-3. 프로그램 삭제
		@GetMapping("/proDeleteProgram")
		public String deleteProgram(Model model, HttpSession session) {
			String festCd = (String)session.getAttribute("F_CD");
			model.addAttribute("AllProgram", programservice.selectAllPro(festCd));		
			return "redirect:/proProList";		
		}

		// 1-4. 프로그램 조회 
		@GetMapping("/proProList")
		public String proList(Model model, HttpSession session) {
			String festCd = (String)session.getAttribute("F_CD");
			model.addAttribute("AllProgram", programservice.selectAllPro(festCd));		
			return "program/proProList";
		}
				
		// 1-5. 프로그램 상세조회
		@GetMapping("/proProDetailList")
		public String selectByProcd(@RequestParam(value="festProCd")String festProCd, Model modelPro, Model modelSpro, HttpSession session) {
			System.out.println("festProCd==>"+festProCd);
			String festCd = (String)session.getAttribute("F_CD");
			modelPro.addAttribute("selectByProcd", programservice.selectByProcd(festProCd));
			modelSpro.addAttribute("AllSprogram", programservice.selectAllSpro(festCd));
			return "program/proProDetailList";
		}	
		
		
//==============세부프로그램 관리=================		
		
		// 1-1. 세부프로그램 신규등록
		@GetMapping("/proInsertSprogram")
		public String insertSprogram() {
			return "program/proInsertSprogram";		
		}
		
		// 1-2. 세부프로그램 수정
		@GetMapping("/proUpdateSprogram")
		public String updateSprogram() {
			return "program/proUpdateSProgram";		
		}
		
		// 1-3. 세부프로그램 삭제
		@GetMapping("/proDeleteSprogram")
		public String deleteSprogram(Model model,HttpSession session) {
			String festCd = (String)session.getAttribute("F_CD");
			model.addAttribute("AllProgram", programservice.selectAllPro(festCd));		
			return "redirect:/proSProList";		
		}
		
		// 1-4. 세부프로그램 조건검색
		@PostMapping("/searchSpro")
		public String searchSpro(@RequestParam(value="festProNm")String festProNm
				,@RequestParam(value="festproSproNm")String festproSproNm	  
				, Model model) {
			model.addAttribute("AllSprogram",programservice.searchSpro(festProNm, festproSproNm));
			return "program/proSProList";
		}
		
		// 1-5. 축제코드로 상세조회 및 프로그램세부조회
		@GetMapping("/proSProList")
		public String selectSpro(Model modelSpro, HttpSession session) {
			String festCd = (String)session.getAttribute("F_CD");
			modelSpro.addAttribute("AllSprogram", programservice.selectAllSpro(festCd));
			return "program/proSProList";
		}			

	
//==============프로그램 참가자 관리=================	
	
	// 1-1. 참가자 신규등록
	@GetMapping("/proInsertParticipant")
	public String insertParticipant() {
		return "program/proInsertParticipant";		
	}
	
	// 1-2. 참가자 수정
	@GetMapping("/proUpdateParticipant")
	public String updateParticipant() {
		return "program/proUpdateParticipant";		
	}

	// 1-3. 참가자 삭제
	@GetMapping("/proDeleteParticipant")
	public String deleteParticipant(Model model, HttpSession session) {
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllParti", programservice.selectAllParticipants(festCd));
		return "redirect:/proParList";		
	}
	
	// 1-4. 프로그램 참가자리스트조회
	@GetMapping("/proParList")
	public String ParticipantsList(Model model, HttpSession session ) {
		String festCd = (String)session.getAttribute("F_CD");
		model.addAttribute("AllParti", programservice.selectAllParticipants(festCd));
		return "program/proParList";
	}		
	
	// 1-5. 프로그램 참가자 조건검색
	@PostMapping("/searchPar")
	public String searchParticipant(@RequestParam(value="festProNm")String festProNm
							,@RequestParam(value="festproSproNm")String festproSproNm	  
							,@RequestParam(value="festproParNm")String festproParNm	  
							,@RequestParam(value="festproParGender")String festproParGender
							,@RequestParam(value="festproParPhone")String festproParPhone  
							, HttpSession session
							, Model model) {
		String festCd = (String)session.getAttribute("F_CD");
		System.out.println("찍혔니? ==>"+festCd);
		model.addAttribute("AllParti", programservice.searchParticipant(festProNm, festproSproNm, festproParNm, festproParGender, festproParPhone, festCd ));
		return "program/proParList";
	}	
	
//==============프로그램 거래처 관리=================	
	
	// 1. 프로그램 참가업체리스트조회
	@GetMapping("/proComList")
	public String proCompanyList() {
		return "program/proComList";
	}
	
		
}