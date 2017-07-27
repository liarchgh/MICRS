package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.UnitInfor;
import com.ldt.table.dao.UnitInforDao;
import com.ldt.table.dao.UnitInforDaoImpl;

/**
 * Servlet implementation class UnitQuerySeverlet
 */
@WebServlet("/query/unit")
public class UnitQuerySeverlet extends HttpServlet {
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
		String unitid = request.getParameter("unitid");
		String unitname = request.getParameter("unitname");
		UnitInforDao uid = new UnitInforDaoImpl();
		System.out.println(unitname + "1111");
		List<UnitInfor> ui = uid.selectUnitInfor(new UnitInfor(unitid,unitname,null,null,null,null));
		
		System.out.println(ui.size());
		request.setAttribute("uilist", ui);
		request.getRequestDispatcher("/Manage/production/unit_query.jsp").forward(request, response);
		
	}

}
