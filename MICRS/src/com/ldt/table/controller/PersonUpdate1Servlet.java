package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.PersonInformation;
import com.ldt.table.dao.PersonInformationDao;
import com.ldt.table.dao.PersonInformationDaoImpl;

/**
 * Servlet implementation class PersonUpdate1Servlet
 */
@WebServlet("/person/update1")
public class PersonUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		PersonInformationDao pid = new PersonInformationDaoImpl();
		List<PersonInformation> pi = pid.selectPersonInformation(new PersonInformation(no, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
		request.setAttribute("pl", pi.get(0));
		request.getRequestDispatcher("/Manage/production/per_update.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
