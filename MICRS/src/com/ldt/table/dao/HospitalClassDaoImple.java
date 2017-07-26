package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.HospitalClass;

public class HospitalClassDaoImple implements HospitalClassDao {
	public static void main(String[] args) {
		HospitalClassDaoImple tt = new HospitalClassDaoImple();
	System.out.println(tt.selectHospitalClass((new HospitalClass())).toString());
//	tt.insertHospitalClass(new HospitalClass("2", "rrrrrrr"));
//	tt.updateHospitalClass(new HospitalClass("2", "qqqqqq"));
//	tt.deleteHospitalClass("3");
	System.out.println(tt.selectHospitalClass((new HospitalClass())).toString());
}
	@Override
	public void insertHospitalClass(HospitalClass item) {
		String sql = "insert into HOSPITAL_CLASS (HOSPITAL_ID, HOSPITAL_LEVEL) values(HOS_CLA_seq.nextval,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getHospitalLevel() != null){
			ps = conn.prepareStatement(sql);
			ps.setString(1, item.getHospitalLevel());
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
	public List<HospitalClass> selectHospitalClass(HospitalClass item) {
		// TODO Auto-generated method stub
		List<HospitalClass> ans = new ArrayList<HospitalClass>();
		String sql = "select * from HOSPITAL_CLASS where 1=1 ";
		if(item.getHospitalId() != null){
			sql = sql + " and HOSPITAL_ID = '" + item.getHospitalId() + "' ";
		}
		if(item.getHospitalLevel() != null){
			sql = sql + " and HOSPITAL_LEVEL = '" + item.getHospitalLevel() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new HospitalClass(rs.getString(1), rs.getString(2)));
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
	public void updateHospitalClass(HospitalClass item) {
		// TODO Auto-generated method stub
		String sql = "update HOSPITAL_CLASS set HOSPITAL_LEVEL = ? where HOSPITAL_ID = ?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(item.getHospitalId() != null
					&& item.getHospitalLevel() != null){
			ps.setString(1, item.getHospitalLevel());
			ps.setString(2, item.getHospitalId());
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
	public void deleteHospitalClass(String id) {
		String sql = "delete from HOSPITAL_CLASS where HOSPITAL_ID = ?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(id != null){
			ps.setString(1, id);
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

}
