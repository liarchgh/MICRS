package com.ldt.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ldt.item.entity.User;

public class UsersDaoImpl implements UsersDao{
//	public static void main(String[] args){
//		UsersDaoImpl uu = new UsersDaoImpl();
//		uu.insertUsers(new User(0, "adminnnnnn", "rootnnnnn"));
//		uu.selectUsers(new User(0, null, null));
//	}

	@Override
	public void insertUsers(User user) {
		String sql = "insert into users (id, account,password) values(user_id_seq.nextval,?,?)";
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getAccount());
			ps.setString(2, user.getPassword());
			System.out.println(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.close(null, ps, conn);
		}
	}

	@Override
	public List<User> selectUsers(User user) {
		// TODO Auto-generated method stub
		List<User> ans = new ArrayList<User>();
		String sql = "select * from users where 1=1 ";
		if(user.getAccount() != null){
			sql = sql + " and account = '" + user.getAccount() + "' ";
		}
		if(user.getID() != 0){
			sql = sql + " and ID = '" + user.getID() + "'";
		}
		if(user.getPassword() != null){
			sql = sql + " and password = '" + user.getPassword() + "'";
		}

		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ans.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.close(rs, ps, conn);
		}
		System.out.println(ans.toString());
		return ans;
	}

}
