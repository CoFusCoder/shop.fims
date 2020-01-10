package shop.fims.contract;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractController {

	/**
	 * @param 없음
	 * @file ContractController.java
	 * @name contractList
	 * @brief 모든계약리스트 화면
	 * @author ksmart33 김동석
	 * @return contract/contractList
	 */
	@GetMapping("/contractList")
	public String contractList() {
		System.out.println("---모든계약리스트 화면 : contractList 메서드 ContractController.java---");
		return "contract/contractList";
	}

}
