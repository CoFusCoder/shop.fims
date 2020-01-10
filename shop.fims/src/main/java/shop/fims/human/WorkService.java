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
	//축제업무수정화면
	public Work selectupdateWorkCategory(String workcatCd) {
		
		return workmapper.selectupdateWorkCategory(workcatCd);
	}
	//축제업무조회
	public List<Work> selectWorkDivision() {
		
		return workmapper.selectWorkDivision();
	}
	//축제업무검색
	public List<Work> searchWorkdivision(String fest_nm, String feswork_cat_nm, String feswork_div_nm, String com_mem_nm2){
		
		return workmapper.searchWorkdivision(fest_nm, feswork_cat_nm, feswork_div_nm, com_mem_nm2);
	}
	//축제업무수정화면
	public Work selectupdateWorkDivision(String workdivCd) {
		
		return workmapper.selectupdateWorkDivision(workdivCd);
	}
	
}
