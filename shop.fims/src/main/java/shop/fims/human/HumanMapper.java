package shop.fims.human;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Human;

@Mapper
public interface HumanMapper {

	//인적리스트가져오기
	public List<Human> selectHuman();
	
	//인적수정화면정보가져오기
	Human selectbyHuman(String humancd);
	

}
