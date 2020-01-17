package shop.fims.gukmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.gukmin.service.GSiteTermService;

@Controller
public class GSiteTermController {
	
	@Autowired
	private GSiteTermService gsiteTermService;
	/**
	 * @param 없음
	 * @file SiteTermController.java
	 * @name siteTermView
	 * @brief 국민사이트 이용약관
	 * @author ksmart33 김동석
	 * @return gukminview/siteterms/siteTermView
	 */
	@GetMapping("/gukminview/siteterms/siteTermView")
	public String siteTermView() {
		System.out.println("---국민사이트 이용약관 : siteTermView SiteTermController.java-------");
		return "/gukminview/siteterms/siteTermView";
	}
	
	/**
	 * @param 없음
	 * @file SiteTermController.java
	 * @name privacyPolicy
	 * @brief 국민사이트 개인정보처리방침
	 * @author ksmart33 김동석
	 * @return gukminview/siteterms/privacyPolicy
	 */
	@GetMapping("/gukminview/siteterms/privacyPolicy")
	public String privacyPolicy() {
		System.out.println("---국민사이트 개인정보처리방침 : privacyPolicy SiteTermController.java-------");
		return "/gukminview/siteterms/privacyPolicy";
	}
}
