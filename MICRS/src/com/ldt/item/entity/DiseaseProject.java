package com.ldt.item.entity;

public class DiseaseProject {
	private String  diseaseNum;
	private String  disClass;
	@Override
	public String toString() {
		return "DiseaseProject [diseaseNum=" + diseaseNum + ", disClass="
				+ disClass + "]";
	}
	public DiseaseProject(String diseaseNum, String disClass) {
		super();
		this.diseaseNum = diseaseNum;
		this.disClass = disClass;
	}
	public DiseaseProject() {
		super();
		// TODO Auto-generated constructor stub
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


}
