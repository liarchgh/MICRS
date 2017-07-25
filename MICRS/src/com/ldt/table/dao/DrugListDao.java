package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.Drug;

public interface DrugListDao {
	public void insertUsers(Drug drug);
	public List<Drug> selectUsers(Drug drug);
	public void updateTable(Drug drug);
	public void deleteTable(String medicineCode);
}
