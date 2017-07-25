package com.ldt.item.entity;

public class IndiSegRatio {
	private String   id;
	private String  indiSegId;
	private String  indiSeg;
	private String  medPersNum;
	private String  medpersClass;
	private String  hospitalId;
	private String  hospitalLevel;
	private float  topMon;
	private float  bootomMon;
	private float  ratio;
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
	public String getMedPersNum() {
		return medPersNum;
	}
	public void setMedPersNum(String medPersNum) {
		this.medPersNum = medPersNum;
	}
	public String getMedpersClass() {
		return medpersClass;
	}
	public void setMedpersClass(String medpersClass) {
		this.medpersClass = medpersClass;
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
	public float getTopMon() {
		return topMon;
	}
	public void setTopMon(float topMon) {
		this.topMon = topMon;
	}
	public float getBootomMon() {
		return bootomMon;
	}
	public void setBootomMon(float bootomMon) {
		this.bootomMon = bootomMon;
	}
	public float getRatio() {
		return ratio;
	}
	public void setRatio(float ratio) {
		this.ratio = ratio;
	}
	public IndiSegRatio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IndiSegRatio(String id, String indiSegId, String indiSeg,
			String medPersNum, String medpersClass, String hospitalId,
			String hospitalLevel, float topMon, float bootomMon, float ratio) {
		super();
		this.id = id;
		this.indiSegId = indiSegId;
		this.indiSeg = indiSeg;
		this.medPersNum = medPersNum;
		this.medpersClass = medpersClass;
		this.hospitalId = hospitalId;
		this.hospitalLevel = hospitalLevel;
		this.topMon = topMon;
		this.bootomMon = bootomMon;
		this.ratio = ratio;
	}
	@Override
	public String toString() {
		return "IndiSegRatio [id=" + id + ", indiSegId=" + indiSegId
				+ ", indiSeg=" + indiSeg + ", medPersNum=" + medPersNum
				+ ", medpersClass=" + medpersClass + ", hospitalId="
				+ hospitalId + ", hospitalLevel=" + hospitalLevel + ", topMon="
				+ topMon + ", bootomMon=" + bootomMon + ", ratio=" + ratio
				+ "]";
	}
	
}
