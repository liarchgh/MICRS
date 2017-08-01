package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.MedPers;
import com.ldt.table.dao.CapLineDao;
import com.ldt.table.dao.CapLineDaoImpl;
import com.ldt.table.dao.MedPersDao;
import com.ldt.table.dao.MedPersDaoImpl;

/**
 * Servlet implementation class CaplineUpdate2Servlet
 */
@WebServlet("/capline/update2")
public class CaplineUpdate2Servlet extends HttpServlet {
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
		String med_per_class_no = request.getParameter("med_per_class_no");
		String med_per_class = request.getParameter("med_per_class");
		String cap_line = request.getParameter("cap_line");
		
		double capline = Double.parseDouble(cap_line);
		
		MedPersDao mpd = new MedPersDaoImpl();
		List<MedPers> mp = mpd.selectMedPers(new MedPers(med_per_class_no,med_per_class));
		MedPers m = mp.get(0);
		
		CapLineDao cp = new CapLineDaoImpl();
		cp.updateTable(new CapLine(m,capline));
		
		request.getRequestDispatcher("/Manage/production/cap_line.jsp").forward(request, response);
	}

}
