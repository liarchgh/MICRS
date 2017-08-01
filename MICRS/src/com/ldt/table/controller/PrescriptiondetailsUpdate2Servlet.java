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
 * Servlet implementation class PrescriptionUpdateServlet
 */
@WebServlet("/prescriptiondetails/update2")
public class PrescriptiondetailsUpdate2Servlet extends HttpServlet {
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
		String outno = request.getParameter("OUTPATIENT_NUM");
		String medno = request.getParameter("MEDICINE_CODE");
		String price = request.getParameter("PRICE");
		String total = request.getParameter("NUMBER");
		String account = request.getParameter("ACCOUNT");
		
		float p = Float.parseFloat(price);
		int t = Integer.parseInt(total);
		float a = Float.parseFloat(account);
		
		DrugListDao dld = new DrugListDaoImpl();
		List<Drug> dd = dld.selectDrug(new Drug(medno, null, null, null, null, null, 0f, null, null, null));
		 Drug d = dd.get(0);
		
		PrescriptionDetailDao ppd = new PrescriptionDetailDaoImpl();
		ppd.updatePrescriptionDetail(new PrescriptionDetail(outno, d, p, t, a));
		request.getRequestDispatcher("/Manage/production/CenterTreatment.jsp").forward(request, response);
	}

}
