package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.Drug;
import com.ldt.item.entity.PrescriptionDetail;

public class PrescriptionDetailDaoImpl implements PrescriptionDetailDao {
	public static void main(String[] args) {
		PrescriptionDetailDaoImpl tt = new PrescriptionDetailDaoImpl();
System.out.println(tt.selectPrescriptionDetail((new PrescriptionDetail())).toString());
tt.insertPrescriptionDetail(new PrescriptionDetail("4665935", new Drug("2", "xxxx"), 11.11f, 22, 44.22f));
//tt.updatePrescriptionDetail(new PrescriptionDetail("0000000", new Drug("2", "xxxx"), 99.99f, 55, 11.11f));
//tt.deleteHospitalOrganization("0000000");
System.out.println(tt.selectPrescriptionDetail((new PrescriptionDetail())).toString());
}

	@Override
	public List<PrescriptionDetail> selectPrescriptionDetail(
			PrescriptionDetail item) {
		// TODO Auto-generated method stub
		List<PrescriptionDetail> ans = new ArrayList<PrescriptionDetail>();
		String sql = "select * from PRESCRIPTION_DETAIL where 1=1 ";
		if(item.getOutpatientNum() != null){
			sql = sql + " and OUTPATIENT_NUM = '" + item.getOutpatientNum() + "' ";
		}
		if(item.getMedicineCode() != null && item.getMedicineCode().getMedicineCode() != null){
			sql = sql + " and MEDICINE_CODE = '" + item.getMedicineCode().getMedicineCode() + "' ";
		}
		if(item.getPrice() > 0){
			sql = sql + " and PRICE = '" + item.getPrice() + "' ";
		}
		if(item.getTotal() > 0){
			sql = sql + " and TOTAL = '" + item.getTotal() + "' ";
		}
		if(item.getAccount() > 0){
			sql = sql + " and ACCOUNT = '" + item.getAccount() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new PrescriptionDetail(rs.getString(1), new Drug(rs.getString(2), null),
						rs.getFloat(3), rs.getInt(4), rs.getFloat(5)));
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
	public void insertPrescriptionDetail(PrescriptionDetail item) {
		String sql = "insert into PRESCRIPTION_DETAIL (OUTPATIENT_NUM, MEDICINE_CODE, PRICE, TOTAL, ACCOUNT) values(?,?,?,?,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getMedicineCode() != null
					&& item.getOutpatientNum() != null){
			ps = conn.prepareStatement(sql);
			ps.setString(1, item.getOutpatientNum());
			ps.setString(2, item.getMedicineCode().getMedicineCode());
			ps.setFloat(3, item.getPrice());
			ps.setInt(4, item.getTotal());
			ps.setFloat(5, item.getAccount());
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
	public void updatePrescriptionDetail(PrescriptionDetail item) {
		// TODO Auto-generated method stub
		String sql = "update PRESCRIPTION_DETAIL set MEDICINE_CODE=?, PRICE=?, TOTAL=?, ACCOUNT=? where OUTPATIENT_NUM=?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(item.getMedicineCode() != null
					&& item.getMedicineCode().getMedicineCode() != null
					&& item.getOutpatientNum() != null){
			ps.setString(1, item.getMedicineCode().getMedicineCode());
			ps.setFloat(2, item.getPrice());
			ps.setInt(3, item.getTotal());
			ps.setFloat(4, item.getAccount());
			ps.setString(5, item.getOutpatientNum());
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
	public void deleteHospitalOrganization(String id) {
		String sql = "delete from PRESCRIPTION_DETAIL where OUTPATIENT_NUM = ?";
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
