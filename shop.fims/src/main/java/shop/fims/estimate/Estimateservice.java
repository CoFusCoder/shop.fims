package shop.fims.estimate;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Estimate;

@Service
public class Estimateservice {
	
	@Autowired EstimateMapper estimatemapper;
	
	//심사대기 리스트
	public List<Estimate> estimatelist(){
		return estimatemapper.estimatelist();
	}
	
	//리스트 -> 신청서
	public List<Estimate> nextapply(String exa_rep_cd){
		return estimatemapper.nextapply(exa_rep_cd);
	}
	//신청서 -> 심사표
	public List<Estimate> examinationIndex(String exaRepCd){
		return estimatemapper.examinationIndex(exaRepCd);
	}
	//심사 문항
	public List<Estimate> indexeva(String eva){
		return estimatemapper.indexeva(eva);
	}
	//심사배점
	public List<Estimate> evaList(String eva){
		return estimatemapper.evaList(eva);
	}	
	//문제를 담는 곳
	public Map<String,List<Estimate>> evaindexscocd(String eva){	
		return estimatemapper.evaindexscocd(eva);
	}
	//심사완료후 승인 여부	
	public List<Estimate> updateestimatelist(String exaRepCd) {
		return estimatemapper.updateestimatelist(exaRepCd);
	}
	//담당자 등록
		public void updataexeManager(String exaRepCd,String exeManager){
			estimatemapper.updataexeManager(exaRepCd,exeManager);
		}
}
