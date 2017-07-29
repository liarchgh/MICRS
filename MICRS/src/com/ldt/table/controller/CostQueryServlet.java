package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DesiMedIns;
import com.ldt.item.entity.MedPers;
import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.UnitInfor;
import com.ldt.table.dao.PersonInformationDao;
import com.ldt.table.dao.PersonInformationDaoImpl;

/**
 * Servlet implementation class CostQueryServlet
 */
@WebServlet("/query/cost")
public class CostQueryServlet extends HttpServlet {
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
		String personid = request.getParameter("personid");
		String personname = request.getParameter("personname");
		
		PersonInformationDao pid = new PersonInformationDaoImpl();
		System.out.println(personid+"111");
		System.out.println(personname+"111");
		List<PersonInformation> d= pid.selectPersonInformation(new PersonInformation(personid, null, null, personname, null, null, null, null, null, null, null, new MedPers(null, null), null, new DesiMedIns(null, null), new UnitInfor(null, null, null, null, null, null)));
		System.out.println(d.toString());
		System.out.println(d.size());
		
		request.setAttribute("costlist", d);
		request.getRequestDispatcher("/Manage/production/cost_query.jsp").forward(request, response);
		
	}

}
