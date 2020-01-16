package shop.fims.official;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.AdminDepart;
import shop.fims.vo.AdminDepartEmploy;
import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;

@Service
public class OfficailService {
	
	@Autowired private OfficailMapper officailMapper;

	// 부서 조회
	public List<AdminDepart> DepartList(){
		
		List<AdminDepart> DepartList = officailMapper.DepartList();
		System.out.println(DepartList + " : 부서 조회");
		
		return DepartList;
		
	}
	
	// 부서별 직원 조회
	public List<AdminDepartEmploy> DepartEmployList(){
		
		List<AdminDepartEmploy> DepartEmployList = officailMapper.DepartEmployList();
		System.out.println(DepartEmployList + " : 부서별 직원 조회");
		
		return DepartEmployList;
	}
}
