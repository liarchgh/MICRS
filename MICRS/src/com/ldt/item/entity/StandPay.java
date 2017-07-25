package com.ldt.item.entity;

public class StandPay {
	private String    id;
	@Override
	public String toString() {
		return "StandPay [id=" + id + ", indiSegId=" + indiSegId + ", indiSeg="
				+ indiSeg + ", medPresNum=" + medPresNum + ", medPresClass="
				+ medPresClass + ", hospitalId=" + hospitalId
				+ ", hospitalLevel=" + hospitalLevel + ", standPay=" + standPay
				+ "]";
	}
	public StandPay(String id, String indiSegId, String indiSeg,
			String medPresNum, String medPresClass, String hospitalId,
			String hospitalLevel, float standPay) {
		super();
		this.id = id;
		this.indiSegId = indiSegId;
		this.indiSeg = indiSeg;
		this.medPresNum = medPresNum;
		this.medPresClass = medPresClass;
		this.hospitalId = hospitalId;
		this.hospitalLevel = hospitalLevel;
		this.standPay = standPay;
	}
	public StandPay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIndiSegId() {
		return indiSegId;
	}
	public void setIndiSegId(String indiSegId) {
		this.indiSegId = indiSegId;
	}
	public String getIndiSeg() {
		return indiSeg;
	}
	public void setIndiSeg(String indiSeg) {
		this.indiSeg = indiSeg;
	}
	public String getMedPresNum() {
		return medPresNum;
	}
	public void setMedPresNum(String medPresNum) {
		this.medPresNum = medPresNum;
	}
	public String getMedPresClass() {
		return medPresClass;
	}
	public void setMedPresClass(String medPresClass) {
		this.medPresClass = medPresClass;
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
	public float getStandPay() {
		return standPay;
	}
	public void setStandPay(float standPay) {
		this.standPay = standPay;
	}
	private String  indiSegId;
	private String  indiSeg;
	private String  medPresNum;
	private String  medPresClass;
	private String  hospitalId;
	private String  hospitalLevel;
	private float  standPay;


}
