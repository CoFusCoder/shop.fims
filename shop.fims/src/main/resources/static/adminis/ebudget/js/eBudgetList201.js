	var bunya = [];
	var total = new Array();
	var percent =  new Array();
	var percent_total = new Array();
	var label =  new Array();
	var count =  $('#list_table tbody th').length;

Number.prototype.format = function()
{
	if(this == 0) return 0;

	var reg = /(^[+-]?\d+)(\d{3})/;
	var n =  (this + ' ' );
	while(reg.test(n)) n = n.replace(reg, '$1' + ',' + '$2');
	return n;
};
	

	for(var i=0; i <count; i++)
	{
		//alert($('#list_table201 tbody th').eq(i).text());//분야
		//alert($('#list_table201 tbody th').eq(i).next().text());//예산액;
		//alert($('#list_table201 tbody th').eq(i).next().next().next().next().text());//누계
		if(i == count-1)
		{
			total[0] =	$('#list_table tbody th').eq(i).text();
			var to = convert($('#list_table tbody th').eq(i).next().text());
			to =  parseInt(to);
			var nu = convert($('#list_table tbody th').eq(i).next().next().next().next().text());
			nu =  parseInt(nu);
			total[1] =	(to-nu)/1000000;//합계
			total[2] =	nu/1000000;//누계
			total[3] =  $('#list_table tbody th').eq(i).next().next().next().next().next().text();//%
		}
		else
		{	
			
			bunya[i] =  $('#list_table tbody th').eq(i).text();
			label [i]= $('#list_table tbody th').eq(i).next().next().next().next().next().text();
			percent[i] =  parseFloat($('#list_table tbody th').eq(i).next().next().next().next().next().text());
			percent_total[i] = 100-percent[i];
		}
	}

var bunya =  bunya.reverse();
var percent =  percent.reverse();
var percent_total =  percent_total.reverse();
var label =  label.reverse();


function convert(string)
{
	var text =  string;
	var result = text.replace(/,/gi, '');
	return result;
}

function bar_graph()
{
	jQuery('#bar_graph').jqplot([percent, percent_total],{
		stackSeries:true,
		seriesColors:
		[
			'#4bb2c5', '#F1F1F0'
		],
		seriesDefaults:
		{
			renderer: jQuery.jqplot.BarRenderer,
			rendererOptions:
			{
				barMargin:38,
				barDirection: 'horizontal',
				shadowOffset:0,
				highlightMouseOver:false,
			}	
		},
		grid:
		{
			drawGridlines:false,
			background:'white',
			drawBorder:false,
			shadow:false,
			gridLineColor:'#FFFFFF'
		},
		series:
		[
			{	
				pointLabels:
				{
					xpadding:10,
					ypadding:-9.5,
					edgeTolerance:-21,
					show:true,
					stackedValue:true,
					labels:label,
					location:'e'
				}
			}
		],
		axes:
		{
			xaxis:
			{
				//min:0,
				//max:100,
				padMax:1.2,
				showTicks:false
			},
			yaxis:
			{
				renderer:$.jqplot.CategoryAxisRenderer,
				ticks:bunya,
				tickOptions:
				{
					markSize :0,
					fontSize:17
				},
				rendererOtions:
				{
					sortMergedLabels:true
				}
			}
		},
		legend:
		{
			renderer:jQuery.jqplot.enhancedLegendRenderer,
			show:true,
			labels:['지출액누계', '예산액'],
			location:'ne',
			placement:'insideGrid'
		}
	});
}


function donut_graph(){

	var total1 =  Math.round(total[1]);
	var total2 =  Math.floor(total[2]);
	
	var data =
	[
		['', Math.round(total[1])], ['총 지출액누계 '+total2.format(), Math.round(total[2])]	
	];
	jQuery('#donut_graph').jqplot([data], {
		seriesColors:['#F1F1F0', '#4bb2c5'],
		grid:
		{
			drawGridlines:false,
			background:'white',
			drawBorder:false,
			shadow:false,
			gridLineColor:'#FFFFFF',
			gridLineWidth:-1
		},
		seriesDefaults:
		{
			renderer:$.jqplot.DonutRenderer,
			rendererOptions:
			{
				startAngle:-50,
				showDataLabels:true,
				shadow:false,
				//totalLabel:true,
				padding:30,
				dataLabelPositionFactor:2.0,
				highlightMouseOver:false,
				dataLabels:'label'
			}
		},
		series:
		[
			{
			renderer:$.jqplot.pointLabels,
			pointLabels:
			{
				//labels:['test','tests']
				//location:'se'
				}
			}
		],
	});

	var to = convert($('#list_table tbody th').eq(13).next().text());
	to =  parseInt(to);
	to = to/1000000;
	to =  Math.floor(to);
	$('#total').text('총 예산 '+to.format());



	
}

	