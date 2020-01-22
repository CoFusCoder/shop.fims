package shop.fims.gukmin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.AContractMapper;
import shop.fims.vo.PriOrderPlan;

@Service
public class AContractService {

	@Autowired
	private AContractMapper aContractMapper;
	
	//수의계약 조회
	public List<PriOrderPlan> getPriOrderPlanList(){
		System.out.println("<----- getPriOrderPlanList 메서드 AContractService.java ---->");
		List<PriOrderPlan> list = aContractMapper.getPriOrderPlanList();
		System.out.println(list + "<----- list 변수 + getPriOrderPlanList 메서드 AContractService.java ---->");
		
		return list;
		
	}
	
	//페이징작업추가
	public Map<String, Object> PriOrderPlanpage(int currentPage){
		//페이지 구성 할 행의 갯수
		final int ROW_PER_PAGE = 10;
		
		//보여줄 첫번째 페이지번호 초기화
		int startPageNum = 1;
		
		//보여줄 페이지번호의 갯수 초기화
		int lastPageNum = ROW_PER_PAGE;
		
		
		if(currentPage > (ROW_PER_PAGE/2)) {
			startPageNum = currentPage -((lastPageNum/2)-1);
			lastPageNum += (startPageNum-1); 
		}
		
		// limit 적용될 값 startRow, 상수ROW_PER_PAGE
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int startRow = (currentPage-1)*ROW_PER_PAGE;
		
		map.put("startRow", startRow);
		map.put("rowPerPage", ROW_PER_PAGE);
		
		// 전체행의 갯수를 가져오는 쿼리
		int PriOrderTotalCount = aContractMapper.getPriOrderPlanAllCount();
		double PriOrderCount = aContractMapper.getPriOrderPlanAllCount();
		
		int lastPage = (int)(Math.ceil(PriOrderCount/ROW_PER_PAGE));
		
		if(currentPage >= (lastPage-4)) {
			lastPageNum = lastPage;
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("list", aContractMapper.PriOrderPlanpage(map));
		resultMap.put("currentPage", currentPage);
		resultMap.put("lastPage", lastPage);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("lastPageNum", lastPageNum);
		resultMap.put("PriOrderTotalCount", PriOrderTotalCount);

		return resultMap;
	}
	
}
