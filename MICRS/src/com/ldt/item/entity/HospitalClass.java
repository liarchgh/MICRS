package com.ldt.item.entity;

public class HospitalClass {
	private String    hospitalId;
	private String    hospitalLevel;
	@Override
	public String toString() {
		return "HospitalClass [hospitalId=" + hospitalId + ", hospitalLevel="
				+ hospitalLevel + "]";
	}
	public HospitalClass(String hospitalId, String hospitalLevel) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalLevel = hospitalLevel;
	}
	public HospitalClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalLevel() {
		return hospitalLevel;
	}
	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}
 

}
