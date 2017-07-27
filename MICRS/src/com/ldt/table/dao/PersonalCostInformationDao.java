package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.PersonalCostInformation;

public interface PersonalCostInformationDao {
	public List<PersonalCostInformation> selectPersonalCostInformation(PersonalCostInformation item);
	public void insertPersonalCostInformation(PersonalCostInformation item);
	public void updatePersonalCostInformation(PersonalCostInformation item);
	public void deletePersonalCostInformation(String id, String time);
}
