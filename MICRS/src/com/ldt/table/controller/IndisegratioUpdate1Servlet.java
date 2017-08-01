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
 * Servlet implementation class IndisegratioUpdate1Servlet
 */
@WebServlet("/indisegratio/update1")
public class IndisegratioUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		IndiSegRatioDao isrd = new IndiSegRatioDaoImpl();
		List<IndiSegRatio> ins = isrd.selectIndiSegRatio(new IndiSegRatio(no));
		request.setAttribute("inlist", ins.get(0));
		request.getRequestDispatcher("/Manage/production/indi_seg_ratio_update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
