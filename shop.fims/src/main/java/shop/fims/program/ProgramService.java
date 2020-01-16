package shop.fims.program;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.ProDivDay;
import shop.fims.vo.ProDivPlace;
import shop.fims.vo.ProDivTheme;
import shop.fims.vo.ProParticipants;
import shop.fims.vo.ProSpro;
import shop.fims.vo.Program;

@Service
public class ProgramService {
	@Autowired ProgramMapper programMapper;
	
	//일자분류 신규등록
	public int insertDivDay(ProDivDay prodivday) {
		return programMapper.insertDivDay(prodivday);
	}
	
	//장소분류 신규등록
	public int insertDivPlace(ProDivPlace proDivPlace) {
		return programMapper.insertDivPlace(proDivPlace);
	}
	
	//성격분류 신규등록
	public int insertDivTheme(ProDivTheme proDivTheme) {
		return programMapper.insertDivTheme(proDivTheme);
	}
	
	
	
	
	// 참가자 조건검색
	public List<ProParticipants> searchParticipant(String festProNm, String festproSproNm
			,String festproParNm, String festproParGender, String festproParPhone, String festCd){
		return programMapper.searchParticipant(festProNm, festproSproNm, festproParNm, festproParGender, festproParPhone, festCd);
	}
	
	// 세부프로그램 다섯가지 조건검색
	public List<ProSpro> searchSpro(String festProNm, String festproSproNm){
		return programMapper.searchSpro(festProNm, festproSproNm);
	}
	
	
	// 프로그램코드로 대프로그램조회
	public List<Program> selectByProcd(String festProCd){
		return programMapper.selectByProcd(festProCd);
	}
	
	
	// 세부프로그램조회
	public List<ProSpro> selectAllSpro(String festCd){
		return programMapper.selectAllSpro(festCd);
	}
	
	// 대프로그램조회
	public List<Program> selectAllPro(String festCd){
		return programMapper.selectAllPro(festCd);
		
	}
	
	//프로그램 참가자 조회	
	public List<ProParticipants> selectAllParticipants(String festCd){
		return programMapper.selectAllParticipants(festCd);
	}

	//프로그램 성격분류조회	
	public List<ProDivTheme> selectAllDivTheme(String festCd){
		return programMapper.selectAllDivTheme(festCd);
	}
	
	
	//프로그램 장소분류조회	
	public List<ProDivPlace> selectAllDivPlace(String festCd){
		return programMapper.selectAllDivPlace(festCd);
	}
	
	
	//프로그램 일자분류조회
	public List<ProDivDay> selectAllDivDay(){
		return programMapper.selectAllDivDay();
		
	}
	
}
