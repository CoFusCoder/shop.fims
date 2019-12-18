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
	//세부프로그램 전체조회
	public List<ProSpro> selectAllSpro();
	
	//대프로그램 전체조회
	public List<Program> selectAllPro();
	
	//프로그램 참가자리스트조회
	public List<ProParticipants> selectAllParticipants();	
	
	//프로그램 성격분류조회
	public List<ProDivTheme> selectAllDivTheme();	
	
	//프로그램 장소분류조회
	public List<ProDivPlace> selectAllDivPlace();
	
	//프로그램 일자분류조회
	public List<ProDivDay> selectAllDivDay();
	
}
