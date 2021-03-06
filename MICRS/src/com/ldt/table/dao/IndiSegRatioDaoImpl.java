package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.HospitalClass;
import com.ldt.item.entity.IndiSeg;
import com.ldt.item.entity.IndiSegRatio;
import com.ldt.item.entity.MedPers;

public class IndiSegRatioDaoImpl implements IndiSegRatioDao{

	@Override
	public void insertIndiSegRatio(IndiSegRatio isr) {
		// TODO Auto-generated method stub
		String sql = "insert into INDI_SEG_RATIO values(INDI_SEG_RATIO_seq.nextval,?,?,?,?,?,?,?,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, isr.getIndiSeg().getIndiSegID());
			ps.setString(2, isr.getIndiSeg().getIndiSeg());
			ps.setString(3, isr.getMedPers().getMedPersNum());
			ps.setString(4, isr.getMedPers().getMedPersClass());
			ps.setString(5, isr.getHospital().getHospitalId());
			ps.setString(6, isr.getHospital().getHospitalLevel());
			ps.setFloat(7,isr.getTopMon());
			ps.setFloat(8, isr.getBootomMon());
			ps.setFloat(9,isr.getRatio());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		
	}

	@Override
	public List<IndiSegRatio> selectIndiSegRatio(IndiSegRatio item) {
		// TODO Auto-generated method stub
		List<IndiSegRatio> ans = new ArrayList<IndiSegRatio>();
	
		String sql = "select * from INDI_SEG_RATIO where 1=1 ";
		if(item.getId() != null && item.getId() != ""){
			sql = sql + " and id =' "+ item.getId()+"'";
		}
		if(item.getIndiSeg()!=null && item.getIndiSeg().getIndiSegID() != null && item.getIndiSeg().getIndiSegID() != ""){
			sql = sql + " and INDI_SEG_ID = '" +item.getIndiSeg().getIndiSegID()+"'";
		}
		if(item.getIndiSeg()!=null && item.getIndiSeg().getIndiSeg() != null && item.getIndiSeg().getIndiSeg()!=""){
			sql = sql + " and INDI_SEG = '"+item.getIndiSeg().getIndiSeg()+"'";
		}
		
		if(item.getMedPers()!=null && item.getMedPers().getMedPersNum() != null && item.getMedPers().getMedPersNum() != ""){
			sql = sql + " and MED_PERS_NUM= '" +item.getMedPers().getMedPersNum()+"'";
		}
		if(item.getMedPers()!=null && item.getMedPers().getMedPersClass()!= null && item.getMedPers().getMedPersClass()!=""){
			sql = sql + " and MED_PERS_CLASS = '"+item.getMedPers().getMedPersClass()+"'";
		}
		if(item.getHospital()!= null && item.getHospital().getHospitalId() != null && item.getHospital().getHospitalId() != ""){
			sql = sql + " and HOSPITAL_ID='" +item.getHospital().getHospitalId()+"'";
		}
		if(item.getHospital()!= null && item.getHospital().getHospitalLevel()!= null && item.getHospital().getHospitalLevel()!= ""){
			sql = sql + " and HOSPITAL_LEVEL='"+item.getHospital().getHospitalLevel()+"'";
		}
		if(item.getTopMon()>0){
			sql = sql + " and TOP_MON = '"+item.getTopMon()+"'";
		}
		if(item.getBootomMon()>0){
			sql = sql + " and BOOTOM_MON ='"+item.getBootomMon()+"'";
		}
		if(item.getRatio()>0){
			sql = sql + " and RATIO= '"+item.getRatio()+"'";
		}
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
//			System.out.println(sql);
			while(rs.next()){
				ans.add(new IndiSegRatio(rs.getString(1), new IndiSeg(rs.getString(2), rs.getString(3)), new MedPers(rs.getString(4), rs.getString(5)), new HospitalClass(rs.getString(6),rs.getString(7)), rs.getFloat(8), rs.getFloat(9), rs.getFloat(10)));
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
	public void updateTable(IndiSegRatio dp) {
		// TODO Auto-generated method stub
		String sql = "update INDI_SEG_RATIO set INDI_SEG_ID=? , INDI_SEG=?,MED_PERS_NUM=?,"
				+ "MED_PERS_CLASS=?,HOSPITAL_ID=?,HOSPITAL_LEVEL=?,TOP_MON=?,BOOTOM_MON=?,"
				+ "RATIO=?"
				+ " where ID = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dp.getIndiSeg().getIndiSegID());
			ps.setString(2, dp.getIndiSeg().getIndiSeg());
			ps.setString(3, dp.getMedPers().getMedPersNum());
			ps.setString(4, dp.getMedPers().getMedPersClass());
			ps.setString(5, dp.getHospital().getHospitalId());
			ps.setString(6, dp.getHospital().getHospitalLevel());
			ps.setFloat(7, dp.getTopMon());
			ps.setFloat(8,dp.getBootomMon());
			ps.setFloat(9,dp.getRatio());
			ps.setString(10,dp.getId());
			
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
		String sql = "delete from INDI_SEG_RATIO where id = ?";
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

}
