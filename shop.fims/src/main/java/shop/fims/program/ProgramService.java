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
	
	// 참가자 조건검색
	public List<ProParticipants> searchParticipant(String fest_pro_nm, String festpro_spro_nm
			,String festpro_par_nm, String festpro_par_gender, String festpro_par_phone, String fest_cd){
		return programMapper.searchParticipant(fest_pro_nm, festpro_spro_nm, festpro_par_nm, festpro_par_gender, festpro_par_phone, fest_cd);
	}
	
	// 세부프로그램 다섯가지 조건검색
	public List<ProSpro> searchSpro(String fest_pro_nm, String festpro_spro_nm){
		return programMapper.searchSpro(fest_pro_nm, festpro_spro_nm);
	}
	
	
	// 프로그램코드로 대프로그램조회
	public List<Program> selectByProcd(String fest_pro_cd){
		return programMapper.selectByProcd(fest_pro_cd);
	}
	
	
	// 세부프로그램조회
	public List<ProSpro> selectAllSpro(String fest_cd){
		return programMapper.selectAllSpro(fest_cd);
	}
	
	// 대프로그램조회
	public List<Program> selectAllPro(String fest_cd){
		return programMapper.selectAllPro(fest_cd);
		
	}
	
	//프로그램 참가자 조회	
	public List<ProParticipants> selectAllParticipants(String fest_cd){
		return programMapper.selectAllParticipants(fest_cd);
	}

	//프로그램 성격분류조회	
	public List<ProDivTheme> selectAllDivTheme(String fest_cd){
		return programMapper.selectAllDivTheme(fest_cd);
	}
	
	
	//프로그램 장소분류조회	
	public List<ProDivPlace> selectAllDivPlace(String fest_cd){
		return programMapper.selectAllDivPlace(fest_cd);
	}
	
	
	//프로그램 일자분류조회
	public List<ProDivDay> selectAllDivDay(){
		return programMapper.selectAllDivDay();
		
	}
	
}
