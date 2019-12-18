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
	
	
	// 세부프로그램조회
	public List<ProSpro> selectAllSpro(){
		return programMapper.selectAllSpro();
	}
	
	// 대프로그램조회
	public List<Program> selectAllPro(){
		return programMapper.selectAllPro();
		
	}
	
	//프로그램 성격분류조회	
	public List<ProParticipants> selectAllParticipants(){
		return programMapper.selectAllParticipants();
	}

	//프로그램 성격분류조회	
	public List<ProDivTheme> selectAllDivTheme(){
		return programMapper.selectAllDivTheme();
	}
	
	
	//프로그램 장소분류조회	
	public List<ProDivPlace> selectAllDivPlace(){
		return programMapper.selectAllDivPlace();
	}
	
	
	//프로그램 일자분류조회
	public List<ProDivDay> selectAllDivDay(){
		return programMapper.selectAllDivDay();
		
	}
	
}
