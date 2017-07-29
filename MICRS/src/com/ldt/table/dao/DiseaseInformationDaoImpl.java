package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.DiseaseProject;
//import com.ldt.item.entity.MedPers;

public class DiseaseInformationDaoImpl implements DiseaseInformationDao{

	@Override
	public void insertDiseaseInformation(DiseaseInformation di) {
		// TODO Auto-generated method stub
		String sql = "insert into DISEASE_INFORMATION values(DISEASE_INFORMATION_seq.nextval,?,?,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, di.getDisName());
			ps.setString(2, di.getDiseaseNum().getDiseaseNum());
			ps.setString(3, di.getDiseaseNum().getDisClass());
			ps.setString(4, di.getDisReimbSign());
			
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
	public List<DiseaseInformation> selectDiseaseInformation(DiseaseInformation item) {
		// TODO Auto-generated method stub
		List<DiseaseInformation> ans = new ArrayList<DiseaseInformation>();
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
//		System.out.println(item.getDisNum());
		String sql = "select * from DISEASE_INFORMATION where 1=1 ";
		if(item.getDisNum() != null && item.getDisNum() != ""){
			sql = sql + " and DIS_NUM = '"+ item.getDisNum()+"'";
		}
		if(item.getDisName() != null && item.getDisName() != ""){
			sql = sql + " and DIS_NAME='"+item.getDisName()+"'";
		}
		if(item.getDiseaseNum()!= null && item.getDiseaseNum().getDiseaseNum() != null && item.getDiseaseNum().getDiseaseNum() !=""){
			sql = sql + " and DISEASE_NUM='"+item.getDiseaseNum().getDiseaseNum()+"'";
		}
		if(item.getDiseaseNum()!= null && item.getDiseaseNum().getDisClass() != null && item.getDiseaseNum().getDisClass() != ""){
			sql = sql + " and DIS_CLASS='"+item.getDiseaseNum().getDisClass()+"'";
		}
		if(item.getDisReimbSign()!=null && item.getDisReimbSign()!= ""){
			sql = sql + " and DIS_REIMB_SIGN = '"+item.getDisReimbSign()+"'";
		}
			
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
				String dno1 = rs.getString(1);
				String dname1 = rs.getString(2);
				String disno = rs.getString(3);
				String discla = rs.getString(4);
				String drs = rs.getString(5);
				
				DiseaseProject dp = new DiseaseProject(disno,discla);
				DiseaseInformation cp = new DiseaseInformation(dno1,dname1,dp,drs);
			
				ans.add(cp);
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
	public void updateTable(DiseaseInformation di) {
		// TODO Auto-generated method stub
		String sql = "update DISEASE_INFORMATION set DIS_NAME=? , DISEASE_NUM=?,DIS_CLASS=?,DIS_REIMB_SIGN=?"
				+ " where DIS_NUM = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, di.getDisName());
			ps.setString(2, di.getDiseaseNum().getDiseaseNum());
			ps.setString(3, di.getDiseaseNum().getDisClass());
			ps.setString(4, di.getDisReimbSign());
			ps.setString(5, di.getDisNum());
			
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
		String sql = "delete from DISEASE_INFORMATION where DIS_NUM = ?";
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
