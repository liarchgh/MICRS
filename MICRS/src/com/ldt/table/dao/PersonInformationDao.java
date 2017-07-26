package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.PersonInformation;

public interface PersonInformationDao {
	public List<PersonInformation> selectPersonInformation(PersonInformation item);
	public void insertPersonInformation(PersonInformation item);
	public void updatePersonInformation(PersonInformation item);
	public void deleteHospitalOrganization(String id);
}
