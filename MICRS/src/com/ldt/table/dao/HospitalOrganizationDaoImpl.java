package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.HospitalOrganization;

public class HospitalOrganizationDaoImpl implements HospitalOrganizationDao {
	public static void main(String[] args) {
		HospitalOrganizationDaoImpl tt = new HospitalOrganizationDaoImpl();
		System.out.println(tt.selectHospitalOrganization(new HospitalOrganization()).toString());
		tt.insertIndiSeg(new HospitalOrganization("", "ssssss"));
		System.out.println(tt.selectHospitalOrganization(new HospitalOrganization()).toString());
}
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
	public void insertIndiSeg(HospitalOrganization item) {
		String sql = "insert into Hospital_Organization (HO_ID, MED_INS_CLASS) values(Hospital_Organization_seq.nextval,?)";
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

	}

	@Override
	public void deleteHospitalOrganization(String id) {
		// TODO Auto-generated method stub

	}

}
