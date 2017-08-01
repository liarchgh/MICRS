package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.DesiMedIns;
import com.ldt.item.entity.MedPers;
import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.UnitInfor;
import com.ldt.table.dao.DesiMedInsDao;
import com.ldt.table.dao.DesiMedInsDaoImpl;
import com.ldt.table.dao.MedPersDao;
import com.ldt.table.dao.MedPersDaoImpl;
import com.ldt.table.dao.PersonInformationDao;
import com.ldt.table.dao.PersonInformationDaoImpl;
import com.ldt.table.dao.UnitInforDao;
import com.ldt.table.dao.UnitInforDaoImpl;

/**
 * Servlet implementation class PersonUpdate2Servlet
 */
@WebServlet("/person/update2")
public class PersonUpdate2Servlet extends HttpServlet {
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
		String pi = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String sex = request.getParameter("sex");
		String pcardtype = request.getParameter("pcardtype");
		String cid = request.getParameter("cid");
		String pnation = request.getParameter("pnation");
		String pbirthday = request.getParameter("pbirthday");
		String pworkday = request.getParameter("pworkday");
		String pretireday = request.getParameter("pretireday");
		String hukouxingzhi = request.getParameter("hukouxingzhi");
		String med_per_class = request.getParameter("med_per_class");
		String hospital_code = request.getParameter("hospital_code");
		String unit_code = request.getParameter("unit_code");
		String hukouloc = request.getParameter("hukouloc");
		
		PersonInformationDao pid = new PersonInformationDaoImpl();
		MedPersDao mpd = new MedPersDaoImpl();
		List<MedPers> mp = mpd.selectMedPers(new MedPers(med_per_class,null));
		MedPers m = mp.get(0);
//		System.out.println(m+"+m");
		
		DesiMedInsDao dmdi = new DesiMedInsDaoImpl();
		List<DesiMedIns> dmd = dmdi.selectDesiMedIns(new DesiMedIns(hospital_code, null, null, null, null, null, null, null, null, null, null));
		DesiMedIns d = dmd.get(0);
//		System.out.println(d+"+d");
		
		UnitInforDao und = new UnitInforDaoImpl();
		List<UnitInfor> uf = und.selectUnitInfor(new UnitInfor(unit_code, null, null, null, null, null));
		UnitInfor u =uf.get(0);
//		System.out.println(u+"+u");
		
		pid.updatePersonInformation(new PersonInformation(pi, pcardtype, cid, pname, sex, pnation, pbirthday, pworkday, pretireday, hukouxingzhi, hukouloc, m, null, d, u));
		request.getRequestDispatcher("/Manage/production/per_query.jsp").forward(request, response);
	}

}
