package com.ldt.table.controller;

import java.io.IOException;
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
import com.ldt.item.entity.MedPers;
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
 * Servlet implementation class PersMedInforUpdate2Sevlet
 */
@WebServlet("/persMedInfor/update2")
public class PersMedInforUpdate2Sevlet extends HttpServlet {
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
		String outno = request.getParameter("outpatient");//住院号
		String num = request.getParameter("no");//人员ID
		String desino = request.getParameter("desiMedIns");//定点医疗机构编码
		String indino = request.getParameter("indiSegId");//医疗类别编码
		String in = request.getParameter("inDate");//入院日期
		String out = request.getParameter("outDate");//出院日期 
		String disprono = request.getParameter("disease");//病种编码
		String hoscno = request.getParameter("hospitalId");//医院等级编码
		String disno = request.getParameter("disNum");//疾病信息编码
		String outrea = request.getParameter("outReason");//出院原因
		String mark = "否";
		
		PersonInformationDao pid = new PersonInformationDaoImpl();
		List<PersonInformation> pi = pid.selectPersonInformation(new PersonInformation(num, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
		PersonInformation p = pi.get(0);
		
		IndiSegDao isd = new IndiSegDaoImpl();
		List<IndiSeg> is = isd.selectIndiSeg(new IndiSeg(indino, null));
//		System.out.println("is is "+new IndiSeg(indino, null));
		IndiSeg i = is.get(0);
		
		DiseaseProjectDao dpd = new DiseaseProjectDaoImpl();
		List<DiseaseProject> dp =dpd.selectDiseaseProject(new DiseaseProject(disprono, null));
		DiseaseProject dp1= dp.get(0);
		
		DesiMedInsDao dmd = new DesiMedInsDaoImpl();
		List<DesiMedIns> dm = dmd.selectDesiMedIns(new DesiMedIns(desino, null, null, null, null, null, null, null, null, null, null));
		DesiMedIns d1 = dm.get(0);
		
		
		HospitalClassDao hcd = new HospitalClassDaoImpl();
		List<HospitalClass> hc = hcd.selectHospitalClass(new HospitalClass(hoscno, null));
		HospitalClass h = hc.get(0);
		
		DiseaseInformationDao did = new DiseaseInformationDaoImpl();
		List<DiseaseInformation> di = did.selectDiseaseInformation(new DiseaseInformation(disno, null, null, null));
		DiseaseInformation d = di.get(0);
		
		PersMedInforDao pmd = new PersMedInforDaoImpl();
		pmd.updatePersMedInfor(new PersMedInfor(outno, p, d1, i, in, out, dp1, h, d, outrea, mark));
		request.getRequestDispatcher("/Manage/production/CenterTreatment.jsp").forward(request, response);
		
	}

}
