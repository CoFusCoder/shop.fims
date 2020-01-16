 package shop.fims.human;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Human;

@Service
public class HumanService {

	@Autowired
	private HumanMapper humanmapper;
	
	//인적사항리스트조회
	public List<Human> selectHuman(){
		
		return humanmapper.selectHuman();
	}
	//인적수정화면정보가져오기
	public Human selectbyHuman(String humanCd) {
		
		return humanmapper.selectbyHuman(humanCd);
	}
	//인적수정처리
	public int updateHuman(Human human) {
		String ManCd1 = human.getMamCd();
		String ComNm21 = human.getComNm2();
		String FestNm1 = human.getFestNm();
		String WorkdivNm1 = human.getWorkdivNm();
		String staNm1 = human.getStaNm();
		System.out.println("ManCd 확인 :" + ManCd1);
		System.out.println("ComNm2 확인 :" + ComNm21);
		System.out.println("FestNm 확인 :" + FestNm1);
		System.out.println("WorkdivNm 확인 :" + WorkdivNm1);
		
		String ManCd = humanmapper.selectupdateHuman1(ManCd1, ComNm21);
		String workdivCd = humanmapper.selectupdateHuman2(FestNm1, WorkdivNm1);
		String staCd = humanmapper.selectupdateHuman3(FestNm1, staNm1);
		
		human.setMamCd(ManCd);
		human.setWorkdivCd(workdivCd);
		human.setStaCd(staCd);
		
		
		System.out.println("workdivCd 확인 :" + workdivCd);
		System.out.println("ManCd1 확인 :" + ManCd);		
		System.out.println("staCd 확인 :" +staCd);
		System.out.println("Human에 뭐가 담겼는지 보자 :" + human);

		
		return humanmapper.updateHuman(human);
	}
	//인적사항상세화면조회
	public Human selecthumanView(String humanCd) {
		
		return humanmapper.selecthumanView(humanCd);
	}
	//인적검색
	public List<Human> searchHuman(String fest_nm, String feswork_div_nm, String com_mem_nm2,
			String fes_human_nm, String fes_human_phone, String fes_human_hour) {
		
		return humanmapper.searchHuman(fest_nm, feswork_div_nm, com_mem_nm2, fes_human_nm, fes_human_phone, fes_human_hour);
	}
	//인적등록화면_공통코드조회
	
	public Human selectinsertHuman(String festCd) {
	
	return humanmapper.selectinsertHuman(festCd); 
	
	} 
	  //인적관리 등록할 회원검색 
	public Human selectinsertHuman2(String memNm, String loginCd) {
	  
	  return humanmapper.selectinsertHuman2(memNm, loginCd); 
	 }
	 
}
