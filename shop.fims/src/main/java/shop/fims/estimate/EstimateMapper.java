package shop.fims.estimate;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Estimate;

@Mapper
public interface EstimateMapper {
	//심사대기 리스트
	public List<String> estimatelist();
	//심사명 선택
	public List<Estimate> examinationIndex();
}
