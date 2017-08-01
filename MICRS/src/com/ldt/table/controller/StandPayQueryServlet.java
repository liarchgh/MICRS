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
import com.ldt.table.dao.HospitalClassDaoImpl;
import com.ldt.table.dao.IndiSegDaoImpl;
import com.ldt.table.dao.MedPersDaoImpl;
import com.ldt.table.dao.StandPayDao;
import com.ldt.table.dao.StandPayDaoImpl;

/**
 * Servlet implementation class StandPayQueryServlet
 */
@WebServlet("/query/standpay")
public class StandPayQueryServlet extends HttpServlet {
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
		String standpanyid = request.getParameter("standpanyid");
		String hospi_peo_class = request.getParameter("hospi_peo_class");
		String institution_type = request.getParameter("institution_type");
		String hospital_ranks = request.getParameter("hospital_ranks");
		String standpay = request.getParameter("standpay");
//		System.out.println("standpanyid is "+standpanyid);
//		System.out.println("hospi_peo_class is "+hospi_peo_class);
//		System.out.println("institution_type is "+institution_type);
//		System.out.println("standpay is "+standpay);
		
		List<MedPers> hosp = hospi_peo_class==""?null:((new MedPersDaoImpl()).selectMedPers(new MedPers(hospi_peo_class, null)));
		List<HospitalClass> hosr = hospital_ranks==""?null:((new HospitalClassDaoImpl()).selectHospitalClass(new HospitalClass(hospital_ranks, null)));
		float sp = (standpay==null||standpay.equals(""))?
				-1:Float.parseFloat(standpay);
		List<IndiSeg> indis = institution_type==""?null:(new IndiSegDaoImpl()).selectIndiSeg(new IndiSeg(null, institution_type));
//		System.out.println("indis is "+indis);

		StandPayDao spd = new StandPayDaoImpl();
//		System.out.println(indis!=null&&indis.size()>0?indis.get(0):null);
//		System.out.println(hosp!=null&&hosp.size()>0?hosp.get(0):null);
//		System.out.println(hosr!=null&&hosr.size()>0?hosr.get(0):null);
//		System.out.println(standpanyid);
		System.out.println(new StandPay(standpanyid,
				institution_type==""?null:((new IndiSegDaoImpl()).selectIndiSeg(new IndiSeg(institution_type, null))).get(0),
				hospi_peo_class==""?null:((new MedPersDaoImpl()).selectMedPers(new MedPers(hospi_peo_class, null))).get(0),
				hospital_ranks==""?null:((new HospitalClassDaoImpl()).selectHospitalClass(new HospitalClass(hospital_ranks, null))).get(0),
				(standpay==null||standpay.equals(""))?
						-1:Float.parseFloat(standpay)));
		List<StandPay> d= spd.selectStandPay(new StandPay(standpanyid,
				institution_type==""?null:((new IndiSegDaoImpl()).selectIndiSeg(new IndiSeg(institution_type, null))).get(0),
				hospi_peo_class==""?null:((new MedPersDaoImpl()).selectMedPers(new MedPers(hospi_peo_class, null))).get(0),
				hospital_ranks==""?null:((new HospitalClassDaoImpl()).selectHospitalClass(new HospitalClass(hospital_ranks, null))).get(0),
				(standpay==null||standpay.equals(""))?
						-1:Float.parseFloat(standpay)));
//		System.out.println("d is "+d);
		System.out.println(d.toString());
		System.out.println(d.size());
		
		request.setAttribute("standpaylist", d);
		request.getRequestDispatcher("/Manage/production/stand_pay.jsp").forward(request, response);
		
	}


}
