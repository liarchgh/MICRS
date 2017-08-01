package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.Drug;
import com.ldt.item.entity.PrescriptionDetail;
import com.ldt.table.dao.DrugListDaoImpl;
import com.ldt.table.dao.PrescriptionDetailDaoImpl;

/**
 * Servlet implementation class PrescriptionDetailInsertServlet
 */
@WebServlet("/Insert/PrescriptionDetail")
public class PrescriptionDetailInsertServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("SS1");
		String outpatientNum = request.getParameter("OUTPATIENT_NUM");
		String medicineCode = request.getParameter("MEDICINE_CODE");
		String Price = request.getParameter("PRICE");
		String Total = request.getParameter("NUMBER");
		String Account = request.getParameter("ACCOUNT");
		Drug drug = null;
		if(medicineCode!=null && !medicineCode.equals("")) {
			List<Drug> temp = new DrugListDaoImpl().selectDrug(new Drug(medicineCode, null));
			if(!temp.isEmpty()) {
				drug = temp.get(0);
			}
		}
		System.out.println("drug is"+drug);
		float price = 0;
		if(Price!=null && !Price.equals("")){
			price = Float.parseFloat(Price);
		}
		int total = 0;
		if(Total!=null && !Total.equals("")){
			total = Integer.parseInt(Total);
		}
		float account = 0;
		if(Account!=null && !Account.equals("")){
			account = Float.parseFloat(Account);
		}

//		System.out.println("SS4");
		PrescriptionDetail pp = new PrescriptionDetail(outpatientNum, drug,
				price, total, account);
		new PrescriptionDetailDaoImpl().insertPrescriptionDetail(pp);
//		System.out.println(pp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
