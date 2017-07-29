package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.MedPers;
import com.ldt.table.dao.MedPersDao;
import com.ldt.table.dao.MedPersDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class IndisegratioMedperAjaxServlet
 */
@WebServlet("/indisegratio/medper/ajax")
public class IndisegratioMedperAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MedPersDao mpd = new MedPersDaoImpl();
		List<MedPers> mp = mpd.selectMedPers(new MedPers(null,null));
		JSONArray jsonarray = JSONArray.fromObject(mp);
		PrintWriter out = response.getWriter();
		out.write(jsonarray.toString());
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
