package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.StandPay;
import com.ldt.table.dao.StandPayDao;
import com.ldt.table.dao.StandPayDaoImpl;

/**
 * Servlet implementation class StandpayUpdate1Servlet
 */
@WebServlet("/standpay/update1")
public class StandpayUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		StandPayDao spd = new StandPayDaoImpl();
		List<StandPay> sp = spd.selectStandPay(new StandPay(no));
		request.setAttribute("s", sp.get(0));
		request.getRequestDispatcher("/Manage/production/stand_pay_update.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
