package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.PersMedInfor;
import com.ldt.table.dao.MedPersDao;
import com.ldt.table.dao.PersMedInforDao;
import com.ldt.table.dao.PersMedInforDaoImpl;

/**
 * Servlet implementation class PersMedInforUpdate1Servlet
 */
@WebServlet("/PersMedInforUpdate1Servlet")
public class PersMedInforUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		PersMedInforDao pmd = new PersMedInforDaoImpl();
		List<PersMedInfor> pm = pmd.selectPersMedInfor(new PersMedInfor(no, null, null, null, null, null, null, null, null, null, null));
		request.setAttribute("p", pm.get(0));
		request.getRequestDispatcher("/Manage/production/cap_line.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
