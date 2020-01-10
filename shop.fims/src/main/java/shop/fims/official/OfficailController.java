package shop.fims.official;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfficailController {
	
	/*
	 * @file   OfficailController.java
	 * @name   OfficailController
	 * @brief  공무원 관리
	 * @author fims 한소연
	 */
	
	//업무현황
	@GetMapping("/official/WorkStatus")
	public String WorkStatus() {
		return "official/WorkStatus";
	}
	
	//행정기관별 부서 및 직원 등록
	@GetMapping("/official/DepartEmployInsert")
	public String DepartEmployInsert() {
		return "official/DepartEmployInsert";
	}
	
	//행정기관별 부서 조회
	@GetMapping("/official/DepartList")
	public String DepartList() {
		return "official/DepartList";
	}
	
	//부서 및 직원 조회
	@GetMapping("/official/DepartEmployList")
	public String DepartEmployList() {
		return "official/DepartEmployList";
	}
	
}
