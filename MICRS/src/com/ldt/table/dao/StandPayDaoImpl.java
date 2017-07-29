package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.HospitalClass;
import com.ldt.item.entity.IndiSeg;
import com.ldt.item.entity.MedPers;
import com.ldt.item.entity.StandPay;

public class StandPayDaoImpl implements StandPayDao {
	/*public static void main(String[] args) {
		StandPayDaoImpl tt = new StandPayDaoImpl();
		System.out.println(tt.selectStandPay(new StandPay()).toString());
		// tt.insertStandPay(new StandPay("4", new IndiSeg("3", "xxx"), new
		// MedPers("3", "cccccc"), new HospitalClass("2", "qqqqqq"), 22.22f));
		// tt.updateStandPay(new StandPay("4", new IndiSeg("3", "xxx"), new
		// MedPers("3", "cccccc"), new HospitalClass("2", "qqqqqq"), 88.88f));
		tt.deleteStandPay("4");
		System.out.println(tt.selectStandPay(new StandPay()).toString());
	}
*/
	@Override
	public void insertStandPay(StandPay item) {
		String sql = "insert into Stand_Pay (ID, INDI_SEG_ID, INDI_SEG, MED_PERS_NUM, MED_PERS_CLASS, HOSPITAL_ID, HOSPITAL_LEVEL, STAND_PAY) values(Stand_Pay_seq.nextval,?,?,?,?,?,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
//			if (item.getIndiSegId() != null && item.getMedPresNum() != null
//					&& item.getHospitalId() != null) {
				ps = conn.prepareStatement(sql);
				ps.setString(1, item.getIndiSegId().getIndiSegID());
				ps.setString(2, item.getIndiSegId().getIndiSeg());
				ps.setString(3, item.getMedPresNum().getMedPersNum());
				ps.setString(4, item.getMedPresNum().getMedPersClass());
				ps.setString(5, item.getHospitalId().getHospitalId());
				ps.setString(6, item.getHospitalId().getHospitalLevel());
				ps.setFloat(7, item.getStandPay());
				ps.executeUpdate();
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ps, conn);
		}
	}

	@Override
	public List<StandPay> selectStandPay(StandPay item) {
		// TODO Auto-generated method stub
		List<StandPay> ans = new ArrayList<StandPay>();
		String sql = "select * from Stand_Pay where 1=1 ";
		if (item.getIndiSegId() != null && item.getIndiSegId().getIndiSegID() != null && item.getIndiSegId().getIndiSegID() != "") {
			sql = sql + " and Indi_Seg_Id = '" + item.getIndiSegId().getIndiSegID() + "' ";
			}
		if (item.getIndiSegId() != null && item.getIndiSegId().getIndiSeg() != null && item.getIndiSegId().getIndiSeg() != "") {
				sql = sql + " and Indi_Seg = '" + item.getIndiSegId().getIndiSeg()
						+ "' ";
			}
		if (item.getMedPresNum() != null && item.getMedPresNum().getMedPersNum() != null && item.getMedPresNum().getMedPersNum() != "") {
			sql = sql + " and Med_Pers_Num = '" + item.getMedPresNum().getMedPersNum() + "' ";
		}
		if (item.getMedPresNum() != null && item.getMedPresNum().getMedPersClass() != null) {
				sql = sql + " and Med_Pers_Class = '"
						+ item.getMedPresNum().getMedPersClass() + "' ";
		}
		
		if (item.getHospitalId() != null && item.getHospitalId().getHospitalId() != null && item.getHospitalId().getHospitalId() != "") {
			sql = sql + " and Hospital_Id = '" + item.getHospitalId().getHospitalId() + "' ";
		}
		if (item.getHospitalId() != null && item.getHospitalId().getHospitalLevel() != null) {
				sql = sql + " and Hospital_Level = '"
						+ item.getHospitalId().getHospitalLevel() + "' ";
			
		}
		if (item.getStandPay() > 0) {
			sql = sql + " and Stand_Pay = '" + item.getStandPay() + "' ";
		}
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println(sql);
			while (rs.next()) {
				ans.add(new StandPay(rs.getString(1), new IndiSeg(rs.getString(2), rs.getString(3)), new MedPers(rs.getString(4), rs.getString(5)), new HospitalClass(rs.getString(6), rs.getString(7)), rs.getFloat(8)));
			}
			System.out.println(ans.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		return ans;
	}

	@Override
	public void updateStandPay(StandPay item) {
		// TODO Auto-generated method stub
		String sql = "update Stand_Pay set INDI_SEG_ID = ?, INDI_SEG = ?, MED_PERS_NUM = ?, MED_PERS_CLASS = ?, HOSPITAL_ID = ?, HOSPITAL_LEVEL = ?, STAND_PAY = ? where ID = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if (item.getIndiSegId() != null && item.getMedPresNum() != null
					&& item.getHospitalId() != null) {
				ps.setString(1, item.getIndiSegId().getIndiSegID());
				ps.setString(2, item.getIndiSegId().getIndiSeg());
				ps.setString(3, item.getMedPresNum().getMedPersNum());
				ps.setString(4, item.getMedPresNum().getMedPersClass());
				ps.setString(5, item.getHospitalId().getHospitalId());
				ps.setString(6, item.getHospitalId().getHospitalLevel());
				ps.setFloat(7, item.getStandPay());
				ps.setString(8, item.getId());
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ps, conn);
		}
	}

	@Override
	public void deleteStandPay(String id) {
		String sql = "delete from Stand_Pay where ID = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if (id != null) {
				ps.setString(1, id);
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ps, conn);
		}
	}
}
