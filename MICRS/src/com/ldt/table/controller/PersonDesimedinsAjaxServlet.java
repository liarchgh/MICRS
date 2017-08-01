package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DesiMedIns;
import com.ldt.item.entity.HospitalOrganization;
import com.ldt.table.dao.DesiMedInsDao;
import com.ldt.table.dao.DesiMedInsDaoImpl;
import com.ldt.table.dao.HospitalOrganizationDao;
import com.ldt.table.dao.HospitalOrganizationDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class PersonDesimedinsAjaxServlet
 */
@WebServlet("/person/desimedins/ajax")
public class PersonDesimedinsAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DesiMedInsDao dmid = new DesiMedInsDaoImpl();
		List<DesiMedIns> dmi = dmid.selectDesiMedIns(new DesiMedIns(null, null));
		JSONArray jsonarray = JSONArray.fromObject(dmi);
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
