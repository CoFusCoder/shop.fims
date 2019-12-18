package shop.fims.human;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Work;

@Service
public class WorkService {

	@Autowired
	private WorkMapper workmapper;
	
	//축제업무분류조회
	public List<Work> selectWorkCategory() {
		
		return workmapper.selectWorkCategory();
	}
	
	//축제업무조회
	public List<Work> selectWorkDivision() {
		
		return workmapper.selectWorkDivision();
	}
}
