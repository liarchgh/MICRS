package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DiseaseInformation;
import com.ldt.table.dao.DiseaseInformationDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class DiseaseInformationAjax
 */
@WebServlet("/DiseaseInformation/Ajax")
public class DiseaseInformationAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("ajax");
		DiseaseInformationDaoImpl dd = new DiseaseInformationDaoImpl();
		List<DiseaseInformation> diseaseInformation = dd.selectDiseaseInformation(new DiseaseInformation());
//		System.out.println(dd.selectDesiMedIns(new DesiMedIns()));
		JSONArray jsonarray = JSONArray.fromObject(diseaseInformation);
		PrintWriter out = response.getWriter();
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
