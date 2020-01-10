package shop.fims.festival;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;
import shop.fims.vo.Festival;

@Mapper
public interface FestivalMapper {
	
	//축제 등록
	public int festivalInsert(Festival festival);
	
	//축제 조회
	public List<Festival> festivalList();
	
	
}
