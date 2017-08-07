package com.neusoft.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.demo.entity.Dept;
import com.neusoft.demo.entity.Emp;

public class EmpDaoImpl implements EmpDao{

	@Override
	public void insertEmp(Emp emp) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		//8888,'zhangsan','CLERK',7902,'01-1ÔÂ-17',2000,500,null
		String sql = "insert into emp "
				+ "values(?,?,?,?,to_date(?,'yyyy-MM-dd'),?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, emp.getEmpNo());
			ps.setString(2, emp.getEmpName());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getManagerNo());
			ps.setString(5, emp.getHireDate());
			ps.setFloat(6, emp.getSalary());
			ps.setFloat(7, emp.getComm());
			ps.setInt(8, emp.getDept().getDeptNo());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ps, conn);
		}
		
	}

	@Override
	public List<Emp> selectAllEmps() {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Emp> emps = new ArrayList<Emp>();
		String sql = "select e.empno,e.ename,e.job,e.hiredate,e.mgr,e.sal,e.comm,e.deptno,d.dname,d.loc from emp e  left join dept d on(e.deptno = d.deptno)";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String hiredate = rs.getString(4);
				int mgr = rs.getInt(5);
				float sal = rs.getFloat(6);
				float comm = rs.getFloat(7);
				int deptno = rs.getInt(8);
				String deptname = rs.getString(9);
				String loc = rs.getString(10);
				
				Dept d = new Dept(deptno,deptname,loc);
				Emp emp = new Emp(empno,ename,job,mgr,hiredate,sal,comm,d);
				
				emps.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(rs, ps, conn);
		}
		return emps;
	}

}
