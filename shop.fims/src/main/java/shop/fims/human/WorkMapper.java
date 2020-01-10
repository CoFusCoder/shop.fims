package shop.fims.human;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Work;

@Mapper
public interface WorkMapper {
	//축제업무분류조회
	public List<Work> selectWorkCategory();
	//측제업무수정화면
	Work selectupdateWorkCategory(String workcatCd);
	//축제업무조회
	public List<Work> selectWorkDivision();
	//축제엄무검색
	public List<Work> searchWorkdivision(String fest_nm, String feswork_cat_nm, String feswork_div_nm, String com_mem_nm2);
	//축제업무수정화면
	Work selectupdateWorkDivision(String workdivCd);
	
}
