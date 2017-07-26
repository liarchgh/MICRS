package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.CapLine;

public interface CapLineDao {
	public void insertCapLine(CapLine capline);
	public List<CapLine> selectCapLine(String id);
	public void updateTable(CapLine capline);
	public void deleteTable(String id);

}
