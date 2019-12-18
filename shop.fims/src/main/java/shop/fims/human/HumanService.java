package shop.fims.human;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Human;

@Service
public class HumanService {

	@Autowired
	private HumanMapper humanmapper;
	
	public List<Human> selectHuman(){
		
		return humanmapper.selectHuman();
	}
}
