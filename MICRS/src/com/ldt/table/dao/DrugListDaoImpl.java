package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.Drug;
import com.ldt.item.entity.HospitalClass;

public class DrugListDaoImpl implements DrugListDao {
//	public static void main(String[] args) {
//		DrugListDaoImpl tt = new DrugListDaoImpl();
//		System.out.println(tt.selectDrug(new Drug()));
////		tt.insertDrug(new Drug("", "qqqq", "gggg", "yyyy", "jjjj", "iiii", 22.33f, "32", "www", new HospitalClass("2", "qqqqqq")));
//		tt.updateDrug(new Drug("2", "xxxx", "wwww", "ffff", "bbbb", "gggg", 44.44f, "66", "uuuu", new HospitalClass("2", "qqqqqq")));
////		tt.deleteDrug("4");
//		System.out.println(tt.selectDrug(new Drug()));
//	}

	@Override
	public void insertDrug(Drug drug) {
		// TODO Auto-generated method stub
		String sql = "insert into drug_list values(drug_list_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, drug.getMedicineName());
			ps.setString(2, drug.getChargeType());
			ps.setString(3, drug.getPrescriptionSign());
			ps.setString(4, drug.getChargeLevel());
			ps.setString(5, drug.getDrugDosageUnit());
			ps.setFloat(6, drug.getPriceCeiling());
			ps.setString(7, drug.getHospitalPreparationMark());
			ps.setString(8, drug.getApprovalMarks());
			ps.setString(9,drug.getHospitalID().getHospitalId());
			ps.setString(10, drug.getHospitalID().getHospitalLevel());
			
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		

	}

	@Override
	public List<Drug> selectDrug(Drug item) {
		// TODO Auto-generated method stub
		List<Drug> ans = new ArrayList<Drug>();
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from drug_list where 1=1 ";
		if(item.getMedicineCode() != null && item.getMedicineCode() != ""){
			sql = sql + " and medicine_Code = '" + item.getMedicineCode() + "'";
		}
		if(item.getMedicineName() != null && item.getMedicineName() != ""){
			sql = sql + " and medicine_Name = '"+ item.getMedicineName() + "'";
		}
		if(item.getChargeType() != null && item.getChargeType() != "") {
			sql = sql + "and charge_type = '"+ item.getChargeType() +"'";
		}
		if(item.getPrescriptionSign() != null && item.getPrescriptionSign() != "") {
			sql = sql + "and prescription_sign = '"+item.getPrescriptionSign()+"'";
		}
		if(item.getChargeLevel() != null && item.getChargeLevel() != "") {
			sql = sql + "and charge_level = '"+item.getChargeLevel()+"'";
		}
		if(item.getDrugDosageUnit() != null && item.getDrugDosageUnit() != "") {
			sql = sql + "and drug_dosage_unit = '"+item.getDrugDosageUnit()+"'";
		}
		if(item.getPriceCeiling() > 0) {
			sql = sql + "and  price ceiling = '"+item.getPriceCeiling()+"'";
		}
		if(item.getHospitalPreparationMark() != null && item.getHospitalPreparationMark() != "") {
			sql = sql + "and hospital_preparation_mark = '"+item.getHospitalPreparationMark()+"'";
		}
		if(item.getApprovalMarks() != null && item.getApprovalMarks() != "") {
			sql = sql + "and approval_marks = '"+item.getApprovalMarks()+"'";
		}
		if(item.getHospitalID() != null && item.getHospitalID().getHospitalLevel() != null && item.getHospitalID().getHospitalLevel() != "") {
			sql = sql + "and hospital_level = '"+item.getHospitalID().getHospitalLevel()+"'";
		}
		if(item.getHospitalID() != null && item.getHospitalID().getHospitalId() != null && item.getHospitalID().getHospitalId() != "") {
			sql = sql + "and HOSPITAL_ID = '"+item.getHospitalID().getHospitalId()+"'";
		}
			
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
				String hl = rs.getString(11);
				String hi = rs.getString(10);
				HospitalClass hc = new HospitalClass(hi,hl);
				
				ans.add(new Drug(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7), rs.getString(8), rs.getString(9), hc));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return ans;
	}

	@Override
	public void updateDrug(Drug drug) {
		// TODO Auto-generated method stub
		String sql = "update drug_list set medicine_name=? , charge_type=?,prescription_sign=?,"
				+ "charge_level=?,drug_dosage_unit=?, price_ceiling=?,hospital_preparation_mark=?,"
				+ "approval_marks=?,HOSPITAL_ID=?,hospital_level=?"
				+ " where medicine_code = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, drug.getMedicineName());
			ps.setString(2, drug.getChargeType());
			ps.setString(3, drug.getPrescriptionSign());
			ps.setString(4, drug.getChargeLevel());
			ps.setString(5, drug.getDrugDosageUnit());
			ps.setFloat(6, drug.getPriceCeiling());
			ps.setString(7, drug.getHospitalPreparationMark());
			ps.setString(8, drug.getApprovalMarks());
			ps.setString(9, drug.getHospitalID().getHospitalId());
			ps.setString(10, drug.getHospitalID().getHospitalLevel());
			ps.setString(11, drug.getMedicineCode());
			
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}

	}

	@Override
	public void deleteDrug(String id) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		String sql = "delete from drug_list where medicine_code = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}
		

	}
}
