package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.DiseaseInformation;
import com.ldt.table.dao.CapLineDao;
import com.ldt.table.dao.CapLineDaoImpl;
import com.ldt.table.dao.DiseaseInformationDao;
import com.ldt.table.dao.DiseaseInformationDaoImpl;

/**
 * Servlet implementation class CapLineQueryServlet
 */
@WebServlet("/query/capline")
public class CapLineQueryServlet extends HttpServlet {
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
//		String caplineid = request.getParameter("caplineid");
		String hospipeoclass = request.getParameter("hospipeoclass");
		
		CapLineDao cld = new CapLineDaoImpl();
//		System.out.println(caplineid+"111");
		System.out.println(hospipeoclass+"111");
		//医疗人员类别没有选择，第二个，已经标注为空
		List<CapLine> d= cld.selectCapLine(new CapLine(null,-1));
		System.out.println(d.toString());
		System.out.println(d.size());
		
		request.setAttribute("caplinelist", d);
		request.getRequestDispatcher("/Manage/production/cap_line.jsp").forward(request, response);
		
	
	}

}
