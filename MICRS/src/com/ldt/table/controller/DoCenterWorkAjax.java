package com.ldt.table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.Drug;
import com.ldt.item.entity.IndiSegRatio;
import com.ldt.item.entity.PersMedInfor;
import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.PersonalCostInformation;
import com.ldt.item.entity.PrescriptionDetail;
import com.ldt.item.entity.StandPay;
import com.ldt.table.dao.CapLineDaoImpl;
import com.ldt.table.dao.DrugListDaoImpl;
import com.ldt.table.dao.IndiSegRatioDaoImpl;
import com.ldt.table.dao.PersMedInforDaoImpl;
import com.ldt.table.dao.PersonInformationDaoImpl;
import com.ldt.table.dao.PersonalCostInformationDaoImpl;
import com.ldt.table.dao.PrescriptionDetailDaoImpl;
import com.ldt.table.dao.StandPayDaoImpl;
import net.sf.json.JSONArray;


@WebServlet("/CenterWork/Pre")
public class DoCenterWorkAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String midId = request.getParameter("midId");
		float reCost = 0;
		float give = 0;
		float sum = 0;
		float selfYi = 0;
		
		//获取处方明细
		PrescriptionDetailDaoImpl pddi = new PrescriptionDetailDaoImpl();
		List<PrescriptionDetail> pds = pddi.selectPrescriptionDetail(new PrescriptionDetail(midId, null));
		//获取就诊信息
		PersMedInforDaoImpl pmidi = new PersMedInforDaoImpl();
		PersMedInfor pmi = pmidi.selectPersMedInfor(new PersMedInfor(midId,null,null,null,null,null,null,null,null,null)).get(0);
		//获取人员信息
		PersonInformationDaoImpl pidi = new PersonInformationDaoImpl();
		PersonInformation pi = pidi.selectPersonInformation(pmi.getNum()).get(0);
		//起付标准
		StandPayDaoImpl spdi = new StandPayDaoImpl();
		float standPay = spdi.selectStandPay(new StandPay(null, pmi.getIndiSegId(), pi.getMedPersNum(),
				pmi.getHospital(), 0)).get(0).getStandPay();
		//分段比例
		IndiSegRatioDaoImpl isrdi = new IndiSegRatioDaoImpl();
		List<IndiSegRatio> isrs = isrdi.selectIndiSegRatio(new IndiSegRatio(null, pmi.getIndiSegId(), pi.getMedPersNum(),
				pmi.getHospital(), 0, 0, 0));
		//年度累计
		PersonalCostInformationDaoImpl pcidi = new PersonalCostInformationDaoImpl();
		Calendar cc = Calendar.getInstance();
		int year = cc.get(Calendar.YEAR);
		PersonalCostInformation pci = pcidi.selectPersonalCostInformation(new PersonalCostInformation(pi, ""+year,0, 0, 0, 0)).get(0);
		//封顶线
		CapLineDaoImpl isdi = new CapLineDaoImpl();
		CapLine is = isdi.selectCapLine(new CapLine(pi.getMedPersNum(), 0)).get(0);

		//计算可报销金额
		if(pmi.getDesiMedIns().getDesiMedInsId().equals(pi.getDesiMedIns().getDesiMedInsId())) {
			for(int i = 0; i < pds.size(); ++i) {
				//药品
				Drug medicine = new DrugListDaoImpl().selectDrug(pds.get(i).getMedicineCode()).get(0); 
				float price = pds.get(i).getPrice();
				float number = pds.get(i).getTotal();
				float costLim = medicine.getPriceCeiling();
				String drugKind = medicine.getChargeType();
				if(Integer.parseInt(medicine.getHospitalID().getHospitalLevel())
						> Integer.parseInt(pmi.getHospital().getHospitalLevel())){
					if(price > costLim){
						price = costLim;
					}
					float cost = price * number;
					if(drugKind.equals("乙")){
						cost = cost * 0.5f;
						selfYi += cost;
					}
					else if(drugKind.equals("甲")){
						cost = 0;
					}
					sum += cost;
				}
			}
			if(sum > standPay) {
				reCost = sum - standPay;
			}
			
			//分段报销
			for(int i = 0; i < isrs.size(); ++i) {
				IndiSegRatio isr = isrs.get(i);
				if(isr.getTopMon() < reCost) {
					give += (isr.getTopMon() - isr.getBootomMon()) * isr.getRatio();
				}
				else {
					give += (reCost - isr.getBootomMon()) * isr.getRatio();
					break;
				}
			}
			float have = (float) (is.getCapLine() - pci.getRemAccumulat()); 
			if(have < give) {
				give = have;
			}
		}
		List<String> ans = new ArrayList<String>();
		ans.add(""+sum);
		ans.add(""+give);
		ans.add(""+(sum - give));
		ans.add(""+(pci.getRemAccumulat() + give));
		ans.add(""+standPay);
		ans.add(""+(reCost - give));
		ans.add(""+is.getCapLine());
		ans.add(""+selfYi);
		JSONArray jsonarray = JSONArray.fromObject(ans);
		PrintWriter out = response.getWriter();
		out.write(jsonarray.toString());
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
