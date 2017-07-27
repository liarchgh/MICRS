package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.DiseaseProject;;

public interface DiseaseProjectDao {
	public void insertDiseaseProject(DiseaseProject dp);
	public List<DiseaseProject> selectDiseaseProject(DiseaseProject dp);
	public void updateTable(DiseaseProject dp);
	public void deleteTable(String dno);

}
