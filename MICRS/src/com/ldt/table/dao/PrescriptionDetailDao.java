package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.PrescriptionDetail;

public interface PrescriptionDetailDao {
	public List<PrescriptionDetail> selectPrescriptionDetail(PrescriptionDetail item);
	public void insertPrescriptionDetail(PrescriptionDetail item);
	public void updatePrescriptionDetail(PrescriptionDetail item);
	public void deleteHospitalOrganization(String id);
}
