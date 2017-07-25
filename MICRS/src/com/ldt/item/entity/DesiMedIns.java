package com.ldt.item.entity;

public class DesiMedIns {
	private String  desiMedInsId;
	private String   serviceName;
	private String    hospitalId;
	private String    hospitalLevel;
	private String    hoId;
	private String   medInsClass;
	@Override
	public String toString() {
		return "DesiMedIns [desiMedInsId=" + desiMedInsId + ", serviceName="
				+ serviceName + ", hospitalId=" + hospitalId
				+ ", hospitalLevel=" + hospitalLevel + ", hoId=" + hoId
				+ ", medInsClass=" + medInsClass + ", postalCode=" + postalCode
				+ ", legRepName=" + legRepName + ", legRepPhone=" + legRepPhone
				+ ", connName=" + connName + ", connPhone=" + connPhone
				+ ", connCell=" + connCell + ", addr=" + addr + "]";
	}
	public DesiMedIns(String desiMedInsId, String serviceName,
			String hospitalId, String hospitalLevel, String hoId,
			String medInsClass, String postalCode, String legRepName,
			String legRepPhone, String connName, String connPhone,
			String connCell, String addr) {
		super();
		this.desiMedInsId = desiMedInsId;
		this.serviceName = serviceName;
		this.hospitalId = hospitalId;
		this.hospitalLevel = hospitalLevel;
		this.hoId = hoId;
		this.medInsClass = medInsClass;
		this.postalCode = postalCode;
		this.legRepName = legRepName;
		this.legRepPhone = legRepPhone;
		this.connName = connName;
		this.connPhone = connPhone;
		this.connCell = connCell;
		this.addr = addr;
	}
	public DesiMedIns() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDesiMedInsId() {
		return desiMedInsId;
	}
	public void setDesiMedInsId(String desiMedInsId) {
		this.desiMedInsId = desiMedInsId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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
	public String getHoId() {
		return hoId;
	}
	public void setHoId(String hoId) {
		this.hoId = hoId;
	}
	public String getMedInsClass() {
		return medInsClass;
	}
	public void setMedInsClass(String medInsClass) {
		this.medInsClass = medInsClass;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getLegRepName() {
		return legRepName;
	}
	public void setLegRepName(String legRepName) {
		this.legRepName = legRepName;
	}
	public String getLegRepPhone() {
		return legRepPhone;
	}
	public void setLegRepPhone(String legRepPhone) {
		this.legRepPhone = legRepPhone;
	}
	public String getConnName() {
		return connName;
	}
	public void setConnName(String connName) {
		this.connName = connName;
	}
	public String getConnPhone() {
		return connPhone;
	}
	public void setConnPhone(String connPhone) {
		this.connPhone = connPhone;
	}
	public String getConnCell() {
		return connCell;
	}
	public void setConnCell(String connCell) {
		this.connCell = connCell;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	private String   postalCode;
	private String   legRepName;
	private String   legRepPhone;
	private String   connName;
	private String   connPhone;
	private String   connCell;
	private String   addr;


}
