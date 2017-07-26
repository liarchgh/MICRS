package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.IndiSeg;

public interface IndiSegDao {
	public void insertIndiSeg(IndiSeg item);
	public List<IndiSeg> selectIndiSeg(IndiSeg item);
	public void updateIndiSeg(IndiSeg item);
	public void deleteIndiSeg(String id);
}
