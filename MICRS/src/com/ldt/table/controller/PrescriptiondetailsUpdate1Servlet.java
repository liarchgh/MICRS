package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.Drug;
import com.ldt.item.entity.PrescriptionDetail;
import com.ldt.table.dao.DrugListDao;
import com.ldt.table.dao.DrugListDaoImpl;
import com.ldt.table.dao.PrescriptionDetailDao;
import com.ldt.table.dao.PrescriptionDetailDaoImpl;

/**
 * Servlet implementation class PrescriptiondetailsUpdate1Servlet
 */
@WebServlet("/prescriptiondetails/update1")
public class PrescriptiondetailsUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String outno = request.getParameter("no1");
		String medno = request.getParameter("no2");
		DrugListDao dld = new DrugListDaoImpl();
		List<Drug> dru = dld.selectDrug(new Drug(medno, null, null, null, null, null, 0f, null , null, null));
		Drug m = dru.get(0);
		PrescriptionDetailDao ppd = new PrescriptionDetailDaoImpl();
		List<PrescriptionDetail> p = ppd.selectPrescriptionDetail(new PrescriptionDetail(outno,m, 0f, 0, 0f));
		request.setAttribute("pl", p);
		request.getRequestDispatcher("/Manage/production/##.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
