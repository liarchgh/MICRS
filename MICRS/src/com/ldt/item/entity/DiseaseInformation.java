package com.ldt.item.entity;

public class DiseaseInformation {
	private String  disNum;
	private String disName;
	private DiseaseProject  diseaseNum;
	private String  disReimbSign;
	public String getDisNum() {
		return disNum;
	}
	public void setDisNum(String disNum) {
		this.disNum = disNum;
	}
	public String getDisName() {
		return disName;
	}
	public void setDisName(String disName) {
		this.disName = disName;
	}
	public DiseaseProject getDiseaseNum() {
		return diseaseNum;
	}
	public void setDiseaseNum(DiseaseProject diseaseNum) {
		this.diseaseNum = diseaseNum;
	}
	public String getDisReimbSign() {
		return disReimbSign;
	}
	public void setDisReimbSign(String disReimbSign) {
		this.disReimbSign = disReimbSign;
	}
	@Override
	public String toString() {
		return "DiseaseInformation [disNum=" + disNum + ", disName=" + disName
				+ ", diseaseNum=" + diseaseNum + ", disReimbSign="
				+ disReimbSign + "]";
	}
	public DiseaseInformation(String disNum, String disName,
			DiseaseProject diseaseNum, String disReimbSign) {
		super();
		this.disNum = disNum;
		this.disName = disName;
		this.diseaseNum = diseaseNum;
		this.disReimbSign = disReimbSign;
	}
	public DiseaseInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DiseaseInformation(String disNum, String disName) {
		super();
		this.disNum = disNum;
		this.disName = disName;
	}
	
	
	

}
