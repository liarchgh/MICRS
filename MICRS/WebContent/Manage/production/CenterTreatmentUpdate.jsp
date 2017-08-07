<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.ldt.item.entity.PersMedInfor"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link href="/MICRS/Manage/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="/MICRS/Manage/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="/MICRS/Manage/vendors/nprogress/nprogress.css"
	rel="stylesheet">
<!-- bootstrap-daterangepicker -->
<link
	href="/MICRS/Manage/vendors/bootstrap-daterangepicker/daterangepicker.css"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="/MICRS/Manage/build/css/custom.css" rel="stylesheet">
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="/MICRS/Manage/production/index.jsp" class="site_title"><i
							class="fa fa-hospital-o"></i> <span>医疗保险中心报销系统</span></a>
					</div>

					<div class="clearfix"></div>

					<!-- menu profile quick info -->
					<div class="profile clearfix">
						<div class="profile_pic">
							<img src="/MICRS/Manage/production/images/img.jpg" alt="..."
								class="img-circle profile_img">
						</div>
						<div class="profile_info">
							<span>欢迎,</span>
							<h2>${sessionScope.user.account }</h2>
						</div>
					</div>
					<!-- /menu profile quick info -->

					<br />

					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">
						<div class="menu_section">
							<h3>系统业务</h3>
							<ul class="nav side-menu">
								<li><a><i class="fa fa-home"></i> 主页 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="/MICRS/Manage/production/index.jsp">报销系统简介</a></li>
										<li><a href="/MICRS/Manage/production/main1.jsp">医疗基本信息简介</a></li>
										<li><a href="/MICRS/Manage/production/main2.jsp">医疗待遇审批简介</a></li>
										<li><a href="/MICRS/Manage/production/main3.jsp">医保中心报销简介</a></li>
										<li><a href="/MICRS/Manage/production/main4.jsp">综合查询简介</a></li>
										<li><a href="/MICRS/Manage/production/main5.jsp">公共业务简介</a></li>
									</ul></li>

								<li><a><i class="fa fa-edit"></i> 医疗基本信息 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="/MICRS/Manage/production/drug_infor.jsp">药品信息</a></li>
										<li><a href="/MICRS/Manage/production/project_infor.jsp">*诊疗项目信息</a></li>
										<li><a href="/MICRS/Manage/production/dept_pro.jsp">*服务设施项目</a></li>
										<li><a href="/MICRS/Manage/production/disea_infor.jsp">病种信息</a></li>
										<li><a href="/MICRS/Manage/production/struc_infor.jsp">定点医疗机构信息</a></li>
										<li><a href="/MICRS/Manage/production/acculate.jsp">医疗报销计算参数</a></li>
									</ul></li>

								<li><a><i class="fa fa-desktop"></i> *医疗待遇审批 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="/MICRS/Manage/production/wait1.jsp">*人员就诊机构审批</a></li>
										<li><a href="/MICRS/Manage/production/wait2.jsp">*特检特治审批</a></li>
									</ul></li>

								<li><a><i class="fa fa-medkit"></i> 医保中心报销 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="/MICRS/Manage/production/Reimbursement.jsp">医保报销</a></li>
										<li><a href="/MICRS/Manage/production/CenterTreatment.jsp">就诊信息查询（报销相关）</a></li>
									</ul></li>

								<li><a><i class="fa fa-table"></i> 综合查询 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="/MICRS/Manage/production/cost_query.jsp">医疗人员费用查询</a></li>
									</ul></li>

								<li><a><i class="fa fa-briefcase"></i> 公共业务 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="/MICRS/Manage/production/unit_infor.jsp">单位基本信息</a></li>
										<li><a href="/MICRS/Manage/production/person_infor.jsp">个人基本信息</a></li>
									</ul></li>
							</ul>
						</div>
					</div>
					<!-- /sidebar menu -->

					<!-- /menu footer buttons -->
					<div class="sidebar-footer hidden-small">
						<a data-toggle="tooltip" data-placement="top" title="Logout"
							href="/MICRS/Manage/production/login.jsp"> <span class="glyphicon glyphicon-off"
							aria-hidden="true"></span>
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
							<li class=""><a href="javascript:;"
								class="user-profile dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false"> <img
									src="/MICRS/Manage/production/images/img.jpg" alt="">${sessionScope.user.account }
									 <span class=" fa fa-angle-down"></span>
							</a>
								<ul class="dropdown-menu dropdown-usermenu pull-right">
									
									<li><a href="/MICRS/Manage/production/login.jsp"><i
											class="fa fa-sign-out pull-right"></i> 注销</a></li>
								</ul></li>

							
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
							<h3 class="drug2">医疗人员费用查询</h3>
						</div>

						<div class="title_right">
							<div
								class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
								<div class="input-group">
									 <span
										class="input-group-btn">
								
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
									<h2 style="font-size: 150%">就诊信息</h2>
									<!--<span style="color: #959595;font-size: x-small;position:absolute;top:25px;right:640px;">填写完成后请点击下一步</span>-->
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<form class="form-horizontal form-label-left SubmitForm" method="post"
										target="nm_iframe" action="/MICRS/persMedInfor/update2">

										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag">
												住院号（门诊号）<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="text" id="outpatientNumber"
													class="form-control col-md-7 col-xs-12 prescriptionNumber"
													name="outpatient" readonly="readonly" value="120">
											</div>
											<span id="outNumS" class="warning"></span>
										</div>
										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">人员ID<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="text"
													class="form-control col-md-7 col-xs-12 prescriptionNumber" name="no"
													readonly="readonly">
											</div>
										</div>
										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">服务机构名称 <span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<select class="select2_group form-control" name="desiMedIns"
													id="desiMedIns">
												</select>
											</div>
										</div>
										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">医疗类别<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<select class="select2_group form-control" name="indiSegId">
													<option value="2">城镇居民医疗</option>
													<option value="3">新农合</option>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">入院日期<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<fieldset>
													<div class="control-group">
														<div class="controls">
															<div class="input-prepend input-group">
																<span class="add-on input-group-addon"><i
																	class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
																<input type="date" class="form-control" name="inDate"
																	id="inDate" onblur="checkDate()">
															</div>
														</div>
													</div>
												</fieldset>
											</div>
											<span id="dateS" class="warning"></span>
										</div>
										<div class="form-group" onblur="checkDate()">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">出院日期<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<fieldset>
													<div class="control-group">
														<div class="controls">
															<div class="input-prepend input-group">
																<span class="add-on input-group-addon"><i
																	class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
																<input type="date" class="form-control" name="outDate"
																	id="outDate" onblur="checkDate()">
															</div>
														</div>
													</div>
												</fieldset>
											</div>
										</div>
										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">病种名称<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<select class="select2_group form-control" name="disease"
													id="disease">
												</select>
											</div>
											<!-- <div class="col-md-6 col-sm-6 col-xs-12">
                                                            <input type="text" name="disease" class="form-control col-md-7 col-xs-12 prescriptionNumber"
                                                            id="disease" readonly="readonly">
                                                        </div> -->
										</div>
										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">医院等级<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<select class="select2_group form-control" name="hospitalId">
													<option value="2">一级</option>
													<option value="3">二级</option>
													<option value="4">三级</option>
													<option value="5">四级</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">入院诊断疾病名称<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<select class="select2_group form-control" name="disNum"
													id="diseaseInf">
												</select>
											</div>
										</div>
										<div class="form-group">
											<label
												class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
												for="last-name">出院原因<span class="required"></span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<textarea id="last-name" name="outReason"
													required="required" class="form-control col-md-7 col-xs-12"></textarea>
											</div>
										</div>
										<!-- <div align="center">
										<input type="submit" class="buttonNext btn btn-success" value="确认修改">
										<input type="submit" value="test">
										</div> -->
										<div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
                                            <button type="submit" class="buttonNext btn btn-success">提交</button>
                                        </div>
                                    </div>
									</form>
								<!-- 	<div align="center">
										<button class="buttonNext btn btn-success"
											onclick="setDefault()">重置</button>
									</div> -->
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
	<script
		src="/MICRS/Manage/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>

	<!-- Custom Theme Scripts -->
	<script src="/MICRS/Manage/build/js/custom.min.js"></script>
	<!-- iCheck -->
	<script src="/MICRS/Manage/vendors/iCheck/icheck.min.js"></script>


	<script
		src="/MICRS/Manage/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
	<script
		src="/MICRS/Manage/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
	<script src="/MICRS/Manage/vendors/jszip/dist/jszip.min.js"></script>
	<script src="/MICRS/Manage/vendors/pdfmake/build/pdfmake.min.js"></script>
	<script src="/MICRS/Manage/vendors/pdfmake/build/vfs_fonts.js"></script>
<script>
	function setDefault(){
		var form = document.getElementsByTagName("form")[0];
		var ins = form.getElementsByTagName("input");
		var ses = form.getElementsByTagName("select");
		var tes = form.getElementsByTagName("textarea");
		$.ajax({
			url : "/MICRS/jiuzhen/query?weather=one&outpatient="+ins[0].value,
			type : "GET",
			dataType : "json",
			success : function(data) {
					ins[1].value = data[1];
					var desMI = ses[0].getElementsByTagName("option");
					for(var i = 0; i < desMI.length; ++i){
						if(desMI[i].value == data[0]){
							desMI[i].selected = true;
							break;
						}
					}
					desMI = ses[1].getElementsByTagName("option");
					for(var i = 0; i < desMI.length; ++i){
						if(desMI[i].value == data[1]){
							desMI[i].selected = true;
							break;
						}
					}
					ins[2].value = data[2].split(" ")[0];
					ins[3].value = data[3].split(" ")[0];
					desMI = ses[2].getElementsByTagName("option");
					for(var i = 0; i < desMI.length; ++i){
						if(desMI[i].value == data[4]){
							desMI[i].selected = true;
							break;
						}
					}
					desMI = ses[3].getElementsByTagName("option");
					for(var i = 0; i < desMI.length; ++i){
						if(desMI[i].value == data[5]){
							desMI[i].selected = true;
							break;
						}
					}
					desMI = ses[4].getElementsByTagName("option");
					for(var i = 0; i < desMI.length; ++i){
						if(desMI[i].value == data[6]){
							desMI[i].selected = true;
							break;
						}
					}
					tes[0].value = data[7];
			},
			error : function() {
				alert("error");
			}
		});
	}
</script>
<script>
window.onload = function() {
    var url = window.location.href;
    var paraString = url.substring(url.indexOf("?") + 1, url.length);
    //参数
    if(paraString!=null && paraString!=""){
	    var outNum = document.getElementById("outpatientNumber");
	    outNum.value = paraString;
	    setDefault();
    }
}
</script>
<script>
		$(function() {
			$.ajax({
						url : "/MICRS/DiseaseInformation/Ajax",
						type : "GET",
						dataType : "json",
						success : function(data) {
							var str = "";
							$(data)
									.each(
											function(i, diseaseInformation) {
												str = str
														+ "<option value="+diseaseInformation.disNum+ " diease=" + diseaseInformation.diseaseNum.disClass +" >"
														+ diseaseInformation.disName
														+ "</option>";
											});
							$("#diseaseInf").html(str);
						},
						error : function() {
							alert("error");
						}
					});
			$.ajax({
						url : "/MICRS/DiseaseProject/Ajax",
						type : "GET",
						dataType : "json",
						success : function(data) {
							var str = "";
							$(data)
									.each(
											function(i, diseaseProject) {
												str = str
														+ "<option value="+diseaseProject.diseaseNum+">"
														+ diseaseProject.disClass
														+ "</option>";
											});
							$("#disease").html(str);
						},
						error : function() {
							alert("error");
						}
					});
			$.ajax({
						url : "/MICRS/DesiMedIns/Ajax",
						type : "GET",
						dataType : "json",
						success : function(data) {
							var str = "";
							$(data)
									.each(
											function(i, desiMedInss) {
												str = str
														+ "<option value="+desiMedInss.desiMedInsId+">"
														+ desiMedInss.serviceName
														+ "</option>";
											});
							$("#desiMedIns").html(str);
						},
						error : function() {
							alert("error");
						}
					});
		});
</script>
</body>
</html>