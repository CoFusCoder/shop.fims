package shop.fims.operate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OprateAdminId {
	
	@GetMapping("/oprateSelectAdmin")
	public String oprateSystemManageView() {
		return "/oprate/oprateSelectAdmin";
	}
	
}
