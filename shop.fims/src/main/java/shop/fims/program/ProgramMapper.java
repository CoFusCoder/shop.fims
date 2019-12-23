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
	
	
	//프로그램 참가자 조건검색
	public List<ProParticipants> searchParticipant(String fest_pro_nm, String festpro_spro_nm
			,String festpro_par_nm, String festpro_par_gender, String festpro_par_phone, String fest_cd);
	
	//세부 프로그램 조건검색
	public List<ProSpro> searchSpro(String fest_pro_nm, String festpro_spro_nm);
	
	//프로그램코드로 프로그램 상세조회
	public List<Program> selectByProcd(String fest_pro_cd);
	
	//세부프로그램 전체조회
	public List<ProSpro> selectAllSpro(String fest_cd);
	
	//대프로그램 전체조회
	public List<Program> selectAllPro(String fest_cd);
	
	//프로그램 참가자리스트조회
	public List<ProParticipants> selectAllParticipants(String fest_cd);	
	
	//프로그램 성격분류조회
	public List<ProDivTheme> selectAllDivTheme(String fest_cd);	
	
	//프로그램 장소분류조회
	public List<ProDivPlace> selectAllDivPlace(String fest_cd);
	
	//프로그램 일자분류조회
	public List<ProDivDay> selectAllDivDay();
	
}
