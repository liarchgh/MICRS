package com.ldt.item.entity;

public class StandPay {
	private String    id;
	private IndiSeg  indiSegId;
	private MedPers  medPresNum;
	private HospitalClass  hospitalId;
	private float  standPay;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IndiSeg getIndiSegId() {
		return indiSegId;
	}
	public void setIndiSegId(IndiSeg indiSegId) {
		this.indiSegId = indiSegId;
	}
	public MedPers getMedPresNum() {
		return medPresNum;
	}
	public void setMedPresNum(MedPers medPresNum) {
		this.medPresNum = medPresNum;
	}
	public HospitalClass getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(HospitalClass hospitalId) {
		this.hospitalId = hospitalId;
	}
	public float getStandPay() {
		return standPay;
	}
	public void setStandPay(float standPay) {
		this.standPay = standPay;
	}
	@Override
	public String toString() {
		return "StandPay [id=" + id + ", indiSegId=" + indiSegId
				+ ", medPresNum=" + medPresNum + ", hospitalId=" + hospitalId
				+ ", standPay=" + standPay + "]";
	}
	public StandPay(String id, IndiSeg indiSegId, MedPers medPresNum,
			HospitalClass hospitalId, float standPay) {
		super();
		this.id = id;
		this.indiSegId = indiSegId;
		this.medPresNum = medPresNum;
		this.hospitalId = hospitalId;
		this.standPay = standPay;
	}
	public StandPay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StandPay(String id) {
		super();
		this.id = id;
	}
	
	


}
