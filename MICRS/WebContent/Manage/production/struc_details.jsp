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
    <!-- bootstrap-daterangepicker -->
    <link href="/MICRS/Manage/vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="/MICRS/Manage/build/css/custom.css" rel="stylesheet">

    <script language="JavaScript" type="text/javascript">
        function  printPage(){
            var newWin=window.open();
            var titleHTML=document.getElementById("doctitle").innerHTML;
            newWin.document.write(titleHTML);
            newWin.document.location.reload();
            newWin.print();
        }
</script>
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
        <div class="top_nav">
            <div class="nav_menu">
                <nav>
                    <div class="nav toggle">
                        <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                    </div>

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
                </nav>
            </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>定点医疗机构信息</h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                            <div class="input-group">
                                <span class="input-group-btn">
                          </span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>定点医疗机构信息详情<small>查询定点医疗机构详细信息</small></h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                    </li>
                                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                                    </li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">

                                <form action="" class="form-horizontal form-label-left" novalidate method = "post">

                                    <p>该页面的主要功能是进行<code>定点医疗机构详细信息</code>的查找，带<code>*</code>是<code>必填项</code>，点击此处可以跳转到<a href="/MICRS/Manage/production/struc_query.jsp">查询页面</a>
                                    </p>
                                    <span class="section">定点医疗机构详细信息</span>
                                    <div id="doctitle">
                                    <table class="table table-striped projects">
                                        <tr>
                                            <th style="text-align: right">定点医疗机构编码：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.desiMedInsId }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">服务机构名称：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.serviceName }"readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">医院等级：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.hospitalId.hospitalLevel }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">医院机构类别：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.hoId.medInsClass }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">邮政编码：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.postalCode }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <td style="text-align: right">法定代表人姓名：</td>
                                            <td><input name="" type="text" value="${requestScope.llist.legRepName }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">法人代表移动电话：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.legRepPhone }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">联系人姓名：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.connName }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">联系电话：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.connPhone }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">联系人移动电话：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.connCell }" readonly="readonly"></td>
                                        </tr>
                                        <tr>
                                            <th style="text-align: right">地址：</th>
                                            <td><input name="" type="text" value="${requestScope.llist.addr }" readonly="readonly"></td>
                                        </tr>
                                    </table>
                                    </div>
                                    <div class="ln_solid"></div>
                                    <div class="form-group" align="right">
                                        <!--<div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">-->
                                        <a href="/MICRS/Manage/production/struc_query.jsp">
                                            <button type="button" class="btn btn-primary">取消</button>
                                        </a>
                                        <a>
                                            <button type="button" class="btn btn-success" onclick="printPage()">打印</button>
                                        </a>
                                        <!--</div>-->
                                    </div>
                                </form>
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
                <a href="/MICRS/Manage/production/struc_infor.jsp" target="_blank" title="定点医疗机构信息">定点医疗机构信息</a>
                &nbsp;
                &nbsp;
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
<!-- validator -->
<script src="/MICRS/Manage/vendors/validator/validator.js"></script>

<!-- Custom Theme Scripts -->
<script src="/MICRS/Manage/build/js/custom.min.js"></script>

</body>
</html>