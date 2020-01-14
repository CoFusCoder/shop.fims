package shop.fims.api.service;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.stereotype.Service;

import shop.fims.vo.ApiVo;

@Service
public class APIService {

	public String call(ApiVo apiVo) throws IOException {
		
		System.out.println("call 메서드 APIService.java");

		String addr = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/";
		String sevicekey = "?serviceKey=" + "PYxBOqKsn8gGzZovCv%2BjyGc%2FaeT0RD1suMNakGyGEYVGE3U%2F08TIDCYr%2Fb5as3ECNffVpKQUBzgfKg6%2FoN0k9Q%3D%3D";
		String parameter = "";
		parameter = parameter + "&" + "numOfRows=" + (apiVo.getNumOfRows()!=null?apiVo.getNumOfRows():"10");
		parameter = parameter + "&" + "pageNo=" + (apiVo.getPageNo()!=null?apiVo.getPageNo():"1");
		parameter = parameter + "&" + "MobileOS=" + (apiVo.getMobileOS()!=null?apiVo.getMobileOS():"ETC");
		parameter = parameter + "&" + "MobileApp=" + (apiVo.getMobileApp()!=null?apiVo.getMobileApp():"AppTest");
		
		switch (apiVo.getType()) {
		case "detailCommon":// 공통정보조회
			System.out.println("detailCommon공통정보조회");			
			parameter = parameter + "&" + "contentId=" + apiVo.getContentId();
			if (apiVo.getContentTypeId() != null)
  			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId(); 
  			parameter = parameter + "&" + "defaultYN=" + (apiVo.getDefaultYN()!=null?apiVo.getDefaultYN():"Y"); 
  			parameter = parameter + "&" + "firstImageYN=" + (apiVo.getFirstImageYN()!=null?apiVo.getFirstImageYN():"Y");
			parameter = parameter + "&" + "areacodeYN=" + (apiVo.getListYN()!=null?apiVo.getListYN():"Y");
  			parameter = parameter + "&" + "catcodeYN=" + (apiVo.getCatcodeYN()!=null?apiVo.getCatcodeYN():"Y"); 
  			parameter = parameter + "&" + "addrinfoYN=" + (apiVo.getAddrinfoYN()!=null?apiVo.getAddrinfoYN():"Y"); 
  			parameter = parameter + "&" + "mapinfoYN=" + (apiVo.getMapinfoYN()!=null?apiVo.getMapinfoYN():"Y");
  			parameter = parameter + "&" + "overviewYN=" + (apiVo.getOverviewYN()!=null?apiVo.getOverviewYN():"Y"); 
  			parameter = parameter + "&" + "transGuideYN=" + (apiVo.getTransGuideYN()!=null?apiVo.getTransGuideYN():"Y");
			break;

		case "detailImage":// 이미지정보조회
			System.out.println("detailImage이미지정보조회");
			parameter = parameter + "&" + "contentId=" + apiVo.getContentId();
			parameter = parameter + "&" + "imageYN=" + (apiVo.getImageYN()!=null?apiVo.getImageYN():"Y");
			parameter = parameter + "&" + "subImageYN=" + (apiVo.getSubImageYN()!=null?apiVo.getSubImageYN():"Y");
			break;

		case "detailIntro":// 소개정보조회
			System.out.println("detailIntro소개정보조회");
			parameter = parameter + "&" + "contentId=" + apiVo.getContentId();
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			break;

		case "detailInfo":// 반복정보조회
			System.out.println("detailInfo반복정보조회");
			parameter = parameter + "&" + "contentId=" + apiVo.getContentId();
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			break;
		case "locationBasedList":// 위치기반 관광정보조회
			System.out.println("locationBasedList위치기반 관광정보조회");
			parameter = parameter + "&" + "listYN=" + (apiVo.getListYN()!=null?apiVo.getListYN():"Y");
			parameter = parameter + "&" + "arrange=" + (apiVo.getArrange()!=null?apiVo.getArrange():"B");
			if (apiVo.getContentTypeId() != null)
				parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			parameter = parameter + "&" + "mapX=" + apiVo.getMapX();
			parameter = parameter + "&" + "mapY=" + apiVo.getMapY();
			if (apiVo.getRadius() != null)
			parameter = parameter + "&" + "radius=" + apiVo.getRadius();
			break;
		case "areaBasedList":// 지역기반 관광정보조회
			System.out.println("areaBasedList지역기반 관광정보조회");
			parameter = parameter + "&" + "listYN=" + (apiVo.getListYN()!=null?apiVo.getListYN():"Y");
			parameter = parameter + "&" + "arrange=" + (apiVo.getArrange()!=null?apiVo.getArrange():"B");
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			parameter = parameter + "&" + "sigunguCode=" + apiVo.getSigunguCode();
			if (apiVo.getCat1() != null) {
				parameter = parameter + "&" + "cat1=" + apiVo.getCat1();
				if (apiVo.getCat1() != null) {
					parameter = parameter + "&" + "cat2=" + apiVo.getCat2();
					if (apiVo.getCat1() != null)
						parameter = parameter + "&" + "cat3=" + apiVo.getCat3();
				}
			}
			break;
		case "searchStay":// 숙박정보조회
			System.out.println("searchStay숙박정보조회");
			parameter = parameter + "&" + "listYN=" + (apiVo.getListYN()!=null?apiVo.getListYN():"Y");
			parameter = parameter + "&" + "arrange=" + (apiVo.getArrange()!=null?apiVo.getArrange():"B");
			if (apiVo.getAreaCode() != null)
				parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			if (apiVo.getSigunguCode() != null)
				parameter = parameter + "&" + "sigunguCode=" + apiVo.getSigunguCode();
			if (apiVo.getHanOk() != null)
				parameter = parameter + "&" + "hanOk=" + apiVo.getHanOk();
			if (apiVo.getBenikia() != null)
				parameter = parameter + "&" + "benikia=" + apiVo.getBenikia();
			if (apiVo.getGoodStay() != null)
				parameter = parameter + "&" + "goodStay=" + apiVo.getGoodStay();
			break;
		case "searchFestival":// 행사정보조회
			System.out.println("searchFestival행사정보조회");
			parameter = parameter + "&" + "listYN=" + (apiVo.getListYN()!=null?apiVo.getListYN():"Y");
			parameter = parameter + "&" + "arrange=" + (apiVo.getArrange()!=null?apiVo.getArrange():"P");
			if (apiVo.getAreaCode() != null)
				parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			if (apiVo.getSigunguCode() != null)
				parameter = parameter + "&" + "sigunguCode=" + apiVo.getSigunguCode();
			parameter = parameter + "&" + "eventStartDate=" + apiVo.getEventStartDate();
			parameter = parameter + "&" + "eventEndDate=" + apiVo.getEventEndDate();
			break;
		case "searchKeyword":// 키워드조회
			System.out.println("searchKeyword키워드조회");			
			parameter = parameter + "&" + "listYN=" + (apiVo.getListYN()!=null?apiVo.getListYN():"Y");
			parameter = parameter + "&" + "arrange=" + (apiVo.getArrange()!=null?apiVo.getArrange():"B");
			if (apiVo.getContentTypeId() != null)
				parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			if (apiVo.getAreaCode() != null)
				parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			if (apiVo.getSigunguCode() != null)
				parameter = parameter + "&" + "sigunguCode=" + apiVo.getSigunguCode();
			if (apiVo.getCat1() != null) {
				parameter = parameter + "&" + "cat1=" + apiVo.getCat1();
				if (apiVo.getCat1() != null) {
					parameter = parameter + "&" + "cat2=" + apiVo.getCat2();
					if (apiVo.getCat1() != null)
						parameter = parameter + "&" + "cat3=" + apiVo.getCat3();
				}
			}
			parameter = parameter + "&" + "keyword=" + URLEncoder.encode(apiVo.getKeyword(), "UTF-8");
			break;
		case "categoryCode":// 서비스분류코드조회
			System.out.println("categoryCode서비스분류코드조회");
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			if (apiVo.getCat1() != null) {
				parameter = parameter + "&" + "cat1=" + apiVo.getCat1();
				if (apiVo.getCat1() != null) {
					parameter = parameter + "&" + "cat2=" + apiVo.getCat2();
					if (apiVo.getCat1() != null)
						parameter = parameter + "&" + "cat3=" + apiVo.getCat3();
				}
			}
			break;
		case "areaCode":// 지역코드조회
			System.out.println("areaCode지역코드조회");
			parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			break; 
		default:
			return null;
		}
		
		parameter = parameter + "&" + "_type=json";
		System.out.println(parameter);
		
		String line = "";
		String result = "";

		URL url = new URL(addr = addr + apiVo.getType() + sevicekey + parameter);
		System.out.println(addr);
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
		while ((line = br.readLine()) != null) {
			result = result.concat(line);
		}

		br.close();
		System.out.println(result);

		return result;
		
	}
}
	
