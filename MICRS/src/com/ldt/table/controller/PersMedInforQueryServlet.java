package com.ldt.table.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DesiMedIns;
import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.DiseaseProject;
import com.ldt.item.entity.HospitalClass;
import com.ldt.item.entity.IndiSeg;
import com.ldt.item.entity.PersMedInfor;
import com.ldt.item.entity.PersonInformation;
import com.ldt.table.dao.DesiMedInsDao;
import com.ldt.table.dao.DesiMedInsDaoImpl;
import com.ldt.table.dao.DiseaseInformationDao;
import com.ldt.table.dao.DiseaseInformationDaoImpl;
import com.ldt.table.dao.DiseaseProjectDao;
import com.ldt.table.dao.DiseaseProjectDaoImpl;
import com.ldt.table.dao.HospitalClassDao;
import com.ldt.table.dao.HospitalClassDaoImpl;
import com.ldt.table.dao.IndiSegDao;
import com.ldt.table.dao.IndiSegDaoImpl;
import com.ldt.table.dao.PersMedInforDao;
import com.ldt.table.dao.PersMedInforDaoImpl;
import com.ldt.table.dao.PersonInformationDao;
import com.ldt.table.dao.PersonInformationDaoImpl;

/**
 * Servlet implementation class MedPersInforQueryServlet
 */
@WebServlet("/medPersInfor/query")
public class PersMedInforQueryServlet extends HttpServlet {
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
		
		String num = request.getParameter("no");//人员ID
		
		PersonInformationDao pid = new PersonInformationDaoImpl();
		List<PersonInformation> pi = pid.selectPersonInformation(new PersonInformation(num, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
		PersonInformation p = pi.get(0);

		PersMedInforDao pmd = new PersMedInforDaoImpl();
		List<PersMedInfor> pd = new ArrayList<PersMedInfor>();
		int i = 0;
		List<PersMedInfor> pm = pmd.selectPersMedInfor(new PersMedInfor(null, p, null, null, null, null, null, null, null, null, null));
		while(pm.get(i).getOutpatientNum() != null && !pm.get(i).getOutpatientNum().equals("") && pm.get(i).getNum() != null && !pm.get(i).getNum().equals("")) {
			pd.add(pm.get(i));
			i++;
		}
		request.setAttribute("plist", pd);
		request.getRequestDispatcher("/Manage/production/##.jsp").forward(request, response);
		
	}

}
