package shop.fims.human;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Human;

@Mapper
public interface HumanMapper {

	public List<Human> selectHuman();
}
