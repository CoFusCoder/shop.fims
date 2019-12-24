package shop.fims.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Area;

@Service
public class AdminService {
	
	@Autowired private AdminMapper adminMapper;
	
	// 전국 지역 및 시군 등록
	public int areaInsert(Area area) {
		
		int areaInsert = adminMapper.areaInsert(area);
		System.out.println(areaInsert + " : 전국 지역 등록 ");
		
		return areaInsert;
	}
	
	// 전국 지역 및 시군 조회
	public List<Area> areaList() {
		
		List<Area> areaList = adminMapper.areaList();
		System.out.println(areaList + " : 전국 지역 조회 ");
		
		return areaList;
	}
	
	

}
