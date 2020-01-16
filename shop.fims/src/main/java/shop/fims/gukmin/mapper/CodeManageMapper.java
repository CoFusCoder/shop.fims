package shop.fims.gukmin.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CodeManageMapper {

	// 코드 생성
	public String codeGeneration(String tbName);
}
