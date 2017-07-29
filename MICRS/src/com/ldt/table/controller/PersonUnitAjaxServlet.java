package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.UnitInfor;
import com.ldt.table.dao.UnitInforDao;
import com.ldt.table.dao.UnitInforDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class PersonUnitAjaxServlet
 */
@WebServlet("/person/unit/ajax")
public class PersonUnitAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UnitInforDao uid = new UnitInforDaoImpl();
		List<UnitInfor> ui = uid.selectUnitInfor(new UnitInfor(null, null, null, null, null, null));
		JSONArray jsonarray = JSONArray.fromObject(ui);
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
