package shop.fims.estimate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Estimateservice {
	
	@Autowired EstimateMapper estimatelist;
	public List<String> estimatelist(){
		return estimatelist.estimatelist();
	}
}
