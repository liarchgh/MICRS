package com.ldt.table.dao;

import java.util.List;
import com.ldt.item.entity.MedPers;

public interface MedPersDao {
	public void insertMedPers(MedPers item);
	public List<MedPers> selectMedPers(MedPers item);
	public void updateMedPers(MedPers item);
	public void deleteMedPers(String id);
}
