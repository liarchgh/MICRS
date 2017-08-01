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
 * Servlet implementation class StrucQueryServlet
 */
@WebServlet("/query/struc")
public class StrucQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strucid = request.getParameter("strucid");
		String strucranks = request.getParameter("strucranks");
		String institution_name = request.getParameter("institution_name");
		String institution_types = request.getParameter("institution_types");
//		System.out.println(strucranks + "+@");
//		System.out.println(institution_types + "+@");
//		System.out.println(strucid + "+@");
//		System.out.println(institution_name + "+@");
		
		DesiMedInsDao dmid = new DesiMedInsDaoImpl();
		HospitalClassDao hco = new HospitalClassDaoImpl();
		HospitalClass h = new HospitalClass();
		if(strucranks!=null && !strucranks.equals("")){
			List<HospitalClass> hc = hco.selectHospitalClass(new HospitalClass(strucranks, null));
			h = hc.get(0);
		}
		HospitalOrganizationDao hcd = new HospitalOrganizationDaoImpl();
		HospitalOrganization hod = new HospitalOrganization();
		if(institution_types!=null && !institution_types.equals("")){
			List<HospitalOrganization> hc = hcd.selectHospitalOrganization(new HospitalOrganization(institution_types, null));
			hod = hc.get(0);
		}
		System.out.println(h.toString());
		
//		System.out.println(new DesiMedIns(strucid, institution_name, h, hod, null, null, null, null, null, null, null));
		List<DesiMedIns> d= dmid.selectDesiMedIns(new DesiMedIns(strucid, institution_name, h, hod, null, null, null, null, null, null, null));
		System.out.println(d.toString());
		System.out.println(d.size());
		
		request.setAttribute("struclist", d);
		request.getRequestDispatcher("/Manage/production/struc_query.jsp").forward(request, response);
		
	}

}
