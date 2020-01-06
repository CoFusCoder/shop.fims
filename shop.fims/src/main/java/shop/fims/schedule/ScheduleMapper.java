package shop.fims.schedule;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Schedule;

@Mapper
public interface ScheduleMapper {
	public List<Schedule> scheDetail (String festCd, String festSchCd);
	
	
	//일정 조건검색
	public List<Schedule> searchSchedule(String accMemCd, String festScheNm, String date1, String date2, String festCd);
	
	//전체 일정 조회
	public List<Schedule> selectAllSchedule();
}
