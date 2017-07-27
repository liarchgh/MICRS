package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.IndiSegRatio;;

public interface IndiSegRatioDao {
	public void insertIndiSegRatio(IndiSegRatio isr);
	public List<IndiSegRatio> selectIndiSegRatio(IndiSegRatio isr);
	public void updateTable(IndiSegRatio dp);
	public void deleteTable(String id);

}
