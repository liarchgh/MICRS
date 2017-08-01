package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.Drug;
import com.ldt.table.dao.DrugListDao;
import com.ldt.table.dao.DrugListDaoImpl;

/**
 * Servlet implementation class DruglistUpdate1Servlet
 */
@WebServlet("/druglist/update1")
public class DruglistUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		DrugListDao dld = new DrugListDaoImpl();
		List<Drug> dl = dld.selectDrug(new Drug(no, null, null, null, null, null, 0f, null, null, null));
		request.setAttribute("dlist", dl.get(0));
		request.getRequestDispatcher("/Manage/production/drug_update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
