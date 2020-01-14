package shop.fims.api.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shop.fims.api.service.APIService;
import shop.fims.vo.ApiVo;

@RestController
public class RestAPIController {

	@Autowired APIService apiService;
	
	
	@RequestMapping(value ="/api/{type}")
	public String apiCall(@PathVariable("type") String type,@RequestBody(required = false) ApiVo apiVo) throws IOException {
		System.out.println("apiCall 메서드 RestAPIController.java");
		if(apiVo==null) {
			System.out.println(type);
			return null;
		}
		apiVo.setType(type);
		System.out.println(apiVo.getKeyword());
		return apiService.call(apiVo);	
	}
}
