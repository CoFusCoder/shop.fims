$(function() {

	fnObj.calendar();
	fnObj.common();
	fnObj.gnb();

	$(window).on('load resize', fnObj.resizeTable);

});

fnObj = {
	resizeTable : function() {
		var w = window.innerWidth;
		if (w < 1025) {
			$("#festivalTable .item_a td").attr("colspan", "3");
			$("#qnaTable .item_a td").attr("colspan", "4");
		} else {
			$("#festivalTable .item_a td").attr("colspan", "5");
			$("#qnaTable .item_a td").attr("colspan", "6");
		}
	},
	gnb : function() {
		$("body").on("click", ".totalMenu", function() {
			var ck = $(this).hasClass("on");
			if (ck) {
				$(this).removeClass("on");
				$(".totalBox").removeClass("on");
			} else {
				$(this).addClass("on");
				$(".totalBox").addClass("on");
			}
		});
		$("body").on("click", ".totalBox nav ul li a", function() {
			var ck = $(this).hasClass("on");
			if (ck) {
				$(this).removeClass("on");
				$(this).parents("li").eq(0).removeClass("on");
			} else {
				$(this).addClass("on");
				$(this).parents("li").eq(0).addClass("on");
			}
		});
	},
	common : function() {
		$("body").on("click", ".commCategory a", function() {
			$(".commCategory a").removeClass("on");
			$(this).addClass("on");
		});
		$("body").on("click", ".commTabs a", function() {
			$(".commTabs a").removeClass("on");
			$(this).addClass("on");
		});
		$("body").on("click", ".categoryTabs a", function() {
			$(".categoryTabs a").removeClass("on");
			$(this).addClass("on");
		});
		$("body").on("click", ".categoriList a", function() {
			$(".categoriList a").removeClass("on");
			$(this).addClass("on");
		});
		$("body").on("click", ".dateCategory a", function() {
			$(".dateCategory a").removeClass("on");
			$(this).addClass("on");
		});
		$("body").on("click", ".msTabs a", function() {
			$(".msTabs a").removeClass("on");
			$(this).addClass("on");
			var targetid = $(this).attr("data-id");
			$(".msArea").hide();
			$("#" + targetid).show();
		});
		$("body").on("click", ".myinfoBox .fl ul li a", function() {
			$(".myinfoBox .fl ul li a").removeClass("on");
			$(this).addClass("on");
			var targetid = $(this).parents("li").eq(0).attr("class");
			$("#indi, #host").hide();
			$("#" + targetid).show();
		});
		$("body").on("click", ".popCont .commTabs li a", function() {
			$(".popCont .commTabs li a").removeClass("on");
			$(this).addClass("on");
			var targetid = $(this).parents("li").eq(0).attr("class");
			$("#indi, #host").hide();
			$("#" + targetid).show();
		});
		$("body").on("click", "#chkall", function() {
			var ck = $(this).prop("checked");
			if (ck) {
				$(".myAgreeList dd input").prop("checked", true);
			} else {
				$(".myAgreeList dd input").prop("checked", false);
			}
		});
		// 광고집행신청서작성 신청버튼 2019.05.25
		$("body").on(
				"click",
				".kangoWarp .btnKango a",
				function() {
					var ck = $(this).parents(".kangoWarp").eq(0).hasClass(
							".btnKango a");
					if (!ck) {
						$(".btnKango a").removeClass(".btnKango a");
						$(".kangoConts").stop().slideUp(200);
						$(this).parents(".kangoWarp").eq(0).addClass(
								".btnKango a");
						$(this).parents(".kangoWarp").eq(0).next(".kangoConts")
								.stop().slideDown(200);
					} else {
						$(this).parents(".kangoWarp").eq(0).removeClass(
								".btnKango a");
						$(this).parents(".kangoWarp").eq(0).next(".kangoConts")
								.stop().slideUp(200);
					}
				});
		// 호스트답변글 달기 2019.07.01
		$("body").on(
				"click",
				".etc .host_btn a",
				function() {
					var ck = $(this).parents(".etc").eq(0).hasClass(
							".host_btn a");
					if (!ck) {
						// 개발 수정 2019.07.03
						// $(".host_btn a").removeClass(".host_btn a");
						// $(".replyWrite").stop().slideUp(200);
						$(this).parents(".etc").eq(0).addClass(".host_btn a");
						$(this).parents(".etc").eq(0).next(".replyWrite")
								.stop().slideDown(200);
					} else {
						$(this).parents(".etc").eq(0)
								.removeClass(".host_btn a");
						$(this).parents(".etc").eq(0).next(".replyWrite")
								.stop().slideUp(200);
					}
				});
		$("body").on("click", ".faqList dt a", function() {
			var ck = $(this).parents("dt").eq(0).hasClass("on");
			if (!ck) {
				$(".faqList dt").removeClass("on");
				$(".faqList dd").stop().slideUp(200);
				$(this).parents("dt").eq(0).addClass("on");
				$(this).parents("dt").eq(0).next("dd").stop().slideDown(200);
			} else {
				$(this).parents("dt").eq(0).removeClass("on");
				$(this).parents("dt").eq(0).next("dd").stop().slideUp(200);
			}
		});

		$("body").on("click", ".item_q a", function() {
			var ck = $(this).hasClass("on");
			if (ck) {
				$(this).removeClass("on");
				$(this).parents("tr").eq(0).next(".item_a").removeClass("on");
			} else {
				$(".item_q a").removeClass("on");
				$(".item_a").removeClass("on");
				$(this).addClass("on");
				$(this).parents("tr").eq(0).next(".item_a").addClass("on");

			}
		});
		// 상세QnA 호스트회원 답변달기
		$("body")
				.on(
						"click",
						".qnaRe .host_btn a",
						function() {
							var ck = $(this).parents(".qnaRe").eq(0).hasClass(
									".host_btn a");
							if (!ck) {
								// 개발 수정 2019.07.09
								//$(".host_btn a").removeClass(".host_btn a");
								//$(".qnaRe_write").stop().slideUp(200);
								$(this).parents(".qnaRe").eq(0).addClass(
										".host_btn a");
								$(this).parents(".qnaRe").eq(0).next(
										".qnaRe_write").stop().slideDown(200);
							} else {
								$(this).parents(".qnaRe").eq(0).removeClass(
										".host_btn a");
								$(this).parents(".qnaRe").eq(0).next(
										".qnaRe_write").stop().slideUp(200);
							}
						});
		$("body").on("click", ".btnHart, .btnJjim,.btnHart2", function() {
			var ck = $(this).hasClass("on");
			if (ck) {
				$(this).removeClass("on");
			} else {
				$(this).addClass("on");
			}
		});
		// 검색창클릭시 창 열림 2019.06.03
		$("body").on("click", "#tagSearch", function() {
			var ck = $(this).hasClass("on");
			if (ck) {
				$(this).removeClass("on");
				$(".norSearchBox").hide();
			} else {
				$(this).addClass("on");
				$(".norSearchBox").show();
			}
		});
		$("body").on("click", ".btnSmartSearch", function() {
			var ck = $(this).hasClass("on");
			if (ck) {
				$(this).removeClass("on");
				$(".smartSearchBox").hide();
			} else {
				$(this).addClass("on");
				$(".smartSearchBox").show();
			}
		});
		$("body").on("click", ".searchTabs a", function() {
			$(".searchTabs a").removeClass("on");
			$(this).addClass("on");
			$(".detaillArea").removeClass("on");
			$(".optionTable").hide();
			var targetid = $(this).attr("data-id");
			$("#" + targetid).show();
		});
		$("body").on("click", ".radioBtn a", function() {
			// $(this).parents(".radioBtn").eq(0).find("a").removeClass("on");
			// $(this).addClass("on");
			// Modified by nullser 20190422
			if ($(this).attr('class') == 'on') {
				$(this).removeClass("on");
			} else {
				$(this).addClass("on");
			}
		});
		$("body").on("click", ".checkBtn a", function() {
			var ck = $(this).hasClass("on");
			if (ck) {
				$(this).removeClass("on");
			} else {
				$(this).addClass("on");
			}
		});

		$("body").on("click", ".fileBox a", function() {
			$(this).next(".hidden").trigger("click");
		});
		$("body").on("change", ".fileBox .hidden", function() {
			$(this).next(".furl").text("File Name : " + $(this).val());
		});
		$("body").on("click", ".groupToggle a", function() {
			$(".groupToggle a").removeClass("on");
			$(this).addClass("on");
		});
		$("body").on("click", ".radioBox label", function() {
			$(".radioBox label").removeClass("on");
			$(this).addClass("on");
		});
		$("body").on("click", ".toggleList a", function() {
			$(this).parents(".toggleList").eq(0).find("a").removeClass("on");
			$(this).addClass("on");
		});
		$("body").on("click", ".detailTabs a", function() {
			var targetid = $(this).attr("data-id");
			var post = $("#" + targetid).position().top;
			if (post > 0) {
				$("html, body").stop().animate({
					scrollTop : post + 'px'
				}, 300);
			}
		});

		/* 메인 슬라이드 */
		$(".mainSlide").slick({
			dots : true,
			slidesToShow : 1
		});
		$("body").on("click", ".msLeft", function(e) {
			$('.mainSlide').slick("slickPrev");
		});
		$("body").on("click", ".msRight", function(e) {
			$('.mainSlide').slick("slickNext");
		});

		/* 메인 슬라이드_모바일 */
		$(".m_mainSlide").slick({
			dots : true,
			slidesToShow : 1
		});
		$("body").on("click", ".msLeft", function(e) {
			$('.m_mainSlide').slick("slickPrev");
		});
		$("body").on("click", ".msRight", function(e) {
			$('.m_mainSlide').slick("slickNext");
		});

		/* 기획적 커버슬라이드 */
		$(".promCover").slick({
			dots : true,
			slidesToShow : 1
		});
		$("body").on("click", ".msLeft", function(e) {
			$('.promCover').slick("slickPrev");
		});
		$("body").on("click", ".msRight", function(e) {
			$('.promCover').slick("slickNext");
		});

		/* 오늘의핫스팟 */
		$(".hotSlide").slick({
			dots : false,
			slidesToShow : 1
		});
		$("body").on("click", ".hotSlideBox .detLeft", function(e) {
			$('.hotSlide').slick("slickPrev");
		});
		$("body").on("click", ".hotSlideBox .detRight", function(e) {
			$('.hotSlide').slick("slickNext");
		});
		$(".planSlide").slick({
			dots : false,
			slidesToShow : 1
		});
		$("body").on("click", ".planSlideBox .detLeft", function(e) {
			$('.planSlide').slick("slickPrev");
		});
		$("body").on("click", ".planSlideBox .detRight", function(e) {
			$('.planSlide').slick("slickNext");
		});

		/* 상세화면 호스트의 다른 축제ㆍ이벤트 */
		$(".hostSlide").slick({
			dots : false,
			slidesToShow : 1
		});
		$("body").on("click", ".hostLeft", function(e) {
			$('.hostSlide').slick("slickPrev");
		});
		$("body").on("click", ".hostRight", function(e) {
			$('.hostSlide').slick("slickNext");
		});
		/* 상세화면 사진/영상 */
		$(".detMovieSlide").slick({
			dots : false,
			slidesToShow : 2,
			responsive : [ {
				breakpoint : 1024,
				settings : {
					slidesToShow : 2,
					slidesToScroll : 2
				}
			}, {
				breakpoint : 600,
				settings : {
					slidesToShow : 1,
					slidesToScroll : 1
				}
			} ]
		});
		$("body").on("click", ".detMovieBox .detLeft", function(e) {
			$('.detMovieSlide').slick("slickPrev");
		});
		$("body").on("click", ".detMovieBox .detRight", function(e) {
			$('.detMovieSlide').slick("slickNext");
		});
		/* 상세화면 연관 기획전 */
		$("#etcSlide01 .detSlideList").slick({
			dots : false,
			slidesToShow : 4,
			responsive : [ {
				breakpoint : 1024,
				settings : {
					slidesToShow : 2,
					slidesToScroll : 2
				}
			}, {
				breakpoint : 600,
				settings : {
					slidesToShow : 1,
					slidesToScroll : 1
				}
			} ]
		});
		$("body").on("click", "#etcSlide01 .detLeft", function(e) {
			$('#etcSlide01 .detSlideList').slick("slickPrev");
		});
		$("body").on("click", "#etcSlide01 .detRight", function(e) {
			$('#etcSlide01 .detSlideList').slick("slickNext");
		});
		/* 상세화면 이 축제와 비슷한 축제ㆍ이벤트 */
		$("#etcSlide02 .detSlideList").slick({
			dots : false,
			slidesToShow : 4,
			responsive : [ {
				breakpoint : 1024,
				settings : {
					slidesToShow : 2,
					slidesToScroll : 2
				}
			}, {
				breakpoint : 600,
				settings : {
					slidesToShow : 1,
					slidesToScroll : 1
				}
			} ]
		});
		$("body").on("click", "#etcSlide02 .detLeft", function(e) {
			$('#etcSlide02 .detSlideList').slick("slickPrev");
		});
		$("body").on("click", "#etcSlide02 .detRight", function(e) {
			$('#etcSlide02 .detSlideList').slick("slickNext");
		});
		/* 상세화면 이 축제와 함께 본 전통시장 ㆍ스토어 */
		$("#etcSlide03 .detSlideList").slick({
			dots : false,
			slidesToShow : 4,
			responsive : [ {
				breakpoint : 1024,
				settings : {
					slidesToShow : 2,
					slidesToScroll : 2
				}
			}, {
				breakpoint : 600,
				settings : {
					slidesToShow : 1,
					slidesToScroll : 1
				}
			} ]
		});
		$("body").on("click", "#etcSlide03 .detLeft", function(e) {
			$('#etcSlide03 .detSlideList').slick("slickPrev");
		});
		$("body").on("click", "#etcSlide03 .detRight", function(e) {
			$('#etcSlide03 .detSlideList').slick("slickNext");
		});

		$("#tutorSlide01").slick({
			dots : true,
			slidesToShow : 4,
			responsive : [ {
				breakpoint : 1024,
				settings : {
					slidesToShow : 1
				}
			} ]
		});
		$("body").on("click", ".slideLeft", function(e) {
			$('#tutorSlide01').slick("slickPrev");
		});
		$("body").on("click", ".slideRight", function(e) {
			$('#tutorSlide01').slick("slickNext");
		});

		$("body").on("click", ".mTabs a", function() {
			var target = $(this);
			var ck = target.hasClass("on");
			$(".mTabs a").removeClass("on");
			target.addClass("on");
		});
		$("body").on("click", ".nTabs a", function() {
			var target = $(this);
			var ck = target.hasClass("on");
			$(".nTabs a").removeClass("on");
			target.addClass("on");
		});
		$("body").on("click", ".btnYoil", function() {
			var target = $(this);
			var ck = target.hasClass("on");
			if (ck) {
				target.removeClass("on");
			} else {
				target.addClass("on");
			}

		});
		/* 찜목록선택 */
		$("body").on("click", ".onlyList li .btnHart_list", function() {
			var ck = $(this).hasClass("on");
			if (ck) {
				$(this).removeClass("on");
				$(".layer_jjim_lsit").hide();
			} else {
				$(this).addClass("on");
				$(".layer_jjim_lsit").show();
			}
		});

	},
	calendar : function() {
		$('.datepicker').datepicker({
			'format' : 'yyyy.mm.dd',
			'autoclose' : true
		});
		$('.timeSetter').timepicker({
			'timeFormat' : 'H:i:s'
		});
	}
}

function popOpen(o) {
	$(o).show();
}
function popClose(o) {
	$(o).hide();
}
