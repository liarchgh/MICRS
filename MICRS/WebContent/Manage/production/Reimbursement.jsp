<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.ldt.item.entity.UnitInfor"%>
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
											<form class="form-horizontal form-label-left" id="userQuery"
												action="https://www.bing.com/" onsubmit="return postForm()">

												<div class="form-group">
													<label
														class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
														for="first-name">报销人员ID：<span class="required">可为空</span>
													</label>
													<div class="col-md-6 col-sm-6 col-xs-12">
														<input type="text" class="form-control col-md-7 col-xs-12">
													</div>
												</div>
												<div class="form-group">
													<label
														class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
														for="last-name">报销人员姓名：<span class="required">可为空</span>
													</label>
													<div class="col-md-6 col-sm-6 col-xs-12">
														<input type="text" class="form-control col-md-7 col-xs-12">
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
															<table
																class="table table-striped projects  dataTable no-footer"
																id="datatable" role="grid"
																aria-describedby="datatable_info">
																<thead>
																	<tr role="row">
																		<th style="width: 140px;" class="sorting_asc"
																			tabindex="0" aria-controls="datatable" rowspan="1"
																			colspan="1" aria-sort="ascending"
																			aria-label="用户编号: activate to sort column descending">
																			用户编号</th>
																		<th style="width: 140px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="用户姓名: activate to sort column ascending">
																			用户姓名</th>
																		<th style="width: 88px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="用户性别: activate to sort column ascending">
																			用户性别</th>
																		<th class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="医疗人员类别: activate to sort column ascending"
																			style="width: 111px;">医疗人员类别</th>
																		<th class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="社保卡号: activate to sort column ascending"
																			style="width: 173px;">社保卡号</th>
																		<th style="width: 297px;" class="sorting" tabindex="0"
																			aria-controls="datatable" rowspan="1" colspan="1"
																			aria-label="选择: activate to sort column ascending">
																			选择</th>
																	</tr>
																</thead>
																<tbody>

																	<tr role="row" class="odd">
																		<td class="sorting_1">1</td>
																		<td>张三</td>
																		<td>男</td>
																		<td>在职</td>
																		<td>00000000000000000</td>
																		<td><label><input name="Fruit"
																				type="radio" value="" /> </label></td>
																	</tr>
																</tbody>
															</table>
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
												<input type="submit" value="test">
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
													<form class="form-horizontal form-label-left SubmitForm"
														target="nm_iframe" action="/MICRS/Insert/PersMedInfor"
														onsubmit="return postForm()">

														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag">
																住院号（门诊号）<span class="required"></span>
															</label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" id="outpatientNumber"
																	class="form-control col-md-7 col-xs-12 prescriptionNumber"
																	onkeyup="value=value.replace(/[^\d]/g,'');"
																	onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))"
																	onblur="checkOutpatientNumber()" placeholder="请输入9位数字"
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
																<input type="text"
																	class="form-control col-md-7 col-xs-12 prescriptionNumber"
																	onkeyup="value=value.replace(/[^\d]/g,'');"
																	onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))"
																	onblur="checkOutpatientNumber()" name="num">
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
																for="last-name">病种名称<span class="required"></span>
															</label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<select class="select2_group form-control"
																	name="disease" id="disease">
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
																<select class="select2_group form-control"
																	name="hospitalId">
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
																<input type="text" id="last-name" name="outReason"
																	required="required"
																	class="form-control col-md-7 col-xs-12">
															</div>
														</div>
														<input type="submit" value="test">
													</form>
													<div
														style="position: absolute; width: 54; left: 50%; margin-left: -(54/2);">
														<button class="buttonNext btn btn-success"
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
														method="post">

														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="first-name"> 住院号（门诊号） </label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" name="OUTPATIENT_NUM"
																	class="form-control col-md-7 col-xs-12">
															</div>
														</div>
														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="last-name">项目编码 </label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" id="last-name" name="MEDICINE_CODE"
																	class="form-control col-md-7 col-xs-12">
															</div>
														</div>
														<div class="form-group">
															<label
																class="control-label col-md-3 col-sm-3 col-xs-12 formTag"
																for="last-name">单价 </label>
															<div class="col-md-6 col-sm-6 col-xs-12">
																<input type="text" name="PRICE"
																	class="form-control col-md-7 col-xs-12 inputPrompt prescriptionUnitPrice"
																	onkeyup="checkPrompt()" />
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
																	onKeyUp="value=value.replace(/[^\d]/g,'');"
																	onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
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
														<input type="submit" value="test">
													</form>
												</div>
											</div>
											<div class="x_panel PrescriptionTable">
												<div class="x_panel">
													<div>
														<a href="#" class="buttonNext btn btn-success"
															style="position: absolute; right: 200px; left: 200px;"
															onclick="addPrescriptionTable()">添加一张</a>
													</div>
												</div>
											</div>

										</div>
										<div id="step-4">
											<h2 class="StepTitle">预报销（此时仅显示，不报销，报销请点击按钮）</h2>
											<!--startprint1-->
											<iframe id="id_iframe" name="nm_iframe"
												style="display: none;"></iframe>
											<table
												class="table table-striped table-bordered dataTable no-footer"
												role="grid" aria-describedby="datatable_info"
												style="width: 400px; position: relative; margin-right: auto; margin-left: auto;">
												<!--<thead>-->
												<!--<tr role="row">-->
												<!--<th class="sorting_asc" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column descending" style="width: 190px;">Name</th>-->
												<!--<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 309px;">Position</th>-->
												<!--<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 143px;">Office</th>-->
												<!--<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 76px;">Age</th>-->
												<!--<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 140px;">Start date</th>-->
												<!--<th class="sorting" tabindex="0" aria-controls="datatable" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 112px;">Salary</th></tr>-->
												<!--</thead>-->
												<!--费用总额、报销金额、自费金额、年度累计报销金额、起付标准、分段计算中自费金额、报销封顶线、乙类项目自费金额、特检特治自费金额-->
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
											</table>
											<button onclick="test()">SSS</button>
											<!--endprint1-->
											<div>
												<a href="#" class="buttonNext btn btn-success"
													style="position: absolute; right: 400px; left: 400px"
													onclick="preview(1)">打印</a>
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
			now.parentNode.previousSibling.previousSibling.reset();
		}
		$(function() {
			var buttonFinish = document.getElementsByClassName("buttonFinish buttonDisabled btn btn-default")[0];
			buttonFinish.onclick = function() {
				window.location.href = "index.html";
			};
			var buttonNext = document.getElementsByClassName("buttonNext btn btn-success")[3];
			alert(buttonNext.innerHTML);
			buttonNext.onclick = function() {
				setTimeout("setNext3()", 5000);
			};
		});
		function setNext3(){
				alert("next3");
 				var forms = document.getElementsByTagName("form");
				for (var i = 1; i < forms.length; ++i) {
					forms[i].submit(true);
					var ins = forms[i].getElementsByTagName("input");
					for(var j = 0; j < ins.length; ++j){
						ins[j].readonly = "readonly";
					}
				}
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
		function checkOutpatientNumber() {
			var outNum = document.getElementById("outpatientNumber").value;
			var outNumS = document.getElementById("outNumS");
			var sta = /^\d{9}$/;
			if (sta.test(outNum) == false) {
				outNumS.innerHTML = "应为9位数字";
				return false;
			} else {
				outNumS.innerHTML = "";
				return true;
			}
		}
		function preview(oper) {
			var newWin = window.open('about:blank', '', '');
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
			alert("is");
			var now;
			var dis = document.getElementById("disease");
			var all = now.childNodes;
			var index = now.selectedIndex;
			alert(index);
			dis.value = all[index].diease;
		}
		function test() {
			var forms = document.getElementsByTagName("form");
			//alert(forms.length);
			//获取处方信息
			for (var i = 2; i < forms.length; ++i) {
				var ins = forms[i].getElementsByTagName("input");
				for (var j = 0; j < ins.length; ++j) {
					ins[j].value;
				}
			}

			var ins1 = forms[1].getElementsByTagName("input");
			var ins2 = forms[1].getElementsByTagName("select");
			for (var i = 0; i < ins2.length; ++i) {
				alert(ins2.length);
			}

			//获取预处理表格
			var preTable = document.getElementById("preTable");
			var spans = preTable.getElementsByTagName("span");
			for (var i = 0; i < spans.length; ++i) {
				spans[i].innerHTML = i * 400;
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