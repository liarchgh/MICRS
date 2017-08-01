<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
    <%@page import="com.ldt.item.entity.PersonInformation"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
            <h2>John Doe</h2>
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
          <a data-toggle="tooltip" data-placement="top" title="Settings">
            <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
          </a>
          <a data-toggle="tooltip" data-placement="top" title="FullScreen">
            <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
          </a>
          <a data-toggle="tooltip" data-placement="top" title="Lock">
            <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
          </a>
          <a data-toggle="tooltip" data-placement="top" title="Logout" href="/MICRS/Manage/production/login.jsp">
            <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
          </a>
        </div>
        <!-- /menu footer buttons -->
      </div>
    </div>

    <!-- top navigation -->
    <div class="top_nav">
      <div class="nav_menu">
        <nav>
          <div class="nav toggle">
            <a id="menu_toggle"><i class="fa fa-bars"></i></a>
          </div>

          <ul class="nav navbar-nav navbar-right">
            <li class="">
              <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                <img src="/MICRS/Manage/production/images/img.jpg" alt="">综合查询
                <span class=" fa fa-angle-down"></span>
              </a>
              <ul class="dropdown-menu dropdown-usermenu pull-right">
                <li><a href="javascript:;"> 医疗人员费用查询</a></li>
                <li>
                  <a href="javascript:;">
                    <span class="badge bg-red pull-right"></span>
                    <span>背景</span>
                  </a>
                </li>
                <li><a href="javascript:;">帮助</a></li>
                <li><a href="/MICRS/Manage/production/login.jsp"><i class="fa fa-sign-out pull-right"></i> 注销</a></li>
              </ul>
            </li>
            </li>
          </ul>
        </nav>
      </div>
    </div>
    <!-- /top navigation -->

    <!-- page content -->
    <div class="right_col" role="main">
      <div class="">
        <div class="page-title">
          <div class="title_left">
            <h3 class="drug2"> 医疗人员费用查询 </h3>
          </div>

          <div class="title_right">
            <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">

            </div>
          </div>
        </div>

        <div class="clearfix"></div>

        <div class="row">
          <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
              <div class="x_title">
                <h2 class="drug1">欢迎进入医疗人员费用查询！</h2>
                <ul class="nav navbar-right panel_toolbox">
                  <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                  </li>
                  <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                    <ul class="dropdown-menu" role="menu">
                      <li><a href="#">Settings 1</a>
                      </li>
                      <li><a href="#">Settings 2</a>
                      </li>
                    </ul>
                  </li>
                  <li><a class="close-link"><i class="fa fa-close"></i></a>
                  </li>
                </ul>
                <div class="clearfix"></div>
              </div>
              <div class="x_content">

                <div class="row" style="height: auto">

                  <p class="drug3 text-muted font-13 m-b-30">该模块主要功能为查询人员年度已经报销并结算的就诊信息、处方明细信息及年度费用累计信息</p>

                  <div class="container-fluid">
                    <div class="row-fluid">
                      <form action="/MICRS/query/cost" method="post">
                        <div class="" style="height: 90px;">
                          <div id="" style="float: left;">
                            <label><font color="black">人员编码：</font></label><input type="text" value="" class="input-large" name="personid" id="personid" /><br/>  <br/>
                            <label><font color="black">人员名称：</font></label><input type="text" value="" class="input-large" name="personname" id="personname" />
                          </div>
                          <div class="btn-toolbar"
                               style="float: left; margin-top: 45px; margin-left: 40px;">
                            <font color="#6495ed"> <input type="submit" value="查询" class="btn" /></font>
                          </div>
                        </div>
                      </form>
                      
                    </div>
                  </div>

                  <table class="table table-striped projects " id="datatable">
                    <thead>
                    <tr>
                      <th style="width: 15%">用户编号</th>
                      <th style="width: 15%">用户姓名</th>
                      <th style="width: 10%">用户性别</th>
                      <th>医疗人员类别</th>
                      <th>社保卡号</th>
                      <th style="width: 30%">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items = "${requestScope.costlist}" var="d" >
                    <tr>
                       <td>${d.userId}</td>
                       <td>${d.name}</td>
                       <td>${d.sex}</td>
                       <td>${d.medPersNum.medPersClass}</td>
                       <td>${d.securityNum}</td>
                       
                
                      <td>
                        <a href="/MICRS/jiuzhen/query?no=${d.userId}" class="btn btn-primary btn-xs"><i class="fa fa-folder "></i> 查询就诊信息</a>
                        <a href="/MICRS/person/costinformation/query?no=${d.userId}" class="btn btn-info btn-xs "><i class="fa fa-folder"></i>年度费用累计信息</a>
                      </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                  </table>

                </div>
              </div>
            </div>
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
<!--datatable-->
<script src="/MICRS/Manage/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>

<!-- Custom Theme Scripts -->
<script src="/MICRS/Manage/build/js/custom.min.js"></script>
<!-- iCheck -->
<script src="/MICRS/Manage/vendors/iCheck/icheck.min.js"></script>


<script src="/MICRS/Manage/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
<script src="/MICRS/Manage/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
<script src="/MICRS/Manage/vendors/jszip/dist/jszip.min.js"></script>
<script src="/MICRS/Manage/vendors/pdfmake/build/pdfmake.min.js"></script>
<script src="/MICRS/Manage/vendors/pdfmake/build/vfs_fonts.js"></script>
</body>
</html>