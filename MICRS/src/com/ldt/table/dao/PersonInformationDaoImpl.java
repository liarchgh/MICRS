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
//	public static void main(String[] args) {
//		PersonInformationDaoImpl tt = new PersonInformationDaoImpl();
//		System.out.println(tt.selectPersonInformation((new PersonInformation())).toString());
////		PersonInformation one = new PersonInformation("1", "tt",
////				"3", "tt", "tt", "tt",
////				"2222-2-2", "2222-2-2", "2222-2-2", "tt",
////				"hh", new MedPers("1", "tt"), "4",
////				new DesiMedIns("2", "tt"), new UnitInfor("2", "234", "werty",
////						"qwertyu", "234562", "12345678987"));
////		System.out.println(one);
////		tt.insertPersonInformation(one);
////		tt.deletePersonInformation("39");
////		System.out.println(tt.selectPersonInformation((new PersonInformation())).toString());
//}
	@Override
	public List<PersonInformation> selectPersonInformation(
			PersonInformation item) {
		// TODO Auto-generated method stub
		List<PersonInformation> ans = new ArrayList<PersonInformation>();
		String sql = "select * from person_information where 1=1 ";
		if(item.getUserId() != null && item.getUserId() != ""){
			sql = sql + " and USER_ID = '" + item.getUserId() + "' ";
		}
		if(item.getCertificateType() != null && item.getCertificateType() != ""){
			sql = sql + " and Certificate_Type = '" + item.getCertificateType() + "' ";
		}
		if(item.getCertificateID() != null && item.getCertificateID() != ""){
			sql = sql + " and Certificate_ID = '" + item.getCertificateID() + "' ";
		}
		if(item.getName() != null && item.getName() != ""){
			sql = sql + " and NAME = '" + item.getName() + "' ";
		}
		if(item.getSex() != null && item.getSex() !=""){
			sql = sql + " and SEX = '" + item.getSex() + "' ";
		}
		if(item.getNation() != null && item.getNation() !=""){
			sql = sql + " and NATION = '" + item.getNation() + "' ";
		}
		if(item.getBirthday() != null && item.getBirthday() != ""){
			sql = sql + " and BIRTHDAY = to_date('" + item.getBirthday()+ "', 'yyyy-mm-dd') ";
		}
		if(item.getWorkDate() != null && item.getWorkDate() != ""){
			sql = sql + " and WORK_DATE = to_date('" + item.getWorkDate() + "', 'yyyy-mm-dd') ";
		}
		if(item.getRetire() != null && item.getRetire() != ""){
			sql = sql + " and RETIRE = to_date('" + item.getRetire() + "', 'yyyy-mm-dd') ";
		}
		if(item.getHouseType() != null && item.getHouseType() != ""){
			sql = sql + " and HOUSE_TYPE = '" + item.getHouseType() + "' ";
		}
		if(item.getHouseLoc() != null && item.getHouseLoc() != ""){
			sql = sql + " and HOUSE_LOC = '" + item.getHouseLoc() + "' ";
		}
		if(item.getMedPersNum() != null && item.getMedPersNum().getMedPersNum() != null && item.getMedPersNum().getMedPersNum() != ""){
			sql = sql + " and MED_PERS_NUM = '" + item.getMedPersNum().getMedPersNum() + "' ";
		}
		if(item.getMedPersNum() != null && item.getMedPersNum().getMedPersClass() != null && item.getMedPersNum().getMedPersClass() !=""){
			sql = sql + " and MED_PERS_CLASS = '" + item.getMedPersNum().getMedPersClass() + "' ";
		}
		if(item.getSecurityNum() != null && item.getSecurityNum() != ""){
			sql = sql + " and SECURITY_NUM = '" + item.getSecurityNum() + "' ";
		}
		if(item.getDesiMedIns() != null && item.getDesiMedIns().getDesiMedInsId() != null && item.getDesiMedIns().getDesiMedInsId() != ""){
			sql = sql + " and DESI_MED_INS_ID = '" + item.getDesiMedIns() + "' ";
		}
		if(item.getUnit() != null && item.getUnit().getUnitId() != null && item.getUnit().getUnitId() != ""){
			sql = sql + " and UNIT_ID = '" + item.getUnit().getUnitId() + "' ";
		}

		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				String bird = rs.getString(7).split(" ")[0];
				String word = rs.getString(8).split(" ")[0];
				String retd = rs.getString(9).split(" ")[0];
				System.out.println(bird+" "+word+" "+retd);
				ans.add(new PersonInformation(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						bird, word, retd, rs.getString(10),
						rs.getString(11), new MedPers(rs.getString(12), rs.getString(13)), rs.getString(14),
						new DesiMedIns(rs.getString(15), null), new UnitInfor(rs.getString(16), null, null,null,null,null)));
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
		String sql = "insert into person_information values(id_seq.nextval,?,?,?,?,?,to_date(? , 'yyyy-mm-dd'),to_date(? , 'yyyy-mm-dd'),to_date(? , 'yyyy-mm-dd'),?,?,?,?,social_id_seq.nextval,?,?)";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
//		System.out.println("haha");

		try {
			ps = conn.prepareStatement(sql);
			/*if(item.getUserId() != null
					&& item.getCertificateID() != null
					&& item.getCertificateType() != null
					&& item.getSex() != null
					&& item.getNation() != null
					&& item.getBirthday() != null
					&& item.getWorkDate() != null
					&& item.getMedPersNum() != null
					&& item.getMedPersNum().getMedPersNum() != null
					&& item.getMedPersNum().getMedPersClass() != null
					&& item.getDesiMedIns() != null
					&& item.getDesiMedIns().getDesiMedInsId() != null
					&& item.getUnit() != null
					&& item.getUnit().getUnitId() != null){*/
			//insert into person_information values(id_seq.nextval,'sssss','3456789','poiuytr','uu','ujnyhn',to_date('2015-5-5', yyyy-mm-dd),to_date('2026-6-21', yyyy-mm-dd),to_date('2054-2-5', yyyy-mm-dd),'yjkrf','oiert','oiert1','ikmhjn',social_id_seq.nextval,'3','345');
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
//			}
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
				+ "SEX=?,NATION=?, BIRTHDAY=to_date(?,'yyyy-mm-dd'),WORK_DATE=to_date(?,'yyyy-mm-dd'),"
				+ "RETIRE=to_date(?,'yyyy-mm-dd'),HOUSE_TYPE=?,HOUSE_LOC=?，MED_PERS_NUM=?,MED_PERS_CLASS=?,SECURITY_NUM=?,"
				+ "DESI_MED_INS_ID=?,UNIT_ID=?"
				+ " where USER_ID = ?";
		Connection conn = DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);

			if(item.getUserId() != null
					&& item.getCertificateID() != null
					&& item.getCertificateType() != null
					&& item.getSex() != null
					&& item.getNation() != null
					&& item.getBirthday() != null
					&& item.getWorkDate() != null
					&& item.getMedPersNum() != null
					&& item.getMedPersNum().getMedPersNum() != null
					&& item.getMedPersNum().getMedPersClass() != null
					&& item.getDesiMedIns() != null
					&& item.getDesiMedIns().getDesiMedInsId() != null
					&& item.getUnit() != null
					&& item.getUnit().getUnitId() != null){
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
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}

	}

	@Override
	public void deletePersonInformation(String id) {
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