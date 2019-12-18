package shop.fims.human;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Work;

@Mapper
public interface WorkMapper {
	//축제업무분류조회
	public List<Work> selectWorkCategory();
	
	//축제업무조회
	public List<Work> selectWorkDivision();
}
