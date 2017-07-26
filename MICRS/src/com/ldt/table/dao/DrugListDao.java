package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.Drug;

public interface DrugListDao {
	public void insertDrug(Drug drug);
	public List<Drug> selectDrug(Drug item);
	public void updateDrug(Drug drug);
	public void deleteDrug(String medicineCode);
}
