package shop.fims.announcement;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Announcement;


@Mapper
public interface FesAnnMapper {
	
	//공고 관리
	public List<Announcement> selectAnnouncementView();
	
	//공고 상세조회 모든축제공고코드로 조회
	public List<Announcement> selectByAnnouncement(String fesAnnCd);
	
	//공고 등록
	public int insertAnnouncement(Announcement announcement);
	
	//공고 수정화면 모든축제공고코드로 조회
	public Announcement selectByAllAnnouncement(String fesAnnCd);
	
	//공고 수정
	public int updateAnnouncement(Announcement announcement);
	
	//공고 삭제
	public int deleteAnnouncement(Announcement announcement);
}
