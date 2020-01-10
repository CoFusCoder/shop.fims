/*
 * jfjs
 *
 * Version: 0.0.1
 * Author:  nulluser
 *
 */
(function($) {
	$.setSigungu = function(sido, target) {
		if (sido == '') {
			$('#' + target).empty();
			$('#' + target).append('<option value="">지역(시군구)</option>');
		} else if (sido == '서울') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="강남구" value="강남구">강남구</option><option title="강동구" value="강동구">강동구</option><option title="강북구" value="강북구">강북구</option><option title="강서구" value="강서구">강서구</option><option title="관악구" value="관악구">관악구</option><option title="광진구" value="광진구">광진구</option><option title="구로구" value="구로구">구로구</option><option title="금천구" value="금천구">금천구</option><option title="노원구" value="노원구">노원구</option><option title="도봉구" value="도봉구">도봉구</option><option title="동대문구" value="동대문구">동대문구</option><option title="동작구" value="동작구">동작구</option><option title="마포구" value="마포구">마포구</option><option title="서대문구" value="서대문구">서대문구</option><option title="서초구" value="서초구">서초구</option><option title="성동구" value="성동구">성동구</option><option title="성북구" value="성북구">성북구</option><option title="송파구" value="송파구">송파구</option><option title="양천구" value="양천구">양천구</option><option title="영등포구" value="영등포구">영등포구</option><option title="용산구" value="용산구">용산구</option><option title="은평구" value="은평구">은평구</option><option title="종로구" value="종로구">종로구</option><option title="중구" value="중구">중구</option><option title="중랑구" value="중랑구">중랑구</option>');
		} else if (sido == '부산') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="강서구" value="강서구">강서구</option><option title="금정구" value="금정구">금정구</option><option title="기장군" value="기장군">기장군</option><option title="남구" value="남구">남구</option><option title="동구" value="동구">동구</option><option title="동래구" value="동래구">동래구</option><option title="부산진구" value="부산진구">부산진구</option><option title="북구" value="북구">북구</option><option title="사상구" value="사상구">사상구</option><option title="사하구" value="사하구">사하구</option><option title="서구" value="서구">서구</option><option title="수영구" value="수영구">수영구</option><option title="연제구" value="연제구">연제구</option><option title="영도구" value="영도구">영도구</option><option title="중구" value="중구">중구</option><option title="해운대구" value="해운대구">해운대구</option>');
		} else if (sido == '대구') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="남구" value="남구">남구</option><option title="달서구" value="달서구">달서구</option><option title="달성군" value="달성군">달성군</option><option title="동구" value="동구">동구</option><option title="북구" value="북구">북구</option><option title="서구" value="서구">서구</option><option title="수성구" value="수성구">수성구</option><option title="중구" value="중구">중구</option>');
		} else if (sido == '인천') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="강화군" value="강화군">강화군</option><option title="계양구" value="계양구">계양구</option><option title="남동구" value="남동구">남동구</option><option title="동구" value="동구">동구</option><option title="미추홀구" value="미추홀구">미추홀구</option><option title="부평구" value="부평구">부평구</option><option title="서구" value="서구">서구</option><option title="연수구" value="연수구">연수구</option><option title="옹진군" value="옹진군">옹진군</option><option title="중구" value="중구">중구</option>');
		} else if (sido == '광주') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="광산구" value="광산구">광산구</option><option title="남구" value="남구">남구</option><option title="동구" value="동구">동구</option><option title="북구" value="북구">북구</option><option title="서구" value="서구">서구</option>');
		} else if (sido == '대전') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="대덕구" value="대덕구">대덕구</option><option title="동구" value="동구">동구</option><option title="서구" value="서구">서구</option><option title="유성구" value="유성구">유성구</option><option title="중구" value="중구">중구</option>');
		} else if (sido == '울산') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="남구" value="남구">남구</option><option title="동구" value="동구">동구</option><option title="북구" value="북구">북구</option><option title="울주군" value="울주군">울주군</option><option title="중구" value="중구">중구</option>');
		} else if (sido == '세종') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="세종특별자치시" value="세종특별자치시">세종특별자치시</option>');
		} else if (sido == '경기') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="가평군" value="가평군">가평군</option><option title="고양시" value="고양시">고양시</option><option title="고양시 덕양구" value="고양시 덕양구">고양시 덕양구</option><option title="고양시 일산동구" value="고양시 일산동구">고양시 일산동구</option><option title="고양시 일산서구" value="고양시 일산서구">고양시 일산서구</option><option title="과천시" value="과천시">과천시</option><option title="광명시" value="광명시">광명시</option><option title="광주시" value="광주시">광주시</option><option title="구리시" value="구리시">구리시</option><option title="군포시" value="군포시">군포시</option><option title="김포시" value="김포시">김포시</option><option title="남양주시" value="남양주시">남양주시</option><option title="동두천시" value="동두천시">동두천시</option><option title="부천시" value="부천시">부천시</option><option title="부천시 소사구" value="부천시 소사구">부천시 소사구</option><option title="부천시 오정구" value="부천시 오정구">부천시 오정구</option><option title="부천시 원미구" value="부천시 원미구">부천시 원미구</option><option title="성남시" value="성남시">성남시</option><option title="성남시 분당구" value="성남시 분당구">성남시 분당구</option><option title="성남시 수정구" value="성남시 수정구">성남시 수정구</option><option title="성남시 중원구" value="성남시 중원구">성남시 중원구</option><option title="수원시" value="수원시">수원시</option><option title="수원시 권선구" value="수원시 권선구">수원시 권선구</option><option title="수원시 영통구" value="수원시 영통구">수원시 영통구</option><option title="수원시 장안구" value="수원시 장안구">수원시 장안구</option><option title="수원시 팔달구" value="수원시 팔달구">수원시 팔달구</option><option title="시흥시" value="시흥시">시흥시</option><option title="안산시" value="안산시">안산시</option><option title="안산시 단원구" value="안산시 단원구">안산시 단원구</option><option title="안산시 상록구" value="안산시 상록구">안산시 상록구</option><option title="안성시" value="안성시">안성시</option><option title="안양시" value="안양시">안양시</option><option title="안양시 동안구" value="안양시 동안구">안양시 동안구</option><option title="안양시 만안구" value="안양시 만안구">안양시 만안구</option><option title="양주시" value="양주시">양주시</option><option title="양평군" value="양평군">양평군</option><option title="여주시" value="여주시">여주시</option><option title="연천군" value="연천군">연천군</option><option title="오산시" value="오산시">오산시</option><option title="용인시" value="용인시">용인시</option><option title="용인시 기흥구" value="용인시 기흥구">용인시 기흥구</option><option title="용인시 수지구" value="용인시 수지구">용인시 수지구</option><option title="용인시 처인구" value="용인시 처인구">용인시 처인구</option><option title="의왕시" value="의왕시">의왕시</option><option title="의정부시" value="의정부시">의정부시</option><option title="이천시" value="이천시">이천시</option><option title="파주시" value="파주시">파주시</option><option title="평택시" value="평택시">평택시</option><option title="포천시" value="포천시">포천시</option><option title="하남시" value="하남시">하남시</option><option title="화성시" value="화성시">화성시</option>');
		} else if (sido == '강원') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="강릉시" value="강릉시">강릉시</option><option title="고성군" value="고성군">고성군</option><option title="동해시" value="동해시">동해시</option><option title="삼척시" value="삼척시">삼척시</option><option title="속초시" value="속초시">속초시</option><option title="양구군" value="양구군">양구군</option><option title="양양군" value="양양군">양양군</option><option title="영월군" value="영월군">영월군</option><option title="원주시" value="원주시">원주시</option><option title="인제군" value="인제군">인제군</option><option title="정선군" value="정선군">정선군</option><option title="철원군" value="철원군">철원군</option><option title="춘천시" value="춘천시">춘천시</option><option title="태백시" value="태백시">태백시</option><option title="평창군" value="평창군">평창군</option><option title="홍천군" value="홍천군">홍천군</option><option title="화천군" value="화천군">화천군</option><option title="횡성군" value="횡성군">횡성군</option>');
		} else if (sido == '충북') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="괴산군" value="괴산군">괴산군</option><option title="단양군" value="단양군">단양군</option><option title="보은군" value="보은군">보은군</option><option title="영동군" value="영동군">영동군</option><option title="옥천군" value="옥천군">옥천군</option><option title="음성군" value="음성군">음성군</option><option title="제천시" value="제천시">제천시</option><option title="증평군" value="증평군">증평군</option><option title="진천군" value="진천군">진천군</option><option title="청원군" value="청원군">청원군</option><option title="청주시" value="청주시">청주시</option><option title="청주시 상당구" value="청주시 상당구">청주시 상당구</option><option title="청주시 서원구" value="청주시 서원구">청주시 서원구</option><option title="청주시 청원구" value="청주시 청원구">청주시 청원구</option><option title="청주시 흥덕구" value="청주시 흥덕구">청주시 흥덕구</option><option title="충주시" value="충주시">충주시</option>');
		} else if (sido == '충남') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="계룡시" value="계룡시">계룡시</option><option title="공주시" value="공주시">공주시</option><option title="금산군" value="금산군">금산군</option><option title="논산시" value="논산시">논산시</option><option title="당진시" value="당진시">당진시</option><option title="보령시" value="보령시">보령시</option><option title="부여군" value="부여군">부여군</option><option title="서산시" value="서산시">서산시</option><option title="서천군" value="서천군">서천군</option><option title="아산시" value="아산시">아산시</option><option title="예산군" value="예산군">예산군</option><option title="천안시" value="천안시">천안시</option><option title="천안시 동남구" value="천안시 동남구">천안시 동남구</option><option title="천안시 서북구" value="천안시 서북구">천안시 서북구</option><option title="청양군" value="청양군">청양군</option><option title="태안군" value="태안군">태안군</option><option title="홍성군" value="홍성군">홍성군</option>');
		} else if (sido == '전북') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="고창군" value="고창군">고창군</option><option title="군산시" value="군산시">군산시</option><option title="김제시" value="김제시">김제시</option><option title="남원시" value="남원시">남원시</option><option title="무주군" value="무주군">무주군</option><option title="부안군" value="부안군">부안군</option><option title="순창군" value="순창군">순창군</option><option title="완주군" value="완주군">완주군</option><option title="익산시" value="익산시">익산시</option><option title="임실군" value="임실군">임실군</option><option title="장수군" value="장수군">장수군</option><option title="전주시" value="전주시">전주시</option><option title="전주시 덕진구" value="전주시 덕진구">전주시 덕진구</option><option title="전주시 완산구" value="전주시 완산구">전주시 완산구</option><option title="정읍시" value="정읍시">정읍시</option><option title="진안군" value="진안군">진안군</option>');
		} else if (sido == '전남') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="강진군" value="강진군">강진군</option><option title="고흥군" value="고흥군">고흥군</option><option title="곡성군" value="곡성군">곡성군</option><option title="광양시" value="광양시">광양시</option><option title="구례군" value="구례군">구례군</option><option title="나주시" value="나주시">나주시</option><option title="담양군" value="담양군">담양군</option><option title="목포시" value="목포시">목포시</option><option title="무안군" value="무안군">무안군</option><option title="보성군" value="보성군">보성군</option><option title="순천시" value="순천시">순천시</option><option title="신안군" value="신안군">신안군</option><option title="여수시" value="여수시">여수시</option><option title="영광군" value="영광군">영광군</option><option title="영암군" value="영암군">영암군</option><option title="완도군" value="완도군">완도군</option><option title="장성군" value="장성군">장성군</option><option title="장흥군" value="장흥군">장흥군</option><option title="진도군" value="진도군">진도군</option><option title="함평군" value="함평군">함평군</option><option title="해남군" value="해남군">해남군</option><option title="화순군" value="화순군">화순군</option>');
		} else if (sido == '경북') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="경산시" value="경산시">경산시</option><option title="경주시" value="경주시">경주시</option><option title="고령군" value="고령군">고령군</option><option title="구미시" value="구미시">구미시</option><option title="군위군" value="군위군">군위군</option><option title="김천시" value="김천시">김천시</option><option title="문경시" value="문경시">문경시</option><option title="봉화군" value="봉화군">봉화군</option><option title="상주시" value="상주시">상주시</option><option title="성주군" value="성주군">성주군</option><option title="안동시" value="안동시">안동시</option><option title="영덕군" value="영덕군">영덕군</option><option title="영양군" value="영양군">영양군</option><option title="영주시" value="영주시">영주시</option><option title="영천시" value="영천시">영천시</option><option title="예천군" value="예천군">예천군</option><option title="울릉군" value="울릉군">울릉군</option><option title="울진군" value="울진군">울진군</option><option title="의성군" value="의성군">의성군</option><option title="청도군" value="청도군">청도군</option><option title="청송군" value="청송군">청송군</option><option title="칠곡군" value="칠곡군">칠곡군</option><option title="포항시" value="포항시">포항시</option><option title="포항시 남구" value="포항시 남구">포항시 남구</option><option title="포항시 북구" value="포항시 북구">포항시 북구</option>');
		} else if (sido == '경남') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="거제시" value="거제시">거제시</option><option title="거창군" value="거창군">거창군</option><option title="고성군" value="고성군">고성군</option><option title="김해시" value="김해시">김해시</option><option title="남해군" value="남해군">남해군</option><option title="밀양시" value="밀양시">밀양시</option><option title="사천시" value="사천시">사천시</option><option title="산청군" value="산청군">산청군</option><option title="양산시" value="양산시">양산시</option><option title="의령군" value="의령군">의령군</option><option title="진주시" value="진주시">진주시</option><option title="창녕군" value="창녕군">창녕군</option><option title="창원시" value="창원시">창원시</option><option title="창원시 마산합포구" value="창원시 마산합포구">창원시 마산합포구</option><option title="창원시 마산회원구" value="창원시 마산회원구">창원시 마산회원구</option><option title="창원시 성산구" value="창원시 성산구">창원시 성산구</option><option title="창원시 의창구" value="창원시 의창구">창원시 의창구</option><option title="창원시 진해구" value="창원시 진해구">창원시 진해구</option><option title="통영시" value="통영시">통영시</option><option title="하동군" value="하동군">하동군</option><option title="함안군" value="함안군">함안군</option><option title="함양군" value="함양군">함양군</option><option title="합천군" value="합천군">합천군</option>');
		} else if (sido == '제주') {
			$('#' + target).empty();
			$('#' + target)
					.append(
							'<option value="">지역(시군구)</option><option title="서귀포시" value="서귀포시">서귀포시</option><option title="제주시" value="제주시">제주시</option>');
		}
	}

	$.spotViewHistory = function(spottype, spotseq) {
		$.ajax({
			type : 'POST',
			url : 'JSONSpotViewHistory.festa',
			data : {
				spottype : spottype,
				spotseq : spotseq
			},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
			},
			error : function(jqXHR, textStatus, errorThrown) {
			},
			complete : function(jqXHR, textStatus) {
			}
		});
	}

	$.pageViewHistory = function() {
		$.ajax({
			type : 'POST',
			url : 'JSONPageViewHistory.festa',
			data : {},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
			},
			error : function(jqXHR, textStatus, errorThrown) {
			},
			complete : function(jqXHR, textStatus) {
			}
		});
	}

	$.getReviewList = function(currentPage, sort, spottype, spotseq, ownerflag) {
		$
				.ajax({
					url : 'JSONSpotReviewList.festa',
					type : 'POST',
					data : {
						currentPage : currentPage,
						sort : sort,
						spottype : spottype,
						spotseq : spotseq
					},
					dataType : 'json',
					success : function(data, textStatus, jqXHR) {
						if (data.resultcode == 0) {
							var itemList = data.itemList;
							paging = data.paging;
							$('.reviewListCont').empty();
							$('#reviewPaging').empty();
							if (itemList.length == 0) {
								$('.reviewListCont').append('등록된 리뷰가 없습니다.');
							} else { // 데이터가있으면 목록을 each로 반복
								$('#reviewcount').empty();
								$('#reviewcount').append(
										'(' + paging.totalCount + ')');
								$('#reviewcount2').empty();
								$('#reviewcount2').append(paging.totalCount);
								$('#averagerating').empty();
								$('#averagerating')
										.append(paging.averagerating);

								$(".totalStar").rateYo({
									rating : paging.averagerating,
									halfStar : true,
									starWidth : "30px",
									normalFill : "#cccccc",
									ratedFill : "#f16728",
									readOnly : true
								});
								_
										.each(
												itemList,
												function(item) {
													var reviewimagelist = '';
													if ($.trim(item.imageList)) {
														for (var i = 0; i < item.imageList.length; i++) {
															reviewimagelist += '<a href="javascript:void(0)"><img src="'
																	+ item.imageList[i].imagefilepath
																	+ '" /></a>';
														}
													}
													var reply = '';
													var replybutton = '';
													if ($.trim(item.reply)) {
														reply = '<li>'
																+ '<p class="t01">작성자 : '
																+ item.replyername
																+ '</p>'
																+ '<p class="t02">'
																+ item.replyhtml
																+ '</p>';
														if (item.replyowner == 2) {
															reply += '<p class="t03">※이 답변은 호스트의 주관적인 의견으로 "조이페스타"의 의견과 일치하지 않을 수 있습니다.</p>';
														}
														if (ownerflag == 'Y'
																&& item.replyowner == 2) {
															reply = reply
																	+ '<div class="host_btn">'
																	+ '<a href="javascript:void(0)" onclick="$.showReviewReplyEditForm('
																	+ item.reviewseq
																	+ ');">수정</a><a href="javascript:void(0)" onclick="$.deleteReviewReply('
																	+ item.reviewseq
																	+ ', '
																	+ currentPage
																	+ ', \''
																	+ sort
																	+ '\', '
																	+ spottype
																	+ ', '
																	+ spotseq
																	+ ', \''
																	+ ownerflag
																	+ '\');">삭제</a></div>'
																	+ '<div class="host_reply_modify" id="reviewreplyeditform_'
																	+ item.reviewseq
																	+ '" style="display: none;">'
																	+ '<textarea id="reviewreplyedit_'
																	+ item.reviewseq
																	+ '">'
																	+ item.reply
																	+ '</textarea>'
																	+ '<div class="host_btn2">'
																	+ '<a href="javascript:void(0)" onclick="$.editReviewReply('
																	+ currentPage
																	+ ', \''
																	+ sort
																	+ '\', \''
																	+ item.spottype
																	+ '\', '
																	+ item.spotseq
																	+ ', '
																	+ item.reviewseq
																	+ ', \''
																	+ ownerflag
																	+ '\');">수정완료</a>'
																	+ '</div>'
																	+ '</div>';
														}
														reply += '</li>';
													} else {
														if (ownerflag == 'Y') {
															replybutton = '<div class="host_btn"><a href="javascript:$.showReviewReplyForm('
																	+ item.reviewseq
																	+ ');">답변</a></div>';
														}
													}
													var reviewedit = '';
													var reviewdelete = '';
													if (item.myreviewflag == 'Y') {
														reviewedit = '<a href="javascript:void(0)" onclick="$.editReviewForm('
																+ item.reviewseq
																+ ', '
																+ currentPage
																+ ', \''
																+ sort
																+ '\');">수정</a>';
														reviewdelete = '<a href="javascript:void(0)" onclick="$.deleteReview('
																+ item.reviewseq
																+ ', '
																+ currentPage
																+ ', \''
																+ sort
																+ '\', '
																+ spottype
																+ ', '
																+ spotseq
																+ ', \''
																+ ownerflag
																+ '\');">삭제</a>';
													}
													var bgcolor = 'fff';
													if (item.reviewhelpflag == 'Y') {
														bgcolor = 'cbd1f2';
													}
													$('.reviewListCont')
															.append(
																	'<li>'
																			+ '<div class="info">'
																			+ '<span class="name">작성자:'
																			+ item.membername
																			+ '</span>'
																			+ '<div id="rateYo_'
																			+ item.reviewseq
																			+ '" class="starEach" data-rating="'
																			+ item.rating
																			+ '"></div>'
																			+ '<div class="btn">'
																			+ reviewedit
																			+ reviewdelete
																			+ '</div>'
																			+ '<div class="support">'
																			+ '<span class="date">'
																			+ item.registerdate
																			+ '</span> <span class="aid"><strong>'
																			+ item.reviewhelpcount
																			+ '</strong>명에게 도움됨</span>'
																			+ '</div></div>'
																			+ '<div class="reviewImgList">'
																			+ reviewimagelist
																			+ '</div>'
																			+ '<div class="cont">'
																			+ item.content
																			+ '</div>'
																			+ '<div class="etc">'
																			+ '<span>이 리뷰가 도움 되셨나요?</span>'
																			+ '<a href="javascript:void(0)" class="good" id="reviewhelp_'
																			+ item.reviewseq
																			+ '" style="background:#'
																			+ bgcolor
																			+ ' url(/include/img/bg/bg_good.png) no-repeat 5px 4px;" onclick="$.reviewHelp('
																			+ item.reviewseq
																			+ ');">도움됐어요</a>'
																			+ replybutton
																			+ '</div>'

																			+ '<div id="reviewreplyform_'
																			+ item.reviewseq
																			+ '" class="replyWrite" style="display: none;">'
																			+ '<textarea id="reviewreply_'
																			+ item.reviewseq
																			+ '"></textarea>'
																			+ '<div class="host_btn"><a href="javascript:void(0)" onclick="$.registerReviewReply('
																			+ currentPage
																			+ ', \''
																			+ sort
																			+ '\', \''
																			+ item.spottype
																			+ '\', '
																			+ item.spotseq
																			+ ', '
																			+ item.reviewseq
																			+ ', \''
																			+ ownerflag
																			+ '\');">답변등록</a></div></div>'

																			+ '<ul class="replyList">'
																			+ reply
																			+ '</ul></li>');
													$(
															"#rateYo_"
																	+ item.reviewseq)
															.rateYo(
																	{
																		rating : item.rating,
																		halfStar : true,
																		starWidth : "20px",
																		normalFill : "#cccccc",
																		ratedFill : "#faa41a",
																		readOnly : true
																	});
												});
								// 이부분이 페이징처리
								if (paging.page != 1) {
									$('#reviewPaging')
											.append(
													'<a href="javascript:$.getReviewList(1, "'
															+ sort
															+ '", '
															+ spottype
															+ ', '
															+ spotseq
															+ ', "'
															+ ownerflag
															+ '");" class="first"></a>'); // 첫페이지로가는버튼
									// 활성화
								} else {
									$('#reviewPaging')
											.append(
													'<a href="javascript:void(0);" class="first"></a>'); // 첫페이지로가는버튼
									// 비활성화
								}
								if (paging.block != 1) { // 첫번째 블럭이 아니면
									$('#reviewPaging')
											.append(
													'<a href="javascript:$.getReviewList('
															+ (Number(paging.startPage) - Number(1))
															+ ', "'
															+ sort
															+ '", '
															+ spottype
															+ ', '
															+ spotseq
															+ ', "'
															+ ownerflag
															+ '");" class="prev"></a>'); // 뒤로가기버튼
									// 활성화
								} else {
									$('#reviewPaging')
											.append(
													'<a href="javascript:void(0);" class="prev">1</a>'); // 뒤로가기버튼
									// 비활성화
								}
								for (var i = paging.startPage; i <= paging.endPage; i++) { // 시작페이지부터
									// 종료페이지까지
									// 반복문
									if (paging.page == i) { // 현재페이지가 반복중인 페이지와
										// 같다면
										$('#reviewPaging').append(
												'<a href="javascript:void(0);" class="on">'
														+ i + '</a>'); // 버튼
										// 비활성화
									} else {
										$('#reviewPaging').append(
												'<a href="javascript:$.getReviewList('
														+ i + ', "' + sort
														+ '", ' + spottype
														+ ', ' + spotseq
														+ ', "' + ownerflag
														+ '");">' + i + '</a>'); // 버튼
										// 활성화
									}
								}
								if (paging.block < paging.totalBlock) { // 전체페이지블럭수가
									// 현재블럭수보다
									// 작을때
									$('#reviewPaging')
											.append(
													'<a href="javascript:$.getReviewList('
															+ (Number(paging.endPage) + Number(1))
															+ ', "'
															+ sort
															+ '", '
															+ spottype
															+ ', '
															+ spotseq
															+ ', "'
															+ ownerflag
															+ '");" class="next"></a>'); // 다음페이지버튼
									// 활성화
								} else {
									$('#reviewPaging')
											.append(
													'<a href="javascript:void(0);" class="next"></a>'); // 다음페이지버튼
									// 비활성화
								}
								if (paging.page < paging.totalPage) { // 현재페이지가
									// 전체페이지보다
									// 작을때
									$('#reviewPaging').append(
											'<a href="javascript:$.getReviewList('
													+ paging.totalPage + ', "'
													+ sort + '", ' + spottype
													+ ', ' + spotseq + ', "'
													+ ownerflag
													+ '");" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 활성화
								} else {
									$('#reviewPaging')
											.append(
													'<a href="javascript:void(0);" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 비활성화
								}
							}
						} else {
							alert(data.resultmessage);
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						// alert(textStatus);
					}
				});
	}

	$.showReviewReplyForm = function(reviewseq) {

	}

	$.showQnaReplyForm = function(qnaseq) {

	}

	$.showReviewReplyEditForm = function(reviewseq) {
		if ($('#reviewreplyeditform_' + reviewseq).attr('style') == 'display: none;') {
			$('#reviewreplyeditform_' + reviewseq).show();
		} else {
			$('#reviewreplyeditform_' + reviewseq).hide();
		}
	}

	$.showQnaReplyEditForm = function(qnaseq) {
		if ($('#qnareplyeditform_' + qnaseq).attr('style') == 'display: none;') {
			$('#qnareplyeditform_' + qnaseq).show();
		} else {
			$('#qnareplyeditform_' + qnaseq).hide();
		}
	}

	$.registerReviewReply = function(currentPage, sort, spottype, spotseq,
			reviewseq, ownerflag) {
		resetCommonDialog();
		indicatorOn();
		$.ajax({
			url : 'JSONSpotReviewReplyRegister.festa',
			type : 'POST',
			data : {
				spottype : spottype,
				spotseq : spotseq,
				reviewseq : reviewseq,
				reply : $('#reviewreply_' + reviewseq).val()
			},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
				indicatorOff();
				if (data.resultcode == 0) {
					$('#dialogtitle').append('리뷰답변 등록');
					$('#dialogcontent').append('리뷰답변 등록처리가 완료되었습니다.');
					$('#commondialog').show();
					$.getReviewList(currentPage, sort, spottype, spotseq,
							ownerflag);
				} else {
					$('#dialogtitle').append('리뷰답변 등록');
					$('#dialogcontent').append(data.resultmessage);
					$('#commondialog').show();
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				indicatorOff();
				$('#dialogtitle').append('리뷰답변 등록');
				$('#dialogcontent').append(textStatus);
				$('#commondialog').show();
			}
		});
	}
	$.registerQnaReply = function(currentPage, spottype, spotseq, qnaseq,
			ownerflag) {
		resetCommonDialog();
		indicatorOn();
		$
				.ajax({
					url : 'JSONSpotQnaReplyRegister.festa',
					type : 'POST',
					data : {
						spottype : spottype,
						spotseq : spotseq,
						qnaseq : qnaseq,
						reply : $('#qnareplyregister_' + qnaseq).val()
					},
					dataType : 'json',
					success : function(data, textStatus, jqXHR) {
						indicatorOff();
						if (data.resultcode == 0) {
							$('#dialogtitle').append('문의답변 등록');
							$('#dialogcontent').append('문의답변 등록처리가 완료되었습니다.');
							$('#commondialog').show();
							$.getSpotQnaList(currentPage, spottype, spotseq,
									ownerflag);
						} else {
							$('#dialogtitle').append('문의답변 등록');
							$('#dialogcontent').append(data.resultmessage);
							$('#commondialog').show();
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						indicatorOff();
						$('#dialogtitle').append('문의답변 등록');
						$('#dialogcontent').append(textStatus);
						$('#commondialog').show();
					}
				});
	}

	$.editReviewReply = function(currentPage, sort, spottype, spotseq,
			reviewseq, ownerflag) {
		resetCommonDialog();
		indicatorOn();
		$.ajax({
			url : 'JSONSpotReviewReplyRegister.festa',
			type : 'POST',
			data : {
				spottype : spottype,
				spotseq : spotseq,
				reviewseq : reviewseq,
				reply : $('#reviewreplyedit_' + reviewseq).val()
			},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
				indicatorOff();
				if (data.resultcode == 0) {
					$('#dialogtitle').append('리뷰답변 수정');
					$('#dialogcontent').append('리뷰답변 수정처리가 완료되었습니다.');
					$('#commondialog').show();
					$.getReviewList(currentPage, sort, spottype, spotseq,
							ownerflag);
				} else {
					$('#dialogtitle').append('리뷰답변 수정');
					$('#dialogcontent').append(data.resultmessage);
					$('#commondialog').show();
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				indicatorOff();
				$('#dialogtitle').append('리뷰답변 수정');
				$('#dialogcontent').append(textStatus);
				$('#commondialog').show();
			}
		});
	}

	$.editQnaReply = function(currentPage, spottype, spotseq, qnaseq, ownerflag) {
		resetCommonDialog();
		indicatorOn();
		$
				.ajax({
					url : 'JSONSpotQnaReplyRegister.festa',
					type : 'POST',
					data : {
						spottype : spottype,
						spotseq : spotseq,
						qnaseq : qnaseq,
						reply : $('#qnareplyedit_' + qnaseq).val()
					},
					dataType : 'json',
					success : function(data, textStatus, jqXHR) {
						indicatorOff();
						if (data.resultcode == 0) {
							$('#dialogtitle').append('문의답변 수정');
							$('#dialogcontent').append('문의답변 수정처리가 완료되었습니다.');
							$('#commondialog').show();
							$.getSpotQnaList(currentPage, spottype, spotseq,
									ownerflag);
						} else {
							$('#dialogtitle').append('문의답변 수정');
							$('#dialogcontent').append(data.resultmessage);
							$('#commondialog').show();
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						indicatorOff();
						$('#dialogtitle').append('문의답변 수정');
						$('#dialogcontent').append(textStatus);
						$('#commondialog').show();
					}
				});
	}

	$.editReviewForm = function(reviewseq, currentPage, sort) {
		resetCommonDialog();
		indicatorOn();
		$
				.ajax({
					url : 'JSONSpotReviewInfo.festa',
					type : 'POST',
					data : {
						reviewseq : reviewseq
					},
					dataType : 'json',
					success : function(data, textStatus, jqXHR) {
						indicatorOff();
						if (data.resultcode == 0) {
							$('#revieweditcontent')
									.val(data.reviewInfo.content);

							$("#rateYoreviewedit").rateYo({
								rating : data.reviewInfo.rating,
								halfStar : true,
								starWidth : "20px",
								normalFill : "#cccccc",
								ratedFill : "#faa41a"
							});

							$('#revieweditrating').html(
									'(' + data.reviewInfo.rating + ')');

							if ($.trim(data.reviewInfo.imageList)) {
								for (var i = 0; i < data.reviewInfo.imageList.length; i++) {
									$("#sortableedit")
											.append(
													'<li id="'
															+ data.reviewInfo.imageList[i].imagefilepath
															+ '" name="editimage_'
															+ editimageindex
															+ '">'
															+ '<img src="'
															+ data.reviewInfo.imageList[i].imagefilepath
															+ '" /><a href="javascript:void(0)" onclick="javascript:$.deleteReviewEditImage(\'editimage_'
															+ editimageindex
															+ '\');" class="del"><img src="/include/img/ico/ico_close01.png" style="vertical-align: top;" /></a></li>');
									editimageindex++;
								}
								$('#revieweditimagefilepath').val(
										$('#sortableedit').sortable('toArray')
												.toString());
							}
							$('#reviewseq').val(reviewseq);
							$('#currentPage').val(currentPage);
							$('#sort').val(sort);
							$('#revieweditform').show();
						} else {
							$('#dialogtitle').append('리뷰수정');
							$('#dialogcontent').append(
									data.reviewInfo.resultmessage);
							$('#commondialog').show();
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						indicatorOff();
						$('#dialogtitle').append('리뷰수정');
						$('#dialogcontent').append(textStatus);
						$('#commondialog').show();
					}
				});

	}

	$.deleteReview = function(reviewseq, currentPage, sort, spottype, spotseq,
			ownerflag) {
		resetCommonDialog();
		indicatorOn();
		$.ajax({
			url : 'JSONSpotReviewDelete.festa',
			type : 'POST',
			data : {
				reviewseq : reviewseq
			},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
				indicatorOff();
				if (data.resultcode == 0) {
					$('#dialogtitle').append('리뷰삭제');
					$('#dialogcontent').append('리뷰삭제처리가 완료되었습니다.');
					$('#commondialog').show();
					$.getReviewList(currentPage, sort, spottype, spotseq,
							ownerflag);
				} else {
					$('#dialogtitle').append('리뷰삭제');
					$('#dialogcontent').append(data.resultmessage);
					$('#commondialog').show();
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				indicatorOff();
				$('#dialogtitle').append('리뷰삭제');
				$('#dialogcontent').append(textStatus);
				$('#commondialog').show();
			}
		});
	}

	$.deleteReviewReply = function(reviewseq, currentPage, sort, spottype,
			spotseq, ownerflag) {
		if (confirm('리뷰답변을 삭제하시겠습니까?')) {
			resetCommonDialog();
			indicatorOn();
			$.ajax({
				url : 'JSONSpotReviewReplyDelete.festa',
				type : 'POST',
				data : {
					spottype : spottype,
					spotseq : spotseq,
					reviewseq : reviewseq
				},
				dataType : 'json',
				success : function(data, textStatus, jqXHR) {
					indicatorOff();
					if (data.resultcode == 0) {
						$('#dialogtitle').append('리뷰답변삭제');
						$('#dialogcontent').append('리뷰답변삭제처리가 완료되었습니다.');
						$('#commondialog').show();
						$.getReviewList(currentPage, sort, spottype, spotseq,
								ownerflag);
					} else {
						$('#dialogtitle').append('리뷰답변삭제');
						$('#dialogcontent').append(data.resultmessage);
						$('#commondialog').show();
					}
				},
				error : function(jqXHR, textStatus, errorThrown) {
					indicatorOff();
					$('#dialogtitle').append('리뷰답변삭제');
					$('#dialogcontent').append(textStatus);
					$('#commondialog').show();
				}
			});
		}
	}

	$.deleteQnaReply = function(qnaseq, currentPage, spottype, spotseq,
			ownerflag) {
		if (confirm('문의답변을 삭제하시겠습니까?')) {
			resetCommonDialog();
			indicatorOn();
			$.ajax({
				url : 'JSONSpotQnaReplyDelete.festa',
				type : 'POST',
				data : {
					spottype : spottype,
					spotseq : spotseq,
					qnaseq : qnaseq
				},
				dataType : 'json',
				success : function(data, textStatus, jqXHR) {
					indicatorOff();
					if (data.resultcode == 0) {
						$('#dialogtitle').append('문의답변삭제');
						$('#dialogcontent').append('문의답변 삭제처리가 완료되었습니다.');
						$('#commondialog').show();
						$.getSpotQnaList(currentPage, spottype, spotseq,
								ownerflag);
					} else {
						$('#dialogtitle').append('문의답변삭제');
						$('#dialogcontent').append(data.resultmessage);
						$('#commondialog').show();
					}
				},
				error : function(jqXHR, textStatus, errorThrown) {
					indicatorOff();
					$('#dialogtitle').append('문의답변삭제');
					$('#dialogcontent').append(textStatus);
					$('#commondialog').show();
				}
			});
		}
	}

	$.deleteReviewImage = function(name) {
		$('[name="' + name + '"]').remove();
		var productOrder = $('#sortable').sortable('toArray').toString();
		$('#imagefilepath').val(productOrder);
	}

	$.deleteReviewEditImage = function(name) {
		$('[name="' + name + '"]').remove();
		var productOrder = $('#sortableedit').sortable('toArray').toString();
		$('#revieweditimagefilepath').val(productOrder);
	}

	$.reviewHelp = function(reviewseq) {
		resetCommonDialog();
		indicatorOn();
		var reviewhelpflag = 'N';
		var style = 'background:#cbd1f2 url(/include/img/bg/bg_good.png) no-repeat 5px 4px;';
		if ($('#reviewhelp_' + reviewseq).attr('style') == 'background:#cbd1f2 url(/include/img/bg/bg_good.png) no-repeat 5px 4px;') {
			reviewhelpflag = 'Y';
			style = 'background:#fff url(/include/img/bg/bg_good.png) no-repeat 5px 4px;';
		}
		$.ajax({
			url : 'JSONSpotReviewHelp.festa',
			type : 'POST',
			data : {
				reviewseq : reviewseq,
				reviewhelpflag : reviewhelpflag
			},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
				indicatorOff();
				if (data.resultcode == 0) {
					$('#reviewhelp_' + reviewseq).attr('style', style);
				} else {
					$('#dialogtitle').append('리뷰');
					$('#dialogcontent').append(data.resultmessage);
					$('#commondialog').show();
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				indicatorOff();
				$('#dialogtitle').append('리뷰');
				$('#dialogcontent').append(textStatus);
				$('#commondialog').show();
			}
		});
	}

	$.getHostPageSpotList = function(currentPage, hosttype, hostseq) {
		$
				.ajax({
					url : 'JSONHostPageSpotList.festa',
					type : 'POST',
					data : {
						currentPage : currentPage,
						hosttype : hosttype,
						hostseq : hostseq
					},
					dataType : 'json',
					success : function(data, textStatus, jqXHR) {
						if (data.resultcode == 0) {
							var itemList = data.itemList;
							paging = data.paging;
							$('#hostspotlist').empty();
							$('#hostspotpaging').empty();
							if (itemList.length == 0) {
								$('#hostspotlist').append('등록된 스팟정보가 없습니다.');
							} else { // 데이터가있으면 목록을 each로 반복
								_
										.each(
												itemList,
												function(item) {
													var hashtags = '';
													for (var j = 0; j < item.hashtaglist.length; j++) {
														hashtags += '#'
																+ item.hashtaglist[j].hashtag
																+ ' ';
													}
													var datetime = '';
													if (item.spottype == 3) {
														datetime = item.startdate
																+ '~'
																+ item.enddate;
													} else {
														if (item.opentime != '00:00'
																&& item.closetime != '00:00') {
															datetime = item.opentime
																	+ '~'
																	+ item.closetime;
														} else {
															datetime = '&nbsp;';
														}
													}
													var spottype = item.spottype;
													var linkurl = '';
													if (spottype == 1) {
														linkurl = 'MarketDetail.festa?marketseq=';
													} else if (spottype == 2) {
														linkurl = 'StoreDetail.festa?storeseq=';
													} else if (spottype == 3) {
														linkurl = 'FestivalDetail.festa?festivalseq=';
													}
													$('#hostspotlist')
															.append(
																	'<li><a href="'
																			+ linkurl
																			+ item.spotseq
																			+ '" class="pic">'
																			+ '<img src="'
																			+ item.mainimagefilepath
																			+ '" maxwidth="120px" /></a>'
																			+ '<div class="cont">'
																			+ '<p class="t01">'
																			+ item.title
																			+ '</p>'
																			+ '<div class="t02">'
																			+ '<span class="date">'
																			+ datetime
																			+ '</span> <span class="gps">'
																			+ item.roadaddress
																			+ '</span>'
																			+ '</div>'
																			+ '<p class="t03">'
																			+ item.description
																					.substr(
																							0,
																							10)
																			+ '</p>'
																			+ '<p class="t04">'
																			+ hashtags
																			+ '</p>'
																			+ '</div></li>'

															);
												});
								// 이부분이 페이징처리
								if (paging.page != 1) {
									$('#blogPaging')
											.append(
													'<a href="javascript:$.getHostPageSpotList(1, \''
															+ hosttype
															+ '\', \''
															+ hostseq
															+ '\');" class="first"></a>'); // 첫페이지로가는버튼
									// 활성화
								} else {
									$('#blogPaging')
											.append(
													'<a href="javascript:void(0);" class="first"></a>'); // 첫페이지로가는버튼
									// 비활성화
								}
								if (paging.block != 1) { // 첫번째 블럭이 아니면
									$('#blogPaging')
											.append(
													'<a href="javascript:$.getHostPageSpotList('
															+ (Number(paging.startPage) - Number(1))
															+ ', \''
															+ hosttype
															+ '\', \''
															+ hostseq
															+ '\');" class="prev"></a>'); // 뒤로가기버튼
									// 활성화
								} else {
									$('#blogPaging')
											.append(
													'<a href="javascript:void(0);" class="prev">1</a>'); // 뒤로가기버튼
									// 비활성화
								}
								for (var i = paging.startPage; i <= paging.endPage; i++) { // 시작페이지부터
									// 종료페이지까지
									// 반복문
									if (paging.page == i) { // 현재페이지가 반복중인 페이지와
										// 같다면
										$('#blogPaging').append(
												'<a href="javascript:void(0);" class="on">'
														+ i + '</a>'); // 버튼
										// 비활성화
									} else {
										$('#blogPaging')
												.append(
														'<a href="javascript:$.getHostPageSpotList('
																+ i + ', \''
																+ hosttype
																+ '\', \''
																+ hostseq
																+ '\');">' + i
																+ '</a>'); // 버튼
										// 활성화
									}
								}
								if (paging.block < paging.totalBlock) { // 전체페이지블럭수가
									// 현재블럭수보다
									// 작을때
									$('#blogPaging')
											.append(
													'<a href="javascript:$.getHostPageSpotList('
															+ (Number(paging.endPage) + Number(1))
															+ ', \''
															+ hosttype
															+ '\', \''
															+ hostseq
															+ '\');" class="next"></a>'); // 다음페이지버튼
									// 활성화
								} else {
									$('#blogPaging')
											.append(
													'<a href="javascript:void(0);" class="next"></a>'); // 다음페이지버튼
									// 비활성화
								}
								if (paging.page < paging.totalPage) { // 현재페이지가
									// 전체페이지보다
									// 작을때
									$('#blogPaging')
											.append(
													'<a href="javascript:$.getHostPageSpotList('
															+ paging.totalPage
															+ ', \''
															+ hosttype
															+ '\', \''
															+ hostseq
															+ '\');" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 활성화
								} else {
									$('#blogPaging')
											.append(
													'<a href="javascript:void(0);" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 비활성화
								}
							}
						} else {
							alert(data.resultmessage);
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						// alert(textStatus);
					}
				});
	}

	$.getSpotBlogList = function(currentPage, query) {
		$
				.ajax({
					url : 'JSONSpotBlogList.festa',
					type : 'POST',
					data : {
						currentPage : currentPage,
						query : query
					},
					dataType : 'json',
					success : function(data, textStatus, jqXHR) {
						if (data.resultcode == 0) {
							var itemList = data.itemList;
							paging = data.paging;
							$('.blogList').empty();
							$('#blogPaging').empty();
							if (itemList.length == 0) {
								$('.blogList').append('관련 블로그가 없습니다.');
							} else { // 데이터가있으면 목록을 each로 반복
								_
										.each(
												itemList,
												function(item) {
													$('.blogList')
															.append(
																	'<li><div class="cont">'
																			+ '<a href="'
																			+ item.link
																			+ '" target="_blank" class="t01">'
																			+ item.title
																			+ '</a>'
																			+ '<p class="t02">'
																			+ item.description
																			+ '</p>'
																			+ '<div class="t03">'
																			+ '<span class="addr"><a href="'
																			+ item.link
																			+ '" target="_blank">'
																			+ item.link
																			+ '</a></span>'
																			+ '<span class="subj"><a href="'
																			+ item.bloggerlink
																			+ '" target="_blank">'
																			+ item.bloggername
																			+ '</a></span>'
																			+ '</div><span class="date">'
																			+ item.postdate
																			+ '</span>'
																			+ '</div></li>');
												});
								// 이부분이 페이징처리
								if (paging.page != 1) {
									$('#blogPaging')
											.append(
													'<a href="javascript:$.getSpotBlogList(1, \''
															+ query
															+ '\');" class="first"></a>'); // 첫페이지로가는버튼
									// 활성화
								} else {
									$('#blogPaging')
											.append(
													'<a href="javascript:void(0);" class="first"></a>'); // 첫페이지로가는버튼
									// 비활성화
								}
								if (paging.block != 1) { // 첫번째 블럭이 아니면
									$('#blogPaging')
											.append(
													'<a href="javascript:$.getSpotBlogList('
															+ (Number(paging.startPage) - Number(1))
															+ ', \''
															+ query
															+ '\');" class="prev"></a>'); // 뒤로가기버튼
									// 활성화
								} else {
									$('#blogPaging')
											.append(
													'<a href="javascript:void(0);" class="prev">1</a>'); // 뒤로가기버튼
									// 비활성화
								}
								for (var i = paging.startPage; i <= paging.endPage; i++) { // 시작페이지부터
									// 종료페이지까지
									// 반복문
									if (paging.page == i) { // 현재페이지가 반복중인 페이지와
										// 같다면
										$('#blogPaging').append(
												'<a href="javascript:void(0);" class="on">'
														+ i + '</a>'); // 버튼
										// 비활성화
									} else {
										$('#blogPaging')
												.append(
														'<a href="javascript:$.getSpotBlogList('
																+ i + ', \''
																+ query
																+ '\');">' + i
																+ '</a>'); // 버튼
										// 활성화
									}
								}
								if (paging.block < paging.totalBlock) { // 전체페이지블럭수가
									// 현재블럭수보다
									// 작을때
									$('#blogPaging')
											.append(
													'<a href="javascript:$.getSpotBlogList('
															+ (Number(paging.endPage) + Number(1))
															+ ', \''
															+ query
															+ '\');" class="next"></a>'); // 다음페이지버튼
									// 활성화
								} else {
									$('#blogPaging')
											.append(
													'<a href="javascript:void(0);" class="next"></a>'); // 다음페이지버튼
									// 비활성화
								}
								if (paging.page < paging.totalPage) { // 현재페이지가
									// 전체페이지보다
									// 작을때
									$('#blogPaging')
											.append(
													'<a href="javascript:$.getSpotBlogList('
															+ paging.totalPage
															+ ', \''
															+ query
															+ '\');" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 활성화
								} else {
									$('#blogPaging')
											.append(
													'<a href="javascript:void(0);" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 비활성화
								}
							}
						} else {
							alert(data.resultmessage);
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						// alert(textStatus);
					}
				});
	}

	$.getSpotNewsList = function(currentPage, query) {
		$
				.ajax({
					url : 'JSONSpotNewsList.festa',
					type : 'POST',
					data : {
						currentPage : currentPage,
						query : query
					},
					dataType : 'json',
					success : function(data, textStatus, jqXHR) {
						if (data.resultcode == 0) {
							var itemList = data.itemList;
							paging = data.paging;
							$('.paperList').empty();
							$('#paperPaging').empty();
							if (itemList.length == 0) {
								$('.paperList').append('관련기사 없습니다.');
							} else { // 데이터가있으면 목록을 each로 반복
								_
										.each(
												itemList,
												function(item) {
													var link = item.originallink;
													if (link == null
															|| link == '') {
														link = item.link;
													}
													$('.paperList')
															.append(
																	'<li><a href="'
																			+ link
																			+ '" target="_blank" title="'
																			+ item.description
																			+ '">'
																			+ item.title
																			+ '</a>'
																			+ '<div class="etc"><span class="date">'
																			+ item.pubDate
																			+ '</span></div></li>');
												});
								// 이부분이 페이징처리
								if (paging.page != 1) {
									$('#paperPaging')
											.append(
													'<a href="javascript:$.getSpotNewsList(1, \''
															+ query
															+ '\');" class="first"></a>'); // 첫페이지로가는버튼
									// 활성화
								} else {
									$('#paperPaging')
											.append(
													'<a href="javascript:void(0);" class="first"></a>'); // 첫페이지로가는버튼
									// 비활성화
								}
								if (paging.block != 1) { // 첫번째 블럭이 아니면
									$('#paperPaging')
											.append(
													'<a href="javascript:$.getSpotNewsList('
															+ (Number(paging.startPage) - Number(1))
															+ ', \''
															+ query
															+ '\');" class="prev"></a>'); // 뒤로가기버튼
									// 활성화
								} else {
									$('#paperPaging')
											.append(
													'<a href="javascript:void(0);" class="prev">1</a>'); // 뒤로가기버튼
									// 비활성화
								}
								for (var i = paging.startPage; i <= paging.endPage; i++) { // 시작페이지부터
									// 종료페이지까지
									// 반복문
									if (paging.page == i) { // 현재페이지가 반복중인 페이지와
										// 같다면
										$('#paperPaging').append(
												'<a href="javascript:void(0);" class="on">'
														+ i + '</a>'); // 버튼
										// 비활성화
									} else {
										$('#paperPaging')
												.append(
														'<a href="javascript:$.getSpotNewsList('
																+ i + ', \''
																+ query
																+ '\');">' + i
																+ '</a>'); // 버튼
										// 활성화
									}
								}
								if (paging.block < paging.totalBlock) { // 전체페이지블럭수가
									// 현재블럭수보다
									// 작을때
									$('#paperPaging')
											.append(
													'<a href="javascript:$.getSpotNewsList('
															+ (Number(paging.endPage) + Number(1))
															+ ', \''
															+ query
															+ '\');" class="next"></a>'); // 다음페이지버튼
									// 활성화
								} else {
									$('#paperPaging')
											.append(
													'<a href="javascript:void(0);" class="next"></a>'); // 다음페이지버튼
									// 비활성화
								}
								if (paging.page < paging.totalPage) { // 현재페이지가
									// 전체페이지보다
									// 작을때
									$('#paperPaging')
											.append(
													'<a href="javascript:$.getSpotNewsList('
															+ paging.totalPage
															+ ', \''
															+ query
															+ '\');" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 활성화
								} else {
									$('#paperPaging')
											.append(
													'<a href="javascript:void(0);" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 비활성화
								}
							}
						} else {
							alert(data.resultmessage);
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						// alert(textStatus);
					}
				});
	}

	$.getSpotQnaList = function(currentPage, spottype, spotseq, ownerflag) {
		var pageSize = 10;
		$
				.ajax({
					url : 'JSONSpotQnaList.festa',
					type : 'POST',
					data : {
						pageSize : pageSize,
						currentPage : currentPage,
						spottype : spottype,
						spotseq : spotseq
					},
					dataType : 'json',
					success : function(data, textStatus, jqXHR) {
						if (data.resultcode == 0) {
							var itemList = data.itemList;
							paging = data.paging;
							$('.listTable01').empty();
							$('#qnaPaging').empty();
							if (itemList.length == 0) {
								$('.listTable01').append('등록된 Q&A가 없습니다.');
							} else { // 데이터가있으면 목록을 each로 반복
								$('.listTable01')
										.append(
												'<colgroup><col width="40" class="mhidden" /><col width="90" /><col width="" /><col width="55" /><col width="100" class="mhidden" /></colgroup>'
														+ '<tr class="mhidden"><th class="mhidden">번호</th><th>상태</th><th>제목</th><th>작성자</th><th>작성일</th></tr>');
								_
										.each(
												itemList,
												function(item, index) {
													var listno = paging.totalCount
															- index
															- (currentPage - 1)
															* pageSize;
													var replystatus = '<span class="wait">답변대기</span>';
													var replycontent = '';
													var replybutton = '';
													var replyform = '';
													if (item.replyflag == 'Y') {
														replystatus = '<span class="confirm rd">답변완료</span>';
														replycontent = '<dd>'
																+ '<p class="tit">[답변내용]</p><p class="desc">'
																+ item.replyhtml
																+ '</p>';
														if (item.replyowner == 2) {
															replycontent += '<p class="t03">※이 답변은 호스트의 주관적인 의견으로 "조이페스타"의 의견과 일치하지 않을 수 있습니다.</p>';
														}
														if (ownerflag == 'Y'
																&& item.replyowner == 2) { // 스팟
															// 호스트
															replycontent = replycontent
																	+ '<div class="host_btn">'
																	+ '<a href="javascript:void(0)" onclick="$.showQnaReplyEditForm('
																	+ item.qnaseq
																	+ ');">수정</a>'
																	+ '<a href="javascript:void(0)" onclick="$.deleteQnaReply('
																	+ item.qnaseq
																	+ ', '
																	+ currentPage
																	+ ', '
																	+ spottype
																	+ ', '
																	+ spotseq
																	+ ', \''
																	+ ownerflag
																	+ '\');">삭제</a>'
																	+ '</div>'
																	+ '<div class="host_qna_modify" id="qnareplyeditform_'
																	+ item.qnaseq
																	+ '" style="display: none;">'
																	+ '<textarea id="qnareplyedit_'
																	+ item.qnaseq
																	+ '" class="textarea">'
																	+ item.reply
																	+ '</textarea>'
																	+ '<div class="host_btn2">'
																	+ '<a href="javascript:void(0)" onclick="$.editQnaReply('
																	+ currentPage
																	+ ', \''
																	+ item.spottype
																	+ '\', '
																	+ item.spotseq
																	+ ', '
																	+ item.qnaseq
																	+ ', \''
																	+ ownerflag
																	+ '\');">수정완료</a>'
																	+ '</div>'
																	+ '</div>'
														}
														replycontent += '</dd>';
													} else { // 답글이 없을 경우
														if (ownerflag == 'Y') {
															replybutton = '<div class="qnaRe">'
																	+ '<div class="host_btn">'
																	+ '<a href="javascript:$.showQnaReplyForm('
																	+ item.reviewseq
																	+ ');">답변</a>'
																	+ '</div>'
																	+ '</div>';
															replyform = '<div class="qnaRe_write">'
																	+ '<textarea id="qnareplyregister_'
																	+ item.qnaseq
																	+ '" class="textarea"></textarea>'
																	+ '<div class="host_btn">'
																	+ '<a href="javascript:void(0)" onclick="$.registerQnaReply('
																	+ currentPage
																	+ ', \''
																	+ item.spottype
																	+ '\', '
																	+ item.spotseq
																	+ ', '
																	+ item.qnaseq
																	+ ', \''
																	+ ownerflag
																	+ '\');">답변등록</a>'
																	+ '</div>'
																	+ '</div>';
														}
													}

													$('.listTable01')
															.append(
																	'<tr class="item_q"><td class="mhidden">'
																			+ listno
																			+ '</td><td>'
																			+ replystatus
																			+ '</td><td><a href="javascript:void(0)">'
																			+ item.title
																			+ '</a></td><td>'
																			+ item.membername
																			+ '</td><td class="mhidden">'
																			+ item.registerdate
																			+ '</td></tr><tr class="item_a"><td colspan="5"><dl class="cont"><dt>'
																			+ item.content
																			+ replybutton
																			+ replyform
																			+ '</dt>'
																			+ replycontent
																			+ '</dl></td></tr>');
												});
								// 이부분이 페이징처리
								if (paging.page != 1) {
									$('#qnaPaging')
											.append(
													'<a href="javascript:$.getSpotQnaList(1, "'
															+ spottype
															+ '", "'
															+ spotseq
															+ '");" class="first"></a>'); // 첫페이지로가는버튼
									// 활성화
								} else {
									$('#qnaPaging')
											.append(
													'<a href="javascript:void(0);" class="first"></a>'); // 첫페이지로가는버튼
									// 비활성화
								}
								if (paging.block != 1) { // 첫번째 블럭이 아니면
									$('#qnaPaging')
											.append(
													'<a href="javascript:$.getSpotQnaList('
															+ (Number(paging.startPage) - Number(1))
															+ ', "'
															+ spottype
															+ '", "'
															+ spotseq
															+ '");" class="prev"></a>'); // 뒤로가기버튼
									// 활성화
								} else {
									$('#qnaPaging')
											.append(
													'<a href="javascript:void(0);" class="prev">1</a>'); // 뒤로가기버튼
									// 비활성화
								}
								for (var i = paging.startPage; i <= paging.endPage; i++) { // 시작페이지부터
									// 종료페이지까지
									// 반복문
									if (paging.page == i) { // 현재페이지가 반복중인 페이지와
										// 같다면
										$('#qnaPaging').append(
												'<a href="javascript:void(0);" class="on">'
														+ i + '</a>'); // 버튼
										// 비활성화
									} else {
										$('#qnaPaging').append(
												'<a href="javascript:$.getSpotQnaList('
														+ i + ', "' + spottype
														+ '", "' + spotseq
														+ '");">' + i + '</a>'); // 버튼
										// 활성화
									}
								}
								if (paging.block < paging.totalBlock) { // 전체페이지블럭수가
									// 현재블럭수보다
									// 작을때
									$('#qnaPaging')
											.append(
													'<a href="javascript:$.getSpotQnaList('
															+ (Number(paging.endPage) + Number(1))
															+ ', "'
															+ spottype
															+ '", "'
															+ spotseq
															+ '");" class="next"></a>'); // 다음페이지버튼
									// 활성화
								} else {
									$('#qnaPaging')
											.append(
													'<a href="javascript:void(0);" class="next"></a>'); // 다음페이지버튼
									// 비활성화
								}
								if (paging.page < paging.totalPage) { // 현재페이지가
									// 전체페이지보다
									// 작을때
									$('#qnaPaging').append(
											'<a href="javascript:$.getSpotQnaList('
													+ paging.totalPage + ', "'
													+ spottype + '", "'
													+ spotseq
													+ '");" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 활성화
								} else {
									$('#qnaPaging')
											.append(
													'<a href="javascript:void(0);" class="last"></a>'); // 마지막페이지로
									// 가기
									// 버튼
									// 비활성화
								}
							}
						} else {
							/*
							 * $('#dialogtitle').append('에러');
							 * $('#dialogcontent').append(data.resultmessage);
							 * $('#commondialog').show();
							 */
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
					}
				});
	}

	$.updateNearSpotListMap = function(lat, lon) {
		$.ajax({
			url : 'JSONNearSpotListMap.festa',
			type : 'POST',
			data : {
				lat : lat,
				lon : lon,
				distance : $('#distance').val()
			},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
				if (data.resultcode == 0) {
					closeOverlay();
					clusterer.clear();
					var markers = $(data.positions).map(
							function(i, position) {
								var spottype = position.spottype;
								var markerImage = '';
								if (spottype == 1) {
									markerImage = markerImageMarket;
								} else if (spottype == 2) {
									markerImage = markerImageStore;
								} else if (spottype == 3) {
									markerImage = markerImageFestival;
								}
								return new daum.maps.Marker({
									position : new daum.maps.LatLng(
											position.lat, position.lng),
									image : markerImage
								});
							});
					// 인포윈도우 생성
					for (var i = 0; i < data.positions.length; i++) {
						// 마커를 생성합니다
						var marker = markers[i];
						var spot = data.positions[i];

						(function(marker, spot) {
							daum.maps.event.addListener(marker, 'click',
									function() {
										$.displaySpotInfo(spot);
									});
						})(marker, data.positions[i]);
					}

					// 클러스터러에 마커들을 추가합니다
					clusterer.addMarkers(markers);
					// 지도 중심을 이동 시킵니다
					var moveLatLon = new daum.maps.LatLng(lat, lon);
					map.panTo(moveLatLon);
				} else {
					alert(data.resultmessage);
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				// alert(textStatus);
			}
		});
	}

	$.displaySpotInfo = function(spot) {
		var spottype = spot.spottype;
		var linkurl = '';
		if (spottype == 1) {
			linkurl = 'MarketDetail.festa?marketseq=';
		} else if (spottype == 2) {
			linkurl = 'StoreDetail.festa?storeseq=';
		} else if (spottype == 3) {
			linkurl = 'FestivalDetail.festa?festivalseq=';
		}
		var content = '<div class="wrap">' + '    <div class="info">'
				+ '        <div class="title">'
				+ spot.title
				+ '            <div class="close" onclick="closeOverlay()" title="닫기"></div>'
				+ '        </div>'
				+ '        <div class="body">'
				+ '            <div class="img">'
				+ '                <img src="'
				+ spot.mainimagefilepath
				+ '" width="73" height="70">'
				+ '           </div>'
				+ '            <div class="desc">'
				+ '                <div class="ellipsis">'
				+ spot.roadaddress
				+ '</div>'
				+ '                <div class="jibun ellipsis">'
				+ spot.contact
				+ '</div>'
				+ '                <div><a href="'
				+ linkurl
				+ spot.spotseq
				+ '" target="_blank" class="link">상세페이지</a></div>'
				+ '            </div>'
				+ '        </div>'
				+ '    </div>'
				+ '</div>';

		contentNode.innerHTML = content;
		spotOverlay.setPosition(new daum.maps.LatLng(spot.lat, spot.lng));
		spotOverlay.setMap(map);
	}

	$.setBookmark = function(id, spottype, spotseq) {
		resetCommonDialog();
		indicatorOn();
		$.ajax({
			url : 'JSONBookmarkSpot.festa',
			type : 'POST',
			data : {
				spottype : spottype,
				spotseq : spotseq
			},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
				indicatorOff();
				if (data.resultcode == 0) {
					/*
					 * $('#dialogtitle').append('찜하기');
					 * $('#dialogcontent').append('해당 스팟이 찜목록에 등록되었습니다.');
					 * $('#commondialog').show();
					 */
				} else if (data.resultcode == 1) {
					$('#dialogtitle').append('찜하기');
					$('#dialogcontent').append(data.resultmessage);
					$('#commondialog').show();
					var bookmarkclass = id.getAttribute('class');
					if (bookmarkclass == 'btnHart'
							|| bookmarkclass == 'btnHart2') {
						id.setAttribute('class', bookmarkclass + ' on');
					} else {
						id.setAttribute('class', bookmarkclass.split(' ')[0]);
					}
				} else {
					$('#bookmarkdialogcontent').empty().append(
							data.resultmessage);
					$('#bookmarkdialog').show();
					var bookmarkclass = id.getAttribute('class');
					if (bookmarkclass == 'btnHart'
							|| bookmarkclass == 'btnHart2') {
						id.setAttribute('class', bookmarkclass + ' on');
					} else {
						id.setAttribute('class', bookmarkclass.split(' ')[0]);
					}
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				indicatorOff();
				$('#dialogtitle').append('찜하기');
				$('#dialogcontent').append(textStatus);
				$('#commondialog').show();
				var bookmarkclass = id.getAttribute('class');
				if (bookmarkclass == 'btnHart' || bookmarkclass == 'btnHart2') {
					id.setAttribute('class', bookmarkclass + ' on');
				} else {
					id.setAttribute('class', bookmarkclass.split(' ')[0]);
				}
			}
		});
	}

	$.setBookmarkHost = function(id, hostpageseq) {
		resetCommonDialog();
		indicatorOn();
		$.ajax({
			url : 'JSONBookmarkHost.festa',
			type : 'POST',
			data : {
				hostpageseq : hostpageseq
			},
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
				indicatorOff();
				if (data.resultcode == 0) {
					/*
					 * $('#dialogtitle').append('찜하기');
					 * $('#dialogcontent').append('해당 스팟이 찜목록에 등록되었습니다.');
					 * $('#commondialog').show();
					 */
				} else if (data.resultcode == 1) {
					$('#dialogtitle').append('찜하기');
					$('#dialogcontent').append(data.resultmessage);
					$('#commondialog').show();
					var bookmarkclass = id.getAttribute('class');
					if (bookmarkclass == 'btnHart'
							|| bookmarkclass == 'btnHart2') {
						id.setAttribute('class', bookmarkclass + ' on');
					} else {
						id.setAttribute('class', bookmarkclass.split(' ')[0]);
					}
				} else {
					$('#bookmarkdialogcontent').empty().append(
							data.resultmessage);
					$('#bookmarkdialog').show();
					var bookmarkclass = id.getAttribute('class');
					if (bookmarkclass == 'btnHart'
							|| bookmarkclass == 'btnHart2') {
						id.setAttribute('class', bookmarkclass + ' on');
					} else {
						id.setAttribute('class', bookmarkclass.split(' ')[0]);
					}
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				indicatorOff();
				$('#dialogtitle').append('찜하기');
				$('#dialogcontent').append(textStatus);
				$('#commondialog').show();
				var bookmarkclass = id.getAttribute('class');
				if (bookmarkclass == 'btnHart' || bookmarkclass == 'btnHart2') {
					id.setAttribute('class', bookmarkclass + ' on');
				} else {
					id.setAttribute('class', bookmarkclass.split(' ')[0]);
				}
			}
		});
	}

	Kakao.init('565c5e2a6c37d4bf2ff2cf399b5dede9');

	$.share = function(target) {
		var url = $('#textbox-url').val();
		if (target == 'fb') {
			var facebook_share_url = "https://www.facebook.com/sharer/sharer.php?u="
					+ url;
			window.open(facebook_share_url, 'Share on Facebook',
					'scrollbars=no, width=500, height=500');
		} else if (target == 'ka') {
			Kakao.Link.sendDefault({
				objectType : 'feed',
				content : {
					title : $('meta[property="og:title"]').attr('content'),
					description : 'tset',
					imageUrl : $('meta[property="og:image"]').attr('content'),
					link : {
						mobileWebUrl : url,
						webUrl : url
					}
				},
				buttons : [ {
					title : '링크 열기',
					link : {
						mobileWebUrl : url,
						webUrl : url
					}
				} ]
			});
		} else if (target == 'nb') {
			var raw_url = url;
			var raw_title = $('meta[property="og:title"]').attr('content');
			var naver_root_url = "http://share.naver.com/web/shareView.nhn?url="
			var naver_share_url = naver_root_url + encodeURI(raw_url)
					+ "&title=" + encodeURI(raw_title);
			window.open(naver_share_url, 'Share on Naver',
					'scrollbars=no, width=500, height=500');
		} else if (target == 'cb') {
			var urlbox = document.getElementById('textbox-url');
			urlbox.select();
			document.execCommand('copy');
			alert('URL이 복사되었습니다.');
		}
	}

	$.serviceDialog = function(title, content, targeturl) {
		resetCommonDialog();
		$('#dialogtitle').append(title);
		$('#dialogcontent').append(content);
		dialogtargeturl = targeturl;
		$('#commondialog').show();
	}
})(jQuery);
