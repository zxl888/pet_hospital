﻿<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html class="ie6"> <![endif]-->
<!--[if IE 7 ]>    <html class="ie7"> <![endif]-->
<!--[if IE 8 ]>    <html class="ie8"> <![endif]-->
<!--[if IE 9 ]>    <html class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html class="" lang="en">
<!--<![endif]-->

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>账单</title>
<!-- Standard Favicon -->
<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/images//favicon.ico" />
<!-- For iPhone 4 Retina display: -->
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="${pageContext.request.contextPath}/images//apple-touch-icon-114x114-precomposed.png">
<!-- For iPad: -->
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="${pageContext.request.contextPath}/images//apple-touch-icon-72x72-precomposed.png">
<!-- For iPhone: -->
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath}/images//apple-touch-icon-57x57-precomposed.png">
<!-- Library - Google Font Familys -->
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic'
	rel='stylesheet' type='text/css'>
<link
	href="https://fonts.googleapis.com/css?family=Vollkorn:400,400i,700,700i"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/revolution/css/settings.css">
<!-- RS5.0 Layers and Navigation Styles -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/revolution/css/layers.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/revolution/css/navigation.css">
<!-- Library - Bootstrap v3.3.5 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/libraries/lib.css">
<!-- Custom - Common CSS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/plugins.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/navigation-menu.css">
<!-- Custom - Theme CSS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css">
<link href="${pageContext.request.contextPath}/css/layui.css"
	type="text/css" rel="stylesheet">
<!--[if lt IE 9]>
		<script src="js/html5/respond.min.js"></script>
    <![endif]-->
</head>

<body data-offset="200" data-spy="scroll" data-target=".ow-navigation">
	<!-- Loader -->
	<!--div id="site-loader" class="load-complete">
		<div class="loader">
			<div class="loader-inner ball-clip-rotate">
				<div></div>
			</div>
		</div>
	</div-->
	<!-- Loader /- -->
	<!-- Header -->
	<header class="header-section container-fluid no-padding">
		<!-- Top Header -->
		<div class="top-header container-fluid no-padding">
			<!-- Container -->
			<div class="container">
				<!-- Social -->
				<div class="col-md-7 col-sm-6 col-xs-12 info">
					<p>
						<i class="icon icon-Pointer"></i>广西崇左江洲区
					</p>
					<p>
						<i class="icon icon-Phone2"></i><a href="tel:(+01)1234567890"
							title="Phone" class="phone">(+0771) 123 456 7890</a>
					</p>
				</div>
				<div class="col-md-5 col-sm-6 col-xs-12 header-social">
					<h5>关注我们</h5>
					<ul>
						<li><a href="#" title="Twitter"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#" title="Facebook"><i
								class="fa fa-facebook"></i></a></li>
						<li><a href="#" title="Google"><i
								class="fa fa-google-plus"></i></a></li>
						<li><a href="#" title="linkedin"><i
								class="fa fa-linkedin"></i></a></li>
						<li><a href="#" title="Tripadvisor"><i
								class="fa fa-tripadvisor"></i></a></li>
					</ul>
				</div>
				<!-- Social /- -->
			</div>
			<!-- Container /- -->
		</div>
		<!-- Top Header /- -->
		<!-- Menu Block -->
		<div class="menu-block container-fluid">
			<!-- Container -->
			<div class="container">
				<!-- Navigation -->
				<nav class="navbar ow-navigation">
					<div class="navbar-header">
						<button aria-controls="navbar" aria-expanded="false"
							data-target="#navbar" data-toggle="collapse"
							class="navbar-toggle collapsed" type="button">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a title="Logo1" href="index.html" class="navbar-brand"><img
							src="${pageContext.request.contextPath}/images/logo.png"></a>
					</div>
					<div class="navbar-collapse collapse" id="navbar">
						<ul class="nav navbar-nav">
							<li class="dropdown"><a href="index.html"
								title="Pages" class="dropdown-toggle" role="button"
								aria-haspopup="true" aria-expanded="false">主页</a></li>
							<li class="dropdown"><a href="#" title="Gallery"
								class="dropdown-toggle" role="button" aria-haspopup="true"
								aria-expanded="false">信息公开</a> <i
								class="ddl-switch fa fa-angle-down"></i>
								<ul class="dropdown-menu">
									<li><a title="overview" href="overview.html">医院概况</a></li>
									<li><a title="resource" href="resource.html">医院资源</a></li>
									<li><a title="Recent developments" href="latestNews.html">近期动态</a></li>
									<li><a title="Contact Us" href="contact-us.html">联系我们</a></li>
								</ul></li>
							<li><a title="services" href="services.html">特色服务</a></li>
							<li class="dropdown"><a href="#" title="notice"
								class="dropdown-toggle" role="button" aria-haspopup="true"
								aria-expanded="false">就医指南</a> <i
								class="ddl-switch fa fa-angle-down"></i>
								<ul class="dropdown-menu">
									<li><a title="Visiting" href="Visiting.html">门诊出诊表</a></li>
									<li><a title="notice" href="notice.html">就医须知</a></li>
								</ul></li>
							<li class="dropdown active"><a aria-expanded="false"
								aria-haspopup="true" role="button" class="dropdown-toggle"
								title="" href="#">网上服务</a> <i
								class="ddl-switch fa fa-angle-down"></i>
								<ul class="dropdown-menu">
									<li><a title="appointment" href="appointment.html">预约挂号</a></li>
									<li class='active'><a title="Blog" href="bills.html">查看账单</a></li>
								</ul></li>
						</ul>
					</div>
				</nav>
				<!-- Navigation -->
			</div>
		</div>
		<!-- Menu Block /- -->
	</header>
	<!-- Header /- -->
	<main> <!-- 账单 -->
	<div class="gallery-single container-fluid no-padding">
		<!-- Container -->
		<div class="container">
			<div class="search bar1">
				<form id="searchBills" action="../pet_hospital/searchBillView" method="get">
					<input name="poidcard" id="poidcard" type="text"
						placeholder="请输入身份证号..." />
					<button type="submit"></button>
				</form>
			</div>
			<div id="layuiPage">
				<!--以下为两个必须div元素-->
				<div id="table"></div>
				<div id="pageBar"></div>
			</div>
		</div>
		<!-- Container /- -->
	</div>
	<!-- 账单 --> </main>
	<!-- Footer Main -->
	<footer id="footer-main" class="footer-main container-fluid no-padding">
		<!-- Top Footer -->
		<div class="top-footer">
			<!-- Container -->
			<div class="container">
				<!-- Widget About -->
				<aside class="col-md-3 col-sm-6 col-xs-6 ftr-widget widget_about">
					<h3 class="widget-title">
						关于我们 <span>MAX</span>
					</h3>
					<p>天使宠物医院是集教学、科研
						、临床为一体的的正规化、现代化、专业化大型连锁宠物诊疗机构。由西南大学副教授郑晓波博士1992年始创于成都，在郑小波博士的带领下，经爱美森人多年的努力，现已建成以爱美森兽医服务中心广西总部为中心辐射四川、重庆、西藏、西双版纳等大中城市50余家天使宠物诊疗机构网络，并培养了一大批综合素质高，临床经验丰富的人才队伍。</p>
					<ul>
						<li><a href="#" title="Facebook"><i
								class="fa fa-facebook"></i></a></li>
						<li><a href="#" title="Twitter"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#" title="Google"><i
								class="fa fa-google-plus"></i></a></li>
						<li><a href="#" title="linkedin"><i
								class="fa fa-linkedin"></i></a></li>
					</ul>
				</aside>
				<!-- Widget About /- -->
				<!-- Widget Links -->
				<aside class="col-md-2 col-sm-6 col-xs-6 ftr-widget widget_links">
					<h3 class="widget-title">更多链接</h3>
					<ul>
						<li><a href="#" title="About Us">预约挂号</a></li>
						<li><a href="#" title="Our Packages">网上缴费</a></li>
						<li><a href="#" title="Popular Destination">Popular
								Destination</a></li>
						<li><a href="#" title="Top Destination">Top Destination</a></li>
						<li><a href="#" title="Latest News">Latest News</a></li>
						<li><a href="#" title="Our Gallery">Our Gallery</a></li>
					</ul>
				</aside>
				<!-- Widget Links -->
				<!-- Widget Hours -->
				<aside class="col-md-3 col-sm-6 col-xs-6 ftr-widget widget_hours">
					<h3 class="widget-title">上班时间</h3>
					<p>
						Monday <span>-</span> 9:00AM to 6:00PM
					</p>
					<p>
						Tuesday <span>-</span> 9:00AM to 6:00PM
					</p>
					<p>
						Wednesday <span>-</span> 9:00AM to 6:00PM
					</p>
					<p>
						Thursday <span>-</span> 9:00AM to 6:00PM
					</p>
					<p>
						Friday <span>-</span> 9:00AM to 6:00PM
					</p>
					<p>
						Saturday <span>-</span> 9:00AM to 6:00PM
					</p>
				</aside>
				<!-- Widget Hours /- -->
				<!-- Widget Destination -->
				<aside
					class="col-md-4 col-sm-6 col-xs-6 ftr-widget widget_destination">
					<h3 class="widget-title">特色服务</h3>
					<ul>
						<li><a href="#" title=""><img
								src="${pageContext.request.contextPath}/images/desti-1.jpg"
								alt="desti"></a></li>
						<li><a href="#" title=""><img
								src="${pageContext.request.contextPath}/images/desti-2.jpg"
								alt="desti"></a></li>
						<li><a href="#" title=""><img
								src="${pageContext.request.contextPath}/images/desti-3.jpg"
								alt="desti"></a></li>
						<li><a href="#" title=""><img
								src="${pageContext.request.contextPath}/images/desti-4.jpg"
								alt="desti"></a></li>
					</ul>
				</aside>
				<!-- Widget Destination /- -->
			</div>
			<!-- Container /- -->
		</div>
		<!-- Top Footer /- -->
	</footer>
	<!-- Footer Main /- -->
	<!-- JQuery v1.11.3 -->
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<!-- Library - Js -->
	<script src="${pageContext.request.contextPath}/libraries/lib.js"></script>
	<!-- Bootstrap JS File v3.3.5 -->
	<!-- RS5.0 Core JS Files -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/revolution/js/jquery.themepunch.tools.min.js?rev=5.0"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/revolution/js/jquery.themepunch.revolution.min.js?rev=5.0"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.video.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
	<!-- Library - Google Map API -->
	<!---<script src="http://ditu.google.cn/maps/api/js?key=AIzaSyDW40y4kdsjsz714OVTvrw7woVCpD8EbLE"></script>--->
	<!-- Library - Theme JS -->
	<script src="${pageContext.request.contextPath}/js/functions.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/layui.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/nicePage.js"></script>
	<script type="text/javascript">
		//标准json格式 目前只支持[{a:b,c:d},{a:b,c:d}]此种格式
		var json=''
		var nameList
		var widthList
		var poidcardVal=''
		
		//ajax bills分页
		function ajaxFindByPetCondition(poidcardVal) {
			$.ajax({
				url : '/pet_hospital/ajaxSelectByPOIdCard/'+poidcardVal,
				type : 'get',
				async: false,//使用同步的方式,true为异步方式
				success : function(data){
					json = JSON.parse(data)
					if (json.length == 0) {
					$('#layuiPage').hide()
				} else {
					$('#layuiPage').show()
					alert('查询成功,一共有'+json.length+'条记录')	
				}
				}
				});
		}
        //获取url中的参数
        function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
            var r = window.location.search.substr(1).match(reg);  //匹配目标参数
            if (r != null) return unescape(r[2]); return null; //返回参数值
        }
		//nameList与widthList的数组长度要一致
		nameList = [ '日期', '宠物编号', '名字',' 订单编号', '联系电话', '主人名字', '支付状态' ] //table的列名
		widthList = [ 100, 100, 100, 100, 100, 100, 100 ] //table每列的宽度
		//初始化
		$(function() {
			$("#poidcard").val(getUrlParam("poidcard"))
			ajaxFindByPetCondition(getUrlParam("poidcard"))
			nicePage
			.setCfg({
				table : 'table',
				bar : 'pageBar',
				limit : 10,
				color : '#31cec3',
				layout : [ 'count', 'prev', 'page', 'next',
						'limit', 'skip' ]
			});
		}); //初始化完成

		$("#table").on('click','.layui-table tbody tr',function() {
			var td = $(this).find("td");
			var data = td.eq(3).text();
			$(location).prop('href', '/pet_hospital/billsFindById/'+data)
		}); 
	</script>
</body>

</html>