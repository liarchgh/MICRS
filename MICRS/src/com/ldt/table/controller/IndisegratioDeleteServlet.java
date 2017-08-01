package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.IndiSegRatio;
import com.ldt.table.dao.IndiSegRatioDao;
import com.ldt.table.dao.IndiSegRatioDaoImpl;

/**
 * Servlet implementation class IndisegratioDeleteServlet
 */
@WebServlet("/indisegratio/delete")
public class IndisegratioDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		IndiSegRatioDao idrd = new IndiSegRatioDaoImpl();
		idrd.deleteTable(no);
//		List<IndiSegRatio> judge = idrd.selectIndiSegRatio(new IndiSegRatio(no));
//		if(judge.get(0) == null) {
//			request.setAttribute("judge", "true");
//		}else {
//			
//		}
		request.getRequestDispatcher("/Manage/production/##.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
