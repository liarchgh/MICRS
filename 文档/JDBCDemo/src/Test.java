import java.util.ArrayList;
import java.util.List;

import com.neusoft.demo.dao.DeptDao;
import com.neusoft.demo.dao.DeptDaoImpl;
import com.neusoft.demo.dao.EmpDao;
import com.neusoft.demo.dao.EmpDaoImpl;
import com.neusoft.demo.entity.Dept;
import com.neusoft.demo.entity.Emp;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DeptDao dd = new DeptDaoImpl();
		dd.deleteDept(49);
		Dept dept = new Dept(51,"it2","¥Û¡¨");
		dd.updateDept(dept);
		List<Dept> depts = dd.selectAllDepts();
		for(Dept d : depts){
			System.out.println(d);
		}*/
		Dept dept = new Dept();
		dept.setDeptNo(50);
		Emp emp = new Emp(9999, "lisi", "it", 8888, "2017-07-12", 5000, 500, dept);
		
		
		EmpDao ed = new EmpDaoImpl();
		ed.insertEmp(emp);
		List<Emp> emps = ed.selectAllEmps();
		for(Emp e : emps){
			System.out.println(e);
		}
	}

}
