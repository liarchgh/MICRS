package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.MedPers;

public class MedPersDaoImpl implements MedPersDao {

//	public static void main(String[] args) {
//		MedPersDaoImpl tt = new MedPersDaoImpl();
//		System.out.println(tt.selectMedPers(new MedPers()).toString());
////		tt.deleteMedPers("2");
////		System.out.println(tt.selectMedPers(new MedPers()).toString());
//	}
	@Override
	public void insertMedPers(MedPers item) {
		String sql = "insert into MED_PERS (MED_PERS_NUM, MED_PERS_CLASS) values(MED_PERS_seq.nextval,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getMedPersClass() != null){
			ps = conn.prepareStatement(sql);
			ps.setString(1, item.getMedPersClass());
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
	public List<MedPers> selectMedPers(MedPers item) {
		// TODO Auto-generated method stub
		List<MedPers> ans = new ArrayList<MedPers>();
		String sql = "select * from MED_PERS where 1=1 ";
		if(item.getMedPersNum() != null){
			sql = sql + " and MED_PERS_NUM = '" + item.getMedPersNum() + "' ";
		}
		if(item.getMedPersNum() != null){
			sql = sql + " and MED_PERS_CLASS = '" + item.getMedPersClass() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new MedPers(rs.getString(1), rs.getString(2)));
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
	public void updateMedPers(MedPers item) {
		// TODO Auto-generated method stub
		String sql = "update MED_PERS set MED_PERS_CLASS = ? where MED_PERS_NUM = ?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(item.getMedPersClass() != null
					&& item.getMedPersNum() != null){
			ps.setString(1, item.getMedPersClass());
			ps.setString(2, item.getMedPersNum());
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
	public void deleteMedPers(String id) {
		String sql = "delete from MED_PERS where MED_PERS_NUM = ?";
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
