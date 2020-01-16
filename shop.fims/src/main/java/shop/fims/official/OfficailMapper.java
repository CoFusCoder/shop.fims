package shop.fims.official;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.AdminDepart;
import shop.fims.vo.AdminDepartEmploy;
import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;

@Mapper
public interface OfficailMapper {
	
	// 부서 조회
	public List<AdminDepart> DepartList();
	
	// 부서별 직원 조회
	public List<AdminDepartEmploy> DepartEmployList();
}
