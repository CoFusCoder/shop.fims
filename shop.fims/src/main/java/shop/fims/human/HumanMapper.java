package shop.fims.human;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Human;

@Mapper
public interface HumanMapper {

	//인적리스트가져오기
	public List<Human> selectHuman();
	
	//인적수정화면정보가져오기
	Human selectbyHuman(String humanCd);
	
	//인적상세화면조회
	Human selecthumanView(String humanCd);
	
	//인적 검색
	public List<Human> searchHuman(String fest_nm, String feswork_div_nm, String com_mem_nm2,
				String fes_human_nm, String fes_human_phone, String fes_human_hour);
	//인적수정처리-조회1
	String selectupdateHuman1(String ManCd1, String ComNm21);
	
	//인적수정처리-조회2
	String selectupdateHuman2(String FestNm1, String WorkdivNm1);
	
	//인정수정처리-조회3
	String selectupdateHuman3(String FestNm1, String staNm1);
	
	//인적수정처리
	int updateHuman(Human human);
	
	//인적등록화면_공통코드조회
	Human selectinsertHuman(String festCd);
	
	//인적등록화면_회원검색 
	
	Human selectinsertHuman2(String memNm, String loginCd);
	 
}
