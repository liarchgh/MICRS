package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.DiseaseProject;
import com.ldt.item.entity.MedPers;

public class DiseaseProjectDaoImpl implements DiseaseProjectDao{

	@Override
	public void insertDiseaseProject(DiseaseProject dp) {
		// TODO Auto-generated method stub
		String sql = "insert into DISEASE_PROJECT values(dis_pro_seq.nextval,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dp.getDisClass());
			
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
	public List<DiseaseProject> selectDiseaseProject(DiseaseProject item) {
		// TODO Auto-generated method stub
		List<DiseaseProject> ans = new ArrayList<DiseaseProject>();
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from DISEASE_PROJECT where 1=1 ";
		if(item.getDiseaseNum() != null && item.getDiseaseNum() != ""){
			sql = sql + " and DISEASE_NUM ='" + item.getDiseaseNum() +"'";
		}
		if(item.getDisClass()!= null && item.getDisClass()!= ""){
			sql = sql + "and DIS_CLASS = '"+item.getDisClass()+"'";
		}
			
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
				String dno1 = rs.getString(1);
				String dc = rs.getString(2);
				
				DiseaseProject dp = new DiseaseProject(dno1,dc);
				ans.add(dp);
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
	public void updateTable(DiseaseProject dp) {
		// TODO Auto-generated method stub
		String sql = "update DISEASE_PROJECT set DIS_CLASS=? "
				+ " where DISEASE_NUM = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dp.getDisClass());
			ps.setString(2, dp.getDiseaseNum());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}
	}

	@Override
	public void deleteTable(String dno) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		String sql = "delete from DISEASE_PROJECT where DISEASE_NUM = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dno);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}
		
	}

}
