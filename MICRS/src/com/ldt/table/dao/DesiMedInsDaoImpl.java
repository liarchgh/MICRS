package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.ldt.item.entity.CapLine;
import com.ldt.item.entity.DesiMedIns;
//import com.ldt.item.entity.Drug;
import com.ldt.item.entity.HospitalClass;
import com.ldt.item.entity.HospitalOrganization;

public class DesiMedInsDaoImpl implements DesiMedInsDao {

	@Override
	public void insertDesiMedIns(DesiMedIns des) {
		// TODO Auto-generated method stub
		String sql = "insert into desi_med_ins values(desi_med_ins_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, des.getServiceName());
			ps.setString(2, des.getHospitalId().getHospitalId());
			ps.setString(3, des.getHospitalId().getHospitalLevel());
			ps.setString(4, des.getHoId().getHoId());
			ps.setString(5, des.getHoId().getMedInsClass());
			ps.setString(6, des.getPostalCode());
			ps.setString(7, des.getLegRepName());
			ps.setString(8, des.getLegRepPhone());
			ps.setString(9,des.getConnName());
			ps.setString(10, des.getConnPhone());
			ps.setString(11, des.getConnCell());
			ps.setString(12, des.getAddr());
			
			
//			System.out.println(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		
	}

	@Override
	public List<DesiMedIns> selectDesiMedIns(DesiMedIns item) {
		// TODO Auto-generated method stub
		List<DesiMedIns> ans = new ArrayList<DesiMedIns>();
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from desi_med_ins where 1=1 ";
		if(item.getDesiMedInsId() != null && item.getDesiMedInsId() != ""){
			sql = sql + " and DESI_MED_INS_ID = '"+ item.getDesiMedInsId() +"'";
		}
		if(item.getServiceName() != null && item.getServiceName() != ""){
			sql = sql + " and SERVICE_NAME = '"+ item.getServiceName()+"''";
		}
		if(item.getHospitalId()!=null && item.getHospitalId().getHospitalId()!= null && item.getHospitalId().getHospitalId()!=""){
			sql = sql + "and HOSPITAL_ID='"+item.getHospitalId().getHospitalId()+"'";
		}
		if(item.getHospitalId()!=null && item.getHospitalId().getHospitalLevel()!= null && item.getHospitalId().getHospitalLevel()!= ""){
			sql = sql + "and HOSPITAL_LEVEL='"+item.getHospitalId().getHospitalLevel()+"'";
		}
		if(item.getHoId()!= null && item.getHoId().getHoId() != null && item.getHoId().getHoId() != ""){
			sql = sql + "and HO_ID= '"+item.getHoId().getHoId()+"'";
		}
		if(item.getHoId()!= null && item.getHoId().getMedInsClass() != null && item.getHoId().getMedInsClass() !=""){
			sql = sql +"and MED_INS_CLASS='"+item.getHoId().getMedInsClass()+"'";
		}
		if(item.getPostalCode()!=null && item.getPostalCode()!= ""){
			sql = sql + "and POSTALCODE= '"+item.getPostalCode()+"'";
		}
		if(item.getLegRepName()!= null && item.getLegRepName()!=""){
			sql = sql + "and LEG_REP_NAME= '"+item.getLegRepName()+"'";
		}
		if(item.getLegRepPhone()!= null && item.getLegRepPhone()!=""){
			sql = sql + "and LEG_REP_PHONE='"+item.getLegRepPhone()+"'";
		}
		if(item.getConnName()!= null && item.getConnName()!= ""){
			sql = sql + "and CONN_NAME ='"+item.getConnName()+"'";
		}
		if(item.getConnPhone()!=null && item.getConnPhone()!= ""){
			sql = sql + "and CONN_PHONE='"+item.getConnPhone()+"'";
		}
		if(item.getConnCell()!= null && item.getConnCell()!= ""){
			sql = sql + "and CONN_CELL = '"+item.getConnCell()+"'";
		}
		if(item.getAddr() != null && item.getAddr() != ""){
			sql = sql +"and ADDR = '"+item.getAddr()+"'";
		}
			
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
				String hi = rs.getString(3);
				String hl = rs.getString(4);
				HospitalClass hc = new HospitalClass(hi,hl);
				
				String hoi = rs.getString(5);
				String mi = rs.getString(6);
				HospitalOrganization ho = new HospitalOrganization(hoi, mi);
				
				ans.add(new DesiMedIns(rs.getString(1), rs.getString(2),hc, ho, rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
//		System.out.println(ans.toString());
		return ans;
		
	}

	@Override
	public void updateTable(DesiMedIns des) {
		// TODO Auto-generated method stub
		String sql = "update desi_med_ins set SERVICE_NAME=? , HOSPITAL_ID=?,HOSPITAL_LEVEL=?,HO_ID=?,MED_INS_CLASS=?,POSTALCODE=?,LEG_REP_NAME=?,LEG_REP_PHONE=?,CONN_NAME=?,CONN_PHONE=?,CONN_CELL=?,ADDR=?"
				+ " where DESI_MED_INS_ID = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, des.getServiceName());
			ps.setString(2, des.getHospitalId().getHospitalId());
			ps.setString(3, des.getHospitalId().getHospitalLevel());
			ps.setString(4, des.getHoId().getHoId());
			ps.setString(5, des.getHoId().getMedInsClass());
			ps.setString(6, des.getPostalCode());
			ps.setString(7, des.getLegRepName());
			ps.setString(8, des.getLegRepPhone());
			ps.setString(9, des.getConnName());
			ps.setString(10, des.getConnPhone());
			ps.setString(11, des.getConnCell());
			ps.setString(12, des.getAddr());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}
		
		
	}

	@Override
	public void deleteTable(String desiid) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		String sql = "delete from desi_med_ins where DESI_MED_INS_ID = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, desiid);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}
		
	}

	
}
