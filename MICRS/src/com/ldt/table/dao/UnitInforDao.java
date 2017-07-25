package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.UnitInfor;

public interface UnitInforDao {
	public void insertUnitInfor(UnitInfor item);
	public List<UnitInfor> selectUnitInfor(UnitInfor item);
	public void updateUnitInfor(UnitInfor item);
	public void deleteUnitInfor(String id);
}
