package com.ldt.item.entity;

public class DiseaseInformation {
	private String  disNum;
	private String disName;
	private String  diseaseNum;
	private String  disClass;
	private String  disReimbSign;
	@Override
	public String toString() {
		return "DiseaseInformation [disNum=" + disNum + ", disName=" + disName
				+ ", diseaseNum=" + diseaseNum + ", disClass=" + disClass
				+ ", disReimbSign=" + disReimbSign + "]";
	}
	public DiseaseInformation(String disNum, String disName, String diseaseNum,
			String disClass, String disReimbSign) {
		super();
		this.disNum = disNum;
		this.disName = disName;
		this.diseaseNum = diseaseNum;
		this.disClass = disClass;
		this.disReimbSign = disReimbSign;
	}
	public DiseaseInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getDiseaseNum() {
		return diseaseNum;
	}
	public void setDiseaseNum(String diseaseNum) {
		this.diseaseNum = diseaseNum;
	}
	public String getDisClass() {
		return disClass;
	}
	public void setDisClass(String disClass) {
		this.disClass = disClass;
	}
	public String getDisReimbSign() {
		return disReimbSign;
	}
	public void setDisReimbSign(String disReimbSign) {
		this.disReimbSign = disReimbSign;
	}


}
