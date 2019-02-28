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
    <title>动态</title>
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
        <!-- Page Banner -->
        <div class="page-banner blog-banner container-fluid no-padding">
            <div class="banner-content">
                <h3>最近动态</h3>
                <ol class="breadcrumb">
                    <li><a href="index.html" title="Home">主页</a></li>
                    <li class="active">最近动态</li>
                </ol>
            </div>
        </div><!-- Page Banner /- -->
        <!-- Container -->
        <div class="container">
            <!-- Content Area -->
            <div class="content-area blog-section col-md-8 col-sm-8 col-xs-12">
                <article class="type-post">
                    <div class="entry-cover">
                        <a title="Blog" href="blog-post.html">
                            <img alt="blog" src="${pageContext.request.contextPath}/images/blog-1.jpg" />
                        </a>
                    </div>
                    <div class="blog-content">
                        <div class="entry-header">
                            <div class="entry-meta">
                                <div class="post-admin">发布者： <a href="#" title="20 Comments">管理员</a></div>
                                <div class="post-date"><a href="#" title="May 10, 2016">2018年10月</a></div>
                            </div>
                            <h3 class="entry-title"><a title="免疫失败的原因" href="blog-post.html">免疫失败的原因</a></h3>
                        </div>
                        <div class="entry-content">
                            <p> 疫苗接种是预防犬传染性疾病的有效方法之一，在所有的预防措施中，免疫接种在犬传染性疾病的防治中具有及其重要的意义。但是免疫接种能否获得成功，不但取决于接种时疫苗的质量、接种途径和免疫程序等外部条件，还取决于机体的免疫应答能力这一内部因素。兽医临床上也经常遇到这样的情况，一些犬接种疫苗后，常常会出现不能抵御相应特定疾病的发生。引起免疫失败的因素很多，了解其原因，有助于减少免疫失败造成的损失。</p>
                        </div>
                        <a href="blog-post.html" class="read-more"><i class="fa fa-angle-right"></i></a>
                    </div>
                </article>
                <article class="type-post">
                    <div class="entry-cover">
                        <a title="Blog" href="blog-post.html">
                            <img alt="blog" src="${pageContext.request.contextPath}/images/blog-2.jpg" />
                        </a>
                    </div>
                    <div class="blog-content">
                        <div class="entry-header">
                            <div class="entry-meta">
                                <div class="post-admin">By <a href="#" title="20 Comments">Admin</a></div>
                                <div class="post-date"><a href="#" title="May 10, 2016">May 10, 2016</a></div>
                            </div>
                            <h3 class="entry-title"><a title="母源抗体干扰" href="blog-post.html">母源抗体干扰 </a></h3>
                        </div>
                        <div class="entry-content">
                            <p>这是免疫失败最常见的因素之一。一定水平的母源抗体，对于保护幼犬避免早期感染传染性疾病具有及其重要的意义。但由于种犬个体免疫应答的差异，以及种犬所用疫苗的不同（所诱导的母源抗体滴度也存在较大的差异），造成不同来源的幼犬母源抗体水平参差不齐。如果所有幼犬均固定在相同日龄进行首免，母源抗体过高的幼犬反而可干扰疫苗的免疫应答，而母源抗体过低的幼犬则可能在接种疫苗时处于传染病潜伏感染期，从而导致免疫失败。即使是来自同一种母犬的幼犬不同个体之间母源抗体滴度也不一定完全一致，若采用固定的首免程序，则同样会干扰疫苗免疫应答，导致免疫失败。</p>
                        </div>
                        <a href="blog-post.html" class="read-more"><i class="fa fa-angle-right"></i></a>
                    </div>
                </article>
                <article class="type-post">
                    <div class="entry-cover">
                        <a title="Blog" href="blog-post.html">
                            <img alt="blog" src="${pageContext.request.contextPath}/images/blog-3.jpg" />
                        </a>
                    </div>
                    <div class="blog-content">
                        <div class="entry-header">
                            <div class="entry-meta">
                                <div class="post-admin">By <a href="#" title="20 Comments">Admin</a></div>
                                <div class="post-date"><a href="#" title="May 10, 2016">May 09, 2016</a></div>
                            </div>
                            <h3 class="entry-title"><a title="营养因素" href="blog-post.html">营养因素</a></h3>
                        </div>
                        <div class="entry-content">
                            <p>抗原进入机体，产生不同水平的免疫反应——细胞免疫和体液免疫，它们都需要一定的营养物质。营养物质缺乏或不足，尤其是维生素A、D、B、E和多种微量元素及全价蛋白缺乏时，均会影响免疫抗体的生成速度或生成的数量，从而导致免疫反应滞后或免疫应答能力下降，导致免疫失败。</p>
                        </div>
                        <a href="blog-post.html" class="read-more"><i class="fa fa-angle-right"></i></a>
                    </div>
                </article>
                <nav class="ow-pagination text-center">
                    <ul class="pagination">
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#"><i class="fa fa-angle-double-right"></i></a></li>
                    </ul>
                </nav>
            </div><!-- Content Area /- -->
            <!-- Widget Area -->
            <div class="col-md-4 col-sm-4 col-xs-12 widget-area">
                <!-- Widget Search -->
                <aside class="widget widget_search">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="搜索">
                        <span class="input-group-btn">
                            <button class="btn btn-search" title="Search" type="button"><i class="icon icon-Search"></i></button>
                        </span>
                    </div>
                </aside><!-- Widget Search /- -->
                <!-- Widget Categories -->
                <aside class="widget widget_categories">
                    <h3 class="widget-title">分类</h3>
                    <ul>
                        <li><a href="#" title="Best Destination">医院公告</a></li>
                        <li><a href="#" title="Family Destination">新闻中心</a></li>
                        <li><a href="#" title="Costly Destination">养宠科普</a></li>
                        <li><a href="#" title="Office Cleaning">文化生活</a></li>
                        <li><a href="#" title="World Tour">人才招聘</a></li>
                    </ul>
                </aside><!-- Widget Categories /-  -->
                <!-- Widget Latest Post -->
                <aside class="widget widget_latestposts">
                    <h3 class="widget-title">最新文章</h3>
                    <div class="latest-content">
                        <a href="blog-post.html" title="Recent Posts"><i><img alt="thumb" src="${pageContext.request.contextPath}/images/latest-post-1.jpg"></i></a>
                        <h5><a title="养宠科普" href="blog-post.html">养宠科普养宠科普养宠科普养宠科普养宠科普养宠科普养宠科普养宠科普养宠科普</a></h5>
                        <span>2018年12月5号</span>
                    </div>
                    <div class="latest-content">
                        <a href="blog-post.html" title="Recent Posts"><i><img alt="thumb" src="${pageContext.request.contextPath}/images/latest-post-2.jpg"></i></a>
                        <h5><a title="动物疫苗" href="blog-post.html">动物疫苗动物疫苗动物疫苗动物疫苗动物疫苗动物疫苗动物疫苗动物疫苗动物疫苗</a></h5>
                        <span>2018年12月5号</span>
                    </div>
                </aside><!-- Widget Latest Post /- -->
                <!-- Widget Tags -->
                <aside class="widget widget_tags">
                    <h3 class="widget-title">热门标签</h3>
                    <a href="#" title="Rooms">疫苗</a>
                    <a href="#" title="Packages">公告</a>
                    <a href="#" title="Resorts">科普</a>
                    <a href="#" title="Travels">招聘</a>
                    <a href="#" title="Food">新闻</a>
                </aside><!-- Widget Tags /- -->
            </div><!-- Widget Area /- -->
        </div><!-- Container /- -->
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
    <!-- Library - Google Map API -->
    <!---<script src="http://ditu.google.cn/maps/api/js?key=AIzaSyDW40y4kdsjsz714OVTvrw7woVCpD8EbLE"></script>--->
    <!-- Library - Theme JS -->
    <script src="${pageContext.request.contextPath}/js/functions.js"></script>
</body>

</html>