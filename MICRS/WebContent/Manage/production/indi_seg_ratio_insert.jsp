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
    
    <script src="/MICRS/Manage/production/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
    	$(function(){
    		$.ajax({
    					url:"/MICRS/indisegratio/medper/ajax",
    					type:"GET",
    					dataType:"json",
    					success:function(data){
    						var str = "";
    						str = str + "<option></option>";
    						$(data).each(function(i,mp){
    							str = str + "<option value="+mp.medPersNum+">"+mp.medPersClass+"</option>";
    						});
    						$("#med_per_class").html(str);
    					},
    					error:function(){
    						alert("error");
    					}
    			});
    	});
    	$(function(){
    		$.ajax({
    					url:"/MICRS/indisegratio/hosclass/ajax",
    					type:"GET",
    					dataType:"json",
    					success:function(data){
    						var str = "";
    						str = str + "<option></option>";
    						$(data).each(function(i,hc){
    							str = str + "<option value="+hc.hospitalId+">"+hc.hospitalLevel+"</option>";
    						});
    						$("#strucclass").html(str);
    					},
    					error:function(){
    						alert("error");
    					}
    			});
    	});
    	$(function(){
    		$.ajax({
    					url:"/MICRS/indisegratio/indiseg/ajax",
    					type:"GET",
    					dataType:"json",
    					success:function(data){
    						var str = "";
    						str = str + "<option></option>";
    						$(data).each(function(i,ilist){
    							str = str + "<option value="+ilist.indiSegID+">"+ilist.indiSeg+"</option>";
    						});
    						$("#structype").html(str);
    					},
    					error:function(){
    						alert("error");
    					}
    			});
    	});
    	 </script>
    
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <div class="navbar nav_title" style="border: 0;">
                    <a href="index.html" class="site_title"><i class="fa fa-hospital-o"></i> <span>医疗保险中心报销系统</span></a>
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
                                    <li><a href="index.html">报销系统简介</a></li>
                                    <li><a href="main1.html">医疗基本信息简介</a></li>
                                    <li><a href="main2.html">医疗待遇审批简介</a></li>
                                    <li><a href="main3.html">医保中心报销简介</a></li>
                                    <li><a href="main4.html">综合查询简介</a></li>
                                    <li><a href="main5.html">公共业务简介</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-edit"></i> 医疗基本信息 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="drug_infor.html">药品信息</a></li>
                                    <li><a href="project_infor.html">*诊疗项目信息</a></li>
                                    <li><a href="dept_pro.html">*服务设施项目</a></li>
                                    <li><a href="disea_infor.html">病种信息</a></li>
                                    <li><a href="struc_infor.html">定点医疗机构信息</a></li>
                                    <li><a href="acculate.html">医疗报销计算参数</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-desktop"></i> *医疗待遇审批 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="wait1.html">*人员就诊机构审批</a></li>
                                    <li><a href="wait2.html">*特检特治审批</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-medkit"></i> 医保中心报销 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="Reimbursement.html">医保报销</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-table"></i> 综合查询 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="cost_query.html">医疗人员费用查询</a></li>
                                </ul>
                            </li>

                            <li><a><i class="fa fa-briefcase"></i> 公共业务 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="unit_infor.html">单位基本信息</a></li>
                                    <li><a href="person_infor.html">个人基本信息</a></li>
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
                    <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
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
                                <img src="/MICRS/Manage/production/images/img.jpg" alt="">医疗基本信息
                                <span class=" fa fa-angle-down"></span>
                            </a>
                            <ul class="dropdown-menu dropdown-usermenu pull-right">
                                <li><a href="javascript:;"> 定点医疗机构信息</a></li>
                                <li>
                                    <a href="javascript:;">
                                        <!-- <span class="badge bg-red pull-right">50%</span>-->
                                        <span>背景</span>
                                    </a>
                                </li>
                                <li><a href="javascript:;">帮助</a></li>
                                <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> 注销</a></li>
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
                        <h3>个人分段自费比例详细信息</h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="Search for...">
                                <span class="input-group-btn">
                              <button class="btn btn-default" type="button">点击查询!</button>
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
                                <h2>个人分段自费比例信息添加<small>添加个人分段自费比例详细信息</small></h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                    </li>
                                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                                    </li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">

                                <form action="/MICRS/indisegratio/insert" class="form-horizontal form-label-left" novalidate method = "post">

                                    <p>该页面的主要功能是进行<code>个人分段自费比例基本信息</code>的添加，带<code>*</code>是<code>必填项</code>，点击此处可以跳转到<a href="indi_seg_ratio.html">查询页面</a>
                                    </p>
                                    <span class="section">个人分段自费比例基本信息</span>

                                   <!-- <div class="item form-group">
                                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="ppid">个人自费编号<span class="required">*</span>
                                        </label>
                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                            <input id="ppid" class="form-control col-md-7 col-xs-12" name="ppid"  data-validate-length-range="1,9" placeholder="六位0~9之间的数字" required="required" type="number">
                                        </div>
                                    </div>-->


                                    <div class="form-group">
                                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="med_per_class">医疗人员类别 <span class="required">*</span></label>
                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                            <select class="form-control col-md-7 col-xs-12" id="med_per_class" required="required" name="med_per_class" style="width: 583px">
                                                
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="strucclass">医院等级 <span class="required">*</span></label>
                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                            <select class="form-control col-md-7 col-xs-12" id="strucclass" name="strucclass" style="width: 583px">
                                                
                                            </select>
                                        </div>
                                    </div>


                                    <div class="form-group">
                                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="structype">医疗类别 <span class="required">*</span></label>
                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                            <select class="form-control col-md-7 col-xs-12" id="structype" name="structype" style="width: 583px">
                                                
                                            </select>
                                        </div>
                                    </div>

                                    <div class="item form-group">
                                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="top_m">上限金额<span class="required">*</span>
                                        </label>
                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                            <input id="top_m" class="form-control col-md-7 col-xs-12" name="top_m"  data-validate-length-range="1,14" placeholder="1111.11" required="required" type="number">
                                        </div>
                                    </div>

                                    <div class="item form-group">
                                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="bottom_m">下限金额<span class="required">*</span>
                                        </label>
                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                            <input id="bottom_m" class="form-control col-md-7 col-xs-12" name="bottom_m"  data-validate-length-range="1,9" placeholder="111.11" required="required" type="number">
                                        </div>
                                    </div>

                                    <div class="item form-group">
                                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="bratio">报销比例<span class="required">*</span>
                                        </label>
                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                            <input id="bratio" class="form-control col-md-7 col-xs-12" name="bratio"  data-validate-length-range="1,9" placeholder="九位0~9之间的数字" required="required" type="number">
                                        </div>
                                    </div>


                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
                                            <a href="indi_seg_ratio.html">
                                                <button type="button" class="btn btn-primary">取消</button>
                                            </a>
                                            <button type="reset" class="btn btn-primary">重置</button>
                                            <button type="submit" class="btn btn-success">提交</button>
                                        </div>
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
                <a href="acculate.html" target="_blank" title="医疗待遇计算参数信息维护">返回</a>
                &nbsp;
                &nbsp;
                <a href="index.html" target="_blank" title="主页">主页</a>
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