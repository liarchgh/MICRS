package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.PersonalCostInformation;
import com.ldt.table.dao.PersonInformationDao;
import com.ldt.table.dao.PersonInformationDaoImpl;
import com.ldt.table.dao.PersonalCostInformationDao;
import com.ldt.table.dao.PersonalCostInformationDaoImpl;

/**
 * Servlet implementation class PersonCostinformationQueryServlet
 */
@WebServlet("/person/costinformation/query")
public class PersonCostinformationQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		PersonalCostInformationDao pcfo = new PersonalCostInformationDaoImpl();
		PersonInformationDao pid = new PersonInformationDaoImpl();
		List<PersonInformation> pi = pid.selectPersonInformation(new PersonInformation(no, null));
		PersonInformation p = pi.get(0);
		List<PersonalCostInformation> pci = pcfo.selectPersonalCostInformation(new PersonalCostInformation(p, null));
		request.setAttribute("plist", pci);
		request.getRequestDispatcher("/Manage/production/annual_account.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
