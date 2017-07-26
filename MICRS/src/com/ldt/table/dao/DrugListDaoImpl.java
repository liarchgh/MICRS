package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.Drug;

public class DrugListDaoImpl implements DrugListDao {

	@Override
	public void insertUsers(Drug drug) {
		// TODO Auto-generated method stub
		String sql = "insert into drug_list values(user_list_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
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
			ps.setString(9, drug.getHospitalLevel());
			ps.setString(10,drug.getHospitalID());
			
			System.out.println(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		

	}

	@Override
	public List<Drug> selectUsers(String code, String name) {
		// TODO Auto-generated method stub
		List<Drug> ans = new ArrayList<Drug>();
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from drug_list where 1=1 ";
		if(code != null){
			sql = sql + " and medicineCode =" + code;
		}
		if(name != null){
			sql = sql + " and medicineName = "+ name;
		}
			
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new Drug(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		System.out.println(ans.toString());
		return ans;
	}

	@Override
	public void updateTable(Drug drug) {
		// TODO Auto-generated method stub
		String sql = "update drug_list set medicine_name=? , charge_type=?,prescription_sign=?,"
				+ "charge_level=?,drug_dosage_unit, price_ceiling=?,hospital_preparation_mark=?,"
				+ "approval_marks=?, hospital_level=?,HOSPITAL_ID=?"
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
			ps.setString(9, drug.getHospitalLevel());
			ps.setString(10, drug.getHospitalID());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}

	}

	@Override
	public void deleteTable(String medicineCode) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		String sql = "delete from drug_list where medicine_code = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, medicineCode);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}
		

	}

}
