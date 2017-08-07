package com.ldt.table.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.PersMedInfor;
import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.PersonalCostInformation;
import com.ldt.table.dao.CalCost;
import com.ldt.table.dao.PersMedInforDaoImpl;
import com.ldt.table.dao.PersonInformationDaoImpl;
import com.ldt.table.dao.PersonalCostInformationDaoImpl;

/**
 * Servlet implementation class CenterWorkCancelAjax
 */
@WebServlet("/CenterWorkC/ancel")
public class CenterWorkCancelAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String midId = request.getParameter("midId");
		List<String> ans = CalCost.cal(midId);
		List<Float> money = new ArrayList<Float>();
		for(int i = 0; i < ans.size(); ++i) {
			money.add(Float.parseFloat(ans.get(i)));
		}
		//获取就诊信息
		PersMedInforDaoImpl pmidi = new PersMedInforDaoImpl();
		PersMedInfor pmi = pmidi.selectPersMedInfor(new PersMedInfor(midId,null,null,null,null,null,null,null,null,null, null)).get(0);
		//获取人员信息
		PersonInformationDaoImpl pidi = new PersonInformationDaoImpl();
		PersonInformation pi = pidi.selectPersonInformation(pmi.getNum()).get(0);
		//年度累计
		PersonalCostInformationDaoImpl pcidi = new PersonalCostInformationDaoImpl();
		Calendar cc = Calendar.getInstance();
		int year = cc.get(Calendar.YEAR);
		PersonalCostInformation pci = pcidi.selectPersonalCostInformation(new PersonalCostInformation(pi, ""+year,0, 0, 0, 0)).get(0);
		pci.setRemAccumulat(pci.getRemAccumulat() - money.get(8));
		pci.setTimes(pci.getTimes()-1);
		pci.setExpAccumulat(pci.getExpAccumulat() - money.get(6));
		pci.setPaiedPerAccu(pci.getExpAccumulat() - pci.getRemAccumulat());
		pcidi.updatePersonalCostInformation(pci);
		pmi.setMark("否");
		pmidi.updatePersMedInfor(pmi);
		request.getRequestDispatcher("/Manage/production/CenterTreatment.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
