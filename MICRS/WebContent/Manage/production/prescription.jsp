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

    <title>医疗保险中心报销系统</title>

    <!-- Bootstrap -->
    <link href="/MICRS/Manage/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="/MICRS/Manage/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="/MICRS/Manage/vendors/nprogress/nprogress.css" rel="stylesheet">
    <link href="/MICRS/Manage/vendors/iCheck/skins/flat/green.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="/MICRS/Manage/build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md" style="overflow:hidden">
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

                <br/>

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
        <div class="right_col" role="main" id="allPrescriptionTable">
            <div>
                <div class="page-title">
                    <div class="title_left">
                        <h3>报销进行中</h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                            <div class="input-group">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>

                <div class="row">

                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel" id="allPanel" style="height: 700px">
                            <div class="x_content">
                                <!-- Smart Wizard -->
                                <p></p>
                                <div id="wizard" class="form_wizard wizard_horizontal">
                                    <div id="step-3">
                                        <div class="x_panel PrescriptionTable" style="display:block">
                                            <div class="x_title">
                                                <h2 style="font-size:150%">处方信息</h2>
                                                <!--<span style="color: #959595;font-size: x-small;position:absolute;top:25px;right:640px;">填写完成后请点击下一步</span>-->
                                                <div class="clearfix"></div>
                                            </div>
                                            <div class="x_panel" style="height: auto ">
                                                <form class="form-horizontal form-label-left" action="/MICRS/chufang/query"
                                                      onkeyup="calculatePrice(this)" method="post">

                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
                                                               for="first-name"> 住院号（门诊号）<span class="required"></span>
                                                        </label>
                                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                                            <input type="text" id="OUTPATIENT_NUM" required="required" name="OUTPATIENT_NUM"
                                                                   class="form-control col-md-7 col-xs-12" readonly="readonly">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
                                                               for="last-name">项目编码<span class="required"></span>
                                                        </label>
                                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                                            <input type="text" id="MEDICINE_CODE" name="MEDICINE_CODE"
                                                                   required="required"
                                                                   class="form-control col-md-7 col-xs-12">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
                                                               for="last-name">单价<span class="required"></span>
                                                        </label>
                                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                                            <input type="text" required="required" id="PRICE" name="PRICE"
                                                                   class="form-control col-md-7 col-xs-12 inputPrompt prescriptionUnitPrice"
                                                                   onkeyup="checkPrompt()"/>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
                                                               for="last-name">数量<span class="required"></span>
                                                        </label>
                                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                                            <input type="text" required="required"
                                                                   class="form-control col-md-7 col-xs-12 prescriptionNumber"
                                                                   onKeyUp="value=value.replace(/[^\d]/g,'');"
                                                                   id="NUMBER" name="NUMBER"
                                                                   onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
                                                               for="last-name">金额<span class="required"></span>
                                                        </label>
                                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                                            <input type="number" required="required" id="ACCOUNT"
                                                                   class="form-control col-md-7 col-xs-12 prescriptionPrice"
                                                                   readonly="readonly" name="ACCOUNT">
                                                        </div>
                                                    </div>
                                                    <input type="text"  name="weather"
                                                           readonly="readonly" value="insert" style="display:none;">
                                                    <div class="button" align="center">
                                                        <button type="submit" class="btn btn-primary" >确认提交</button>
                                                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                                        <a href="/MICRS/Manage/production/index.jsp">
                                                        <button type="button" class="btn btn-default">返回</button>
                                                        </a>
                                                    </div>
                                                </form>

                                            </div>
                                        </div>

                                    </div>

                                </div>
                            </div>

                            <!-- End SmartWizard Content -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
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

<!-- Custom Theme Scripts -->
<script src="/MICRS/Manage/build/js/custom.min.js"></script>

<script>
	window.onload = function() {
	    var url = window.location.href;
	    var paraString = url.substring(url.indexOf("?") + 1, url.length).split("&");
	    //参数
	    if(paraString[0]!=null && paraString[0]!=""){
		    var outNum = document.getElementById("OUTPATIENT_NUM");
		    outNum.value = paraString[0];
	    }
	    if(paraString[1]!=null && paraString[1]!=""){
		    var outNum = document.getElementById("MEDICINE_CODE");
		    outNum.value = paraString[1];
		    setDefault();
	    }
	    else{
	    }
	}

	function setDefault(){
		var form = document.getElementsByTagName("form")[0];
		form.action="/MICRS/prescriptiondetails/update2";
		var ins = form.getElementsByTagName("input");
		$.ajax({
			url : "/MICRS/chufang/query?weather=one&OUTPATIENT_NUM="+ins[0].value+"&MEDICINE_CODE="+ins[1].value,
			type : "GET",
			dataType : "json",
			success : function(data) {
				var isn = document.getElementsByTagName("input");
				$(data).each(
						function(i, tt) {
							if(i > 1){
								ins[i].value = tt;
							}
						});
			},
			error : function() {
				alert("error");
			}
		});
	}
    function calculatePrice(tar) {
        var unitPrice = (tar.getElementsByClassName("prescriptionUnitPrice"))[0];
        var num = (tar.getElementsByClassName("prescriptionNumber"))[0];
        var price = (tar.getElementsByClassName("prescriptionPrice"))[0];

        unitPrice = parseFloat(unitPrice.value);
        num = parseFloat(num.value);
        price.value = unitPrice * num;
    }

    function deleteTable(deleted) {
        deleted.parentNode.removeChild(deleted);
    }

    function clearTable(now) {
        now.parentNode.previousSibling.previousSibling.reset();
    }
    $(function () {
        var buttonFinish = document.getElementsByClassName("buttonFinish buttonDisabled btn btn-default")[0];
        buttonFinish.onclick = function () {
            var forms = document.getElementsByTagName("form");
            alert(forms.length);
            for (var i = 0; i < forms.length; ++i) {
                forms[i].submit(true);
            }
            window.location.href = "/MICRS/Manage/production/index.jsp";
        };
    });

    function checkOutpatientNumber(){
        var outNum = document.getElementById("outpatientNumber").value;
        var outNumS = document.getElementById("outNumS");
        var sta = /^\d{9}$/;
        if(sta.test(outNum) == false){
            outNumS.innerHTML = "应为9位数字";
            return false;
        }
        else{
            outNumS.innerHTML = "";
            return true;
        }
    }

</script>
</body>

</html>