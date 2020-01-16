package shop.fims.publicrelations;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import shop.fims.vo.AttachFiles;
import shop.fims.vo.EventWinner;
import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;

@Service
public class PublicrelationsService {
	@Autowired PublicrelationsMapper publicrelationsMapper;

	@Value("${static.file.upload.path}")
	private String location;
	
//**********홍보 분류 ***********			
	// 홍보분류조회
	public List<PrDiv> selectAllPrDiv(){
		return publicrelationsMapper.selectAllPrDiv();		
	}	
	
	// 홍보 분류 등록
	public int insertPrDiv(PrDiv prdiv){
		return publicrelationsMapper.insertPrDiv(prdiv);		
	}	
	
	// 홍보 분류 수정
	public int updateDiv(PrDiv prdiv) {
		return publicrelationsMapper.updateDiv(prdiv);		
	}
	
	// 홍보 분류 삭제
	public int deleteDiv(String festprDivCd) {
		return publicrelationsMapper.deleteDiv(festprDivCd);		
	}	
	
	
	public String selectDivByCd(String festprDivCd) {
		return publicrelationsMapper.selectDivByCd(festprDivCd);	
	}
	
	
//**********홍보 프로모션 ***********	
	
	//홍보 그룹코드명 변경
	public int updatePrGroupNm (String groupCd, String groupNm) {
		return publicrelationsMapper.updatePrGroupNm(groupCd, groupNm);		
	}
	// 홍보 사업 신규 등록
	public int insertPromotionPro(PrPromotion promotion, String groupNm2) {
		System.out.println("groupNm2"+groupNm2);
		if(promotion.getGroupNm().equals("")) {
			promotion.setGroupNm(groupNm2);	
		}
		
		System.out.println(promotion);
		String groupCd = publicrelationsMapper.selectGroupCd(promotion.getGroupNm());
		if(groupCd==null) {
			groupCd=publicrelationsMapper.newGroupCd();
			promotion.setGroupCd(groupCd);
		}else {
			promotion.setGroupCd(groupCd);
		}
		return publicrelationsMapper.insertPromotionPro(promotion);
	}
	
	// 홍보 사업 수정
	public int updatePromotionPro(PrPromotion promotion, String groupNm2) {
		System.out.println("groupNm2"+groupNm2);
		if(promotion.getGroupNm().equals("")) {
			promotion.setGroupNm(groupNm2);	
		}
		
		System.out.println(promotion);
		String groupCd = publicrelationsMapper.selectGroupCd(promotion.getGroupNm());
		if(groupCd==null) {
			groupCd=publicrelationsMapper.newGroupCd();
			promotion.setGroupCd(groupCd);
		}else {
			promotion.setGroupCd(groupCd);
		}
		return publicrelationsMapper.updatePromotionPro(promotion);
	}	

	
	// 홍보관련 계정과목명 조회
	public List<Map<String, Object>> selectBudget(String festCd) {
		return publicrelationsMapper.selectBudget(festCd);		
	}
	
	// 홍보 그룹코드명 조회
	public List<Map<String, Object>> selectGroup(String festCd) {
		return publicrelationsMapper.selectGroup(festCd);		
	}
	
	// 홍보 그룹코드명 수정
	public int updateGroupNm(PrPromotion promotion) {
		return publicrelationsMapper.updateGroupNm(promotion);		
	}
	
	
	
	// 홍보관련 계정과목명 조회
	public List<Map<String, Object>> selectParners() {
		return publicrelationsMapper.selectParners();		
	}

	// 홍보리스트 조건검색
	public List<PrPromotion> searchPrDetail(String festprDivNm, String catAccNm1, String festprProNm, String date1, String date2
											, String actionStatus, String festCd){
		return publicrelationsMapper.searchPrDetail(festprDivNm, catAccNm1, festprProNm, date1, date2, actionStatus, festCd);
	}	

	//홍보코드로 상세내역조회
	public List<Map<String, Object>> selectByPmcd(String festprProCd){
		return publicrelationsMapper.selectByPmcd(festprProCd);		
	}

	// 홍보 리스트 조회
	public List<PrPromotion> selectAllPromotion(String festCd){
		return publicrelationsMapper.selectAllPromotion(festCd);
	}
	
	// 홍보사업 파일첨부
	public int sendfile (MultipartFile fileUpload) {
		AttachFiles attachFiles = new AttachFiles();
				
			String filename = StringUtils.cleanPath(fileUpload.getOriginalFilename());				
		
			try (InputStream inputStream = fileUpload.getInputStream()) {
				
				Files.copy(inputStream, Paths.get(location).resolve(filename),
						StandardCopyOption.REPLACE_EXISTING);				
				attachFiles.setFileSize(fileUpload.getSize());
				attachFiles.setFileNm(fileUpload.getOriginalFilename());
				attachFiles.setFestprProCd(publicrelationsMapper.selectLastCd());
				attachFiles.setFileWriter("임시계정명");
								
				System.out.println(attachFiles.getFileNm()+ " << 실제 업로드된 파일명");
				System.out.println(fileUpload.getContentType() + " << 실제 업로드된 파일명");	
				System.out.println(attachFiles.getFileSize() + " << 실제 업로드된 사이즈");				
				System.out.println("/" + location + "/ " +filename+ " <<<<<<<<<<<< 저장 경로");//고정으로 할꺼면 파일명,사이즈만 필요
				
			} catch (IOException e) {
				e.printStackTrace();				
				try {
					Files.delete(Paths.get(location).resolve(filename));
				}catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		
		return publicrelationsMapper.sendfile(attachFiles);		
	}
	
	public List<AttachFiles> selectFile (String festprProCd){
		return publicrelationsMapper.selectFile(festprProCd);		
	}
	
	
	//홍보사업 및 첨부파일 삭제
	public int deletePromotion(String festprProCd) {
		publicrelationsMapper.deleteFile(festprProCd);
		publicrelationsMapper.deletePromotion(festprProCd);
		return 0;		
	}
	
	// 최초 그룹예산 합산용 데이터 조회 후 등록
	public int selectForGroupBud (String festprProCd){
		String Actioncheck = publicrelationsMapper.checkActionCd(festprProCd);
		if(Actioncheck==null) {
		Map<String, String> groupdata = publicrelationsMapper.selectForGroupBud(festprProCd);	
		publicrelationsMapper.insertGroupBud(groupdata);
		}else {
			String groupCd = publicrelationsMapper.selectGroupCdByProCd(festprProCd);
			int sum = publicrelationsMapper.calGroupBudExp(festprProCd);
			publicrelationsMapper.updateGroupCal(groupCd, sum);
		}
		
		return publicrelationsMapper.updateAction(festprProCd);
	}

	public String checkActionStatus(String festprProCd) {
		return publicrelationsMapper.checkActionStatus(festprProCd);
	}
	
//**********홍보 이벤트당첨자 ***********		

	
	//홍보코드로 이벤트 당첨자 조회
	public List<EventWinner> selectEventWinnerByPmcd(String festprProCd){
		return publicrelationsMapper.selectEventWinnerByPmcd(festprProCd);
	}
	
//**********홍보 거래처 ***********
	// 홍보관련 승인 거래처 조회
	public List<Map<String, Object>> selectPrCom(String festCd){
		return publicrelationsMapper.selectPrCom(festCd);		
	}
	// 거래처명으로 홍보사업리스트 조회
	public List<PrPromotion> searchPrByCom (String festCd, String catAccNm1){
		return publicrelationsMapper.searchPrByCom(festCd, catAccNm1);
		
	}
	//축제별 미승인 홍보 거래처 조회
	public List<PrPromotion> searchPrComNotapproved (String festCd){
		return publicrelationsMapper.searchPrComNotapproved(festCd);	
	}

}
