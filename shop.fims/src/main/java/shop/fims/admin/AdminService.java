package shop.fims.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;

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
	
	//전국 지역 수정
	public int areaUpdate(Area area) {
		
		int areaUpdate = adminMapper.areaUpdate(area);
		System.out.println(areaUpdate + " : 전국 지역 수정");
		
		return areaUpdate;
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
	
	// 전국 행정기관 등록
	public int areaCityAdminInsert(AreaCityAdmin areaCityAdmin) {
		
		int areaCityAdminInsert = adminMapper.areaCityAdminInsert(areaCityAdmin);
		System.out.println(areaCityAdminInsert + " : 전국 행정기관 등록");
		
		return areaCityAdminInsert;
	}
	
	// 전국 행정기관 조회
	public List<AreaCityAdmin> areaCityAdminList() {
		
		List<AreaCityAdmin> areaCityAdminList = adminMapper.areaCityAdminList();
		System.out.println(areaCityAdminList + " : 전국 행정기관 조회 ");
		
		return areaCityAdminList;
	}

}
