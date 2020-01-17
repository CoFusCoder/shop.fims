package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.CodeManageMapper;


@Service
public class CodeManageService {

	@Autowired
	private CodeManageMapper codeManageMapper;
	
	/**
	 * 각 테이블별 등록될 코드 값 추출하는 공통메서드 (매개변수 '테이블명' 입력)
	 * @param String tbName
	 * @return String 코드값
	 */
	public String codeGeneration(String tbName) {
		System.out.println(tbName + "<---PK값 자동추출 : codeGeneration 메서드 CodeManageService.java---");
		return codeManageMapper.codeGeneration(tbName);
	}
}
