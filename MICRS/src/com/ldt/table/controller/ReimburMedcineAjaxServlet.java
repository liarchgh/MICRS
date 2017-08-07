package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.Drug;
import com.ldt.table.dao.DrugListDao;
import com.ldt.table.dao.DrugListDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class ReimburMedcineAjaxServlet
 */
@WebServlet("/reimbur/medcine/ajax")
public class ReimburMedcineAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/reimbur/medcine/ajax");
		// TODO Auto-generated method stub
		DrugListDao dld = new DrugListDaoImpl();
		List<Drug> dl = dld.selectDrug(new Drug(null, null));
		JSONArray jsonarray = JSONArray.fromObject(dl);
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