package shop.fims.operate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OprateNotice {
	
	@GetMapping("/oprateSelectNotice")
	public String oprateSystemManageView() {
		return "/oprate/oprateSelectNotice";
		
	}
	
}
