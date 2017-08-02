package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.PersMedInfor;
import com.ldt.table.dao.PersMedInforDaoImpl;

/**
 * Servlet implementation class PersMedQUniAjax
 */
@WebServlet("/PersMed/QUni233")
public class PersMedQUniAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/PersMed/QUni");
		List<PersMedInfor> ans =
				new PersMedInforDaoImpl().selectPersMedInfor(new PersMedInfor(request.getParameter("outpatientNumber"), null, null, null, null, null, null, null, null, null, null));
		PrintWriter out = response.getWriter();
		System.out.println("ans is "+ans);
		if(ans.size() > 0) {
			out.write("此住院号已录入！");
		}
		else {
			out.write("可录入");
		}
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
