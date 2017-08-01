package com.ldt.table.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.PrescriptionDetail;
import com.ldt.table.dao.PrescriptionDetailDao;
import com.ldt.table.dao.PrescriptionDetailDaoImpl;

/**
 * Servlet implementation class PrescriptionDetailQueryServlet
 */
@WebServlet("/prescriptiondetail/query")
public class PrescriptionDetailQueryServlet extends HttpServlet {
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
		String no = request.getParameter("no");
		PrescriptionDetailDao ppd = new PrescriptionDetailDaoImpl();
		List<PrescriptionDetail> mp = new ArrayList<PrescriptionDetail>();
		List<PrescriptionDetail> pp = ppd.selectPrescriptionDetail(new PrescriptionDetail(no, null, 0f, 0, 0f));
		int i = 0;
		while(pp.get(i).getOutpatientNum() != null && !pp.get(i).getOutpatientNum().equals("") && pp.get(i).getMedicineCode() != null && !pp.get(i).getMedicineCode().equals("")) {
			mp.add(pp.get(i));
			i++;
		}
		request.setAttribute("p", mp);
		request.getRequestDispatcher("/Manage/production/cap_line.jsp").forward(request, response);
		
		
	}

}
