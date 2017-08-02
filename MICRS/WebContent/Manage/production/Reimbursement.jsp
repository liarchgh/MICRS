<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
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
<link href="/MICRS/Manage/vendors/iCheck/skins/flat/green.css"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="/MICRS/Manage/build/css/custom.min.css" rel="stylesheet">

</head>

<body class="nav-md" style="overflow: hidden">
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="index.html" class="site_title"><i
							class="fa fa-hospital-o"></i> <span>医疗保险中心报销系统</span></a>
					</div>

					<div class="clearfix"></div>

					<!-- menu profile quick info -->
					<div class="profile clearfix">
						<div class="profile_pic">
							<img src="images/img.jpg" alt="..."
								class="img-circle profile_img">
						</div>
						<div class="profile_info">
							<span>欢迎,</span>
							<h2>John Doe</h2>
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
										<li><a href="index.html">报销系统简介</a></li>
										<li><a href="main1.html">药品安全简介</a></li>
										<li><a href="main2.html">诊疗项目简介</a></li>
										<li><a href="main3.html">服务项目简介</a></li>
										<li><a href="main4.html">疾病信息简介</a></li>
										<li><a href="main5.html">定点医疗机构简介</a></li>
										<li><a href="main6.html">医疗报销计算参数简介</a></li>
									</ul></li>

								<li><a><i class="fa fa-edit"></i> 医疗基本信息 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="drug_infor.html">药品信息</a></li>
										<li><a href="project_infor.html">*诊疗项目信息</a></li>
										<li><a href="dept_pro.html">*服务设施项目</a></li>
										<li><a href="disea_infor.html">病种信息</a></li>
										<li><a href="struc_infor.html">定点医疗机构信息</a></li>
										<li><a href="acculate.html">医疗报销计算参数</a></li>
									</ul></li>

								<li><a><i class="fa fa-desktop"></i> *医疗待遇审批 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="wait1.html">*人员就诊机构审批</a></li>
										<li><a href="wait2.html">*特检特治审批</a></li>
									</ul></li>

								<li><a><i class="fa fa-medkit"></i> 医保中心报销 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="Reimbursement.html">医保报销</a></li>
									</ul></li>

								<li><a><i class="fa fa-table"></i> 综合查询 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="cost_query.html">医疗人员费用查询</a></li>
									</ul></li>

								<li><a><i class="fa fa-briefcase"></i> 公共业务 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="unit_infor.html">单位基本信息</a></li>
										<li><a href="person_infor.html">个人基本信息</a></li>
									</ul></li>
							</ul>
						</div>
					</div>
					<!-- /sidebar menu -->

					<!-- /menu footer buttons -->
					<div class="sidebar-footer hidden-small">
						<a data-toggle="tooltip" data-placement="top" title="Settings">
							<span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="FullScreen">
							<span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="Lock"> <span
							class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="Logout"
							href="login.html"> <span class="glyphicon glyphicon-off"
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
								aria-expanded="false"> <img src="images/img.jpg" alt="">医保中心报销
									<span class=" fa fa-angle-down"></span>
							</a>
								<ul class="dropdown-menu dropdown-usermenu pull-right">
									<li><a href="javascript:;"> 医保报销</a></li>
									<li><a href="javascript:;"> <!-- <span class="badge bg-red pull-right">50%</span>-->
											<span>背景</span>
									</a></li>
									<li><a href="javascript:;">帮助</a></li>
									<li><a href="login.html"><i
											class="fa fa-sign-out pull-right"></i> 注销</a></li>
								</ul></li>



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
							<div
								class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
								<div class="input-group"></div>
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
										<ul class="wizard_steps">
											<li><a href="#step-1"> <span class="step_no">1</span>
													<span class="step_descr"> 第一步<br /> <small>查找报销人员</small>
												</span>
											</a></li>
											<li><a href="#step-2"> <span class="step_no">2</span>
													<span class="step_descr"> 第二步<br /> <small>添加就诊信息</small>
												</span>
											</a></li>
											<li><a href="#step-3"> <span class="step_no">3</span>
													<span class="step_descr"> 第三步<br /> <small>添加处方信息</small>
												</span>
											</a></li>
											<li><a href="#step-4"> <span class="step_no">4</span>
													<span class="step_descr"> 第四步<br /> <small>确认报销信息</small>
												</span>
											</a></li>
										</ul>
										<div id="step-1">
											<form class="form-horizontal form-label-left" id="userQuery" method="post"
												action="/MICRS/perscost/connect/query">

												<div class="form-group">
													<label
														class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
														for="first-name">报销人员ID：<span class="required">可为空</span>
													</label>
													<div class="col-md-6 col-sm-6 col-xs-12">
														<input type="text" class="form-control col-md-7 col-xs-12" name="qManId" id="qManId">
													</div>
												</div>
												<div class="form-group">
													<label
														class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
														for="last-name">报销人员姓名：<span class="required">可为空</span>
													</label>
													<div class="col-md-6 col-sm-6 col-xs-12">
														<input type="text" class="form-control col-md-7 col-xs-12" name="qName" id="qName">
													</div>
												</div>
												<div class="form-group">
													<label
														class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
														for="last-name"><span class="required"></span> </label>
													<div class="col-md-6 col-sm-6 col-xs-12">
														<input type="submit" value="查询" class="btn">
													</div>
												</div>
												<br> <br>
												<div id="datatable_wrapper"
													class="dataTables_wrapper form-inline dt-bootstrap no-footer">
													<div class="row">
														<div class="col-sm-6">
															<div class="dataTables_length" id="datatable_length">
																<label>Show <select name="datatable_length"
																	aria-controls="datatable" class="form-control input-sm">
																		<option value="10">10</option>
																		<option value="25">25</option>
																		<option value="50">50</option>
																		<option value="100">100</option>
																</select> entries
																</label>
															</div>
														</div>
														<div class="col-sm-6">
															<div id="datatable_filter" class="dataTables_filter">
																<label>Search:<input type="search"
																	class="form-control input-sm" placeholder=""
																	aria-controls="datatable"></label>
															</div>
														</div>
													</div>
													<div class="row">
														<div class="col-sm-12">
														<form>
															<table
																class="table table-striped projects  dataTable no-footer"
																id="datatable" role="grid"
																aria-describedby="datatable_info">
																<thead>
																<!-- 姓名、公民身份号码、性别、
																出生日期、医疗人员类别、单位编号、
																单位名称、本年住院次数、本年中心报销累计、
																本年个人自费累计、本年医疗费用累计 -->
																	<tr role="row">
																		<th style="width: 140px;" class="sorting_asc"
																			tabindex="0" aria-controls="datatable" rowspan="1"
																			colspan="1" aria-sort="ascending"
																			aria-label="姓名: activate to sort column descending">
																			姓名</th>
																		<th style="width: 140px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="公民身份号码: activate to sort column ascending">
																			公民身份号码</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="性别: activate to sort column ascending">
																			性别</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="出生日期: activate to sort column ascending">
																			出生日期</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="医疗人员类别: activate to sort column ascending">
																			医疗人员类别</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="单位编号: activate to sort column ascending">
																			单位编号</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="单位名称: activate to sort column ascending">
																			单位名称</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="本年住院次数: activate to sort column ascending">
																			本年住院次数</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="上次出院时间: activate to sort column ascending">
																			上次出院时间</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="上次出院诊断: activate to sort column ascending">
																			上次出院诊断</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="本年中心报销累计: activate to sort column ascending">
																			本年中心报销累计</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="本年个人自费累计: activate to sort column ascending">
																			本年个人自费累计</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="本年医疗费用累计: activate to sort column ascending">
																			本年医疗费用累计</th>
																		<th style="width: 297px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="选择: activate to sort column ascending">
																			选择</th>
																	</tr>
																</thead>
																<tbody>
							                                        <c:forEach items = "${requestScope.list}" var="px">
							                                        <tr>
							                                        <c:forEach items = "${px}" var="pp" begin="0" end="12" step="1" varStatus="var">
							                                            <td>${pp}</td>
							                                        </c:forEach>
							                                        <td><label><input type="radio" name="one" onclick="setManId(${px[13]},'${px[0]}')"></label></td>
							                                        </tr>
							                                        </c:forEach>
																</tbody>
															</table>
															</form>
														</div>
													</div>
													<div class="row">
														<div class="col-sm-5">
															<div class="dataTables_info" id="datatable_info"
																role="status" aria-live="polite">Showing 1 to 1 of
																1 entries</div>
														</div>
														<div class="col-sm-7">
															<div class="dataTables_paginate paging_simple_numbers"
																id="datatable_paginate">
																<ul class="pagination">
																	<li class="paginate_button previous disabled"
																		id="datatable_previous"><a href="#"
																		aria-controls="datatable" data-dt-idx="0" tabindex="0">Previous</a>
																	</li>
																	<li class="paginate_button active"><a href="#"
																		aria-controls="datatable" data-dt-idx="1" tabindex="0">1</a>
																	</li>
																	<li class="paginate_button next disabled"
																		id="datatable_next"><a href="#"
																		aria-controls="datatable" data-dt-idx="2" tabindex="0">Next</a>
																	</li>
																</ul>
															</div>
														</div>
													</div>
												</div>
											</form>
											<!--<div class="center-block">-->
											<!--<span>均为空则查询全部</span>-->
											<!--</div>-->
										</div>
										<div id="step-2">
											<div class="x_panel">
												<div class="x_title">
													<h2 style="font-size: 150%">就诊信息</h2>
													<!--<span style="color: #959595;font-size: x-small;position:absolute;top:25px;right:640px;">填写完成后请点击下一步</span>-->
													<div class="clearfix"></div>
												</div>
												<div class="x_content">
													<form class="form-horizontal form-label-left SubmitForm" method="post"
														target="nm_iframe" action="/MICRS/Insert/PersMedInforX">

														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag">
																住院号（门诊号）<span class="required"></span>
															</label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" id="outpatientNumber"
																	class="form-control col-md-7 col-xs-12 prescriptionNumber"
																	onkeyup="value=value.replace(/[^\d]/g,'');"
																	onblur="checkOutpatientNumber(this);setClinicNumber(this);"
																	name="outpatientNum">
															</div>
															<span id="outNumS" class="warning"></span>
														</div>
														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="last-name">人员ID<span class="required"></span>
															</label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" id="manId" readonly="readonly"
																	class="form-control col-md-7 col-xs-12 prescriptionNumber"
																	onkeyup="value=value.replace(/[^\d]/g,'');" name="num">
															</div>
														</div>
														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="last-name">服务机构名称 <span class="required"></span>
															</label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<select class="select2_group form-control"
																	name="desiMedIns" id="desiMedIns">
																</select>
															</div>
														</div>
														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="last-name">医疗类别<span class="required"></span>
															</label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<select class="select2_group form-control"
																	name="indiSegId">
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
																				<input type="date" class="form-control"
																					name="inDate" id="inDate" onblur="checkDate()">
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
																				<input type="date" class="form-control"
																					name="outDate" id="outDate" onblur="checkDate()">
																			</div>
																		</div>
																	</div>
																</fieldset>
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
																	required="required"
																	class="form-control col-md-7 col-xs-12"></textarea>
															</div>
														</div>
														<!-- <input type="submit" value="test"> -->
													</form>
													<div
														style="position: absolute; width: 54; left: 50%; margin-left: -(54/2);">
														<button class="buttonNext btn btn-success banned"
															onclick="clearTable(this)">重置</button>
													</div>
												</div>
											</div>
										</div>
										<div id="step-3">
											<div class="x_panel PrescriptionTable" style="display: none">
												<div class="x_title">
													<h2 style="font-size: 150%">处方信息</h2>
													<!--<span style="color: #959595;font-size: x-small;position:absolute;top:25px;right:640px;"></span>-->
													<ul class="nav navbar-right panel_toolbox">
														<li><a class="close-link"
															onclick="deleteTable(this.parentNode.parentNode.parentNode.parentNode)"><i
																class="fa fa-close"></i></a></li>
													</ul>
													<div class="clearfix"></div>
												</div>
												<div class="x_panel">
													<form class="form-horizontal form-label-left TestForm"
														action="/MICRS/Insert/PrescriptionDetail"
														onkeyup="calculatePrice(this)" target="nm_iframe"
														method="post" >

														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="first-name"> 住院号（门诊号） </label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" id="OUTPATIENT_NUM" name="OUTPATIENT_NUM" readonly="readonly"
																	class="form-control col-md-7 col-xs-12 clinicNumber"/>
															</div>
														</div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12 formTag">药品名称 <span class="required"></span>
															</label>
                                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                                <select class="select2_group form-control" name="MEDICINE_CODE" id="MEDICINE_CODE" onchange="">
																</select>
                                                            </div>
                                                        </div>
														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="last-name">单价 </label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" name="PRICE"
																	class="form-control col-md-7 col-xs-12 inputPrompt prescriptionUnitPrice"
																	onkeyup=""/>
															</div>
														</div>
														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="last-name">数量<span class="required"></span>
															</label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" name="NUMBER"
																	class="form-control col-md-7 col-xs-12 prescriptionNumber"
																	onKeyUp="value=value.replace(/[^\d]/g,'');">
															</div>
														</div>
														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="last-name">金额<span class="required"></span>
															</label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="number" name="ACCOUNT"
																	class="form-control col-md-7 col-xs-12 prescriptionPrice"
																	readonly="readonly">
															</div>
														</div>
														<!-- <input type="submit" value="test"> -->
													</form>
												</div>
											</div>
											<div class="x_panel PrescriptionTable">
												<div class="x_panel">
													<div style="position: absolute; width: 54; left: 50%; margin-left: -(54/2);">
														<button class="buttonNext btn btn-success banned" onclick="addPrescriptionTable(this)">添加一张</button>
													</div>
														
												</div>
											</div>

										</div>
										<div id="step-4">
											<h2 class="StepTitle">预报销<span style="color:gray;font-size:smaller;">（此时就诊相关信息已提交；保险信息仅显示，还未报销，报销请点击下方按钮）</span></h2>
											<!--startprint1-->
											<iframe id="id_iframe" name="nm_iframe"
												style="display: none;"></iframe>
											<!-- <table
												class="table table-striped table-bordered dataTable no-footer"
												role="grid" aria-describedby="datatable_info"
												style="width: 400px; position: relative; margin-right: auto; margin-left: auto;">
											<thead>
										<tr role="row">
											<th class="sorting_asc" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column descending" style="width: 190px;">Name</th>
											<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 309px;">Position</th>
												<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 143px;">Office</th>
												<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 76px;">Age</th>
												<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 140px;">Start date</th>
												<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 112px;">Salary</th></tr>
												</thead>
												费用总额、报销金额、自费金额、年度累计报销金额、起付标准、分段计算中自费金额、报销封顶线、乙类项目自费金额、特检特治自费金额
												<tbody id="preTable">
													<tr role="row" class="odd">
														<td class="sorting_1">费用总额</td>
														<td>￥<span>162,700</span></td>
													</tr>
													<tr role="row" class="even">
														<td class="sorting_1">报销金额</td>
														<td>￥<span>162,700</span></td>
													</tr>
													<tr role="row" class="odd">
														<td class="sorting_1">自费金额</td>
														<td>￥<span>162,700</span></td>
													</tr>
													<tr role="row" class="even">
														<td class="sorting_1">年度累计报销金额</td>
														<td>￥<span>162,700</span></td>
													</tr>
													<tr role="row" class="odd">
														<td class="sorting_1">起付标准</td>
														<td>￥<span>162,700</span></td>
													</tr>
													<tr role="row" class="even">
														<td class="sorting_1">分段计算中自费金额</td>
														<td>￥<span>162,700</span></td>
													</tr>
													<tr role="row" class="odd">
														<td class="sorting_1">报销封顶线</td>
														<td>￥<span>162,700</span></td>
													</tr>
													<tr role="row" class="even">
														<td class="sorting_1">乙类项目自费金额</td>
														<td>￥<span>162,700</span></td>
													</tr>
													<tr role="row" class="odd">
														<td class="sorting_1">特检特治自费金额</td>
														<td>￥<span>162,700</span></td>
												</tbody>
											</table> -->
											<table class="MsoNormalTable" border="1" cellspacing="0"
												cellpadding="0" width="84%"
												style="border-collapse: collapse; mso-table-layout-alt: fixed; border: none; mso-border-alt: solid windowtext .5pt; mso-yfti-tbllook: 191; mso-padding-alt: 0cm 5.4pt 0cm 5.4pt; mso-border-insideh: .5pt solid windowtext; mso-border-insidev: .5pt solid windowtext">
												<tbody>
													<tr
														style="mso-yfti-irow: 0; mso-yfti-firstrow: yes; height: 21.9pt">
														<td width="13%" valign="top"
															style="width: 13.22%; border: solid windowtext 1.0pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 21.9pt">
															<p class="MsoNormal">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">姓名</span>
															</p>
														</td>
														<td width="28%" colspan="3" valign="top"
															style="width: 28.9%; border: solid windowtext 1.0pt; border-left: none; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 21.9pt">
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;" id="qName1"></span>
															</p>
														</td>
														<td width="20%" valign="top"
															style="width: 20.42%; border: solid windowtext 1.0pt; border-left: none; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 21.9pt">
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">个人编号</span>
															</p>
														</td>
														<td width="37%" colspan="2" valign="top"
															style="width: 37.44%; border: solid windowtext 1.0pt; border-left: none; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 21.9pt">
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;" id="qManId1"></span>
															</p>
														</td>
													</tr>
													
													<tr style="mso-yfti-irow: 4; height: 276.6pt" id="preTable">
														<td width="100%" colspan="7" valign="top"
															style="width: 100.0%; border: solid windowtext 1.0pt; border-top: none; mso-border-top-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 276.6pt">
															<p class="MsoNormal" style="text-indent: 21.1pt">
																<b style="mso-bidi-font-weight: normal"><span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">结算明细：</span><span
																	lang="EN-US"></span></b>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">年度累计报销金额：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">起付标准：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">分段计算中自费金额：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">报销封顶线：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">乙类项目自费金额：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">特检特治自费金额：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">________________________________________________________________________________
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">费用总额：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">报销金额：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">自费金额：</span>
															</p>
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span lang="EN-US"></span>
															</p>
														</td>
													</tr>
													<tr style="mso-yfti-irow: 5; height: 7.9pt">
														<td width="18%" colspan="2" rowspan="2"
															style="width: 18.72%; border: solid windowtext 1.0pt; border-top: none; mso-border-top-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 7.9pt">
															<p class="MsoNormal" align="center"
																style="text-align: center; text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">拨付金额</span>
															</p>
														</td>
														<td width="81%" colspan="5" valign="top"
															style="width: 81.28%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 7.9pt">
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">大写：
																	万 <span class="GramE"> </span>仟 <span class="GramE">
																</span>佰 <span class="GramE"> </span>拾 <span class="GramE">
																</span>元 <span class="GramE"> </span>角 <span class="GramE">
																</span>分
																</span>
															</p>
														</td>
													</tr>
													<tr
														style="mso-yfti-irow: 6; mso-yfti-lastrow: yes; height: 7.85pt">
														<td width="81%" colspan="5" valign="top"
															style="width: 81.28%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 7.85pt">
															<p class="MsoNormal" style="text-indent: 21.0pt">
																<span
																	style="font-family: 宋体; mso-ascii-font-family: &amp;quot; Times New Roman&amp;quot;; mso-hansi-font-family: &amp;quot;Times New Roman&amp;quot;">小写：</span>
															</p>
														</td>
													</tr>
													<!--[if !supportMisalignedColumns]-->
													<tr height="0">
														<td width="76" style="border: none"></td>
														<td width="81" style="border: none"></td>
														<td width="120" style="border: none"></td>
														<td width="88" style="border: none"></td>
														<td width="117" style="border: none"></td>
														<td width="78" style="border: none"></td>
														<td width="137" style="border: none"></td>
													</tr>
													<!--[endif]-->
												</tbody>
											</table>
											<!--endprint1-->
											<br>
											<br>
											<div>
												<a href="#" class="buttonNext btn btn-success"
													style="position: absolute; right: 400px; left: 400px"
													onclick="preview(1)">打印报销单</a>
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
		<!-- /page content -->

		<!-- footer content -->
		<!--<footer>-->
		<!--<div class="pull-right">-->
		<!--Gentelella - Bootstrap Admin Template by Colorlib. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>-->
		<!--</div>-->
		<!--<div class="clearfix"></div>-->
		<!--</footer>-->
		<!-- /footer content -->
	</div>

	<!-- jQuery -->
	<script src="/MICRS/Manage/vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="/MICRS/Manage/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="/MICRS/Manage/vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script src="/MICRS/Manage/vendors/nprogress/nprogress.js"></script>
	<!-- jQuery Smart Wizard -->
	<script
		src="/MICRS/Manage/vendors/jQuery-Smart-Wizard/js/jquery.smartWizard.js"></script>
	<!-- Custom Theme Scripts -->
	<script src="/MICRS/Manage/build/js/custom.min.js"></script>


	<!-- jQuery -->
	<!-- Bootstrap -->
	<!-- FastClick -->
	<!-- NProgress -->
	<!-- bootstrap-daterangepicker -->

	<!--<script>-->
	<!--$(function(){-->
	<!--function initTableCheckbox() {-->
	<!--var $thr = $('table thead tr');-->
	<!--var $checkAllTh = $('<th><input type="checkbox" id="checkAll" name="checkAll" /></th>');-->
	<!--/*将全选/反选复选框添加到表头最前，即增加一列*/-->
	<!--//$thr.prepend($checkAllTh);-->
	<!--/*“全选/反选”复选框*/-->
	<!--var $checkAll = $thr.find('input');-->
	<!--$checkAll.click(function(event){-->
	<!--/*将所有行的选中状态设成全选框的选中状态*/-->
	<!--$tbr.find('input').prop('checked',$(this).prop('checked'));-->
	<!--/*并调整所有选中行的CSS样式*/-->
	<!--if ($(this).prop('checked')) {-->
	<!--$tbr.find('input').parent().parent().addClass('warning');-->
	<!--} else{-->
	<!--$tbr.find('input').parent().parent().removeClass('warning');-->
	<!--}-->
	<!--/*阻止向上冒泡，以防再次触发点击操作*/-->
	<!--event.stopPropagation();-->
	<!--});-->
	<!--/*点击全选框所在单元格时也触发全选框的点击操作*/-->
	<!--$checkAllTh.click(function(){-->
	<!--$(this).find('input').click();-->
	<!--});-->
	<!--var $tbr = $('table tbody tr');-->
	<!--var $checkItemTd = $('<td><input type="checkbox" name="checkItem" /></td>');-->
	<!--/*每一行都在最前面插入一个选中复选框的单元格*/-->
	<!--$tbr.prepend($checkItemTd);-->
	<!--/*点击每一行的选中复选框时*/-->
	<!--$tbr.find('input').click(function(event){-->
	<!--/*调整选中行的CSS样式*/-->
	<!--$(this).parent().parent().toggleClass('warning');-->
	<!--/*如果已经被选中行的行数等于表格的数据行数，将全选框设为选中状态，否则设为未选中状态*/-->
	<!--$checkAll.prop('checked',$tbr.find('input:checked').length == $tbr.length ? true : false);-->
	<!--/*阻止向上冒泡，以防再次触发点击操作*/-->
	<!--event.stopPropagation();-->
	<!--});-->
	<!--/*点击每一行时也触发该行的选中操作*/-->
	<!--$tbr.click(function(){-->
	<!--$(this).find('input').click();-->
	<!--});-->
	<!--}-->
	<!--initTableCheckbox();-->
	<!--});-->
	<!--</script>-->
	<script>
	function checkOutpatientNumber(now){
		$.ajax({
			url : "/MICRS/PersMed/QUni233?outpatientNumber="+ now.value,
			type : "GET",
			dataType : "text",
			success : function(data) {
				//alert(data);
				var outNumS = document.getElementById("outNumS");
				var buttonNext = document.getElementsByClassName("buttonNext btn btn-success")[3];
				var buttonNextClass = buttonNext.getAttribute("class");
				outNumS.innerHTML = data;
				if(data == "此住院号已录入！"){
					buttonNextClass = buttonNextClass.concat(" buttonDisabled");
					buttonNext.setAttribute("class",buttonNextClass );
				}
				else{
					buttonNextClass = buttonNextClass.replace(" buttonDisabled","");
					buttonNext.setAttribute("class",buttonNextClass );
				}
			 },
			error : function() {
				alert("error");
			}
		}); 
	}
	function checkEmpty(now){
		var data = now.value;
		//alert(data);
		var buttonNext = document.getElementsByClassName("buttonNext btn btn-success")[3];
		var buttonNextClass = buttonNext.getAttribute("class");
		outNumS.innerHTML = data;
		if(data == ""){
			buttonNextClass = buttonNextClass.concat(" buttonDisabled");
			buttonNext.setAttribute("class",buttonNextClass );
		}
		else{
			buttonNextClass = buttonNextClass.replace(" buttonDisabled","");
			buttonNext.setAttribute("class",buttonNextClass );
		}
	}
		function calculatePrice(tar) {
			var unitPrice = (tar
					.getElementsByClassName("prescriptionUnitPrice"))[0];
			var num = (tar.getElementsByClassName("prescriptionNumber"))[0];
			var price = (tar.getElementsByClassName("prescriptionPrice"))[0];
			//        alert(this.typeName);
			//        if(thisType == 0){
			//            var unitPrice = this;
			//            var num = this.nextSibling;
			//            var price = this.nextSibling.nextSibling;
			//        }
			//        else if(thisType == 1){
			//            var unitPrice = this.previousSibling;
			//            var num = this;
			//            var price = this.nextSibling;
			//        }
			//        else{
			//            alert("error");
			//        }
			unitPrice = parseFloat(unitPrice.value);
			num = parseFloat(num.value);
			price.value = unitPrice * num;
		}

		function deleteTable(deleted) {
			deleted.parentNode.removeChild(deleted);
		}

		function clearTable(now) {
			var jiuzhen = now.parentNode.previousSibling.previousSibling;
			var ins= jiuzhen.getElementsByTagName("input");
			var in0val = ins[0].val;
			var in1val = ins[1].val;
			now.parentNode.previousSibling.previousSibling.reset();
			 ins[0].val = in0val;
			 ins[1].val = in1val;
		}
		window.onload = function() {
			var buttonFinish = document
					.getElementsByClassName("buttonFinish btn btn-default")[0];
			buttonFinish.onclick = function() {
				var forms = document.getElementsByTagName("form");
				$.ajax({
					url : "/MICRS/CenterWork/Do?midId="
							+ forms[1].getElementsByTagName("input")[0].value,
					type : "GET",
					dataType : "json",
					success : function(data) {
						$(data).each(function(i, dd) {
						});
					},
					error : function() {
						alert("error");
					}
				});
				window.location.href = "/MICRS/Manage/production/index.html";
			};
			var buttonNext = document.getElementsByClassName("buttonNext btn btn-success")[3];
			buttonNext.onclick = function() {
				var step = document.getElementsByClassName("selected");
				if (step[0].rel == "3") {
					var forms = document.getElementsByTagName("form");
					var ins = document.getElementsByTagName("input");
					var bus = document.getElementsByTagName("button");
					var sels = document.getElementsByTagName("select");
					var texs = document.getElementsByTagName("textarea");
					forms[1].submit(true);
					setTimeout("stepDo1()",600);
					setTimeout("stepDo2()",1000); 
					for(var i = 0; i < ins.length; ++i){
						ins[i].disabled="disable";
					}
					for(var i = 0; i < texs.length; ++i){
						texs[i].disabled="disable";
					}
					for(var i = 0; i < bus.length; ++i){
						bus[i].disabled="disable";
					}
					for(var i = 0; i < sels.length; ++i){
						sels[i].disabled="disable";
					}
				}
			};
		}
		function stepDo1(){
			var forms = document.getElementsByTagName("form");
			for (var i = 3; i < forms.length; ++i) {
				forms[i].submit(true);
			}
		}
		function stepDo2(){
			var forms = document.getElementsByTagName("form");
			$.ajax({
				url : "/MICRS/CenterWork/Preview?midId="
						+ forms[1].getElementsByTagName("input")[0].value,
				type : "GET",
				dataType : "json",
				success : function(data) {
					$(data)
							.each(
									function(i, dd) {
										var preTable = document
												.getElementById("preTable");
										var spans = preTable
												.getElementsByTagName("span");
										spans[(i+1)*2+1].innerHTML = "￥"+dd;
									});
				},
				error : function() {
					alert("error");
				}
			});
		}
		function checkDate() {
			var date1 = document.getElementById("inDate").value;
			var date2 = document.getElementById("outDate").value;
			var dateS = document.getElementById("dateS");
			if (date1 != "" && date2 != "" && date1 > date2) {
				dateS.style.color = "red";
				dateS.innerHTML = "入院日期不应晚于出院日期";
				return false;
			} else {
				dateS.innerHTML = "";
				return true;
			}
		}
		
		function preview(oper) {
			var newWin = window.open('', '报销单', '', false);
			bdhtml = window.document.body.innerHTML;//获取当前页的html代码
			sprnstr = "<!--startprint" + oper + "-->";//设置打印开始区域
			eprnstr = "<!--endprint" + oper + "-->";//设置打印结束区域
			prnhtml = bdhtml.substring(bdhtml.indexOf(sprnstr) + 18); //从开始代码向后取html
			//
			prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr));//从结束代码向前取html
			newWin.document.body.innerHTML = prnhtml;
			newWin.print();
			//        window.document.body.innerHTML=bdhtml;
		}
		function changeDis() {
			var now;
			var dis = document.getElementById("disease");
			var all = now.childNodes;
			var index = now.selectedIndex;
			//alert(index);
			dis.value = all[index].diease;
		}//根据第一步选的人员设定就诊信息的人员id
		function setManId(manId, manName){
			var step = document.getElementsByClassName("disabled");
			var inManId = document.getElementById("manId");
			inManId.value = manId;
			setTableMan(manId, manName);
		}
	//根据第二步的住院号设定第三步处方的住院号
		function setClinicNumber(now){
			var cns = document.getElementsByClassName("clinicNumber");
			for(var i = 0; i < cns.length; ++i){
				cns[i].value = now.value;
			}
		}
	//设定预报销中的姓名、个人编号
		function setTableMan(qManId, qName){
			var qManId1 = document.getElementById("qManId1");
			var qName1 = document.getElementById("qName1");
			qManId1.innerHTML = qManId;
			qName1.innerHTML = qName;
		}
	//第三步中保证药品不重复
        function changeForm(now) {
            var forms = document.getElementsByTagName("form");
            var selval = now.value;
            for (var i = 2; i < forms.length; i++) {
                var sel = forms[i].getElementsByTagName("select")[0];
                if (sel.value != selval) {
                    var ops = sel.getElementsByTagName("option");
                    for (var j = 0; j < ops.length; ++j) {
                        if (ops[j].value == selval) {
                            ops[j].disabled = "disabled";
                        }
                    }
                } else {
                    sel.disabled = "disabled";
                }
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
            $.ajax({
                url: "/MICRS/reimbur/medcine/ajax",
                type: "GET",
                dataType: "json",
                success: function(data) {
                    var str = "";
                    str = str + "<option></option>";
                    $(data).each(function(i, dl) {
                        str = str + "<option value=" + dl.medicineCode + ">" + dl.medicineName + "</option>";
                    });
                    $("#MEDICINE_CODE").html(str);
                },
                error: function() {
                    alert("error");
                }
            });
		});
	</script>
</body>

</html>