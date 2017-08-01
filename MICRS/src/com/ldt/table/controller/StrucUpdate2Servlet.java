package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DesiMedIns;
import com.ldt.item.entity.HospitalClass;
import com.ldt.item.entity.HospitalOrganization;
import com.ldt.table.dao.DesiMedInsDao;
import com.ldt.table.dao.DesiMedInsDaoImpl;
import com.ldt.table.dao.HospitalClassDao;
import com.ldt.table.dao.HospitalClassDaoImpl;
import com.ldt.table.dao.HospitalOrganizationDao;
import com.ldt.table.dao.HospitalOrganizationDaoImpl;

/**
 * Servlet implementation class StrucUpdate2Servlet
 */
@WebServlet("/struc/update2")
public class StrucUpdate2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strucid = request.getParameter("strucid");
		String strucname = request.getParameter("strucname");
		String strucclass = request.getParameter("strucclass");
		String structype = request.getParameter("structype");
		String strucpostcode = request.getParameter("strucpostcode");
		String legalname = request.getParameter("legalname");
		String legalphone = request.getParameter("legalphone");
		String cname = request.getParameter("cname");
		String cphone = request.getParameter("cphone");
		String cmphone = request.getParameter("cmphone");
		String loc = request.getParameter("loc");
		
		HospitalClassDao hcd = new HospitalClassDaoImpl();
		List<HospitalClass> hc = hcd.selectHospitalClass(new HospitalClass(strucclass,null));
		HospitalClass h = hc.get(0);
		
		HospitalOrganizationDao hod = new HospitalOrganizationDaoImpl();
		List<HospitalOrganization> ho = hod.selectHospitalOrganization(new HospitalOrganization(structype,null));
		HospitalOrganization h1 = ho.get(0);
		
		DesiMedInsDao dmid = new DesiMedInsDaoImpl();
		dmid.updateTable(new DesiMedIns(strucid, strucname, h, h1, strucpostcode, legalname, legalphone, cname, cphone, cmphone, loc));
		request.getRequestDispatcher("/Manage/production/struc_query.jsp").forward(request, response);
	}

}
