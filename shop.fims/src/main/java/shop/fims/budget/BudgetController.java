package shop.fims.budget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BudgetController {

	@Autowired
	private BudgetService budgetService;
	/**
	 * @param 없음
	 * @file BudgetController.java
	 * @name budgetMainView
	 * @brief 세입세출 예산메인화면
	 * @author ksmart33 김동석
	 * @return ebudgetview/budget/revExpBudgetView
	 */
	@GetMapping("/gukminview/ebudgetview/budget/budgetMainView")
	public String budgetMainView() {
		System.out.println("---세입세출 예산메인화면 : budgetMainView 메서드 BudgetController.java---");
		return"/gukminview/ebudgetview/budget/budgetMainView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name ExpEntBudgetView
	 * @brief 세출현황 -> 사업 및 예산정보
	 * @author ksmart33 김동석
	 * @return ebudgetview/budget/expEntBudgetView
	 */
	@GetMapping("/gukminview/ebudgetview/budget/expEntBudgetView")
	public String expEntBudgetView() {
		System.out.println("---세출현황 -> 사업 및 예산정보 : ExpEntBudgetView 메서드 BudgetController.java---");
		return"/gukminview/ebudgetview/budget/expEntBudgetView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name revBudgetView
	 * @brief 세입현황
	 * @author ksmart33 김동석
	 * @return ebudgetview/budget/revBudgetView"
	 */
	@GetMapping("/gukminview/ebudgetview/budget/revBudgetView")
	public String revBudgetView() {
		System.out.println("---세입현황 : revBudgetView 메서드 BudgetController.java---");
		return"/gukminview/ebudgetview/budget/revBudgetView";
	}
}
