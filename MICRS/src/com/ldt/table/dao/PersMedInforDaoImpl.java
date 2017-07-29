package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.DesiMedIns;
import com.ldt.item.entity.DiseaseInformation;
import com.ldt.item.entity.DiseaseProject;
import com.ldt.item.entity.HospitalClass;
import com.ldt.item.entity.IndiSeg;
import com.ldt.item.entity.PersMedInfor;
import com.ldt.item.entity.PersonInformation;

public class PersMedInforDaoImpl implements PersMedInforDao {

	public static void main(String[] args) {
		PersMedInforDaoImpl tt = new PersMedInforDaoImpl();
		System.out.println(tt.selectPersMedInfor(new PersMedInfor()));
//		tt.deleteMedPers("2");
//		tt.insertPersMedInfor(new PersMedInfor("2",
//				new PersonInformation("2", null),
//				new DesiMedIns("5", null),
//				new IndiSeg("1", "www"),
//				"2015-4-4", "2017-4-5",
//				new DiseaseProject("2", null),
//				new HospitalClass("2", "yy"),
//				new DiseaseInformation("2", "gg"),
//				"ss"));
//		tt.updatePersMedInfor(new PersMedInfor("38",
//				new PersonInformation("2", null),
//				new DesiMedIns("5", null),
//				new IndiSeg("1", "xxx"),
//				"2025-2-2", "2022-2-2",
//				new DiseaseProject("2", null),
//				new HospitalClass("2", "xx"),
//				new DiseaseInformation("2", "xx"),
//				"ss"));
		tt.deletePersMedInfor("38");
//		System.out.println(tt.selectMedPers(new MedPers()).toString());
		System.out.println(tt.selectPersMedInfor(new PersMedInfor()));
	}
	
	@Override
	public List<PersMedInfor> selectPersMedInfor(PersMedInfor item) {
		// TODO Auto-generated method stub
//		OUTPATIENT_NUM
//		NUM
//		DESI_MED_INS_ID
//		INDI_SEG_ID
//		INDI_SEG
//		IN_DATE
//		OUT_DATE
//		DISTYPE_NUM
//		HOSPITAL_ID
//		HOSPITAL_LEVEL
//		DIS_NUM
//		DIS_NAME
//		OUT_REASON

		List<PersMedInfor> ans = new ArrayList<PersMedInfor>();
		String sql = "select * from PERS_MED_INFOR where 1=1 ";
		if(item.getOutpatientNum() != null && !item.getOutpatientNum().equals("")){
			sql = sql + " and OUTPATIENT_NUM = '" + item.getOutpatientNum() + "' ";
		}
		if(item.getNum() != null){
			sql = sql + " and NUM = '" + item.getNum() + "' ";
		}
		if(item.getDesiMedIns() != null && item.getDesiMedIns().getDesiMedInsId() != null && !item.getDesiMedIns().getDesiMedInsId().equals("")){
			sql = sql + " and DESI_MED_INS_ID = '" + item.getDesiMedIns().getDesiMedInsId() + "' ";
		}
		if(item.getIndiSegId() != null){
			if(item.getIndiSegId().getIndiSegID() != null && !item.getIndiSegId().getIndiSegID().equals("")) {
				sql = sql + " and INDI_SEG_ID = '" + item.getIndiSegId().getIndiSegID() + "' ";
			}
			if(item.getIndiSegId().getIndiSeg() != null && !item.getIndiSegId().getIndiSeg().equals("")){
				sql = sql + " and INDI_SEG = '" + item.getIndiSegId().getIndiSeg() + "' ";
			}
		}
		if(item.getInDate() != null && !item.getInDate().equals("")){
			sql = sql + " and in_date = to_date('" + item.getInDate() + "', 'yyyy-mm-dd') ";
		}
		if(item.getOutDate() != null && !item.getOutDate().equals("")){
			sql = sql + " and OUT_DATE = to_date('" + item.getOutDate() + "', 'yyyy-mm-dd') ";
		}
		if(item.getDiseaseProject() != null && item.getDiseaseProject().getDiseaseNum() != null && !item.getDiseaseProject().getDiseaseNum().equals("")){
			sql = sql + " and DISTYPE_NUM = '" + item.getDiseaseProject().getDiseaseNum() + "' ";
		}
		if(item.getHospital() != null){
			if(item.getHospital().getHospitalId() != null && !item.getHospital().getHospitalId().equals("")){
				sql = sql + " and HOSPITAL_ID = '" + item.getHospital().getHospitalId() + "' ";
			}
			if(item.getHospital().getHospitalLevel() != null && !item.getHospital().getHospitalLevel().equals("")){
				sql = sql + " and HOSPITAL_LEVEL = '" + item.getHospital().getHospitalLevel() + "' ";
			}
		}
		if(item.getDisNum() != null) {
			if(item.getDisNum().getDisNum() != null && !item.getDisNum().getDisNum().equals("")){
				sql = sql + " and DIS_NUM = '" + item.getDisNum().getDisNum() + "' ";
			}
			if(item.getDisNum().getDisName() != null && !item.getDisNum().getDisName().equals("")){
				sql = sql + " and DIS_NAME = '" + item.getDisNum().getDisName() + "' ";
			}
		}
		if(item.getOutReason() != null && !item.getOutReason().equals("")){
			sql = sql + " and OUT_REASON = '" + item.getOutReason() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new PersMedInfor(rs.getString(1),
						new PersonInformation(rs.getString(2), null),
						new DesiMedIns(rs.getString(3), null),
						new IndiSeg(rs.getString(4), rs.getString(5)),
						rs.getString(6), rs.getString(7),
						new DiseaseProject(rs.getString(8), null),
						new HospitalClass(rs.getString(9), rs.getString(10)),
						new DiseaseInformation(rs.getString(11), rs.getString(12)),
						rs.getString(13)));
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
	public void insertPersMedInfor(PersMedInfor item) {
		String sql = "insert into PERS_MED_INFOR (OUTPATIENT_NUM, NUM,DESI_MED_INS_ID,INDI_SEG_ID,INDI_SEG,"
				+ "in_date,OUT_DATE,DISTYPE_NUM,HOSPITAL_ID,HOSPITAL_LEVEL,DIS_NUM,DIS_NAME,OUT_REASON)"
				+ "values(PERS_MED_INFOR_seq.nextval,?,?,?,?,to_date(?, 'yyyy-mm-dd'),to_date(?, 'yyyy-mm-dd'),?,?,?,?,?,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getNum() != null
					&& item.getInDate() != null && !item.getInDate().equals("")
					&& item.getDesiMedIns() != null && item.getDesiMedIns().getDesiMedInsId() != null && !item.getDesiMedIns().getDesiMedInsId().equals("")
					&& item.getIndiSegId() != null
					&& item.getIndiSegId().getIndiSegID() != null && !item.getIndiSegId().getIndiSegID().equals("")
					&& item.getIndiSegId().getIndiSeg() != null && !item.getIndiSegId().getIndiSeg().equals("")
					&& item.getOutDate() != null && !item.getOutDate().equals("")
					&& item.getDiseaseProject() != null && item.getDiseaseProject().getDiseaseNum() != null && !item.getDiseaseProject().getDiseaseNum().equals("")
					&& item.getHospital() != null
					&& item.getHospital().getHospitalId() != null && !item.getHospital().getHospitalId().equals("")
					&& item.getHospital().getHospitalLevel() != null && !item.getHospital().getHospitalLevel().equals("")
					&& item.getDisNum() != null
					&& item.getDisNum().getDisNum() != null && !item.getDisNum().getDisNum().equals("")
					&& item.getDisNum().getDisName() != null && !item.getDisNum().getDisName().equals("")
					&& item.getOutReason() != null && !item.getOutReason().equals("")){
			ps = conn.prepareStatement(sql);
//			System.out.println(item.getNum().getUserId());
//			System.out.println(item.getDesiMedIns().getDesiMedInsId());
//			System.out.println(item.getIndiSegId().getIndiSegID());
//			System.out.println(item.getIndiSegId().getIndiSeg());
//			System.out.println(item.getInDate());
//			System.out.println(item.getOutDate());
//			System.out.println("getDiseaseProject" + item.getDiseaseProject().getDiseaseNum());
//			System.out.println(item.getHospital().getHospitalId());
//			System.out.println(item.getHospital().getHospitalLevel());
//			System.out.println(item.getDisNum().getDisNum());
//			System.out.println(item.getDisNum().getDisName());
//			System.out.println(item.getOutReason());
		
			ps.setString(1, item.getNum().getUserId());
			ps.setString(2, item.getDesiMedIns().getDesiMedInsId());
			ps.setString(3, item.getIndiSegId().getIndiSegID());
			ps.setString(4, item.getIndiSegId().getIndiSeg());
			ps.setString(5, item.getInDate());
			ps.setString(6, item.getOutDate());
			ps.setString(7, item.getDiseaseProject().getDiseaseNum());
			ps.setString(8, item.getHospital().getHospitalId());
			ps.setString(9, item.getHospital().getHospitalLevel());
			ps.setString(10, item.getDisNum().getDisNum());
			ps.setString(11, item.getDisNum().getDisName());
			ps.setString(12, item.getOutReason());
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
	public void updatePersMedInfor(PersMedInfor item) {
		// TODO Auto-generated method stub
		String sql = "update PERS_MED_INFOR set NUM=?,DESI_MED_INS_ID=?,INDI_SEG_ID=?,"
				+ "INDI_SEG=?,in_date=to_date(?,'yyyy-mm-dd'),OUT_DATE=to_date(?,'yyyy-mm-dd'),DISTYPE_NUM=?,HOSPITAL_ID=?,"
				+ "HOSPITAL_LEVEL=?,DIS_NUM=?,DIS_NAME=?,OUT_REASON=? "
				+ "where OUTPATIENT_NUM = ?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(item.getNum() != null
					&& item.getInDate() != null && !item.getInDate().equals("")
					&& item.getDesiMedIns() != null && item.getDesiMedIns().getDesiMedInsId() != null && !item.getDesiMedIns().getDesiMedInsId().equals("")
					&& item.getIndiSegId() != null
					&& item.getIndiSegId().getIndiSegID() != null && !item.getIndiSegId().getIndiSegID().equals("")
					&& item.getIndiSegId().getIndiSeg() != null && !item.getIndiSegId().getIndiSeg().equals("")
					&& item.getOutDate() != null && !item.getOutDate().equals("")
					&& item.getDiseaseProject() != null && item.getDiseaseProject().getDiseaseNum() != null && !item.getDiseaseProject().getDiseaseNum().equals("")
					&& item.getHospital() != null
					&& item.getHospital().getHospitalId() != null && !item.getHospital().getHospitalId().equals("")
					&& item.getHospital().getHospitalLevel() != null && !item.getHospital().getHospitalLevel().equals("")
					&& item.getDisNum() != null
					&& item.getDisNum().getDisNum() != null && !item.getDisNum().getDisNum().equals("")
					&& item.getDisNum().getDisName() != null && !item.getDisNum().getDisName().equals("")
					&& item.getOutReason() != null && !item.getOutReason().equals("")){
			ps = conn.prepareStatement(sql);
//			System.out.println(item.getIndiSegId().getIndiSegID());
			ps.setString(1, item.getNum().getUserId());
			ps.setString(2, item.getDesiMedIns().getDesiMedInsId());
			ps.setString(3, item.getIndiSegId().getIndiSegID());
			ps.setString(4, item.getIndiSegId().getIndiSeg());
			ps.setString(5, item.getInDate());
			ps.setString(6, item.getOutDate());
			ps.setString(7, item.getDiseaseProject().getDiseaseNum());
			ps.setString(8, item.getHospital().getHospitalId());
			ps.setString(9, item.getHospital().getHospitalLevel());
			ps.setString(10, item.getDisNum().getDisNum());
			ps.setString(11, item.getDisNum().getDisName());
			ps.setString(12, item.getOutReason());
			ps.setString(13, item.getOutpatientNum());
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
	public void deletePersMedInfor(String id) {
		String sql = "delete from PERS_MED_INFOR where OUTPATIENT_NUM = ?";
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
