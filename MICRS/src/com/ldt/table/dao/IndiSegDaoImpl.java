package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.IndiSeg;

public class IndiSegDaoImpl implements IndiSegDao {
	public static void main(String[] args) {
		IndiSegDaoImpl tt = new IndiSegDaoImpl();
		System.out.println(tt.selectStandPay(new IndiSeg()).toString());
		tt.insertIndiSeg(new IndiSeg("aaa", "aa"));
		System.out.println(tt.selectStandPay(new IndiSeg()).toString());
	}

	@Override
	public void insertIndiSeg(IndiSeg item) {
		String sql = "insert into Indi_Seg (IndiSegID, IndiSeg) values(Indi_Seg_seq.nextval,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getIndiSeg() != null){
			ps = conn.prepareStatement(sql);
			ps.setString(1, item.getIndiSeg());
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
	public List<IndiSeg> selectStandPay(IndiSeg item) {
		// TODO Auto-generated method stub
		List<IndiSeg> ans = new ArrayList<IndiSeg>();
		String sql = "select * from Indi_Seg where 1=1 ";
		if(item.getIndiSeg() != null){
			sql = sql + " and IndiSeg = '" + item.getIndiSeg() + "' ";
		}
		if(item.getIndiSegID() != null){
			sql = sql + " and IndiSegID = '" + item.getIndiSegID() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new IndiSeg(rs.getString(1), rs.getString(2)));
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
	public void updateIndiSeg(IndiSeg item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteIndiSeg(IndiSeg medicineCode) {
		// TODO Auto-generated method stub

	}

}
