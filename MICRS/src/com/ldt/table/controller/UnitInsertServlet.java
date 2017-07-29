package com.ldt.table.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.UnitInfor;
import com.ldt.table.dao.UnitInforDao;
import com.ldt.table.dao.UnitInforDaoImpl;

/**
 * Servlet implementation class UnitInsertServlet
 */
@WebServlet("/unit/insert")
public class UnitInsertServlet extends HttpServlet {
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
		String uname = request.getParameter("uname");
		String utype = request.getParameter("utype");
		String uaddr = request.getParameter("uaddr");
		String upostcode = request.getParameter("upostcode");
		String utelephone = request.getParameter("utelephone");
		
		UnitInforDao uid = new UnitInforDaoImpl();
		uid.insertUnitInfor(new UnitInfor(null,uname,utype,uaddr,upostcode,utelephone));
		request.getRequestDispatcher("/Manage/production/unit_infor.jsp").forward(request, response);
		
	}

}
