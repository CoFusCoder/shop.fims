package shop.fims.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Area;

@Mapper
public interface AdminMapper {
	
	// 전국 지역 등록
	public int areaInsert(Area area);
	
	// 전국 지역 조회
	public List<Area> areaList();
	
}
