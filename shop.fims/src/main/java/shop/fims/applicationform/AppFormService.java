package shop.fims.applicationform;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import shop.fims.vo.CommitteeApp;

@Service
public class AppFormService {
	
	@Autowired AppFormMapper appFormMapper;
	
	//위원회 신청서 관리(페이징)
	public Map<String, Object> getComAppList(int currentPage){
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
		double appFormCount = appFormMapper.getComAppAllCount();
		
		int lastPage = (int)(Math.ceil(appFormCount/ROW_PER_PAGE));
		
		if(currentPage >= (lastPage-4)) {
			lastPageNum = lastPage;
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("list", appFormMapper.getComAppList(map));
		resultMap.put("currentPage", currentPage);
		resultMap.put("lastPage", lastPage);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("lastPageNum", lastPageNum);
		
		return resultMap;

		
	}
	
	//위원회 신청서 상세보기 위원회참가신청서관리코드로 조회
	public CommitteeApp selectByComApp(String comAppCd) {
		return appFormMapper.selectByComApp(comAppCd);
	}
	
	//위원회 등록
	public int insertCommitteeApp(CommitteeApp committeeApp) {
		return appFormMapper.insertCommitteeApp(committeeApp);
	}
}
