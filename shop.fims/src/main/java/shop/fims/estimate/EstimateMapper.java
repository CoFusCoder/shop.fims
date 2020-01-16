package shop.fims.estimate;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Estimate;

@Mapper
public interface EstimateMapper {
	//심사대기 리스트
	public List<Estimate> estimateList();	
	//리스트->신청서 페이지 변경
	public List<Estimate> nextApply(String exa_rep_cd);
	//신청서 ->심사 페이지 변경
	public List<Estimate> examinationIndex(String exaRepCd);
	//시험 문항
	public List<Estimate> indexEva(String eva); 
	//시험배점
	public List<Estimate> evaList(String eva);
	
	//전체를 받는 곳
	public Map<String,List<Estimate>> evaIndexScocd(String eva);
	
	//심사완료후 승인 여부	
	public List<Estimate> updateEstimateList(String exaRepCd);
	//담당자 등록 (update)
	public void updataexeManager(String exaRepCd,String exeManager);
	//점수등록
	public int insertscoring();
	
}
