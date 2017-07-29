package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.Drug;
import com.ldt.item.entity.HospitalClass;
import com.ldt.table.dao.DiseaseInformationDao;
import com.ldt.table.dao.DiseaseInformationDaoImpl;
import com.ldt.table.dao.DrugListDao;
import com.ldt.table.dao.DrugListDaoImpl;

/**
 * Servlet implementation class DrugQueryServlet
 */
@WebServlet("/query/drug")
public class DrugQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DrugQueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		
		System.out.println("已跳转");
		String drugid = request.getParameter("drugid");
		String drugname = request.getParameter("drugname");
		
		
		DrugListDao did = new DrugListDaoImpl();
		System.out.println(drugid+"src");
		System.out.println(drugname+"src");
		List<Drug> d= did.selectDrug(new Drug(drugid, drugname, null, null, null, null, 0f, null, null, new HospitalClass(null, null)));
		System.out.println(d.toString());
		System.out.println(d.size());
		
		request.setAttribute("druglist", d);
		request.getRequestDispatcher("/Manage/production/drug_query.jsp").forward(request, response);
		
		
		
	}

}
