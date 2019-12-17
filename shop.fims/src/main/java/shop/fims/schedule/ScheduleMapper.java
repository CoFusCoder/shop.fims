package shop.fims.schedule;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Schedule;

@Mapper
public interface ScheduleMapper {
	public List<Schedule> selectAllSchedule();
}
