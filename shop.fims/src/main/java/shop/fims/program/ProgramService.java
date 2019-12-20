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
	
	//프로그램 성격분류조회	
	public List<ProParticipants> selectAllParticipants(){
		return programMapper.selectAllParticipants();
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
