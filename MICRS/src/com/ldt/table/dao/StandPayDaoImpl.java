package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.StandPay;
import com.ldt.item.entity.UnitInfor;

public class StandPayDaoImpl implements StandPayDao {
	public static void main(String[] args) {
		StandPayDaoImpl tt  = new StandPayDaoImpl();3, medPersClass=cccccc]
		System.out.println(tt.selectStandPay(new StandPay()).toString());
		tt.insertStandPay(new StandPay("", "3", "xxx",
				"3", "cccccc", String hospitalId,
				String hospitalLevel, float standPay));(
	}

	@Override
	public void insertStandPay(StandPay item) {
		String sql = "insert into Stand_Pay (ID, INDI_SEG_ID, INDI_SEG, MED_PERS_NUM, MED_PERS_CLASS, HOSPITAL_ID, HOSPITAL_LEVEL, STAND_PAY) values(Stand_Pay_seq.nextval,?,?,?,?,?,?,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getIndiSegId() != null
					&& item.getIndiSeg() != null
					&& item.getMedPresNum() != null
					&& item.getMedPresClass() != null
					&& item.getHospitalId() != null){
			ps = conn.prepareStatement(sql);
			ps.setString(1, item.getIndiSegId());
			ps.setString(2, item.getIndiSeg());
			ps.setString(3, item.getMedPresNum());
			ps.setString(4, item.getMedPresClass());
			ps.setString(5, item.getHospitalId());
			ps.setString(6, item.getHospitalLevel());
			ps.setFloat(7, item.getStandPay());
			ps.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.close(null, ps, conn);
		}
	}

	@Override
	public List<StandPay> selectStandPay(StandPay item) {
		// TODO Auto-generated method stub
		List<StandPay> ans = new ArrayList<StandPay>();
		String sql = "select * from Stand_Pay where 1=1 ";
		if(item.getIndiSegId() != null){
			sql = sql + " and IndiSegId = '" + item.getIndiSegId() + "' ";
		}
		if(item.getIndiSeg() != null){
			sql = sql + " and IndiSeg = '" + item.getIndiSeg() + "' ";
		}
		if(item.getMedPresNum() != null){
			sql = sql + " and MedPresNum = '" + item.getMedPresNum() + "' ";
		}
		if(item.getMedPresClass() != null){
			sql = sql + " and MedPresClass = '" + item.getMedPresClass() + "' ";
		}
		if(item.getHospitalId() != null){
			sql = sql + " and HospitalId = '" + item.getHospitalId() + "' ";
		}
		if(item.getHospitalLevel() != null){
			sql = sql + " and HospitalLevel = '" + item.getHospitalLevel() + "' ";
		}
		if(item.getStandPay() > 0){
			sql = sql + " and StandPay = '" + item.getStandPay() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new StandPay(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getFloat(8)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.close(rs, ps, conn);
		}
		return ans;
	}

	@Override
	public void updateStandPay(StandPay item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStandPay(String medicineCode) {
		// TODO Auto-generated method stub

	}

}
