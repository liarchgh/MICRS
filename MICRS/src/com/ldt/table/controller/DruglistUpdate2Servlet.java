package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.Drug;
import com.ldt.item.entity.HospitalClass;
import com.ldt.table.dao.DrugListDao;
import com.ldt.table.dao.DrugListDaoImpl;
import com.ldt.table.dao.HospitalClassDao;
import com.ldt.table.dao.HospitalClassDaoImpl;

/**
 * Servlet implementation class DruglistUpdate2Servlet
 */
@WebServlet("/druglist/update2")
public class DruglistUpdate2Servlet extends HttpServlet {
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
		String durgid = request.getParameter("durgid");
		String drugname = request.getParameter("drugname");
		String chargetype = request.getParameter("chargetype");
		String chufangsyb = request.getParameter("chufangsyb");
		String chargeclass = request.getParameter("chargeclass");
		String drugunit = request.getParameter("drugunit");
		String top_price = request.getParameter("top_price");
		String yuanneisyb = request.getParameter("yuanneisyb");
		String checking = request.getParameter("checking");
		String hospital_ranks = request.getParameter("hospital_ranks");
		System.out.println(drugname);
		
//		System.out.println(top_price);
		
		HospitalClassDao hh = new HospitalClassDaoImpl();
		List<HospitalClass> hlist = hh.selectHospitalClass(new HospitalClass(hospital_ranks,null));
//		System.out.println(hlist.toString());
		
		float priceCeiling = Float.parseFloat(top_price);
		HospitalClass h = new HospitalClass();
		h = hlist.get(0);
//		System.out.println(h);
		
		DrugListDao dld = new DrugListDaoImpl();
		dld.updateDrug(new Drug(durgid,drugname,chargetype,chufangsyb,chargeclass,drugunit,priceCeiling,yuanneisyb,checking,h));
		
		request.getRequestDispatcher("/Manage/production/drug_query.jsp").forward(request, response);
	}

}
