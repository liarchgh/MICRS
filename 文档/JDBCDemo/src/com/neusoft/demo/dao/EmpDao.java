package com.neusoft.demo.dao;

import java.util.List;

import com.neusoft.demo.entity.Emp;

public interface EmpDao {

	public void  insertEmp(Emp emp);
	public List<Emp> selectAllEmps();
}
