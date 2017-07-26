package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.PersMedInfor;

public interface PersMedInforDao {
	public List<PersMedInfor> selectRersMedInfor(PersMedInfor item);
	public void insertRersMedInfor(PersMedInfor item);
	public void updateRersMedInfor(PersMedInfor item);
	public void deleteRersMedInfor(String id);
}
