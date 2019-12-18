package shop.fims.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Schedule;

@Service
public class ScheduleService {
	@Autowired ScheduleMapper scheduleMapper;
	
	public List<Schedule> selectAllSchedule(){
		return scheduleMapper.selectAllSchedule();
		
	}
}
