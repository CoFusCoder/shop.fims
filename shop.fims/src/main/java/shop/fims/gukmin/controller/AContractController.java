package shop.fims.gukmin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.gukmin.service.AContractService;
import shop.fims.vo.PriOrderPlan;

@Controller
public class AContractController {

	@Autowired
	private AContractService aContractService;

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
	
	/*
	 * @GetMapping("gukminview/acontract/orderingPlanView") public String
	 * orderingPlanView(Model model) { System.out.
	 * println("---수의계약->발주계획 : orderingPlanView AContractController.java-------");
	 * 
	 * List<PriOrderPlan> list = aContractService.getPriOrderPlanList();
	 * model.addAttribute("PriOrderPlanList", list);
	 * 
	 * 
	 * 
	 * return "/gukminview/acontract/orderingPlanView"; }
	 */
	
	/**
	 * @param 없음
	 * @file AContractController.java
	 * @name orderingPlanView
	 * @brief 수의계약->발주계획
	 * @author ksmart33 김동석
	 * @return gukminview/acontract/orderingPlanView
	 */
	@GetMapping("gukminview/acontract/orderingPlanView")
	public String orderingPlanView(Model model
							,@RequestParam(value="currentPage"
							, required = false
							, defaultValue = "1") int currentPage) {
		Map<String, Object> map = aContractService.PriOrderPlanpage(currentPage);
			
		model.addAttribute("PriOrderTotalCount", map.get("PriOrderTotalCount"));
		model.addAttribute("orderingPlanpageing", map.get("list"));
		model.addAttribute("currentPage", map.get("currentPage"));
		model.addAttribute("lastPage", map.get("lastPage"));
		model.addAttribute("startPageNum", map.get("startPageNum"));
		model.addAttribute("lastPageNum", map.get("lastPageNum"));
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











