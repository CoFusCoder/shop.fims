package shop.fims.gukmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AContractController {


	/**
	 * @param 없음
	 * @file AContractController.java
	 * @name contractComReceipt
	 * @brief 수의계약->계약희망업체접수
	 * @author ksmart33 김동석
	 * @return gukminview/acontract/contractComReceipt
	 */
	@GetMapping("gukminview/acontract/contractComReceipt")
	public String contractComReceipt() {
		System.out.println("---수의계약->계약희망업체접수 : contractComReceipt AContractController.java-------");
		return "/gukminview/acontract/contractComReceipt";
	}
	
	/**
	 * @param 없음
	 * @file AContractController.java
	 * @name generalContractOrdPlan
	 * @brief 일반계약->발주계획
	 * @author ksmart33 김동석
	 * @return gukminview/acontract/generalContractOrdPlan
	 */
	@GetMapping("gukminview/acontract/generalContractOrdPlan")
	public String generalContractOrdPlan() {
		System.out.println("---일반계약->발주계획 : generalContractOrdPlan AContractController.java-------");
		return "/gukminview/acontract/generalContractOrdPlan";
	}
	
	/**
	 * @param 없음
	 * @file AContractController.java
	 * @name generalContractView
	 * @brief 일반계약현황
	 * @author ksmart33 김동석
	 * @return gukminview/acontract/generalContractView
	 */
	@GetMapping("gukminview/acontract/generalContractView")
	public String generalContractView() {
		System.out.println("---일반계약현황 : generalContractView AContractController.java-------");
		return "/gukminview/acontract/generalContractView";
	}
	
	/**
	 * @param 없음
	 * @file AContractController.java
	 * @name orderingPlanView
	 * @brief 수의계약->발주계획
	 * @author ksmart33 김동석
	 * @return gukminview/acontract/orderingPlanView
	 */
	@GetMapping("gukminview/acontract/orderingPlanView")
	public String orderingPlanView() {
		System.out.println("---수의계약->발주계획 : orderingPlanView AContractController.java-------");
		return "/gukminview/acontract/orderingPlanView";
	}
	
	/**
	 * @param 없음
	 * @file AContractController.java
	 * @name privateContractView
	 * @brief 수의계약현황
	 * @author ksmart33 김동석
	 * @return gukminview/acontract/privateContractView
	 */
	@GetMapping("gukminview/acontract/privateContractView")
	public String privateContractView() {
		System.out.println("---수의계약현황 : privateContractView AContractController.java-------");
		return "/gukminview/acontract/privateContractView";
	}
}











