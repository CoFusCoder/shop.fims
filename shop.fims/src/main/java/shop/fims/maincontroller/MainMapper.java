package shop.fims.maincontroller;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Main;

@Mapper
public interface MainMapper {

		public Main selectFestByFestcd(String festCd);
}
