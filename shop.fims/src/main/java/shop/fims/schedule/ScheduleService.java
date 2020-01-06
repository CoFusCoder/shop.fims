package shop.fims.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Schedule;

@Service
public class ScheduleService {
	@Autowired ScheduleMapper scheduleMapper;
	
	
	
	//일정 조건 검색
	public List<Schedule> searchSchedule(String accMemCd, String festScheNm, String date1, String date2, String festCd){		
		return scheduleMapper.searchSchedule(accMemCd, festScheNm, date1, date2, festCd);	
	}
	
	//일정 상세조회
	public List<Schedule> scheDetail(String festCd, String festSchCd){
		return scheduleMapper.scheDetail(festCd, festSchCd);		
	}
	
	
	//스케줄 전체조회
	public List<Schedule> selectAllSchedule(){
		return scheduleMapper.selectAllSchedule();
	}
}
