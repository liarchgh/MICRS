package com.ldt.table.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldt.item.entity.PersonInformation;
import com.ldt.item.entity.PersonalCostInformation;
import com.ldt.table.dao.DBUtil;
import com.ldt.table.dao.PersonInformationDao;
import com.ldt.table.dao.PersonInformationDaoImpl;

/**
 * Servlet implementation class PersCostConnectQueryServlet
 */
@WebServlet("/perscost/connect/query")
public class PersCostConnectQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("/perscost/connect/query");
		String no = request.getParameter("qManId");
		String name = request.getParameter("qName");
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		Connection conn =  DBUtil.getPreparedStatement();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<List<String> > stl = new ArrayList<List<String> >();	
		List<String> userIds = new ArrayList<String>();	
		String sql = "select c.name, c.Certificate_ID, c.sex, c.birthday,c.med_pers_class,c.unit_ID,b.unit_name,d.times,a.out_date,a.dis_name,d.rem_accumulat,d.paied_per_accu,d.exp_accumulat, c.user_id " + 
				"from pers_med_infor a, unit_infor b,person_information c,personal_cost_information d " + 
				"where a.num=c.user_ID and a.num=d.user_ID and c.unit_ID=b.unit_ID" ;
		if(no != null && no != "") {
			sql = sql + " and c.userID = '"+no+"'";
		}
		if(name != null && name != "") {
			sql = sql + " and c.name = '"+name+"'";
		}
		sql = sql + " and d.time = '"+year+"'";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				List<String> stt = new ArrayList<String>();
				for (int i= 1;i<=14; i++) {
					stt.add(rs.getString(i));
				}
				stl.add(stt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		if(stl.size() != 0) {
			request.setAttribute("list", stl);
			System.out.println("stl are "+stl);
			request.getRequestDispatcher("/Manage/production/Reimbursement.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/Manage/production/Reimbursement.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
