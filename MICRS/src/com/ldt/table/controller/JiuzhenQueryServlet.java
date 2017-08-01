package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.PersMedInfor;
import com.ldt.item.entity.PersonInformation;
import com.ldt.table.dao.DiseaseInformationDaoImpl;
import com.ldt.table.dao.PersMedInforDao;
import com.ldt.table.dao.PersMedInforDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class JiuzhenQueryServlet
 */
@WebServlet("/jiuzhen/query")
public class JiuzhenQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// no outpatient name
		System.out.println("/jiuzhen/query");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String outpatient = request.getParameter("outpatient");
		String weather = request.getParameter("weather");
		PersMedInforDao pmid = new PersMedInforDaoImpl();
		List<PersMedInfor> pmi = pmid.selectPersMedInfor(new PersMedInfor(outpatient, new PersonInformation(no, name), null, null, null, null, null, null, null, null,null));
		List<PersMedInfor> p = new ArrayList<PersMedInfor>();
//		System.out.println("number are "+pmi.size()+" "+p.size());
//		System.out.println("weather is "+weather);
//		System.out.println("outpatient is "+outpatient);
		if(weather != null && weather.equals("yes")) {
			request.setAttribute("p", pmi);
			request.getRequestDispatcher("/Manage/production/CenterTreatment.jsp").forward(request, response);
		}
		else if(weather != null && weather.equals("one")) {
			List<String> ans = new ArrayList<String>();
			PersMedInfor pp = pmi.get(0);
//			System.out.println("pp is "+pp);
			ans.add(pp.getDesiMedIns().getDesiMedInsId());
			ans.add(pp.getIndiSegId().getIndiSegID());
			ans.add(pp.getInDate());
			ans.add(pp.getOutDate());
			DiseaseInformation din = new DiseaseInformationDaoImpl().selectDiseaseInformation(pp.getDisNum()).get(0);
			ans.add(din.getDiseaseNum().getDiseaseNum());
			ans.add(pp.getHospital().getHospitalId());
			ans.add(din.getDisNum());
			ans.add(pp.getOutReason());
//			System.out.println("ans are "+ans);
			JSONArray jsonarray = JSONArray.fromObject(ans);
			PrintWriter out = response.getWriter();
			out.write(jsonarray.toString());
			out.flush();
			out.close();
		}
		else {
			int i = 0;
			while(i< pmi.size() && pmi.get(i).getOutpatientNum() != null && pmi.get(i).getOutpatientNum() != "") {
				PersMedInfor pm= pmi.get(i);
				if(pm.getMark().equals("是")) {
					p.add(pm);
				}
				i++;
			}
			request.setAttribute("p", p);
			request.getRequestDispatcher("/Manage/production/jiuzhen.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
