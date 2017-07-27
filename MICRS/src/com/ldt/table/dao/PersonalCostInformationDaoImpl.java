package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.HospitalOrganization;
import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.PersonalCostInformation;

public class PersonalCostInformationDaoImpl implements
PersonalCostInformationDao {
//	public static void main(String[] args) {
//		PersonalCostInformationDaoImpl tt = new PersonalCostInformationDaoImpl();
//System.out.println(tt.selectPersonalCostInformation((new PersonalCostInformation())));
////tt.insertPersonalCostInformation(new PersonalCostInformation(new PersonInformation("3",null), "2011",
////		5, 22.22f, 2.2f,
////		22.2f));
////tt.updatePersonalCostInformation(new PersonalCostInformation(new PersonInformation("3",null), "2011", 9, 11.11f,111.1f, 1111f));
//tt.deletePersonalCostInformation("3", "2011");
//System.out.println(tt.selectPersonalCostInformation((new PersonalCostInformation())).toString());
//}

	@Override
	public List<PersonalCostInformation> selectPersonalCostInformation(
			PersonalCostInformation item) {
		// TODO Auto-generated method stub
		List<PersonalCostInformation> ans = new ArrayList<PersonalCostInformation>();
		String sql = "select * from PERSONAL_COST_INFORMATION where 1=1 ";
		if(item.getUser() != null && item.getUser().getUserId() != null){
			sql = sql + " and USER_ID = '" + item.getUser().getUserId() + "' ";
		}
		if(item.getTime() != null){
			sql = sql + " and TIME = '" + item.getTime() + "' ";
		}
		if(item.getTimes() > 0){
			sql = sql + " and TIMES = '" + item.getTimes() + "' ";
		}
		if(item.getExpAccumulat() > 0){
			sql = sql + " and  EXP_ACCUMULAT = '" + item.getExpAccumulat() + "' ";
		}
		if(item.getRemAccumulat() > 0){
			sql = sql + " and  REM_ACCUMULAT = '" + item.getRemAccumulat() + "' ";
		}
		if(item.getPaiedPerAccu() > 0){
			sql = sql + " and PAIED_PER_ACCU = '" + item.getPaiedPerAccu() + "' ";
		}
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new PersonalCostInformation(new PersonInformation(rs.getString(1), null), rs.getString(2),
						rs.getInt(3), rs.getFloat(4), rs.getFloat(5),
						rs.getFloat(6)));
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
	public void insertPersonalCostInformation(PersonalCostInformation item) {
		String sql = "insert into PERSONAL_COST_INFORMATION (USER_ID, TIME, TIMES, EXP_ACCUMULAT, REM_ACCUMULAT, PAIED_PER_ACCU) values(?,?,?,?,?,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			if(item.getUser() != null
					&& item.getTime() != null
					&& item.getUser().getUserId() != null){
			ps = conn.prepareStatement(sql);
			ps.setString(1, item.getUser().getUserId());
			ps.setString(2, item.getTime());
			ps.setInt(3, item.getTimes());
			ps.setFloat(4, item.getExpAccumulat());
			ps.setFloat(5, item.getRemAccumulat());
			ps.setFloat(6, item.getPaiedPerAccu());
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
	public void updatePersonalCostInformation(PersonalCostInformation item) {
		// TODO Auto-generated method stub
		String sql = "update PERSONAL_COST_INFORMATION set TIMES=?, EXP_ACCUMULAT=?, REM_ACCUMULAT=?, PAIED_PER_ACCU=? where USER_ID = ? and time = ?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(item.getTime() != null
					&& item.getUser() != null
					&& item.getUser().getUserId() != null){
			ps.setInt(1, item.getTimes());
			ps.setFloat(2, item.getExpAccumulat());
			ps.setFloat(3, item.getRemAccumulat());
			ps.setFloat(4, item.getPaiedPerAccu());
			ps.setString(5, item.getUser().getUserId());
			ps.setString(6, item.getTime());
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
	public void deletePersonalCostInformation(String id, String time) {
		String sql = "delete from PERSONAL_COST_INFORMATION where USER_ID = ? and time = ?";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(id != null && time != null){
				ps.setString(1, id);
				ps.setString(2, time);
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
