package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DiseaseInformation;
import com.ldt.table.dao.DiseaseInformationDao;
import com.ldt.table.dao.DiseaseInformationDaoImpl;

/**
 * Servlet implementation class DiseaseInformationQuerySeverlet
 */
@WebServlet("/query/diseaseinformation")
public class DiseaseInformationQuerySeverlet extends HttpServlet {
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
		String diseid = request.getParameter("diseid");
		String disename = request.getParameter("disename");
		
		DiseaseInformationDao did = new DiseaseInformationDaoImpl();
		System.out.println(diseid+"111");
		System.out.println(disename+"111");
		List<DiseaseInformation> d= did.selectDiseaseInformation(new DiseaseInformation(diseid,disename,null,null));
		System.out.println(d.toString());
		System.out.println(d.size());
		
		request.setAttribute("dlist", d);
		request.getRequestDispatcher("/Manage/production/disea_query.jsp").forward(request, response);
		
	}

}
