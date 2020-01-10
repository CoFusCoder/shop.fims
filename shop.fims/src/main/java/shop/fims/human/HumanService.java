 package shop.fims.human;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Human;

@Service
public class HumanService {

	@Autowired
	private HumanMapper humanmapper;
	
	//인적사항리스트조회
	public List<Human> selectHuman(){
		
		return humanmapper.selectHuman();
	}
	//인적수정화면정보가져오기
	public Human selectbyHuman(String humanCd) {
		
		return humanmapper.selectbyHuman(humanCd);
	}
	//인적사항상세화면조회
	public Human selecthumanView(String humanCd) {
		
		return humanmapper.selecthumanView(humanCd);
	}
	//인적검색
	public List<Human> searchHuman(String fest_nm, String feswork_div_nm, String com_mem_nm2,
			String fes_human_nm, String fes_human_phone, String fes_human_hour) {
		
		return humanmapper.searchHuman(fest_nm, feswork_div_nm, com_mem_nm2, fes_human_nm, fes_human_phone, fes_human_hour);
	}
}
