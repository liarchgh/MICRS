package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.DesiMedIns;
import com.ldt.item.entity.MedPers;
import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.UnitInfor;

public class PersonInformationDaoImpl implements PersonInformationDao {
	public static void main(String[] args) {
		PersonInformationDaoImpl tt = new PersonInformationDaoImpl();
		System.out.println(tt.selectPersonInformation((new PersonInformation())).toString());
		tt.insertPersonInformation(new PersonInformation("", "sssss",
			"3456789", "poiuytr", "uu", "ujnyhn",
			"2015-5-5", "2026-6-21", "2054-2-5", "yjkrf",
			"oiert", new MedPers("1", "医生"), "",
			new DesiMedIns("3", "esrew"), new UnitInfor("345", "234", "werty",
					"qwertyu", "234562", "12345678987")));
		System.out.println(tt.selectPersonInformation((new PersonInformation())).toString());
}
	@Override
	public List<PersonInformation> selectPersonInformation(
			PersonInformation item) {
		// TODO Auto-generated method stub
		List<PersonInformation> ans = new ArrayList<PersonInformation>();
		String sql = "select * from person_information where 1=1 ";
		if(item.getUserId() != null){
			sql = sql + " and USER_ID = '" + item.getUserId() + "' ";
		}
		if(item.getCertificateType() != null){
			sql = sql + " and Certificate_Type = '" + item.getCertificateType() + "' ";
		}
		if(item.getCertificateID() != null){
			sql = sql + " and Certificate_ID = '" + item.getCertificateID() + "' ";
		}
		if(item.getName() != null){
			sql = sql + " and NAME = '" + item.getName() + "' ";
		}
		if(item.getSex() != null){
			sql = sql + " and SEX = '" + item.getSex() + "' ";
		}
		if(item.getNation() != null){
			sql = sql + " and NATION = '" + item.getNation() + "' ";
		}
		if(item.getBirthday() != null){
			sql = sql + " and BIRTHDAY = '" + item.getBirthday()+ "' ";
		}
		if(item.getWorkDate() != null){
			sql = sql + " and WORK_DATE = '" + item.getWorkDate() + "' ";
		}
		if(item.getRetire() != null){
			sql = sql + " and RETIRE = '" + item.getRetire() + "' ";
		}
		if(item.getHouseType() != null){
			sql = sql + " and HOUSE_TYPE = '" + item.getHouseType() + "' ";
		}
		if(item.getHouseLoc() != null){
			sql = sql + " and HOUSE_LOC = '" + item.getHouseLoc() + "' ";
		}
		if(item.getMedPersNum() != null && item.getMedPersNum().getMedPersNum() != null){
			sql = sql + " and MED_PERS_NUM = '" + item.getMedPersNum().getMedPersNum() + "' ";
		}
		if(item.getMedPersNum() != null && item.getMedPersNum().getMedPersClass() != null){
			sql = sql + " and MED_PERS_CLASS = '" + item.getMedPersNum().getMedPersClass() + "' ";
		}
		if(item.getSecurityNum() != null){
			sql = sql + " and SECURITY_NUM = '" + item.getSecurityNum() + "' ";
		}
		if(item.getDesiMedIns() != null){
			sql = sql + " and DESI_MED_INS_ID = '" + item.getDesiMedIns() + "' ";
		}
		if(item.getUnit() != null && item.getUnit().getUnitId() != null){
			sql = sql + " and UNIT_ID = '" + item.getUnit().getUnitId() + "' ";
		}

		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new PersonInformation(rs.getString(1), rs.getString(2)));
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
	public void insertPersonInformation(PersonInformation item) {
		// TODO Auto-generated method stub
		String sql = "insert into person_information values(id_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,social_id_seq.nextval,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		//记得新建一个社保卡号序列

		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, item.getCertificateType());
			ps.setString(2, item.getCertificateID());
			ps.setString(3, item.getName());
			ps.setString(4, item.getSex());
			ps.setString(5, item.getNation());
			ps.setString(6, item.getBirthday());
			ps.setString(7, item.getWorkDate());
			ps.setString(8, item.getRetire());
			ps.setString(9,item.getHouseType());
			ps.setString(10,item.getHouseLoc());
			ps.setString(11, item.getMedPersNum().getMedPersNum());
			ps.setString(12, item.getMedPersNum().getMedPersClass());
			ps.setString(13, item.getDesiMedIns().getDesiMedInsId());
			ps.setString(14, item.getUnit().getUnitId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}

	}

	@Override
	public void updatePersonInformation(PersonInformation item) {
		// TODO Auto-generated method stub
		String sql = "update person_information set Certificate_Type=? , Certificate_ID=?,NAME=?,"
				+ "SEX=?,NATION=?, BIRTHDAY=?,WORK_DATE=?,"
				+ "RETIRE=?,HOUSE_TYPE=?,HOUSE_LOC=?，MED_PERS_NUM=?,MED_PERS_CLASS=?,SECURITY_NUM=?,"
				+ "DESI_MED_INS_ID=?,UNIT_ID=?"
				+ " where USER_ID = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, item.getCertificateType());
			ps.setString(2, item.getCertificateID());
			ps.setString(3, item.getName());
			ps.setString(4, item.getSex());
			ps.setString(5, item.getNation());
			ps.setString(6, item.getBirthday());
			ps.setString(7, item.getWorkDate());
			ps.setString(8, item.getRetire());
			ps.setString(9, item.getHouseType());
			ps.setString(10, item.getHouseLoc());
			ps.setString(11, item.getMedPersNum().getMedPersNum());
			ps.setString(12, item.getMedPersNum().getMedPersClass());
			ps.setString(13, item.getSecurityNum());
			ps.setString(14, item.getDesiMedIns().getDesiMedInsId());
			ps.setString(15, item.getUnit().getUnitId());
			ps.setString(16, item.getUserId());
	
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}

	}

	@Override
	public void deleteHospitalOrganization(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from person_information where USER_ID = ?";
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