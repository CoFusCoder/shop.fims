package shop.fims.gukmin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.PriOrderPlan;

@Mapper
public interface AContractMapper {

	
	//수의계약_발주계획 조회
	public List<PriOrderPlan> getPriOrderPlanList();
	
	//페이징카운트
	public int getPriOrderPlanAllCount(); 
		
	//페이징작업 추가
	public List<PriOrderPlan> PriOrderPlanpage(Map<String, Integer> map);
}
