var TableData = function() {
	"use strict";
	var runDataTable_deptInfo = function() {
		var oTable = $('#bottomDataTableInfos').dataTable({
			retrieve: true,
			"aoColumnDefs" : [{
				"aTargets" : [0]
			}],
			"oLanguage" : {
				"sLengthMenu" : "_MENU_ 개씩 보기",
				"sSearch" : "",
				"sInfo": "전체 _TOTAL_ 데이터 중 _START_부터 _END_까지 보고 계십니다.",
				"oPaginate" : {
					"sPrevious" : "",
					"sNext" : ""
				}
			},
			"aaSorting" : [[1, 'asc']],
			"aLengthMenu" : [[5, 10, 15, 20, -1], [5, 10, 15, 20, "전체"] // change per page values here
			],
			// set the initial value
			"iDisplayLength" : 10,
		});
		$('#bottomDataTableInfos_wrapper .dataTables_filter input').addClass("form-control input-sm").attr("placeholder", "검색");
	};
	return {
		init : function() {
			runDataTable_deptInfo();
		}
	};
}();


var WasteTableData = function() {
	"use strict";
	var runDataTable_deptInfo = function() {
		var oTable = $('#wasteDataTableInfos').dataTable({
			retrieve: true,
			"aoColumnDefs" : [{
				"aTargets" : [0]
			}],
			"oLanguage" : {
				"sLengthMenu" : "_MENU_ 개씩 보기",
				"sSearch" : "",
				"sInfo": "전체 _TOTAL_ 데이터 중 _START_부터 _END_까지 보고 계십니다.",
				"oPaginate" : {
					"sPrevious" : "",
					"sNext" : ""
				}
			},
			"aaSorting" : [[1, 'asc']],
			"aLengthMenu" : [[5, 10, 15, 20, -1], [5, 10, 15, 20, "전체"] // change per page values here
			],
			// set the initial value
			"iDisplayLength" : 10,
		});
		$('#wasteDataTableInfos_wrapper .dataTables_filter input').addClass("form-control input-sm").attr("placeholder", "검색");
	};
	return {
		init : function() {
			runDataTable_deptInfo();
		}
	};
}();

