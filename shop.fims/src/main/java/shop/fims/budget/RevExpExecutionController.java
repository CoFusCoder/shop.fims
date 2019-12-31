package shop.fims.budget;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevExpExecutionController {

	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name revExpBudgetList
	 * @brief 세입·세출집행 리스트
	 * @author ksmart33 김동석
	 * @return execution/revExpExecutionList
	 */
	@GetMapping("/revExpExecutionList")
	public String revExpExecutionList() {
		System.out.println("---세입·세출집행리스트: revExpBudgetList 메서드 RevExpExecutionController.java---");
		return "execution/revExpExecutionList";
	}
	
	/**
	 * @param 없음
	 * @file RevExpExecutionController.java
	 * @name revExpExecutionView
	 * @brief 세출현황->예산집행현현황
	 * @author ksmart33 김동석
	 * @return adminisview/execution/revExpExecutionView
	 */
	@GetMapping("/revExpExecutionView")
	public String revExpExecutionView() {
		System.out.println("---세출현황->예산집행현현황: revExpExecutionView 메서드 RevExpExecutionController.java---");
		return "execution/revExpExecutionView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpExecutionController.java
	 * @name expExecutionView
	 * @brief 세출현황->지출정보
	 * @author ksmart33 김동석
	 * @return execution/expExecutionView
	 */
	@GetMapping("/expExecutionView")
	public String expExecutionView() {
		System.out.println("---세출현황->지출정보 : expExecutionView 메서드 RevExpExecutionController.java---");
		return "execution/expExecutionView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpExecutionController.java
	 * @name fundManStatusView
	 * @brief 자금운용상태
	 * @author ksmart33 김동석
	 * @return /execution/expExecutionView
	 */
	@GetMapping("/fundManStatusView")
	public String fundManStatusView() {
		System.out.println("---자금운용상태 : fundManStatusView 메서드 RevExpExecutionController.java---");
		return "execution/fundManStatusView";
	}
}
