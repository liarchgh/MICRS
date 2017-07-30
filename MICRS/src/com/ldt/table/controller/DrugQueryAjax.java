package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.Drug;
import com.ldt.item.entity.HospitalClass;
import com.ldt.table.dao.DrugListDao;
import com.ldt.table.dao.DrugListDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class DrugQueryAjax
 */
@WebServlet("/Drug/Ajax")
public class DrugQueryAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("已跳转DA1");		
//		doPost(request, response);
		String drugid = request.getParameter("drugid");
//		
//		
		DrugListDao did = new DrugListDaoImpl();
//		System.out.println(drugid+"src");
//		System.out.println(drugname+"src");
		List<Drug> d= did.selectDrug(new Drug(drugid, null, null, null, null, null, 0f, null, null, new HospitalClass(null, null)));

		JSONArray jsonarray = JSONArray.fromObject(d);
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
		
		System.out.println("已跳转DA2");
//		String drugid = request.getParameter("drugid");
//		
//		
//		DrugListDao did = new DrugListDaoImpl();
////		System.out.println(drugid+"src");
////		System.out.println(drugname+"src");
//		List<Drug> d= did.selectDrug(new Drug(drugid, drugname, null, null, null, null, 0f, null, null, new HospitalClass(null, null)));
//
//		JSONArray jsonarray = JSONArray.fromObject(d);
//		PrintWriter out = response.getWriter();
//		out.write(jsonarray.toString());
//		out.flush();
//		out.close();
		

	}

}
