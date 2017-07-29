package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.HospitalClass;
import com.ldt.table.dao.HospitalClassDao;
import com.ldt.table.dao.HospitalClassDaoImpl;

import net.sf.json.JSONArray;
import sun.awt.RepaintArea;

/**
 * Servlet implementation class IndisegratioHosclassAjaxServlet
 */
@WebServlet("/indisegratio/hosclass/ajax")
public class IndisegratioHosclassAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HospitalClassDao hcd = new HospitalClassDaoImpl();
		List<HospitalClass> hc = hcd.selectHospitalClass(new HospitalClass(null,null));
		JSONArray jsonarray = JSONArray.fromObject(hc);
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
