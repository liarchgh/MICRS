package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.CapLine;

public class CapLineDaoImpl implements CapLineDao{

	@Override
	public void insertCapLine(CapLine capline) {
		// TODO Auto-generated method stub
		String sql = "insert into cap_line values(cap_line_seq.nextval,?,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, capline.getIndiSegId());
			ps.setString(2, capline.getMedPersClass());
			ps.setFloat(3, capline.getCapLine());
			
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
	public List<CapLine> selectCapLine(String id) {
		// TODO Auto-generated method stub
		List<CapLine> ans = new ArrayList<CapLine>();
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from cap_list where 1=1 ";
		if(id != null){
			sql = sql + " and id =" + id;
		}
			
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new CapLine(rs.getString(1), rs.getString(2), rs.getString(3), rs.getFloat(4)));
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
	public void updateTable(CapLine capline) {
		// TODO Auto-generated method stub
		String sql = "update cap_line set INDI_ SEG_ID=? , MED_PERS_CLASS=?,CAP_LINE=?,"
				+ " where ID = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, capline.getIndiSegId());
			ps.setString(2, capline.getMedPersClass());
			ps.setFloat(3, capline.getCapLine());
			ps.setString(4, capline.getId());
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
		String sql = "delete from Cap_Line where id = ?";
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
	
	public static void main(String[] args) {
		CapLineDao cl = new CapLineDaoImpl();
		cl.insertCapLine(new CapLine("1","1","1",1));
		
	}

}
