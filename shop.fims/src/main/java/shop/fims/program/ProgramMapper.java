package shop.fims.program;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.ProDivDay;
import shop.fims.vo.ProDivPlace;
import shop.fims.vo.ProDivTheme;
import shop.fims.vo.ProParticipants;
import shop.fims.vo.ProSpro;
import shop.fims.vo.Program;

@Mapper
public interface ProgramMapper {
	
	//프로그램 일자코드등록
	public int insertDivDay(ProDivDay prodivday);
	
	//프로그램 장소코드등록
	public int insertDivPlace(ProDivPlace proDivPlace);
	
	//프로그램 성격코드등록
	public int insertDivTheme(ProDivTheme proDivTheme);
	
	//프로그램 참가자 조건검색
	public List<ProParticipants> searchParticipant(String festProNm, String festproSproNm
			,String festproParNm, String festproParGender, String festproParPhone, String festCd);
	
	//세부 프로그램 조건검색
	public List<ProSpro> searchSpro(String festProNm, String festproSproNm);
	
	//프로그램코드로 프로그램 상세조회
	public List<Program> selectByProcd(String festProCd);
	
	//세부프로그램 전체조회
	public List<ProSpro> selectAllSpro(String festCd);
	
	//대프로그램 전체조회
	public List<Program> selectAllPro(String festCd);
	
	//프로그램 참가자리스트조회
	public List<ProParticipants> selectAllParticipants(String festCd);	
	
	//프로그램 성격분류조회
	public List<ProDivTheme> selectAllDivTheme(String festCd);	
	
	//프로그램 장소분류조회
	public List<ProDivPlace> selectAllDivPlace(String festCd);
	
	//프로그램 일자분류조회
	public List<ProDivDay> selectAllDivDay();
	
}
