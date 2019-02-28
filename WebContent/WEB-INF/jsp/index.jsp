<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
    <title>天使医院</title>
    <!-- Standard Favicon -->
    <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/images//favicon.ico" />
    <!-- For iPhone 4 Retina display: -->
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/images//apple-touch-icon-114x114-precomposed.png">
    <!-- For iPad: -->
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/images//apple-touch-icon-72x72-precomposed.png">
    <!-- For iPhone: -->
    <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/images//apple-touch-icon-57x57-precomposed.png">
    <!-- Library - Google Font Familys -->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/css?family=Vollkorn:400,400i,700,700i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/revolution/css/settings.css">
    <!-- RS5.0 Layers and Navigation Styles -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/revolution/css/layers.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/revolution/css/navigation.css">
    <!-- Library - Bootstrap v3.3.5 -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/libraries/lib.css">
    <!-- Custom - Common CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/plugins.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/navigation-menu.css">
    <!-- Custom - Theme CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
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
    <!--在线咨询-->
    <button class="chatBtn">在线咨询</button>
    <div class="talk_con">
        <div class="talk_show" id="words">
            <div class="customTalk"><span id="asay">你好</span></div>
            <div class="userTalk"><span id="bsay">你好啊</span></div>
        </div>
        <div class="talk_input">
            <input type="text" class="talk_word" id="talkwords">
            <input class="talkButton" type="button" value="发送" class="talk_sub" id="talksub"> 
        </div>
    </div>
    <!--在线咨询-->
    <!-- Header -->
    <header class="header-section container-fluid no-padding">
        <!-- Top Header -->
        <div class="top-header container-fluid no-padding">
            <!-- Container -->
            <div class="container">
                <!-- Social -->
                <div class="col-md-7 col-sm-6 col-xs-12 info">
                    <p><i class="icon icon-Pointer"></i>广西崇左江洲区</p>
                    <p><i class="icon icon-Phone2"></i><a href="tel:(+01)1234567890" title="Phone" class="phone">(+0771) 123 456 7890</a></p>
                </div>
                <div class="col-md-5 col-sm-6 col-xs-12 header-social">
                    <h5>关注我们</h5>
                    <ul>
                        <li><a href="#" title="Twitter"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#" title="Facebook"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#" title="Google"><i class="fa fa-google-plus"></i></a></li>
                        <li><a href="#" title="linkedin"><i class="fa fa-linkedin"></i></a></li>
                        <li><a href="#" title="Tripadvisor"><i class="fa fa-tripadvisor"></i></a></li>
                    </ul>
                </div><!-- Social /- -->
            </div><!-- Container /- -->
        </div><!-- Top Header /- -->
        <!-- Menu Block -->
        <div class="menu-block container-fluid">
            <!-- Container -->
            <div class="container">
                <!-- Navigation -->
                <nav class="navbar ow-navigation">
                    <div class="navbar-header">
                        <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a title="Logo1" href="index.html" class="navbar-brand"><img src="${pageContext.request.contextPath}/images/logo.png"></a>
                    </div>
                    <div class="navbar-collapse collapse" id="navbar">
                        <ul class="nav navbar-nav">
                            <li class="dropdown active">
                                <a href="index.html" title="Pages" class="dropdown-toggle" role="button" aria-haspopup="true" aria-expanded="false">主页</a>
                            </li>

                            <li class="dropdown">
                                <a href="#" title="Gallery" class="dropdown-toggle" role="button" aria-haspopup="true" aria-expanded="false">信息公开</a>
                                <i class="ddl-switch fa fa-angle-down"></i>
                                <ul class="dropdown-menu">
                                    <li><a title="overview" href="overview.html">医院概况</a></li>
                                   
                                    <li><a title="resource" href="resource.html">医院资源</a></li>
                                    <li><a title="Recent developments" href="latestNews.html">近期动态</a></li>
                                    <li><a title="Contact Us" href="contact-us.html">联系我们</a></li>
                                </ul>
                            </li>
                             <li><a title="services" href="services.html">特色服务</a></li>
                            <li class="dropdown">
                                <a href="#" title="notice" class="dropdown-toggle" role="button" aria-haspopup="true" aria-expanded="false">就医指南</a>
                                <i class="ddl-switch fa fa-angle-down"></i>
                                <ul class="dropdown-menu">
                                    <li><a title="Visiting" href="Visiting.html">门诊出诊表</a></li>
                                    <li><a title="notice" href="notice.html">就医须知</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a aria-expanded="false" aria-haspopup="true" role="button" class="dropdown-toggle" title="" href="#">网上服务</a>
                                <i class="ddl-switch fa fa-angle-down"></i>
                                <ul class="dropdown-menu">
                                    <li><a title="appointment" href="appointment.html">预约挂号</a></li>
                                    <li><a title="Blog" href="bills.html">查看账单</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav><!-- Navigation -->
            </div>
        </div><!-- Menu Block /- -->
    </header><!-- Header /- -->
    <main>
        <!-- Slider Section 2 -->
        <div id="home-revslider" class="slider-section container-fluid no-padding">
            <!-- START REVOLUTION SLIDER 5.0 -->
            <div class="rev_slider_wrapper">
                <div id="home-slider1" class="rev_slider" data-version="5.0">
                    <ul>
                        <li data-transition="zoomout" data-slotamount="default" data-easein="easeInOut" data-easeout="easeInOut" data-masterspeed="2000" data-rotate="0" data-fstransition="fade" data-fsmasterspeed="1500" data-fsslotamount="7">
                            <img src="${pageContext.request.contextPath}/images/slider-1.jpg" alt="slider" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="10" class="rev-slidebg" data-no-retina>
                            <!-- LAYERS -->
                            <!-- LAYER NR. 1 -->
                            <div class="tp-caption tp-shape tp-shapewrapper" id="slide-layer-0" data-x="['center','center','center','center']" data-y="['middle','middle','middle','middle']" data-basealign="slide" data-height="full" data-hoffset="['0','0','0','0']" data-responsive="off" data-responsive_offset="off" data-start="0" data-transform_idle="o:1;" data-transform_in="opacity:0;s:2000;e:Power2.easeInOut;" data-transform_out="opacity:0;s:500;s:500;" data-voffset="['0','0','0','0']" data-whitespace="nowrap" data-width="full" style="z-index: 5;background-color:rgba(0, 0, 0, 0.502);">
                            </div>
                            <!-- LAYER NR. 2 -->
                            <div class="tp-caption NotGeneric-Title tp-resizeme rs-parallaxlevel-0" id="slide-layer-1" data-x="['left','left','left','left']" data-hoffset="['400','125','100','70']" data-y="['middle','middle','middle','middle']" data-voffset="['-200','-80','-100','-100']" data-fontsize="['54','40','30','20']" data-lineheight="['70','60','60','60']" data-fontweight="['600','600','600','600']" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_in="x:[105%];z:0;rX:45deg;rY:0deg;rZ:90deg;sX:1;sY:1;skX:0;skY:0;s:2000;e:Power4.easeInOut;" data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;" data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" data-mask_out="x:inherit;y:inherit;s:inherit;e:inherit;" data-start="1000" data-splitin="chars" data-splitout="none" data-responsive_offset="on" data-elementdelay="0.05" style="z-index: 5; white-space: nowrap; color:#fff; font-family: 'Open Sans', sans-serif; text-transform: uppercase">为宠物着想
                            </div>
                            <!-- LAYER NR. 3 -->
                            <div class="tp-caption NotGeneric-Title tp-resizeme rs-parallaxlevel-0" id="slide-layer-2" data-x="['left','left','left','left']" data-hoffset="['400','125','100','70']" data-y="['top','top','top','top']" data-voffset="['275','300','215','150']" data-fontsize="['54','45','30','20']" data-fontweight="['400','400','400','400']" data-lineheight="['76','24','24','24']" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_in="y:-50px;opacity:0;s:1000;e:Power4.easeOut;" data-transform_out="opacity:0;s:3000;e:Power4.easeIn;s:3000;e:Power4.easeIn;" data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" data-mask_out="x:inherit;y:inherit;s:inherit;e:inherit;" data-start="1000" data-splitin="none" data-splitout="none" data-responsive_offset="on" data-elementdelay="0.05" style="z-index: 5; color:#fff; font-family: 'Open Sans', sans-serif; text-transform:uppercase;">为爱心导航
                            </div>
                            <!-- LAYER NR. 4 -->
                            <div class="tp-caption NotGeneric-Button rev-btn  rs-parallaxlevel-0" id="slide-layer-3" data-x="['left','left','left','left']" data-hoffset="['400','125','100','70']" data-y="['top','top','top','top']" data-voffset="['400','375','280','215']" data-fontsize="['16','12','12','12']" data-fontweight="['600','600','600','600']" data-lineheight="['28','20','20','20']" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_hover="o:1;rX:0;rY:0;rZ:0;z:0;s:100;e:Power1.easeInOut;" data-style_hover="c:rgba(162, 144, 97, 1.00);bg:rgba(255, 255, 255, 1.00);" data-transform_in="x:[-100%];z:0;rX:0deg;rY:0deg;rZ:0deg;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2500;e:Power3.easeInOut;" data-transform_out="auto:auto;s:1000;e:Power2.easeInOut;" data-start="2000" data-splitin="none" data-splitout="none" data-actions='[{"event":"click","action":"scrollbelow","offset":"0px"}]' data-responsive_offset="on" data-responsive="off" style="z-index: 10; padding:8px 33px; letter-spacing:0.16px; color: #fff; font-family: 'Open Sans', sans-serif; text-transform:uppercase; background-color:transparent; white-space: nowrap;outline:none;box-shadow:none;box-sizing:border-box;-moz-box-sizing:border-box;-webkit-box-sizing:border-box;">开始起航
                            </div>
                        </li>
                        <li data-transition="zoomout" data-slotamount="default" data-easein="easeInOut" data-easeout="easeInOut" data-masterspeed="2000" data-rotate="0" data-fstransition="fade" data-fsmasterspeed="1500" data-fsslotamount="7">
                            <img src="${pageContext.request.contextPath}/images/slider-3.jpg" alt="slider" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="10" class="rev-slidebg" data-no-retina>
                            <div class="tp-caption tp-shape tp-shapewrapper" id="slide-layer-4" data-x="['center','center','center','center']" data-y="['middle','middle','middle','middle']" data-basealign="slide" data-height="full" data-hoffset="['0','0','0','0']" data-responsive="off" data-responsive_offset="off" data-start="0" data-transform_idle="o:1;" data-transform_in="opacity:0;s:2000;e:Power2.easeInOut;" data-transform_out="opacity:0;s:500;s:500;" data-voffset="['0','0','0','0']" data-whitespace="nowrap" data-width="full" style="z-index: 5;background-color:rgba(0, 0, 0, 0.702);">
                            </div>
                            <div class="tp-caption NotGeneric-Title tp-resizeme rs-parallaxlevel-0" id="slide-layer-5" data-x="['left','left','left','left']" data-hoffset="['550','125','100','35']" data-y="['middle','middle','middle','middle']" data-voffset="['-215','-80','-100','-100']" data-fontsize="['50','30','25','15']" data-lineheight="['72','45','35','25']" data-fontweight="['600','600','600','600']" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_in="x:[105%];z:0;rX:45deg;rY:0deg;rZ:90deg;sX:1;sY:1;skX:0;skY:0;s:2000;e:Power4.easeInOut;" data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;" data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" data-mask_out="x:inherit;y:inherit;s:inherit;e:inherit;" data-start="1000" data-splitin="chars" data-splitout="none" data-responsive_offset="on" data-elementdelay="0.05" style="z-index: 5; white-space: nowrap; color:#fff; font-family: 'Open Sans', sans-serif;">相伴宠物情缘<br>享受浪漫人生
                            </div>
                            <div class="tp-caption NotGeneric-Title tp-resizeme rs-parallaxlevel-0" id="slide-layer-6" data-x="['left','left','left','left']" data-hoffset="['550','125','100','35']" data-y="['middle','middle','middle','middle']" data-voffset="['-50','40','10','10']" data-fontsize="['18','18','20','16']" data-lineheight="['24','24','24','24']" data-fontweight="['300','300','300','300']" data-width="['1920','1024','768','400']" data-height="none" data-whitespace="normal" data-transform_idle="o:1;" data-transform_in="x:[105%];z:0;rX:45deg;rY:0deg;rZ:90deg;sX:1;sY:1;skX:0;skY:0;s:2000;e:Power4.easeInOut;" data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;" data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" data-mask_out="x:inherit;y:inherit;s:inherit;e:inherit;" data-start="1000" data-splitin="none" data-splitout="none" data-responsive_offset="on" data-elementdelay="0.05" style="z-index: 5; white-space: normal; letter-spacing: 0.45px; word-wrap: break-word; min-width: 1920px; max-width: 1920px; color:#fff; font-family: 'Open Sans', sans-serif; font-style:italic;">博爱堂宠物情缘<br>给你爱宠一个五星级既家。
                            </div>
                            <div class="tp-caption NotGeneric-Button rev-btn  rs-parallaxlevel-0" id="slide-layer-7" data-x="['left','left','left','left']" data-hoffset="['550','125','100','35']" data-y="['top','top','top','top']" data-voffset="['480','454','375','330']" data-fontsize="['16.2','12','12','12']" data-fontweight="['600','600','600','600']" data-lineheight="['28','20','20','20']" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_hover="o:1;rX:0;rY:0;rZ:0;z:0;s:100;e:Power1.easeInOut;" data-style_hover="c:rgba(162, 144, 97, 1.00);bg:rgba(255, 255, 255, 1.00);" data-transform_in="x:[-100%];z:0;rX:0deg;rY:0deg;rZ:0deg;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2500;e:Power3.easeInOut;" data-transform_out="auto:auto;s:1000;e:Power2.easeInOut;" data-start="2000" data-splitin="none" data-splitout="none" data-actions='[{"event":"click","action":"scrollbelow","offset":"0px"}]' data-responsive_offset="on" data-responsive="off" style="z-index: 10; padding:8px 33px; letter-spacing:0.405px; color: #fff; font-family: 'Open Sans', sans-serif; text-transform:uppercase; background-color:transparent; white-space: nowrap;outline:none;box-shadow:none;box-sizing:border-box;-moz-box-sizing:border-box;-webkit-box-sizing:border-box;">contact us
                            </div>
                        </li>
                        <li data-transition="zoomout" data-slotamount="default" data-easein="easeInOut" data-easeout="easeInOut" data-masterspeed="2000" data-rotate="0" data-fstransition="fade" data-fsmasterspeed="1500" data-fsslotamount="7">
                            <img src="${pageContext.request.contextPath}/images/slider-4.jpg" alt="slider" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="10" class="rev-slidebg" data-no-retina>
                            <!-- LAYERS -->
                            <!-- LAYER NR. 1 -->
                            <div class="tp-caption tp-shape tp-shapewrapper" id="slide-layer-8" data-x="['center','center','center','center']" data-y="['middle','middle','middle','middle']" data-basealign="slide" data-height="full" data-hoffset="['0','0','0','0']" data-responsive="off" data-responsive_offset="off" data-start="0" data-transform_idle="o:1;" data-transform_in="opacity:0;s:2000;e:Power2.easeInOut;" data-transform_out="opacity:0;s:500;s:500;" data-voffset="['0','0','0','0']" data-whitespace="nowrap" data-width="full" style="z-index: 5;background-color:rgba(0, 0, 0, 0.6);">
                            </div>
                            <div class="tp-caption NotGeneric-Title tp-resizeme rs-parallaxlevel-0" id="slide-layer-9" data-x="['left','left','left','left']" data-hoffset="['550','125','100','55']" data-y="['middle','middle','middle','middle']" data-voffset="['-135','-80','-100','-100']" data-fontsize="['50','30','25','20']" data-lineheight="['72','45','35','25']" data-fontweight="['600','600','600','600']" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_in="x:[105%];z:0;rX:45deg;rY:0deg;rZ:90deg;sX:1;sY:1;skX:0;skY:0;s:2000;e:Power4.easeInOut;" data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;" data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" data-mask_out="x:inherit;y:inherit;s:inherit;e:inherit;" data-start="1000" data-splitin="chars" data-splitout="none" data-responsive_offset="on" data-elementdelay="0.05" style="z-index: 5; white-space: nowrap; color:#fff; font-family: 'Open Sans', sans-serif;">宠物大团圆<br>爱宠爱不完，尽在宠物情缘。
                            </div>
                            <div class="tp-caption NotGeneric-Button rev-btn  rs-parallaxlevel-0" id="slide-layer-10" data-x="['left','left','left','left']" data-hoffset="['550','125','100','55']" data-y="['top','top','top','top']" data-voffset="['430','330','250','200']" data-fontsize="['16.2','12','12','12']" data-fontweight="['600','600','600','600']" data-lineheight="['28','20','20','20']" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_hover="o:1;rX:0;rY:0;rZ:0;z:0;s:100;e:Power1.easeInOut;" data-style_hover="c:rgba(162, 144, 97, 1.00);bg:rgba(255, 255, 255, 1.00);" data-transform_in="x:[-100%];z:0;rX:0deg;rY:0deg;rZ:0deg;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2500;e:Power3.easeInOut;" data-transform_out="auto:auto;s:1000;e:Power2.easeInOut;" data-start="2000" data-splitin="none" data-splitout="none" data-actions='[{"event":"click","action":"scrollbelow","offset":"0px"}]' data-responsive_offset="on" data-responsive="off" style="z-index: 10; padding:8px 33px; letter-spacing:0.405px; color: #fff; font-family: 'Open Sans', sans-serif; text-transform:uppercase; background-color:transparent; white-space: nowrap;outline:none;box-shadow:none;box-sizing:border-box;-moz-box-sizing:border-box;-webkit-box-sizing:border-box;">contact us
                            </div>
                        </li>
                    </ul>
                </div><!-- END REVOLUTION SLIDER -->
            </div><!-- END OF SLIDER WRAPPER -->
        </div><!-- Slider Section 2 /- -->
        <!-- Welcome Section -->
        <div class="welcome-section container-fluid">
            <!-- Container -->
            <div class="container">
                <!-- Section Header -->
                <div class="section-header section-header-2">
                    <h3>欢迎您来到 <span>天使宠物</span> 医院</h3>
                </div><!-- Section Header /- -->
                <div class="welcome-content">
                    <p>天使宠物医院是集教学、科研 、临床为一体的的正规化、现代化、专业化大型连锁宠物诊疗机构。由西南大学副教授郑晓波博士1992年始创于成都，在郑小波博士的带领下，经爱美森人多年的努力，现已建成以爱美森兽医服务中心广西总部为中心辐射四川、重庆、西藏、西双版纳等大中城市50余家天使宠物诊疗机构网络，并培养了一大批综合素质高，临床经验丰富的人才队伍。</p>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-6 welcome-outer">
                    <div class="welcome-box">
                        <span>提供</span>
                        <p>优质服务</p>
                        <i class="icon icon-Cup"></i>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-6 welcome-outer">
                    <div class="welcome-box">
                        <span>透明</span>
                        <p>服务费用</p>
                        <i class="icon icon-Starship"></i>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-6 welcome-outer">
                    <div class="welcome-box">
                        <span>追求</span>
                        <p>卓越医疗</p>
                        <i class="icon icon-Bag"></i>
                    </div>
                </div>
            </div><!-- Container / -->
        </div><!-- Welcome Section /- -->
        <!-- Whychooseus Section -->
        <div class="whychooseus-section container-fluid">
            <!-- Container -->
            <div class="container">
                <!-- Section Header -->
                <div class="section-header section-header-2">
                    <h3>特色专科医疗服务</h3>
                </div><!-- Section Header /- -->
                <div class="col-md-6 col-sm-12 col-xs-6">
                    <div class="choose-us-box">
                        <div class="col-md-12 col-sm-12 col-xs-12 no-padding choose-us-block">
                            <div class="col-md-5 col-sm-4 col-xs-12 choose-us-cover">
                                <i><img src="${pageContext.request.contextPath}/images/choose-us-1.jpg" alt="choose-us" /></i>
                                <a class="zoom" href="${pageContext.request.contextPath}/images/choose-us-1.jpg" title="offer"><i class="icon icon-Linked"></i></a>
                            </div>
                            <div class="col-md-7 col-sm-8 col-xs-12 choose-us-content">
                                <h5>骨科</h5>
                                <p>伴随着宠物走入人们的身边，宠物已经成为家庭的一员，车祸、咬伤、高空坠落造成的骨折病例在临床上也逐渐增多，骨折发生后，宠物主人愿意让宠物接受好的治疗。</p>
                                <a href="#" title="read-more">更多</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-sm-12 col-xs-6">
                    <div class="choose-us-box">
                        <div class="col-md-12 col-sm-12 col-xs-12 no-padding choose-us-block">
                            <div class="col-md-5 col-sm-4 col-xs-12 choose-us-cover">
                                <i><img src="${pageContext.request.contextPath}/images/choose-us-2.jpg" alt="choose-us" /></i>
                                <a class="zoom" href="${pageContext.request.contextPath}/images/choose-us-2.jpg" title="offer"><i class="icon icon-Linked"></i></a>
                            </div>
                            <div class="col-md-7 col-sm-8 col-xs-12 choose-us-content">
                                <h5>心脏科</h5>
                                <p>心脏血管系统是维持生命活动的重要器官，它主要参与机体的血液循环代谢，因此与其他系统关系非常为密切。心脏血管系统原发病虽不多，但当发病时必然要引起其他系统机能障碍，其他系统疾病，也常常影响心脏血管系统的机能。</p>
                                <a href="#" title="read-more">更多</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-sm-12 col-xs-6">
                    <div class="choose-us-box">
                        <div class="col-md-12 col-sm-12 col-xs-12 no-padding choose-us-block">
                            <div class="col-md-5 col-sm-4 col-xs-12 choose-us-cover">
                                <i><img src="${pageContext.request.contextPath}/images/choose-us-3.jpg" alt="choose-us" /></i>
                                <a class="zoom" href="${pageContext.request.contextPath}/images/choose-us-3.jpg" title="offer"><i class="icon icon-Linked"></i></a>
                            </div>
                            <div class="col-md-7 col-sm-8 col-xs-12 choose-us-content">
                                <h5>皮肤科</h5>
                                <p>宠物易感染皮肤病，包括细菌性皮肤病、真菌性皮肤病、螨虫等皮肤寄生虫感染、过敏性皮肤病、角化性和皮脂溢性皮肤病、自身免疫性皮肤病、内分泌性皮肤病，先天性和后天性脱毛、色素异常等复杂顽固性皮肤病</p>
                                <a href="#" title="read-more">更多</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-sm-12 col-xs-6">
                    <div class="choose-us-box">
                        <div class="col-md-12 col-sm-12 col-xs-12 no-padding choose-us-block">
                            <div class="col-md-5 col-sm-4 col-xs-12 choose-us-cover">
                                <i><img src="${pageContext.request.contextPath}/images/choose-us-4.jpg" alt="choose-us" /></i>
                                <a class="zoom" href="${pageContext.request.contextPath}/images/choose-us-4.jpg" title="offer"><i class="icon icon-Linked"></i></a>
                            </div>
                            <div class="col-md-7 col-sm-8 col-xs-12 choose-us-content">
                                <h5>肿瘤科</h5>
                                <p>犬猫肿瘤病为常见多发病，近年来呈上升趋势。是目前危害宠物健康的主要杀手之一。随着宠物年龄的增长，特别是犬龄、猫龄10年以上，50%终死于癌症。当您发现爱宠体表有包块时，要立即去医院就诊。</p>
                                <a href="#" title="read-more">更多</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!-- Container /- -->
        </div><!-- Whychooseus Section /- -->
        <!-- Offer Section -->
        <div class="offer-section container-fluid">
            <!-- Container -->
            <div class="container">
                <!-- Section Header -->
                <div class="section-header section-header-2">
                    <h3>著名专家</h3>
                </div><!-- Section Header /- -->
                <div class="offer-carousel">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="offer-box">
                            <i><img src="${pageContext.request.contextPath}/images/offer-1.jpg" alt="offer"></i>
                            <div class="offer-content">
                                <h5>侯加法</h5>
                                <p>从事兽医外科教学和科研工作有43年，中国小动物临床诊疗行业重要的奠基人，中国小动物外科学开拓者。主编《小动物外科学》、《小动物疾病学》（第一、二版）、副主编《兽医外科手术学》和《兽医外科学》等教材</p>
                                <span>安安宠医·医疗技术委员会首席专家</span>
                                <a class="zoom" href="${pageContext.request.contextPath}/images/offer-1.jpg" title="offer"><i class="fa fa-plus"></i></a>
                                <a href="#" title="Book Now" class="book-now">预约</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="offer-box">
                            <i><img src="${pageContext.request.contextPath}/images/offer-2.jpg" alt="offer"></i>
                            <div class="offer-content">
                                <h5>徐国兴</h5>
                                <p>徐国兴院长已经帮助无数瘫痪的小动物重新站起来奔跑，治愈率在96%以上。在中国的小动物神经外科发展，开辟了新的领域—显微镜下神经外科(切口小、损伤小、出血少、康复快等特点)，做出了巨大的成就。 </p>
                                <span>安安宠医·医疗技术委员会委员</span>
                                <a class="zoom" href="${pageContext.request.contextPath}/images/offer-2.jpg" title="offer"><i class="fa fa-plus"></i></a>
                                <a href="#" title="Book Now" class="book-now">预约</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="offer-box">
                            <i><img src="${pageContext.request.contextPath}/images/offer-3.jpg" alt="offer"></i>
                            <div class="offer-content">
                                <h5>裴增杨</h5>
                                <p>中国80后小动物医师的优秀代表之一，毕业于扬州大学兽医学本科、中国农业大学临床兽医学硕-博连读，并赴美国田纳西大学、北卡罗来纳州立大学、堪萨斯州立大学的兽医教学医院进修</p>
                                <span>安安宠医·医疗技术委员会委员</span>
                                <a class="zoom" href="${pageContext.request.contextPath}/images/offer-3.jpg" title="offer"><i class="fa fa-plus"></i></a>
                                <a href="#" title="Book Now" class="book-now">预约</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!-- Container /- -->
        </div><!-- Offer Section /- -->
        <!-- Counter Section -->
        <div class="counter-section container-fluid">
            <!-- Container -->
            <div class="container">
                <div class="col-md-3 col-sm-3 col-xs-6">
                    <div class="counter-box">
                        <i class="icon icon-Users"></i>
                        <h3><span class="count" id="statistics_count-1" data-statistics_percent="14343"> &nbsp;</span></h3>
                        <p>成功病例</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3 col-xs-6">
                    <div class="counter-box">
                        <i class="icon icon-House"></i>
                        <h3><span class="count" id="statistics_count-2" data-statistics_percent="74"> &nbsp;</span></h3>
                        <p>行业表彰</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3 col-xs-6">
                    <div class="counter-box">
                        <i class="icon icon-Tie"></i>
                        <h3><span class="count" id="statistics_count-3" data-statistics_percent="726"> &nbsp;</span></h3>
                        <p>优秀医生</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3 col-xs-6">
                    <div class="counter-box">
                        <i class="icon icon-Cup"></i>
                        <h3><span class="count" id="statistics_count-4" data-statistics_percent="46"> &nbsp;</span></h3>
                        <p>高新设备</p>
                    </div>
                </div>
            </div><!-- Container /- -->
        </div><!-- Counter Section /- -->
        <!-- Gallery Section -->
        <div class="gallery-section container-fluid">
            <!-- Container -->
            <div class="container">
                <!-- Section Header -->
                <div class="section-header">
                    <h3>高新设备</h3>
                </div><!-- Section Header /- -->
                <ul class="portfolio-list no-left-padding">
                    <li class="col-md-4 col-sm-4 col-xs-6 design">
                        <div class="content-image-block">
                            <img src="${pageContext.request.contextPath}/images/gallery-1.jpg" alt="gallery">
                            <div class="content-block-hover">
                                <h5>血气仪</h5>
                                <p>血气分析仪：利用电非常在较短时间内对动脉中的酸碱度(pH)、二氧化碳分压(PCO2)和氧分压(PO2)等相关指标进行测定的仪器。</p>
                            </div>
                        </div>
                    </li>
                    <li class="col-md-4 col-sm-4 col-xs-6 video">
                        <div class="content-image-block">
                            <img src="${pageContext.request.contextPath}/images/gallery-2.jpg" alt="gallery">
                            <div class="content-block-hover">
                                <h5>显微镜</h5>
                                <p>光学显微镜：放大微小物体成为人的肉眼所能看到。<br>用途：粪检，涂片检查</p>
                            </div>
                        </div>
                    </li>
                    <li class="col-md-4 col-sm-4 col-xs-6 photography">
                        <div class="content-image-block">
                            <img src="${pageContext.request.contextPath}/images/gallery-3.jpg" alt="gallery">
                            <div class="content-block-hover">
                                <h5>手术室心电及血氧监控</h5>
                                <p>心电监护仪：监护心电图形、呼吸、体温、血压（分无创和有创）、血氧饱和度、脉率参数。</p>
                            </div>
                        </div>
                    </li>
                    <li class="col-md-4 col-sm-4 col-xs-6 design">
                        <div class="content-image-block">
                            <img src="${pageContext.request.contextPath}/images/gallery-4.jpg" alt="gallery">
                            <div class="content-block-hover">
                                <h5>B超-彩色</h5>
                                <p>彩超：高清晰度的黑白B超加上色彩多普勒，利用超声波的物理特性进行诊断和治疗的仪器。</p>
                            </div>
                        </div>
                    </li>
                    <li class="col-md-4 col-sm-4 col-xs-6 photography">
                        <div class="content-image-block">
                            <img src="${pageContext.request.contextPath}/images/gallery-5.jpg" alt="gallery">
                            <div class="content-block-hover">
                                <h5>内分泌分析仪</h5>
                                <p>用于：甲状腺功能减退症，甲状腺功能亢进症，库欣氏综合征，阿狄森氏病，肝功能异常，犬胰腺炎，犬心丝虫，埃立克体病，莱姆病，无形体病，猫白血病病毒，猫免疫缺陷病毒，猫心丝虫，</p>
                            </div>
                        </div>
                    </li>
                    <li class="col-md-4 col-sm-4 col-xs-6 web">
                        <div class="content-image-block">
                            <img src="${pageContext.request.contextPath}/images/gallery-6.jpg" alt="gallery">
                            <div class="content-block-hover">
                                <h5>呼吸麻醉机</h5>
                                <p>
                                    呼吸麻醉机：在完成麻醉诱导后，将空气麻醉机与密闭式面罩或气管导管连接。吸气时，麻醉混合气体经开启的吸气活瓣进入体内；呼气时，呼气活瓣开启，同时吸气活瓣关闭，排出呼出的气体。</p>
                            </div>
                        </div>
                    </li>
                </ul>
            </div><!-- Container /- -->
        </div><!-- Gallery Section /- -->
        <!-- Callout -->
        <div class="callout container-fluid">
            <!-- Container -->
            <div class="container">
                <div class="call-out-content">
                    <h3>我们是您和您的爱宠最好的选择</h3>
                    <p>天使宠物医院长期致力于推动中国宠物医疗事业发展，本着“因为严谨、所以安心”的宗旨以“家人”般的呵护，将服务做到贴心与专业，为爱宠提供人性化、高品质的健康服务体验</p>
                    <a href="#" title="Book Now">预约</a>
                </div>
            </div><!-- Container /- -->
        </div><!-- Callout /- -->
        <!-- Event Section -->
        <div class="event-section container-fluid">
            <!-- Container -->
            <div class="container">
                <!-- Section Header -->
                <div class="section-header section-header-1">
                    <p>NEWS</p>
                    <h3>最近动态</h3>
                </div><!-- Section Header /- -->
                <div class="col-md-4 col-sm-6 col-xs-6 event-box">
                    <img src="${pageContext.request.contextPath}/images/event-1.jpg" alt="service" />
                    <div class="event-content">
                        <div class="event-date">
                            <p>15日</p>
                            <span>12月</span>
                        </div>
                        <h5 class="event-title"><a href="#">纸短情长|一封感谢信浓浓医患情！</a></h5>
                        <p><i class="icon icon-Pointer"></i>Victoria, USA</p>
                        <p><i class="icon icon-User"></i><a href="#">Mike Hurry</a></p>
                        <a href="#" class="view-detail">查看详情<i class="fa fa-angle-double-right"></i></a>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-6 event-box">
                    <img src="${pageContext.request.contextPath}/images/event-2.jpg" alt="service" />
                    <div class="event-content">
                        <div class="event-date">
                            <p>25</p>
                            <span>May</span>
                        </div>
                        <h5 class="event-title"><a href="#">纸短情长|一封感谢信浓浓医患情！</a></h5>
                        <p><i class="icon icon-Pointer"></i>Victoria, USA</p>
                        <p><i class="icon icon-User"></i><a href="#">Mike Hurry</a></p>
                        <a href="#" class="view-detail">查看详情<i class="fa fa-angle-double-right"></i></a>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-6 event-box">
                    <img src="${pageContext.request.contextPath}/images/event-3.jpg" alt="service" />
                    <div class="event-content">
                        <div class="event-date">
                            <p>28</p>
                            <span>May</span>
                        </div>
                        <h5 class="event-title"><a href="#">纸短情长|一封感谢信浓浓医患情！</a></h5>
                        <p><i class="icon icon-Pointer"></i>Victoria, USA</p>
                        <p><i class="icon icon-User"></i><a href="#">Mike Hurry</a></p>
                        <a href="#" class="view-detail">查看详情<i class="fa fa-angle-double-right"></i></a>
                    </div>
                </div>
            </div><!-- Container /- -->
        </div><!-- Event Section /- -->
    </main>
    <!-- Footer Main -->
    <footer id="footer-main" class="footer-main container-fluid no-padding">
        <!-- Top Footer -->
        <div class="top-footer">
            <!-- Container -->
            <div class="container">
                <!-- Widget About -->
                <aside class="col-md-3 col-sm-6 col-xs-6 ftr-widget widget_about">
                    <h3 class="widget-title">关于我们 <span>MAX</span></h3>
                    <p>天使宠物医院是集教学、科研 、临床为一体的的正规化、现代化、专业化大型连锁宠物诊疗机构。由西南大学副教授郑晓波博士1992年始创于成都，在郑小波博士的带领下，经爱美森人多年的努力，现已建成以爱美森兽医服务中心广西总部为中心辐射四川、重庆、西藏、西双版纳等大中城市50余家天使宠物诊疗机构网络，并培养了一大批综合素质高，临床经验丰富的人才队伍。</p>
                    <ul>
                        <li><a href="#" title="Facebook"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#" title="Twitter"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#" title="Google"><i class="fa fa-google-plus"></i></a></li>
                        <li><a href="#" title="linkedin"><i class="fa fa-linkedin"></i></a></li>
                    </ul>
                </aside><!-- Widget About /- -->
                <!-- Widget Links -->
                <aside class="col-md-2 col-sm-6 col-xs-6 ftr-widget widget_links">
                    <h3 class="widget-title">更多链接</h3>
                    <ul>
                        <li><a href="#" title="About Us">预约挂号</a></li>
                        <li><a href="#" title="Our Packages">网上缴费</a></li>
                        <li><a href="#" title="Popular Destination">Popular Destination</a></li>
                        <li><a href="#" title="Top Destination">Top Destination</a></li>
                        <li><a href="#" title="Latest News">Latest News</a></li>
                        <li><a href="#" title="Our Gallery">Our Gallery</a></li>
                    </ul>
                </aside><!-- Widget Links -->
                <!-- Widget Hours -->
                <aside class="col-md-3 col-sm-6 col-xs-6 ftr-widget widget_hours">
                    <h3 class="widget-title">上班时间</h3>
                    <p>Monday <span>-</span> 9:00AM to 6:00PM</p>
                    <p>Tuesday <span>-</span> 9:00AM to 6:00PM</p>
                    <p>Wednesday <span>-</span> 9:00AM to 6:00PM</p>
                    <p>Thursday <span>-</span> 9:00AM to 6:00PM</p>
                    <p>Friday <span>-</span> 9:00AM to 6:00PM</p>
                    <p>Saturday <span>-</span> 9:00AM to 6:00PM</p>
                </aside><!-- Widget Hours /- -->
                <!-- Widget Destination -->
                <aside class="col-md-4 col-sm-6 col-xs-6 ftr-widget widget_destination">
                    <h3 class="widget-title">特色服务</h3>
                    <ul>
                        <li><a href="#" title=""><img src="${pageContext.request.contextPath}/images/desti-1.jpg" alt="desti"></a></li>
                        <li><a href="#" title=""><img src="${pageContext.request.contextPath}/images/desti-2.jpg" alt="desti"></a></li>
                        <li><a href="#" title=""><img src="${pageContext.request.contextPath}/images/desti-3.jpg" alt="desti"></a></li>
                        <li><a href="#" title=""><img src="${pageContext.request.contextPath}/images/desti-4.jpg" alt="desti"></a></li>
                    </ul>
                </aside><!-- Widget Destination /- -->
            </div><!-- Container /- -->
        </div><!-- Top Footer /- -->
    </footer><!-- Footer Main /- -->
    <!-- JQuery v1.11.3 -->
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <!-- Library - Js -->
    <script src="${pageContext.request.contextPath}/libraries/lib.js"></script><!-- Bootstrap JS File v3.3.5 -->
    <!-- RS5.0 Core JS Files -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/revolution/js/jquery.themepunch.tools.min.js?rev=5.0"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/revolution/js/jquery.themepunch.revolution.min.js?rev=5.0"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.video.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/revolution/js/extensions/revolution.extension.actions.min.js"></script>
    <!-- Library - Google Map API -->
    <!---<script src="http://ditu.google.cn/maps/api/js?key=AIzaSyDW40y4kdsjsz714OVTvrw7woVCpD8EbLE"></script>--->
    <!-- Library - Theme JS -->
    <script src="${pageContext.request.contextPath}/js/functions.js"></script>
</body>

</html>