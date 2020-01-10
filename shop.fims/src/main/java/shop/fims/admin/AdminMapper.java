package shop.fims.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;

@Mapper
public interface AdminMapper {
	
	// 전국 지역 등록
	public int areaInsert(Area area);
	
	// 전국 지역 조회
	public List<Area> areaList();
	
	// 전국 지역 수정
	public int areaUpdate (Area area);
	
	// 전국 지역 삭제
	public int areaDelete (String area);
	
	// 전국 지역 시군 등록
	public int areaCityInsert(AreaCity areaCity);
	
	// 전국 지역 시군 조회
	public List<AreaCity> areaCityList();
	
	// 전국 지역 시군 수정
	public int areaCityUpdate(AreaCity areaCity);
	
	// 전국 지역 시군 삭제
	public int areaCityDelete(String areaCity);
	
	// 전국 행정기관 등록
	public int areaCityAdminInsert(AreaCityAdmin areaCityAdmin);
	
	// 전국 행정기관 조회
	public List<AreaCityAdmin> areaCityAdminList();
	
	// 전국 행정기관 수정
	public int areaCityAdmUpdate(AreaCityAdmin areaCityAdmin);
	
	// 전국 행정기관 삭제
	public int areaCityAdmDelete(String areacityAdminCd);
}
