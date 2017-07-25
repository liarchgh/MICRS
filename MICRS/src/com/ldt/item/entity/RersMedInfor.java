package com.ldt.item.entity;

public class RersMedInfor {
	private String  outpatientNum;
	private String   num;
	private String  desiMedInsId;
	private String   indiSegId;
	private String   indiSeg;
	private String   inDate;
	private String   outDate;
	private String   distypeNum;
	private String   hospitalId;
	private String   hospitalLevel;
	private String   disNum;
	private String   disName;
	private String   outReason;
	@Override
	public String toString() {
		return "RersMedInfor [outpatientNum=" + outpatientNum + ", num=" + num
				+ ", desiMedInsId=" + desiMedInsId + ", indiSegId=" + indiSegId
				+ ", indiSeg=" + indiSeg + ", inDate=" + inDate + ", outDate="
				+ outDate + ", distypeNum=" + distypeNum + ", hospitalId="
				+ hospitalId + ", hospitalLevel=" + hospitalLevel + ", disNum="
				+ disNum + ", disName=" + disName + ", outReason=" + outReason
				+ "]";
	}
	public RersMedInfor(String outpatientNum, String num, String desiMedInsId,
			String indiSegId, String indiSeg, String inDate, String outDate,
			String distypeNum, String hospitalId, String hospitalLevel,
			String disNum, String disName, String outReason) {
		super();
		this.outpatientNum = outpatientNum;
		this.num = num;
		this.desiMedInsId = desiMedInsId;
		this.indiSegId = indiSegId;
		this.indiSeg = indiSeg;
		this.inDate = inDate;
		this.outDate = outDate;
		this.distypeNum = distypeNum;
		this.hospitalId = hospitalId;
		this.hospitalLevel = hospitalLevel;
		this.disNum = disNum;
		this.disName = disName;
		this.outReason = outReason;
	}
	public RersMedInfor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOutpatientNum() {
		return outpatientNum;
	}
	public void setOutpatientNum(String outpatientNum) {
		this.outpatientNum = outpatientNum;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDesiMedInsId() {
		return desiMedInsId;
	}
	public void setDesiMedInsId(String desiMedInsId) {
		this.desiMedInsId = desiMedInsId;
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
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	public String getOutDate() {
		return outDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}
	public String getDistypeNum() {
		return distypeNum;
	}
	public void setDistypeNum(String distypeNum) {
		this.distypeNum = distypeNum;
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
	public String getOutReason() {
		return outReason;
	}
	public void setOutReason(String outReason) {
		this.outReason = outReason;
	}


}
