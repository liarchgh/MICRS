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
import com.ldt.item.entity.PersMedInfor;
import com.ldt.item.entity.PersonInformation;
import com.ldt.table.dao.DesiMedInsDaoImpl;
import com.ldt.table.dao.DiseaseInformationDaoImpl;
import com.ldt.table.dao.DiseaseProjectDaoImpl;
import com.ldt.table.dao.HospitalClassDaoImpl;
import com.ldt.table.dao.IndiSegDaoImpl;
import com.ldt.table.dao.PersMedInforDaoImpl;
import com.ldt.table.dao.PersonInformationDaoImpl;

/**
 * Servlet implementation class PersMedInforInsert
 */
@WebServlet("/Insert/PersMedInforX")
public class PersMedInforInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/Insert/PersMedInforX");
		String outpatientNum = request.getParameter("outpatientNum");
		String num = request.getParameter("num");
		String desiMedInsId = request.getParameter("desiMedIns");
		String indiSegId = request.getParameter("indiSegId");
		String inDate = request.getParameter("inDate");
		String outDate = request.getParameter("outDate");
		String disease = request.getParameter("disease");
		String disNum = request.getParameter("disNum");
		String outReason = request.getParameter("outReason");
		System.out.println("outReason is "+outReason);
		System.out.println("outpatientNum is "+outpatientNum);
		System.out.println("num is "+num);
		System.out.println("desiMedInsId is "+desiMedInsId);
		System.out.println("indiSegId is "+indiSegId);
		System.out.println("inDate is "+inDate);
		System.out.println("outDate is "+outDate);
		System.out.println("disease is "+disease);
		System.out.println("disNum is "+disNum);
		List<DesiMedIns> desiMedInss = new DesiMedInsDaoImpl().selectDesiMedIns(new DesiMedIns(desiMedInsId, null));
		DesiMedIns desiMedIns = null;
		if(!desiMedInss.isEmpty()) {
			desiMedIns = desiMedInss.get(0);
		}
		List<IndiSeg> indiSegs = new IndiSegDaoImpl().selectIndiSeg(new IndiSeg(indiSegId, null));
		IndiSeg indiSeg = null;
		if(!indiSegs.isEmpty()) {
			indiSeg = indiSegs.get(0);
		}
		List<DiseaseProject> diseaseProjects = new DiseaseProjectDaoImpl().selectDiseaseProject(new DiseaseProject(disease, null));
		DiseaseProject diseaseProject = null;
		if(!diseaseProjects.isEmpty()) {
			diseaseProject = diseaseProjects.get(0);
		}
		List<HospitalClass> hospitalClasss = new HospitalClassDaoImpl().selectHospitalClass(new HospitalClass(desiMedIns.getHospitalId().getHospitalId(), null));
		HospitalClass hospitalClass = null;
		if(!hospitalClasss.isEmpty()) {
			hospitalClass = hospitalClasss.get(0);
		}
		List<DiseaseInformation> diseaseInformations = new DiseaseInformationDaoImpl().selectDiseaseInformation(new DiseaseInformation(disNum, null));
		DiseaseInformation diseaseInformation = null;
		if(!diseaseInformations.isEmpty()) {
			diseaseInformation = diseaseInformations.get(0);
		}
		List<PersonInformation> personInformations = new PersonInformationDaoImpl().selectPersonInformation(new PersonInformation(num, null));
		PersonInformation personInformation = null;
		if(!personInformations.isEmpty()) {
			personInformation = personInformations.get(0);
		}

		PersMedInforDaoImpl pp = new PersMedInforDaoImpl();
//	System.out.println(new PersMedInfor(outpatientNum, personInformation, desiMedIns, indiSeg,
//				inDate, outDate, diseaseProject, hospitalClass,
//				diseaseInformation, outReason, "否"));
		pp.insertPersMedInfor(new PersMedInfor(outpatientNum, personInformation, desiMedIns, indiSeg,
				inDate, outDate, diseaseProject, hospitalClass,
				diseaseInformation, outReason, "否"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
