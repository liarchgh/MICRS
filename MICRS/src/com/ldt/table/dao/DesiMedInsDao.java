package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.DesiMedIns;;

public interface DesiMedInsDao {
	public void insertDesiMedIns(DesiMedIns des);
	public List<DesiMedIns> selectDesiMedIns(DesiMedIns item);
	public void updateTable(DesiMedIns des);
	public void deleteTable(String desiid);

}
