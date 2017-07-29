package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.HospitalClass;
import com.ldt.item.entity.IndiSeg;
import com.ldt.item.entity.IndiSegRatio;
import com.ldt.item.entity.MedPers;
import com.ldt.table.dao.DiseaseInformationDao;
import com.ldt.table.dao.DiseaseInformationDaoImpl;
import com.ldt.table.dao.HospitalClassDao;
import com.ldt.table.dao.HospitalClassDaoImpl;
import com.ldt.table.dao.IndiSegDao;
import com.ldt.table.dao.IndiSegDaoImpl;
import com.ldt.table.dao.IndiSegRatioDao;
import com.ldt.table.dao.IndiSegRatioDaoImpl;
import com.ldt.table.dao.MedPersDao;
import com.ldt.table.dao.MedPersDaoImpl;

/**
 * Servlet implementation class IndiSegRatioQueryServlet
 */
@WebServlet("/query/indisegratio")
public class IndiSegRatioQueryServlet extends HttpServlet {
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
		String personid = request.getParameter("personid");
		String hospi_peo_class = request.getParameter("hospi_peo_class");
		String institution_type = request.getParameter("institution_type");
		String hospital_ranks = request.getParameter("hospital_ranks");
		
	
		MedPersDao mpd = new MedPersDaoImpl();
		MedPers m = new MedPers();
		if(hospi_peo_class != null && hospi_peo_class != "") {
		List<MedPers> mp = mpd.selectMedPers(new MedPers(hospi_peo_class,null));
		m = mp.get(0);
		}
		
		
		IndiSegDao isd = new IndiSegDaoImpl();
		IndiSeg i = new IndiSeg();
		if(institution_type != null && institution_type != "") {
		List<IndiSeg> is = isd.selectIndiSeg(new IndiSeg(institution_type,null));
		i = is.get(0);
		}
		
		HospitalClassDao hcd = new HospitalClassDaoImpl();
		HospitalClass h = new HospitalClass ();
		if(hospital_ranks != null && hospital_ranks != "") {
		List<HospitalClass> hc = hcd.selectHospitalClass(new HospitalClass(hospital_ranks,null));
		h = hc.get(0);
		}
		
		
		IndiSegRatioDao isrd = new IndiSegRatioDaoImpl();
		List<IndiSegRatio> id = isrd.selectIndiSegRatio(new IndiSegRatio(personid, i, m, h , 0f, 0f, 0f));
		request.setAttribute("indilist", id);
		/*System.out.println(d.toString());
		System.out.println(d.size());
		
		request.setAttribute("indilist", d);*/
		request.getRequestDispatcher("/Manage/production/indi_seg_ratio.jsp").forward(request, response);
		
	}

}
