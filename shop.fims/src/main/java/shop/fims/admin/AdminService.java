package shop.fims.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;

@Service
public class AdminService {
	
	@Autowired private AdminMapper adminMapper;
	
	// 전국 지역 및 시군 등록
	public int areaInsert(Area area) {
		
		int areaInsert = adminMapper.areaInsert(area);
		System.out.println(areaInsert + " : 전국 지역 등록 ");
		
		return areaInsert;
	}
	
	// 전국 지역 조회
	public List<Area> areaList() {
		
		List<Area> areaList = adminMapper.areaList();
		System.out.println(areaList + " : 전국 지역 조회 ");
		
		return areaList;
	}
	
	// 전국 지역 시군 등록
	public int areaCityInsert(AreaCity areaCity) {
		
		int areaCityInsert = adminMapper.areaCityInsert(areaCity);
		System.out.println(areaCityInsert + " : 전국 지역 시군 등록");
		
		return areaCityInsert;
	}
	
	// 전국 지역 시군 조회
	public List<AreaCity> areaCityList() {
		
		List<AreaCity> areaCityList = adminMapper.areaCityList();
		System.out.println(areaCityList + " : 전국 지역 시군 조회 ");
		
		return areaCityList;
	}

}
