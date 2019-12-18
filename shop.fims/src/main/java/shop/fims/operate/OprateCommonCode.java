package shop.fims.operate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OprateCommonCode {
	
	@GetMapping("/oprateSelectCommonCode")
	public String oprateSystemManageView() {
		return "/oprate/oprateSelectCommonCode";
		
	}
	
}
