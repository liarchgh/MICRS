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
						<a data-toggle="tooltip" data-placement="top" title="Settings">
							<span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="FullScreen">
							<span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="Lock"> <span
							class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="Logout"
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
									src="/MICRS/Manage/production/images/img.jpg" alt="">医疗基本信息
									<span class=" fa fa-angle-down"></span>
							</a>
								<ul class="dropdown-menu dropdown-usermenu pull-right">
									<li><a href="javascript:;"> 病种信息</a></li>
									<li><a href="javascript:;"> <span
											class="badge bg-red pull-right">50%</span> <span>背景</span>
									</a></li>
									<li><a href="javascript:;">帮助</a></li>
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

							</div>
						</div>
					</div>

					<div class="clearfix"></div>
					<div id="step-4">
						<h2 class="StepTitle">预报销（此时仅显示，不报销，报销请点击按钮）</h2>
						<!--startprint1-->
						<iframe id="id_iframe" name="nm_iframe" style="display: none;"></iframe>
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
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">单位名称</span>
										</p>
									</td>
									<td width="28%" colspan="3" valign="top"
										style="width: 28.9%; border: solid windowtext 1.0pt; border-left: none; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 21.9pt">
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
									<td width="20%" valign="top"
										style="width: 20.42%; border: solid windowtext 1.0pt; border-left: none; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 21.9pt">
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">单位编号</span>
										</p>
									</td>
									<td width="37%" colspan="2" valign="top"
										style="width: 37.44%; border: solid windowtext 1.0pt; border-left: none; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 21.9pt">
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
								</tr>
								<tr style="mso-yfti-irow: 1">
									<td width="13%" valign="top"
										style="width: 13.22%; border: solid windowtext 1.0pt; border-top: none; mso-border-top-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt">
										<p class="MsoNormal">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">姓名</span>
										</p>
									</td>
									<td width="13%" colspan="2" valign="top"
										style="width: 13.62%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt">
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
									<td width="15%" valign="top"
										style="width: 15.3%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt">
										<p class="MsoNormal">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">个人编号</span>
										</p>
									</td>
									<td width="20%" valign="top"
										style="width: 20.42%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt">
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
									<td width="13%" valign="top"
										style="width: 13.62%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt">
										<p class="MsoNormal">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">人员类别</span>
										</p>
									</td>
									<td width="23%" valign="top"
										style="width: 23.82%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt">
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
								</tr>
								<tr style="mso-yfti-irow: 2; height: 15.75pt">
									<td width="13%" valign="top"
										style="width: 13.22%; border: solid windowtext 1.0pt; border-top: none; mso-border-top-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">申报原因</span>
										</p>
									</td>
									<td width="13%" colspan="2" valign="top"
										style="width: 13.62%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal"
											style="text-indent: 21.0pt; tab-stops: 140.25pt">
											<span lang="EN-US"><span style="mso-tab-count: 1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											</span></span>
										</p>
									</td>
									<td width="15%" valign="top"
										style="width: 15.3%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal" style="tab-stops: 140.25pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">报销类别</span>
										</p>
									</td>
									<td width="20%" valign="top"
										style="width: 20.42%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal"
											style="text-indent: 21.0pt; tab-stops: 140.25pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
									<td width="13%" valign="top"
										style="width: 13.62%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal" style="tab-stops: 140.25pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">住院次数</span>
										</p>
									</td>
									<td width="23%" valign="top"
										style="width: 23.82%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal"
											style="text-indent: 21.0pt; tab-stops: 140.25pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
								</tr>
								<tr style="mso-yfti-irow: 3; height: 15.75pt">
									<td width="13%" valign="top"
										style="width: 13.22%; border: solid windowtext 1.0pt; border-top: none; mso-border-top-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">就诊医院</span>
										</p>
									</td>
									<td width="28%" colspan="3" valign="top"
										style="width: 28.9%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal"
											style="text-indent: 21.0pt; tab-stops: 140.25pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
									<td width="20%" valign="top"
										style="width: 20.42%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal"
											style="text-indent: 21.0pt; tab-stops: 140.25pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">就诊时段</span>
										</p>
									</td>
									<td width="37%" colspan="2" valign="top"
										style="width: 37.44%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 15.75pt">
										<p class="MsoNormal"
											style="text-indent: 21.0pt; tab-stops: 140.25pt">
											<span lang="EN-US"><o:p>&nbsp;</o:p></span>
										</p>
									</td>
								</tr>
								<tr style="mso-yfti-irow: 4; height: 276.6pt" id="preTable">
									<td width="100%" colspan="7" valign="top"
										style="width: 100.0%; border: solid windowtext 1.0pt; border-top: none; mso-border-top-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 276.6pt">
										<p class="MsoNormal" style="text-indent: 21.1pt">
											<b style="mso-bidi-font-weight: normal"><span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">结算明细：</span><span
												lang="EN-US"></span></b>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">年度累计报销金额：</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US">12345678</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">起付标准：</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"></span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">分段计算中自费金额：</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"></span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">报销封顶线：</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"></span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">乙类项目自费金额：</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"></span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">特检特治自费金额：</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"></span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">________________________________________________________________________________
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">费用总额：</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"></span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">报销金额：</span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span lang="EN-US"></span>
										</p>
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">自费金额：</span>
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
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">拨付金额</span>
										</p>
									</td>
									<td width="81%" colspan="5" valign="top"
										style="width: 81.28%; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; mso-border-top-alt: solid windowtext .5pt; mso-border-left-alt: solid windowtext .5pt; mso-border-alt: solid windowtext .5pt; padding: 0cm 5.4pt 0cm 5.4pt; height: 7.9pt">
										<p class="MsoNormal" style="text-indent: 21.0pt">
											<span
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">大写：
												万 <span class="GramE"> </span>仟 <span class="GramE">
											</span>佰 <span class="GramE"> </span>拾 <span class="GramE"> </span>元
												<span class="GramE"> </span>角 <span class="GramE"> </span>分
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
												style="font-family: 宋体; mso-ascii-font-family: &amp;amp; quot; Times New Roman&amp;amp; quot;; mso-hansi-font-family: &amp;amp;">小写：</span>
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
						<br>

						<!--endprint1-->
						<div>
							<a href="#" class="buttonNext btn btn-success"
								style="position: absolute; right: 400px; left: 400px"
								onclick="preview(1)">打印</a>
						</div>					
					<div style="float:center;">
					<a id="doWork" href="/MICRS/CenterWork/Do?midId=" type="button" class="btn btn-round btn-warning">确认报销</a>
					</div>
					</div>	

				</div>
			</div>
			<!-- /page content -->

			<!-- footer content -->
			<footer>
				<div class="pull-right">
					Gentelella - Bootstrap Admin Template by Colorlib. More Templates <a
						href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
					- Collect from <a href="http://www.cssmoban.com/" title="网页模板"
						target="_blank">网页模板</a>
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
window.onload = function(){
    var url = window.location.href;
    var paraString = url.substring(url.indexOf("?") + 1, url.length);
    //参数
    if(paraString!=null && paraString!=""){
	    var outNum = document.getElementById("doWork");
	    outNum.href = outNum.href+paraString+"&toWhere=search";
    }
    $.ajax({
		url : "/MICRS/CenterWork/Preview?midId="+paraString,
		type : "GET",
		dataType : "json",
		success : function(data) {
			$(data).each(
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
</script>

</body>
</html>