package com.ldt.table.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.table.dao.PrescriptionDetailDao;
import com.ldt.table.dao.PrescriptionDetailDaoImpl;

/**
 * Servlet implementation class PrescriptiondetailDeleteServlet
 */
@WebServlet("/prescriptiondetail/delete")
public class PrescriptiondetailDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String outno = request.getParameter("OUTPATIENT_NUM");
		String medno = request.getParameter("MEDICINE_CODE");
		PrescriptionDetailDao pdd = new PrescriptionDetailDaoImpl();
		pdd.deleteHospitalOrganization(outno, medno);
		request.getRequestDispatcher("/Manage/production/CenterTreatment.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
