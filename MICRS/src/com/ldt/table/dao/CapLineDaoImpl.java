package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.CapLine;
//import com.ldt.item.entity.Drug;
import com.ldt.item.entity.MedPers;

public class CapLineDaoImpl implements CapLineDao{

	@Override
	public void insertCapLine(CapLine capline) {
		// TODO Auto-generated method stub
		String sql = "insert into cap_line values(?,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, capline.getMedpers().getMedPersNum());
			ps.setString(2, capline.getMedpers().getMedPersClass());
			ps.setDouble(3, capline.getCapLine());
			
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
	public List<CapLine> selectCapLine(CapLine capline) {
		// TODO Auto-generated method stub
		List<CapLine> ans = new ArrayList<CapLine>();
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from cap_line where 1=1 ";
		if(capline.getMedpers()!= null && capline.getMedpers().getMedPersNum() != null && capline.getMedpers().getMedPersNum() != ""){
			sql = sql + " and INDI_SEG_ID ='" + capline.getMedpers().getMedPersNum()+"'";
		}
		if(capline.getMedpers()!= null &&  capline.getMedpers().getMedPersClass() != null && capline.getMedpers().getMedPersClass() != ""){
			sql = sql +" and MED_PERS_CLASS= '"+ capline.getMedpers().getMedPersClass()+"'";
		}
		if(capline.getCapLine()>0){
			sql = sql + " and CAP_LINE ='" + capline.getCapLine()+"'";
		}
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				String medid = rs.getString(1);
				String medname = rs.getString(2);
				float cap = rs.getFloat(3);
				
				MedPers mp = new MedPers(medid,medname);
				CapLine cp = new CapLine(mp,cap);
				
				ans.add(cp);
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
	public void updateTable(CapLine capline) {
		// TODO Auto-generated method stub
		String sql = "update cap_line set MED_PERS_CLASS=?,CAP_LINE=?"
				+ " where INDI_SEG_ID=?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, capline.getMedpers().getMedPersClass());
			ps.setDouble(2, capline.getCapLine());
			ps.setString(3, capline.getMedpers().getMedPersNum());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}
		
	}

	@Override
	public void deleteTable(String id) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		String sql = "delete from Cap_Line where INDI_SEG_ID= ?";
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
	
	/*public static void main(String[] args) {
		CapLineDao cl = new CapLineDaoImpl();

		
	}
*/
}
