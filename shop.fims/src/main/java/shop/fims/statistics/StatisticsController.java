package shop.fims.statistics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatisticsController {

	/**
	 * @param 없음
	 * @file StatisticsController.java
	 * @name accountAnalysisView
	 * @brief 거래처분석 화면
	 * @author ksmart33 김동석
	 * @return statistics/accountAnalysisView
	 */
	@GetMapping("/accountAnalysisView")
	public String accountAnalysisView() {
		System.out.println("---거래처분석 화면 : accountAnalysisView 메서드 StatisticsController.java---");
		return "statistics/accountAnalysisView";
	}
	
	/**
	 * @param 없음
	 * @file StatisticsController.java
	 * @name budgetAnalysisView
	 * @brief 예산분석 화면
	 * @author ksmart33 김동석
	 * @return statistics/budgetAnalysisView
	 */
	@GetMapping("/budgetAnalysisView")
	public String budgetAnalysisView() {
		System.out.println("---예산분석 화면 : budgetAnalysisView 메서드 StatisticsController.java---");
		return "statistics/budgetAnalysisView";
	}
	
	/**
	 * @param 없음
	 * @file StatisticsController.java
	 * @name evaluationAnalysisView
	 * @brief 평가분석 화면
	 * @author ksmart33 김동석
	 * @return statistics/evaluationAnalysisView
	 */
	@GetMapping("/evaluationAnalysisView")
	public String evaluationAnalysisView() {
		System.out.println("---거래처분석 화면 : evaluationAnalysisView 메서드 StatisticsController.java---");
		return "statistics/evaluationAnalysisView";
	}
	
	/**
	 * @param 없음
	 * @file StatisticsController.java
	 * @name executionAnalysisView
	 * @brief 집행액분석 화면
	 * @author ksmart33 김동석
	 * @return statistics/executionAnalysisView
	 */
	@GetMapping("/executionAnalysisView")
	public String executionAnalysisView() {
		System.out.println("---집행액분석 화면 : executionAnalysisView 메서드 StatisticsController.java---");
		return "statistics/executionAnalysisView";
	}
	
	/**
	 * @param 없음
	 * @file StatisticsController.java
	 * @name festivalAnalysisView
	 * @brief 축제분석 화면
	 * @author ksmart33 김동석
	 * @return statistics/festivalAnalysisView
	 */
	@GetMapping("/festivalAnalysisView")
	public String festivalAnalysisView() {
		System.out.println("---축제분석 화면 : festivalAnalysisView 메서드 StatisticsController.java---");
		return "statistics/festivalAnalysisView";
	}
}
