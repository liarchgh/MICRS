package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.DiseaseInformation;;

public interface DiseaseInformationDao {
	public void insertDiseaseInformation(DiseaseInformation di);
	public List<DiseaseInformation> selectDiseaseInformation(DiseaseInformation di);
	public void updateTable(DiseaseInformation di);
	public void deleteTable(String dno);

}
