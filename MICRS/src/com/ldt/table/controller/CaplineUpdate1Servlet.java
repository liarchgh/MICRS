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
 * Servlet implementation class CaplineUpdate1Servlet
 */
@WebServlet("/capline/update1")
public class CaplineUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no = request.getParameter("no");
		CapLineDao cd = new CapLineDaoImpl();
		MedPersDao mpd = new MedPersDaoImpl();
		List<MedPers> mp = mpd.selectMedPers(new MedPers(no,null));
		MedPers m = mp.get(0);
		
		List<CapLine> c = cd.selectCapLine(new CapLine(m,0f));
		System.out.println(c.toString());
		request.setAttribute("clist", c.get(0));
		request.getRequestDispatcher("/Manage/production/cap_line_update.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
