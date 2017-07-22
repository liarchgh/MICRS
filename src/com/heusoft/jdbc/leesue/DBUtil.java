package com.heusoft.jdbc.leesue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@10.25.243.15:1521:ORCL";
	private static String username = "scott";
	private static String password = "tiger";
	
	public static void main(String[] args){
		String sql = "select * from emp";
		PreparedStatement ps = DBUtil.getPreparedStatement(sql);
		ResultSet rs = null;
		if(ps != null){
			System.out.println("yes");
			try {
				rs = ps.executeQuery();
				while(rs.next()){
					System.out.println(rs.getString(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("no");
		}
	}

	public static PreparedStatement getPreparedStatement(String sql){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			ps = conn.prepareStatement(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ps;
	}
	
	public static void close(ResultSet rs, Statement ps, Connection conn){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps != null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
