package shop.fims.human;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Human;

@Mapper
public interface HumanMapper {

	//인적리스트가져오기
	public List<Human> selectHuman();
	
	//인적수정화면정보가져오기
	Human selectbyHuman(String humanCd);
	
	//인적상세화면조회
	Human selecthumanView(String humanCd);
	
	//인적 검색
	public List<Human> searchHuman(String fest_nm, String feswork_div_nm, String com_mem_nm2,
				String fes_human_nm, String fes_human_phone, String fes_human_hour);
}
