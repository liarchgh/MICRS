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
import com.ldt.item.entity.MedPers;
import com.ldt.item.entity.StandPay;
import com.ldt.table.dao.HospitalClassDao;
import com.ldt.table.dao.HospitalClassDaoImpl;
import com.ldt.table.dao.IndiSegDao;
import com.ldt.table.dao.IndiSegDaoImpl;
import com.ldt.table.dao.MedPersDao;
import com.ldt.table.dao.MedPersDaoImpl;
import com.ldt.table.dao.StandPayDao;
import com.ldt.table.dao.StandPayDaoImpl;

/**
 * Servlet implementation class StandpayInsertServlet
 */
@WebServlet("/standpay/insert")
public class StandpayInsertServlet extends HttpServlet {
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
		String structype = request.getParameter("structype");
		String med_per_class = request.getParameter("med_per_class");
		String strucclass = request.getParameter("strucclass");
		String sp_stad = request.getParameter("sp_stad");
		float sd = Float.parseFloat(sp_stad);
		
		
		IndiSegDao isd = new IndiSegDaoImpl();
		List<IndiSeg> is = isd.selectIndiSeg(new IndiSeg(structype, null));
		IndiSeg i = is.get(0);
		
		HospitalClassDao hcd = new HospitalClassDaoImpl();
		List<HospitalClass> hc = hcd.selectHospitalClass(new HospitalClass(strucclass, null));
		HospitalClass h =hc.get(0);
		
		MedPersDao mpd = new MedPersDaoImpl();
		List<MedPers> mp = mpd.selectMedPers(new MedPers(med_per_class, null));
		MedPers m = mp.get(0);
		StandPayDao spd = new StandPayDaoImpl();
		spd.insertStandPay(new StandPay(null, i, m, h, sd));
		request.getRequestDispatcher("/Manage/production/stand-pay.jsp").forward(request, response);
		
	}

}
