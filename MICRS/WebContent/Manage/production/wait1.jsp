<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>医疗保险中心报销系统 </title>

    <!-- Bootstrap -->
    <link href="/MICRS/Manage/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="/MICRS/Manage/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="/MICRS/Manage/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="/MICRS/Manage/vendors/iCheck/skins/flat/green.css" rel="stylesheet">
	
    <!-- bootstrap-progressbar -->
    <link href="/MICRS/Manage/vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="/MICRS/Manage/vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="/MICRS/Manage/vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="/MICRS/Manage/build/css/custom.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="/MICRS/Manage/production/index.jsp" class="site_title"><i class="fa fa-hospital-o"></i> <span>医疗保险中心报销系统</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="/MICRS/Manage/production/images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>欢迎,</span>
                <h2>${sessionScope.user.account }</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>系统业务</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> 主页 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/MICRS/Manage/production/index.jsp">报销系统简介</a></li>
                      <li><a href="/MICRS/Manage/production/main1.jsp">医疗基本信息简介</a></li>
                      <li><a href="/MICRS/Manage/production/main2.jsp">医疗待遇审批简介</a></li>
                      <li><a href="/MICRS/Manage/production/main3.jsp">医保中心报销简介</a></li>
                      <li><a href="/MICRS/Manage/production/main4.jsp">综合查询简介</a></li>
                      <li><a href="/MICRS/Manage/production/main5.jsp">公共业务简介</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-edit"></i> 医疗基本信息 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/MICRS/Manage/production/drug_infor.jsp">药品信息</a></li>
                      <li><a href="/MICRS/Manage/production/project_infor.jsp">*诊疗项目信息</a></li>
                      <li><a href="/MICRS/Manage/production/dept_pro.jsp">*服务设施项目</a></li>
                      <li><a href="/MICRS/Manage/production/disea_infor.jsp">病种信息</a></li>
                      <li><a href="/MICRS/Manage/production/struc_infor.jsp">定点医疗机构信息</a></li>
                      <li><a href="/MICRS/Manage/production/acculate.jsp">医疗报销计算参数</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-desktop"></i> *医疗待遇审批 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/MICRS/Manage/production/wait1.jsp">*人员就诊机构审批</a></li>
                      <li><a href="/MICRS/Manage/production/wait2.jsp">*特检特治审批</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-medkit"></i> 医保中心报销 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/MICRS/Manage/production/Reimbursement.jsp">医保报销</a></li>
                      <li><a href="/MICRS/Manage/production/CenterTreatment.jsp">就诊信息查询（报销相关）</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-table"></i> 综合查询 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/MICRS/Manage/production/cost_query.jsp">医疗人员费用查询</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-briefcase"></i> 公共业务 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/MICRS/Manage/production/unit_infor.jsp">单位基本信息</a></li>
                      <li><a href="/MICRS/Manage/production/person_infor.jsp">个人基本信息</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="/MICRS/Manage/production/login.jsp">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <ul class="nav navbar-nav navbar-right">
          <li class="">
            <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
              <img src="/MICRS/Manage/production/images/img.jpg" alt="">${sessionScope.user.account }
              <span class=" fa fa-angle-down"></span>
            </a>
            <ul class="dropdown-menu dropdown-usermenu pull-right">
              <li><a href="/MICRS/Manage/production/login.jsp"><i class="fa fa-sign-out pull-right"></i> 注销</a></li>
            </ul>
          </li>



        </ul>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <!-- top tiles -->
          <div class="row tile_count">
            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-user"></i> 系统使用人数</span>
              <div class="count">2500</div>
              <span class="count_bottom"><i class="green">4% </i> 上周</span>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-clock-o"></i> 个人平均使用时间</span>
              <div class="count">10min</div>
              <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>3% </i> 上周</span>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-user"></i> 男性使用人数</span>
              <div class="count green">1,000</div>
              <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>40% </i> 上周</span>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-user"></i> 女性使用人数</span>
              <div class="count">1,500</div>
              <span class="count_bottom"><i class="red"><i class="fa fa-sort-desc"></i>60% </i> 上周</span>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-user"></i> 好评人数 </span>
              <div class="count">2，500</div>
              <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>100% </i> 上周</span>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-user"></i> 差评人数</span>
              <div class="count">0</div>
              <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>0% </i> 上周</span>
            </div>
          </div>
          <!-- /top tiles -->

          <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="dashboard_graph">

                <div class="row x_title">
                  <div class="col-md-6">
                    <h3>医疗报销人数比例情况统计 <small>医疗报销比例</small></h3>
                  </div>
                  <div class="col-md-6">
                    <div id="reportrange" class="pull-right" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
                      <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                      <span>December 30, 2014 - January 28, 2015</span> <b class="caret"></b>
                    </div>
                  </div>
                </div>

                <div class="col-md-9 col-sm-9 col-xs-12">
                  <div id="chart_plot_01" class="demo-placeholder"></div>
                </div>
                <div class="col-md-3 col-sm-3 col-xs-12 bg-white">
                  <div class="x_title">
                    <h2>报销政策满意度</h2>
                    <div class="clearfix"></div>
                  </div>

                  <div class="col-md-12 col-sm-12 col-xs-6">
                    <div>
                      <p>满意</p>
                      <div class="">
                        <div class="progress progress_sm" style="width: 76%;">
                          <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="80"></div>
                        </div>
                      </div>
                    </div>
                    <div>
                      <p>还好</p>
                      <div class="">
                        <div class="progress progress_sm" style="width: 76%;">
                          <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="60"></div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-md-12 col-sm-12 col-xs-6">
                    <div>
                      <p>一般</p>
                      <div class="">
                        <div class="progress progress_sm" style="width: 76%;">
                          <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="20"></div>
                        </div>
                      </div>
                    </div>
                    <div>
                      <p>差评</p>
                      <div class="">
                        <div class="progress progress_sm" style="width: 76%;">
                          <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="8"></div>
                        </div>
                      </div>
                    </div>
                  </div>

                </div>

                <div class="clearfix"></div>
              </div>
            </div>

          </div>
          <br />


          <div class="row">
            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2 style="font-weight: bold">报销系统简介</h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
                  <div class="dashboard-widget-content">

                    <ul class="list-unstyled timeline widget">
                      <li>
                        <div class="block">
                          <div class="block_content">
                            <h2 class="title">
                                              <a>医疗基本信息</a>
                                          </h2>
                            <p class="excerpt">医疗基本信息模块下属包含了六个模块，分别为药品信息，诊疗项目，服务设施项目，病种信息，定点医疗机构信息，医疗报销计算参数......<a href="/MICRS/Manage/production/main1.jsp">点击查看更多</a>
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            <h2 class="title">
                                              <a>医疗待遇审批</a>
                                          </h2>
                            <p class="excerpt">医疗待遇审批模块下属包含了两个模块，分别为人员机构审批模块和特检特质审批...... <a href="/MICRS/Manage/production/main2.jsp">点击查看更多</a>
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            <h2 class="title">
                                              <a>医保中心报销</a>
                                          </h2>医保中心报销为该系统的主要模块，在该模块下，用户可以在系统中进行业务的报销活动......<a href="/MICRS/Manage/production/main3.jsp">点击查看更多</a>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            <h2 class="title">
                                              <a>综合查询</a>
                                          </h2>
                            <p class="excerpt">该模块主要进医疗人员的费用查询.....<a href="/MICRS/Manage/production/main4.jsp">点击查看更多</a>
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            <h2 class="title">
                              <a>公共业务</a>
                            </h2>
                            <p class="excerpt">公共业务模块主要包含了个人基本信息和单位基本信息查询......<a href="/MICRS/Manage/production/main5.jsp">点击查看更多</a>
                            </p>
                          </div>
                        </div>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>


            <div class="col-md-8 col-sm-8 col-xs-12">



              <div class="row">

                <div class="col-md-12 col-sm-12 col-xs-12">
                  <div class="x_panel">
                    <div class="x_title">
                      <h2 style="font-weight: bold">世界医疗待遇审批政策实施状况统计</h2>
                      <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>>
                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                      </ul>
                      <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                      <div class="dashboard-widget-content">
                        <div class="col-md-4 hidden-small">
                          <h2 class="line_30">世界各国视野选择</h2>

                          <table class="countries_list">
                            <tbody>
                              <tr>
                                <td>United States</td>
                                <td class="fs15 fw700 text-right">80%</td>
                              </tr>
                              <tr>
                                <td>France</td>
                                <td class="fs15 fw700 text-right">77%</td>
                              </tr>
                              <tr>
                                <td>Germany</td>
                                <td class="fs15 fw700 text-right">88%</td>
                              </tr>
                              <tr>
                                <td>Spain</td>
                                <td class="fs15 fw700 text-right">78%</td>
                              </tr>
                              <tr>
                                <td>Britain</td>
                                <td class="fs15 fw700 text-right">69%</td>
                              </tr>
                            </tbody>
                          </table>
                        </div>
                        <div id="world-map-gdp" class="col-md-8 col-sm-12 col-xs-12" style="height:230px;"></div>
                      </div>
                    </div>
                  </div>
                </div>

              </div>
              <div class="row">


                <!-- Start to do list -->
                <div class="col-md-6 col-sm-6 col-xs-12">
                  <div class="x_panel">
                    <div class="x_title">
                      <h2 style="font-weight: bold">报销医疗日志</h2>
                      <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                      </ul>
                      <div class="clearfix"></div>
                    </div>
                    <div class="x_content">

                      <div class="">
                        <ul class="to_do">
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第一天 </p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第二天</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第三天</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第四天</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第五天</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第六天</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第七天</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第八天</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> 报销医疗第九天</p>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
                <!-- End to do list -->
                
                <!-- start of weather widget -->
                <div class="col-md-6 col-sm-6 col-xs-12">
                  <div class="x_panel">
                    <div class="x_title">
                      <h2>每周天气预报查询</h2>
                      <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                      </ul>
                      <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                      <div class="row">
                        <div class="col-sm-12">
                          <div class="temperature"><b>周五</b>, 07:30
                          </div>
                        </div>
                      </div>
                      <div class="row">
                        <div class="col-sm-4">
                          <div class="weather-icon">
                            <canvas height="84" width="84" id="partly-cloudy-day"></canvas>
                          </div>
                        </div>
                        <div class="col-sm-8">
                          <div class="weather-text">
                            <h2>大连 <br><i>晴</i></h2>
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-12">
                        <div class="weather-text pull-right">
                          <h3 class="degrees">23</h3>
                        </div>
                      </div>

                      <div class="clearfix"></div>

                      <div class="row weather-days">
                        <div class="col-sm-2">
                          <div class="daily-weather">
                            <h2 class="day">周五</h2>
                            <h3 class="degrees">23</h3>
                            <canvas id="clear-day" width="32" height="32"></canvas>
                            <h5>15 <i>km/h</i></h5>
                          </div>
                        </div>
                        <div class="col-sm-2">
                          <div class="daily-weather">
                            <h2 class="day">周六</h2>
                            <h3 class="degrees">25</h3>
                            <canvas height="32" width="32" id="rain"></canvas>
                            <h5>12 <i>km/h</i></h5>
                          </div>
                        </div>
                        <div class="col-sm-2">
                          <div class="daily-weather">
                            <h2 class="day">周日</h2>
                            <h3 class="degrees">27</h3>
                            <canvas height="32" width="32" id="snow"></canvas>
                            <h5>14 <i>km/h</i></h5>
                          </div>
                        </div>
                        <div class="col-sm-2">
                          <div class="daily-weather">
                            <h2 class="day">周一</h2>
                            <h3 class="degrees">28</h3>
                            <canvas height="32" width="32" id="sleet"></canvas>
                            <h5>15 <i>km/h</i></h5>
                          </div>
                        </div>
                        <div class="col-sm-2">
                          <div class="daily-weather">
                            <h2 class="day">周二</h2>
                            <h3 class="degrees">28</h3>
                            <canvas height="32" width="32" id="wind"></canvas>
                            <h5>11 <i>km/h</i></h5>
                          </div>
                        </div>
                        <div class="col-sm-2">
                          <div class="daily-weather">
                            <h2 class="day">周三</h2>
                            <h3 class="degrees">26</h3>
                            <canvas height="32" width="32" id="cloudy"></canvas>
                            <h5>10 <i>km/h</i></h5>
                          </div>
                        </div>
                    </div>
                  </div>

                </div>
                <!-- end of weather widget -->
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            <a href="/MICRS/Manage/production/index.jsp" target="_blank" title="主页">主页</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>

    <!-- jQuery -->
    <script src="/MICRS/Manage/vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="/MICRS/Manage/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="/MICRS/Manage/vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="/MICRS/Manage/vendors/nprogress/nprogress.js"></script>
    <!-- Chart.js -->
    <script src="/MICRS/Manage/vendors/Chart.js/dist/Chart.min.js"></script>
    <!-- gauge.js -->
    <script src="/MICRS/Manage/vendors/gauge.js/dist/gauge.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="/MICRS/Manage/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="/MICRS/Manage/vendors/iCheck/icheck.min.js"></script>
    <!-- Skycons -->
    <script src="/MICRS/Manage/vendors/skycons/skycons.js"></script>
    <!-- Flot -->
    <script src="/MICRS/Manage/vendors/Flot/jquery.flot.js"></script>
    <script src="/MICRS/Manage/vendors/Flot/jquery.flot.pie.js"></script>
    <script src="/MICRS/Manage/vendors/Flot/jquery.flot.time.js"></script>
    <script src="/MICRS/Manage/vendors/Flot/jquery.flot.stack.js"></script>
    <script src="/MICRS/Manage/vendors/Flot/jquery.flot.resize.js"></script>
    <!-- Flot plugins -->
    <script src="/MICRS/Manage/vendors/flot.orderbars/js/jquery.flot.orderBars.js"></script>
    <script src="/MICRS/Manage/vendors/flot-spline/js/jquery.flot.spline.min.js"></script>
    <script src="/MICRS/Manage/vendors/flot.curvedlines/curvedLines.js"></script>
    <!-- DateJS -->
    <script src="/MICRS/Manage/vendors/DateJS/build/date.js"></script>
    <!-- JQVMap -->
    <script src="/MICRS/Manage/vendors/jqvmap/dist/jquery.vmap.js"></script>
    <script src="/MICRS/Manage/vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
    <script src="/MICRS/Manage/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="/MICRS/Manage/vendors/moment/min/moment.min.js"></script>
    <script src="/MICRS/Manage/vendors/bootstrap-daterangepicker/daterangepicker.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="/MICRS/Manage/build/js/custom.min.js"></script>
	
  </body>
</html>
