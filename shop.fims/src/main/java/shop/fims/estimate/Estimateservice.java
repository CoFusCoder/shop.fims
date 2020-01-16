package shop.fims.estimate;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Estimate;

@Service
public class Estimateservice {
	
	@Autowired EstimateMapper estimateMapper;
	
	//심사대기 리스트
	public List<Estimate> estimateList(){
		return estimateMapper.estimateList();
	}
	
	//리스트 -> 신청서
	public List<Estimate> nextApply(String exa_rep_cd){
		return estimateMapper.nextApply(exa_rep_cd);
	}
	//신청서 -> 심사표
	public List<Estimate> examinationIndex(String exaRepCd){
		return estimateMapper.examinationIndex(exaRepCd);
	}
	//심사 문항
	public List<Estimate> indexEva(String eva){
		return estimateMapper.indexEva(eva);
	}
	//심사배점
	public List<Estimate> evaList(String eva){
		return estimateMapper.evaList(eva);
	}	
	//문제를 담는 곳
	public Map<String,List<Estimate>> evaIndexScocd(String eva){	
		return estimateMapper.evaIndexScocd(eva);
	}
	//심사완료후 승인 여부	
	public List<Estimate> updateEstimateList(String exaRepCd) {
		return estimateMapper.updateEstimateList(exaRepCd);
	}
	//담당자 등록
	public void updataexeManager(String exaRepCd,String exeManager){
			estimateMapper.updataexeManager(exaRepCd,exeManager);
	}
	//점수 등록
	public int insertscoring() {
		return estimateMapper.insertscoring();
	}
}
