package com.ldt.table.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.Drug;
import com.ldt.item.entity.IndiSegRatio;
import com.ldt.item.entity.PersMedInfor;
import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.PersonalCostInformation;
import com.ldt.item.entity.PrescriptionDetail;
import com.ldt.item.entity.StandPay;
import com.ldt.table.dao.PersMedInforDaoImpl;
import com.ldt.table.dao.PrescriptionDetailDaoImpl;

public class CalCost {
	public static List<String> cal(String midId){
		System.out.println("CalCost.cal");
		float reCost = 0;
		float give = 0;
		float sum = 0;
		float selfYi = 0;
		float reSum = 0;
		
		//获取处方明细
		PrescriptionDetailDaoImpl pddi = new PrescriptionDetailDaoImpl();
		List<PrescriptionDetail> pds = pddi.selectPrescriptionDetail(new PrescriptionDetail(midId, null));
		//获取就诊信息
		PersMedInforDaoImpl pmidi = new PersMedInforDaoImpl();
		PersMedInfor pmi = pmidi.selectPersMedInfor(new PersMedInfor(midId,null,null,null,null,null,null,null,null,null, null)).get(0);
		//获取人员信息
		PersonInformationDaoImpl pidi = new PersonInformationDaoImpl();
		PersonInformation pi = pidi.selectPersonInformation(pmi.getNum()).get(0);
		//起付标准
		StandPayDaoImpl spdi = new StandPayDaoImpl();
		float standPay = 0;
		List<StandPay> sps = spdi.selectStandPay(new StandPay(null, pmi.getIndiSegId(), pi.getMedPersNum(),
				pmi.getHospital(), 0));
		if(sps != null && sps.size() > 0) {
			standPay = sps.get(0).getStandPay();
		}
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
		CapLine is = new CapLine();
		List<CapLine> cls = isdi.selectCapLine(new CapLine(pi.getMedPersNum(), 0));
		if(cls!=null && cls.size() > 0) {
			is = cls.get(0);
		}

		//计算可报销金额
//			System.out.println("number is "+pds.size());
			for(int i = 0; i < pds.size(); ++i) {
				//药品
				Drug medicine = new DrugListDaoImpl().selectDrug(pds.get(i).getMedicineCode()).get(0);
				float price = pds.get(i).getPrice();
				float number = pds.get(i).getTotal();
				float costLim = medicine.getPriceCeiling();
				String drugKind = medicine.getChargeType();
				float cost = price * number;
				reSum += cost;
				if(Integer.parseInt(medicine.getHospitalID().getHospitalId())
						>= Integer.parseInt(pmi.getHospital().getHospitalId())){
					if(price > costLim){
						price = costLim;
					}
					if(drugKind.equals("乙")){
						cost = cost * 0.5f;
						selfYi += cost;
					}
					else if(drugKind.equals("丙")){
						cost = 0;
					}
					sum += cost;
				}
			}
			if(sum > standPay) {
				reCost = sum - standPay;
			}
//			System.out.println("sum is "+sum);
//			System.out.println("reCost is "+reCost);
			
			//分段报销
//			System.out.println("getRatio "+isrs.size());
		if(pmi.getDesiMedIns().getDesiMedInsId().equals(pi.getDesiMedIns().getDesiMedInsId())) {

			System.out.println("give is "+give);
			for(int i = 0; i < isrs.size(); ++i) {
				IndiSegRatio isr = isrs.get(i);
				System.out.println("TopMon is "+isr.getTopMon());
				System.out.println("BootomMon is "+isr.getBootomMon());
				System.out.println("give is "+give);
				if(isr.getTopMon() < reCost) {
					give += (isr.getTopMon() - isr.getBootomMon()) * isr.getRatio();
				}
				else if(give > isr.getBootomMon()){
					give += (reCost - isr.getBootomMon()) * isr.getRatio();
					break;
				}
				else {
					break;
				}
			}
			System.out.println("give is "+give);
			float have = (float) (is.getCapLine() - pci.getRemAccumulat()); 
			System.out.println("have is "+have);
			System.out.println("CapLine is "+is.getCapLine());
			System.out.println("RemAccumulat is "+pci.getRemAccumulat());
			if(have < give) {
				give = have;
			}
//			System.out.println("give is "+give);
		}
		List<String> ans = new ArrayList<String>();
		ans.add(""+(pci.getRemAccumulat() + give));
		ans.add(""+standPay);
		ans.add(""+(reCost - give));
		ans.add(""+is.getCapLine());
		ans.add("0");
		ans.add(""+selfYi);
		ans.add(""+reSum);
		ans.add(""+give);
		ans.add(""+(reSum - give));
//		System.out.println("ans is "+ans);
		return ans;
	}
}
