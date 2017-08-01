package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.DiseaseProject;
import com.ldt.table.dao.DiseaseInformationDao;
import com.ldt.table.dao.DiseaseInformationDaoImpl;
import com.ldt.table.dao.DiseaseProjectDao;
import com.ldt.table.dao.DiseaseProjectDaoImpl;

/**
 * Servlet implementation class DiseaseinformationUpdate2Servlet
 */
@WebServlet("/diseaseinformation/update2")
public class DiseaseinformationUpdate2Servlet extends HttpServlet {
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
		String diseaname = request.getParameter("disename");
		String diseatype = request.getParameter("diseatype");
		String diseasyb = request.getParameter("diseasyb");
//		System.out.println(diseid +"@"+ diseaname +"@"+  diseatype +"@"+  diseasyb);
		
		DiseaseProjectDao dpd = new DiseaseProjectDaoImpl();
		List<DiseaseProject> dd= dpd.selectDiseaseProject(new DiseaseProject(diseatype,null));
		DiseaseProject p = dd.get(0);
		
		DiseaseInformationDao did = new DiseaseInformationDaoImpl();
		DiseaseInformation di = new DiseaseInformation(diseid,diseaname,p,diseasyb);
		did.updateTable(di);
		
		request.getRequestDispatcher("/Manage/production/disea_query.jsp").forward(request, response);
	}

}
