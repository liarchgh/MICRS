package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.PersonInformation;
import com.ldt.table.dao.PersonInformationDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class PersonNameQueryServlet
 */
@WebServlet("/Person/QueryName")
public class PersonNameQueryAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonNameQueryAjax() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("manId");
		PersonInformation man = new PersonInformation(id, null);
		man = new PersonInformationDaoImpl().selectPersonInformation(man).get(0);
		PrintWriter out = response.getWriter();
		out.write(man.getName());
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
