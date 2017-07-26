package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.HospitalClass;

public interface HospitalClassDao {
	public void insertHospitalClass(HospitalClass item);
	public List<HospitalClass> selectHospitalClass(HospitalClass item);
	public void updateHospitalClass(HospitalClass item);
	public void deleteHospitalClass(String id);
}
