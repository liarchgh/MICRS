package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DiseaseProject;
import com.ldt.table.dao.DiseaseProjectDao;
import com.ldt.table.dao.DiseaseProjectDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class DiseaseInformationDiseaseproAjaxServlet
 */
@WebServlet("/diseaseinformation/diseasepro/ajax")
public class DiseaseInformationDiseaseproAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DiseaseProjectDao dpd = new DiseaseProjectDaoImpl();
		List<DiseaseProject> dpdl = dpd.selectDiseaseProject(new DiseaseProject(null,null));
		JSONArray jsonarray = JSONArray.fromObject(dpdl);
		PrintWriter out = response.getWriter();
		System.out.println(jsonarray.toString());
		out.write(jsonarray.toString());
		out.flush();
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
