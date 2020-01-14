package shop.fims.gukmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EBudgetController {
	
	/**
	 * @param 없음
	 * @file EBudgetController.java
	 * @name expEntBudgetView
	 * @brief 세출현황 -> 사업 및 예산정보
	 * @author ksmart33 김동석
	 * @return ebudgetview/budget/expEntBudgetView
	 */
	@GetMapping("gukminview/ebudget/expEntBudgetView")
	public String expEntBudgetView() {
		System.out.println("---세출현황 -> 사업 및 예산정보 : expEntBudgetView 메서드 EBudgetController.java---");
		return"/gukminview/ebudget/expEntBudgetView";
	}
	
	/**
	 * @param 없음
	 * @file EBudgetController.java
	 * @name expExecutionView
	 * @brief 세출현황 -> 사업 및 예산정보
	 * @author ksmart33 김동석
	 * @return ebudgetview/budget/expExecutionView
	 */
	@GetMapping("gukminview/ebudget/expExecutionView")
	public String expExecutionView() {
		System.out.println("--- 세출현황->지출정보 : expExecutionView 메서드 EBudgetController.java---");
		return"/gukminview/ebudget/expExecutionView";
	}
	
	/**
	 * @param 없음
	 * @file EBudgetController.java
	 * @name revBudgetView
	 * @brief 세출현황 -> 사업 및 예산정보
	 * @author ksmart33 김동석
	 * @return ebudgetview/budget/revBudgetView
	 */
	@GetMapping("gukminview/ebudget/revBudgetView")
	public String revBudgetView() {
		System.out.println("---세입현황 : revBudgetView 메서드 EBudgetController.java---");
		return"/gukminview/ebudget/revBudgetView";
	}
	
	/**
	 * @param 없음
	 * @file EBudgetController.java
	 * @name revExpExecutionView
	 * @brief 세출현황 -> 사업 및 예산정보
	 * @author ksmart33 김동석
	 * @return ebudgetview/budget/revExpExecutionView
	 */
	@GetMapping("gukminview/ebudget/revExpExecutionView")
	public String revExpExecutionView() {
		System.out.println("---세출현황->예산집행현현황 : revExpExecutionView 메서드 EBudgetController.java---");
		return"/gukminview/ebudget/revExpExecutionView";
	}

}
