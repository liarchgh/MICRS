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

import com.ldt.item.entity.Drug;
import com.ldt.item.entity.PrescriptionDetail;
import com.ldt.table.dao.DrugListDaoImpl;
import com.ldt.table.dao.PrescriptionDetailDao;
import com.ldt.table.dao.PrescriptionDetailDaoImpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class ChufangQueryServlet
 */
@WebServlet("/chufang/query")
public class ChufangQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("/chufang/query");
		String no = null;
		String mid = null;
		String weather = request.getParameter("weather");
		System.out.println("weather is "+weather);
		PrescriptionDetailDao pdd = new PrescriptionDetailDaoImpl();
		if(weather != null && weather.equals("one")) {
			no = request.getParameter("OUTPATIENT_NUM");
			mid = request.getParameter("MEDICINE_CODE");
		}
		else if(weather != null && weather.equals("insert")){
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

//			System.out.println("SS4");
			PrescriptionDetail pp = new PrescriptionDetail(outpatientNum, drug,
					price, total, account);
			new PrescriptionDetailDaoImpl().insertPrescriptionDetail(pp);
		}
		List<PrescriptionDetail> pd = pdd.selectPrescriptionDetail(new PrescriptionDetail(no, new Drug(mid, null), 0f, 0, 0f));
		if(weather != null && weather.equals("one")) {
			PrescriptionDetail newPc = pd.get(0);
			List<String> pp = new ArrayList<String>();
			pp.add(newPc.getOutpatientNum());
			pp.add(newPc.getMedicineCode().getMedicineCode());
			pp.add(""+newPc.getPrice());
			pp.add(newPc.getTotal()+"");
			pp.add(newPc.getAccount()+"");
			JSONArray jsonarray = JSONArray.fromObject(pp);
			PrintWriter out = response.getWriter();
			out.write(jsonarray.toString());
			out.flush();
			out.close();
		}
		else if(weather != null && weather.equals("yes")) {
			request.setAttribute("p", pd);
			request.getRequestDispatcher("/Manage/production/chufangFjiuzhen.jsp").forward(request, response);
		}
		else if(weather != null && weather.equals("insert")){
			request.getRequestDispatcher("/Manage/production/CenterTreatment.jsp").forward(request, response);
		}
		else {
			request.setAttribute("p", pd);
			request.getRequestDispatcher("/Manage/production/chufang.jsp").forward(request, response);
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