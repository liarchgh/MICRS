package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.PersMedInfor;

public interface PersMedInforDao {
	public List<PersMedInfor> selectPersMedInfor(PersMedInfor item);
	public void insertPersMedInfor(PersMedInfor item);
	public void updatePersMedInfor(PersMedInfor item);
	public void deletePersMedInfor(String id);
}
