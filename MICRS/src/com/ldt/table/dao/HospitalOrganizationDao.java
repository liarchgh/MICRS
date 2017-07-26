package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.HospitalOrganization;

public interface HospitalOrganizationDao {
	public List<HospitalOrganization> selectHospitalOrganization(HospitalOrganization item);
	public void insertIndiSeg(HospitalOrganization item);
	public void updateHospitalOrganization(HospitalOrganization item);
	public void deleteHospitalOrganization(String id);
}
