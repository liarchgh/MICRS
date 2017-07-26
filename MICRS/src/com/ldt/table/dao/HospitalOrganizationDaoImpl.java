package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.HospitalOrganization;

public class HospitalOrganizationDaoImpl implements HospitalOrganizationDao {
//	public static void main(String[] args) {
//	HospitalClassDaoImple tt = new HospitalClassDaoImple();
//System.out.println(tt.selectHospitalClass((new HospitalClass())).toString());
////tt.insertHospitalClass(new HospitalClass("2", "rrrrrrr"));
////tt.updateHospitalClass(new HospitalClass("2", "qqqqqq"));
////tt.deleteHospitalClass("3");
//System.out.println(tt.selectHospitalClass((new HospitalClass())).toString());
//}
	@Override
	public List<HospitalOrganization> selectHospitalOrganization(
			HospitalOrganization item) {
		// TODO Auto-generated method stub
		List<HospitalOrganization> ans = new ArrayList<HospitalOrganization>();
		String sql = "select * from Hospital_Organization where 1=1 ";
		if(item.getHoId() != null){
			sql = sql + " and HO_ID = '" + item.getHoId() + "' ";
		}
		if(item.getMedInsClass() != null){
			sql = sql + " and MED_INS_CLASS = '" + item.getMedInsClass() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new HospitalOrganization(rs.getString(1), rs.getString(2)));
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
	public void insertHospitalOrganization(HospitalOrganization item) {
		String sql = "insert into Hospital_Organization (HO_ID, MED_INS_CLASS) values(Hos_Org_seq.nextval,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getMedInsClass() != null){
			ps = conn.prepareStatement(sql);
			ps.setString(1, item.getMedInsClass());
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
	public void updateHospitalOrganization(HospitalOrganization item) {
		// TODO Auto-generated method stub
		String sql = "update Hospital_Organization set MED_INS_CLASS = ? where HO_ID = ?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(item.getMedInsClass() != null){
			ps.setString(1, item.getMedInsClass());
			ps.setString(2, item.getHoId());
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
	public void deleteHospitalOrganization(String id) {
		String sql = "delete from Hospital_Organization where HO_ID = ?";
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
