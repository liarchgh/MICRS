package com.ldt.item.entity;

public class MedPers {
	private String  medPersNum;
	private String  medPersClass;
	public String getMedPersNum() {
		return medPersNum;
	}
	public void setMedPersNum(String medPersNum) {
		this.medPersNum = medPersNum;
	}
	public String getMedPersClass() {
		return medPersClass;
	}
	public void setMedPersClass(String medPersClass) {
		this.medPersClass = medPersClass;
	}
	@Override
	public String toString() {
		return "MedPers [medPersNum=" + medPersNum + ", medPersClass=" + medPersClass + "]";
	}
	public MedPers(String medPersNum, String medPersClass) {
		super();
		this.medPersNum = medPersNum;
		this.medPersClass = medPersClass;
	}
	public MedPers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
