package shop.fims.budget;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevExpBudgetController {

	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name revExpBudgetView
	 * @brief 세입세출예산화면
	 * @author ksmart33 김동석
	 * @return budget/revExpBudgetView
	 */
	@GetMapping("/revExpBudgetView")
	public String revExpBudgetView() {
		System.out.println("---세입세출예산화면 : revExpBudgetView 메서드 RevExpBudgetController.java---");
		return"budget/revExpBudgetView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name revExpBudgetList
	 * @brief 세입세출예산리스트
	 * @author ksmart33 김동석
	 * @return budget/revExpBudgetList
	 */
	@GetMapping("/revExpBudgetList")
	public String revExpBudgetList() {
		System.out.println("---세입세출예산리스트 : revExpBudgetList 메서드 RevExpBudgetController.java---");
		return"budget/revExpBudgetList";
	}

}
