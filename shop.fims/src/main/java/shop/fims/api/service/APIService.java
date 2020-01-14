package shop.fims.api.service;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.stereotype.Service;

import shop.fims.vo.ApiVo;

@Service
public class APIService {

	public String call(ApiVo apiVo) throws IOException {
		
		System.out.println("call 메서드 APIService.java");

		String addr = "http://api.visitkorea.or.kr/openapi/service/rest/RusService/";
		String sevicekey = "?"
				+ "ServiceKey=ZHe7knpFjmDZZ%2B1WbSjdX6Tk2m3J62sy9nh4s0uObfESC7biJOnf3QyibxQPTIjTNfiOcA4MIzdSIkZmze96zg%3D%3D";
		String parameter = "";
		
		parameter = parameter + "&" + "numOfRows=" + (apiVo.getNumOfRows()!=null?apiVo.getNumOfRows():"10");
		parameter = parameter + "&" + "pageNo=" + (apiVo.getPageNo()!=null?apiVo.getPageNo():"1");
		parameter = parameter + "&" + "MobileOS=" + (apiVo.getMobileOS()!=null?apiVo.getMobileOS():"ETC");
		parameter = parameter + "&" + "MobileApp=" + (apiVo.getMobileApp()!=null?apiVo.getMobileApp():"AppTest");
		
		switch (apiVo.getType()) {
		case "detailCommon":// 공통정보조회
			System.out.println("detailCommon공통정보조회");
			
			parameter = parameter + "&" + "contentId=" + apiVo.getContentId(); 
  			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId(); 
  			parameter = parameter + "&" + "defaultYN=" + apiVo.getDefaultYN(); 
  			parameter = parameter + "&" + "firstImageYN=" + apiVo.getFirstImageYN(); 
			parameter = parameter + "&" + "areacodeYN=" + apiVo.getAreacodeYN(); 
  			parameter = parameter + "&" + "catcodeYN=" + apiVo.getCatcodeYN(); 
  			parameter = parameter + "&" + "addrinfoYN=" + apiVo.getAddrinfoYN(); 
  			parameter = parameter + "&" + "mapinfoYN=" + apiVo.getMapinfoYN(); 
  			parameter = parameter + "&" + "overviewYN=" + apiVo.getOverviewYN(); 
  			parameter = parameter + "&" + "transGuideYN=" + apiVo.getTransGuideYN(); 

			break;

		case "detailImage":// 이미지정보조회
			System.out.println("detailImage이미지정보조회");

			parameter = parameter + "&" + "contentId=" + apiVo.getContentId();
			parameter = parameter + "&" + "imageYN=" + apiVo.getImageYN();
			parameter = parameter + "&" + "subImageYN=" + apiVo.getSubImageYN();

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
			parameter = parameter + "&" + "arrange=" + (apiVo.getArrange()!=null?apiVo.getArrange():"B");
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
			parameter = parameter + "&" + "keyword=" + apiVo.getKeyword();


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
			break;
		}
		
		parameter = parameter + "&" + "_type=json";
		System.out.println(parameter);
		
		String line = "";
		String result = "";

		URL url = new URL(addr = addr + apiVo.getType() + sevicekey + parameter);
		System.out.println(addr);
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		System.out.println(url.openStream());
		while ((line = br.readLine()) != null) {
			result = result.concat(line);
		}

		br.close();

		System.out.println(result);

		return result;
		
		
	}
}
	
