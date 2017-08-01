package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DesiMedIns;
import com.ldt.table.dao.DesiMedInsDao;
import com.ldt.table.dao.DesiMedInsDaoImpl;

/**
 * Servlet implementation class StrucUpdate1Servlet
 */
@WebServlet("/struc/update1")
public class StrucUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		DesiMedInsDao dmd = new DesiMedInsDaoImpl();
		List<DesiMedIns> dmi = dmd.selectDesiMedIns(new DesiMedIns(no, null, null, null, null, null, null, null, null, null, null));
		request.setAttribute("dl", dmi.get(0));
		request.getRequestDispatcher("/Manage/production/struc_update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
