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

}
