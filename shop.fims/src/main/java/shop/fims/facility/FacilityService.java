package shop.fims.facility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Facility;

@Service
public class FacilityService {

	@Autowired
	private FacilityMapper facilitymapper;
	//시설분류조회
	public List<Facility> selectClassification() {
		
		return facilitymapper.selectClassification();
	}
	//보유시설조회
	public List<Facility> selectFacility() {
		
		return facilitymapper.selectFacility();
	}
	//임시시설설치및철거관리조회
	public List<Facility> selectTemporary(){
		
		return facilitymapper.selectTemporary();
	}
	//안전점검후유지보수리스트
	public List<Facility> selectMaintenance(){
		
		return facilitymapper.selectMaintenance();
	}
	//안전점검표조회
	public List<Facility> selectChecklist(){
		
		return facilitymapper.selectChecklist();
	}
}
