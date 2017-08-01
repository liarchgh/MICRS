package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.HospitalClass;
import com.ldt.item.entity.IndiSeg;
import com.ldt.item.entity.IndiSegRatio;
import com.ldt.item.entity.MedPers;
import com.ldt.table.dao.HospitalClassDao;
import com.ldt.table.dao.HospitalClassDaoImpl;
import com.ldt.table.dao.IndiSegDao;
import com.ldt.table.dao.IndiSegDaoImpl;
import com.ldt.table.dao.IndiSegRatioDao;
import com.ldt.table.dao.IndiSegRatioDaoImpl;
import com.ldt.table.dao.MedPersDao;
import com.ldt.table.dao.MedPersDaoImpl;

/**
 * Servlet implementation class IndisegratioUpdate2Servlet
 */
@WebServlet("/indisegratio/update2")
public class IndisegratioUpdate2Servlet extends HttpServlet {
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
		String ppid = request.getParameter("ppid");
		String med_per_class = request.getParameter("med_per_class");
		String strucclass = request.getParameter("strucclass");
		String structype = request.getParameter("structype");
		String top_m = request.getParameter("top_m");
		String bottom_m = request.getParameter("bottom_m");
		String bratio = request.getParameter("bratio");
//		System.out.println(bottom_m);
		
		IndiSegDao isd = new IndiSegDaoImpl();
		List<IndiSeg> lis = isd.selectIndiSeg(new IndiSeg(structype,null));
		IndiSeg l = lis.get(0);
//		System.out.println(l+"srl");
		
		MedPersDao mpd = new MedPersDaoImpl();
		List<MedPers> mp = mpd.selectMedPers(new MedPers(med_per_class,null));
		System.out.println(mp);
		MedPers m = mp.get(0);
//		System.out.println(m+"srm");
		
		HospitalClassDao hcd = new HospitalClassDaoImpl();
		List<HospitalClass> hc = hcd.selectHospitalClass(new HospitalClass(strucclass,null));
		HospitalClass h = hc.get(0);
//		System.out.println(h+"srh");
		
		float t = Float.parseFloat(top_m);
		float b = Float.parseFloat(bottom_m);
		float br = Float.parseFloat(bratio);
		
		IndiSegRatioDao isr = new IndiSegRatioDaoImpl();
		isr.updateTable(new IndiSegRatio(ppid, l, m, h, t, b, br));
		
		request.getRequestDispatcher("/Manage/production/indi_seg_ratio.jsp").forward(request, response);
	}

}
