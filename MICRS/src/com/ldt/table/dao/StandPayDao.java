package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.StandPay;

public interface StandPayDao{
	public void insertStandPay(StandPay item);
	public List<StandPay> selectStandPay(StandPay item);
	public void updateStandPay(StandPay item);
	public void deleteStandPay(String medicineCode);
}
