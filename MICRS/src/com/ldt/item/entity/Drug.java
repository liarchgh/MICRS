package com.ldt.item.entity;

public class Drug {
	private String medicineCode;
	private String medicineName;
	private String chargeType;
	private String prescriptionSign;
	private String chargeLevel;
	private String drugDosageUnit;
	private float  priceCeiling;
	private String hospitalPreparationMark;
	private String approvalMarks;
	private HospitalClass hospitalID;
	public String getMedicineCode() {
		return medicineCode;
	}
	public void setMedicineCode(String medicineCode) {
		this.medicineCode = medicineCode;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getPrescriptionSign() {
		return prescriptionSign;
	}
	public void setPrescriptionSign(String prescriptionSign) {
		this.prescriptionSign = prescriptionSign;
	}
	public String getChargeLevel() {
		return chargeLevel;
	}
	public void setChargeLevel(String chargeLevel) {
		this.chargeLevel = chargeLevel;
	}
	public String getDrugDosageUnit() {
		return drugDosageUnit;
	}
	public void setDrugDosageUnit(String drugDosageUnit) {
		this.drugDosageUnit = drugDosageUnit;
	}
	public float getPriceCeiling() {
		return priceCeiling;
	}
	public void setPriceCeiling(float priceCeiling) {
		this.priceCeiling = priceCeiling;
	}
	public String getHospitalPreparationMark() {
		return hospitalPreparationMark;
	}
	public void setHospitalPreparationMark(String hospitalPreparationMark) {
		this.hospitalPreparationMark = hospitalPreparationMark;
	}
	public String getApprovalMarks() {
		return approvalMarks;
	}
	public void setApprovalMarks(String approvalMarks) {
		this.approvalMarks = approvalMarks;
	}
	public HospitalClass getHospitalID() {
		return hospitalID;
	}
	public void setHospitalID(HospitalClass hospitalID) {
		this.hospitalID = hospitalID;
	}
	@Override
	public String toString() {
		return "Drug [medicineCode=" + medicineCode + ", medicineName="
				+ medicineName + ", chargeType=" + chargeType
				+ ", prescriptionSign=" + prescriptionSign + ", chargeLevel="
				+ chargeLevel + ", drugDosageUnit=" + drugDosageUnit
				+ ", priceCeiling=" + priceCeiling
				+ ", hospitalPreparationMark=" + hospitalPreparationMark
				+ ", approvalMarks=" + approvalMarks + ", hospitalID="
				+ hospitalID + "]";
	}
	public Drug(String medicineCode, String medicineName, String chargeType,
			String prescriptionSign, String chargeLevel, String drugDosageUnit,
			float priceCeiling, String hospitalPreparationMark,
			String approvalMarks, HospitalClass hospitalID) {
		super();
		this.medicineCode = medicineCode;
		this.medicineName = medicineName;
		this.chargeType = chargeType;
		this.prescriptionSign = prescriptionSign;
		this.chargeLevel = chargeLevel;
		this.drugDosageUnit = drugDosageUnit;
		this.priceCeiling = priceCeiling;
		this.hospitalPreparationMark = hospitalPreparationMark;
		this.approvalMarks = approvalMarks;
		this.hospitalID = hospitalID;
	}
	public Drug() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Drug(String medicineCode, String medicineName) {
		super();
		this.medicineCode = medicineCode;
		this.medicineName = medicineName;
	}
	
	
	
}
