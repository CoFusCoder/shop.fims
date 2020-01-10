package shop.fims.festival;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.AdminMapper;
import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;
import shop.fims.vo.Festival;

@Service
public class FestivalService {
	
	@Autowired private AdminMapper adminMapper;
	@Autowired private FestivalMapper festivalMapper;
	
	// 축제 등록
	public int festivalInsert(Festival festival) {
		
		int festivalInsert = festivalMapper.festivalInsert(festival);
		System.out.println(festivalInsert + " : 축제 등록 ");
		
		return festivalInsert;
	}
	
	// 축제 조회
	public List<Festival> festivalList(){
		
		List<Festival> festivalList = festivalMapper.festivalList();
		System.out.println(festivalList + " : 축제 조회 ");
		
		return festivalList;
	}

}
