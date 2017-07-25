package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.UnitInfor;

public class UnitInforDaoImpl implements UnitInforDao {
//	public static void main(String[] args) {
//		UnitInforDaoImpl tt = new UnitInforDaoImpl();
//		System.out.println(tt.selectUnitInforDao(new UnitInfor()).toString());
////		tt.insertUnitInfor(new UnitInfor("", "aaaaaa","aaaaaa","aaaaaa","99999","999999"));
////		tt.updateUnitInfor(new UnitInfor("4", "bbbbb","bbbbb","bbbbb","5555","55555"));
//		tt.deleteUnitInfor("4");
//		System.out.println(tt.selectUnitInforDao(new UnitInfor()).toString());
//	}

	@Override
	public void insertUnitInfor(UnitInfor item) {
		String sql = "insert into Unit_Infor (UNIT_ID, UNIT_NAME, UNIT_TYPE, UNIT_ADDR, POSTCODE, PHONE) values(Unit_Infor_seq.nextval,?,?,?,?,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getUnitName() != null
					&& item.getPhone() != null
					&& item.getPostcode() != null
					&& item.getUnitAddr() != null
					&& item.getUnitType() != null){
			ps = conn.prepareStatement(sql);
			ps.setString(1, item.getUnitName());
			ps.setString(2, item.getUnitType());
			ps.setString(3, item.getUnitAddr());
			ps.setString(4, item.getPostcode());
			ps.setString(5, item.getPhone());
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
	public List<UnitInfor> selectUnitInfor(UnitInfor item) {
		// TODO Auto-generated method stub
		List<UnitInfor> ans = new ArrayList<UnitInfor>();
		String sql = "select * from UNIT_INFOR where 1=1 ";
		if(item.getPhone() != null){
			sql = sql + " and Phone = '" + item.getPhone() + "' ";
		}
		if(item.getPostcode() != null){
			sql = sql + " and Postcode = '" + item.getPostcode() + "' ";
		}
		if(item.getUnitAddr() != null){
			sql = sql + " and UnitAddr = '" + item.getUnitAddr() + "' ";
		}
		if(item.getUnitId() != null){
			sql = sql + " and UnitId = '" + item.getUnitId() + "' ";
		}
		if(item.getUnitName() != null){
			sql = sql + " and UnitName = '" + item.getUnitName() + "' ";
		}
		if(item.getUnitType() != null){
			sql = sql + " and UnitType = '" + item.getUnitType() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new UnitInfor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
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
	public void updateUnitInfor(UnitInfor item) {
		// TODO Auto-generated method stub
		String sql = "update Unit_Infor set UNIT_NAME = ?, UNIT_TYPE = ?, UNIT_ADDR = ?, POSTCODE = ?, PHONE = ? where UNIT_ID = ?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(item.getUnitName() != null
					&& item.getUnitType() != null
					&& item.getUnitAddr() != null
					&& item.getPostcode() != null
					&& item.getPhone() != null
					&& item.getUnitId() != null){
			ps.setString(1, item.getUnitName());
			ps.setString(2, item.getUnitType());
			ps.setString(3, item.getUnitAddr());
			ps.setString(4, item.getPostcode());
			ps.setString(5, item.getPhone());
			ps.setString(6, item.getUnitId());
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
	public void deleteUnitInfor(String id) {
		String sql = "delete from Unit_Infor where UNIT_ID = ?";
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
