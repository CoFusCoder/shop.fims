package shop.fims.announcement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Announcement;

@Service
public class FesAnnService {
	
	@Autowired FesAnnMapper fesAnnMapper;
	
	//공고 관리
	public List<Announcement> selectAnnouncementView(){
		return fesAnnMapper.selectAnnouncementView();
	}
	
	//공고 상세조회 모든축제공고코드로 조회
	public List<Announcement> selectByAnnouncement(String fesAnnCd){
		return fesAnnMapper.selectByAnnouncement(fesAnnCd);
	}
	
	//공고 등록
	public int insertAnnouncement(Announcement announcement) {
		return fesAnnMapper.insertAnnouncement(announcement);
	}
	
	//공고 수정화면 모든축제공고코드로 조회
	public Announcement selectByAllAnnouncement(String fesAnnCd) {
		return fesAnnMapper.selectByAllAnnouncement(fesAnnCd);
	}
	
	//공고 수정
	public int updateAnnouncement(Announcement announcement) {
		return fesAnnMapper.updateAnnouncement(announcement);
	}
	
	//공고 삭제
	public int deleteAnnouncement(Announcement announcement) {
		return fesAnnMapper.deleteAnnouncement(announcement);
	}
}
