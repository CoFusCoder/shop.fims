package shop.fims.estimate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Estimate;

@Service
public class Estimateservice {
	
	@Autowired EstimateMapper estimatemapper;
	
	//심사대기 리스트
	public List<String> estimatelist(){
		return estimatemapper.estimatelist();
	}
	//심사명 선택
	public List<Estimate> examinationIndex(){
		return estimatemapper.examinationIndex();
	}
}
