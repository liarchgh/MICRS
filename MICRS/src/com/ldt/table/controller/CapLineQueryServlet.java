package com.ldt.table.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.MedPers;
import com.ldt.table.dao.CapLineDao;
import com.ldt.table.dao.CapLineDaoImpl;
import com.ldt.table.dao.DiseaseInformationDao;
import com.ldt.table.dao.DiseaseInformationDaoImpl;
import com.ldt.table.dao.MedPersDao;
import com.ldt.table.dao.MedPersDaoImpl;

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
		String hospipeoclass = request.getParameter("hospipeoclass");
		MedPers m = new MedPers();
		CapLineDao cld = new CapLineDaoImpl();
		List<CapLine> cp = new ArrayList<CapLine>();
		CapLine d = new CapLine();
		if (hospipeoclass.equals("")) {
			cp = cld.selectCapLine(new CapLine(null,0f));
			request.setAttribute("caplinelist", cp);
		}else {
			MedPersDao mpd = new MedPersDaoImpl();
			List<MedPers> mp = mpd.selectMedPers(new MedPers(hospipeoclass, null));
			m = mp.get(0);
			cp = cld.selectCapLine(new CapLine(m,0f));
			
			request.setAttribute("caplinelist", cp);
		}
		request.getRequestDispatcher("/Manage/production/cap_line.jsp").forward(request, response);
		
	
	}

}
