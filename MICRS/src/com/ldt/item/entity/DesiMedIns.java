package com.ldt.item.entity;

public class DesiMedIns {
	private String  desiMedInsId;
	private String   serviceName;
	private HospitalClass hospitalId;
	private HospitalOrganization hoId;
	private String   postalCode;
	private String   legRepName;
	private String   legRepPhone;
	private String   connName;
	private String   connPhone;
	private String   connCell;
	private String   addr;
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
	public HospitalClass getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(HospitalClass hospitalId) {
		this.hospitalId = hospitalId;
	}
	public HospitalOrganization getHoId() {
		return hoId;
	}
	public void setHoId(HospitalOrganization hoId) {
		this.hoId = hoId;
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
	@Override
	public String toString() {
		return "DesiMedIns [desiMedInsId=" + desiMedInsId + ", serviceName="
				+ serviceName + ", hospitalId=" + hospitalId + ", hoId=" + hoId
				+ ", postalCode=" + postalCode + ", legRepName=" + legRepName
				+ ", legRepPhone=" + legRepPhone + ", connName=" + connName
				+ ", connPhone=" + connPhone + ", connCell=" + connCell
				+ ", addr=" + addr + "]";
	}
	public DesiMedIns(String desiMedInsId, String serviceName,
			HospitalClass hospitalId, HospitalOrganization hoId,
			String postalCode, String legRepName, String legRepPhone,
			String connName, String connPhone, String connCell, String addr) {
		super();
		this.desiMedInsId = desiMedInsId;
		this.serviceName = serviceName;
		this.hospitalId = hospitalId;
		this.hoId = hoId;
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
	public DesiMedIns(String desiMedInsId, String serviceName) {
		super();
		this.desiMedInsId = desiMedInsId;
		this.serviceName = serviceName;
	}
	

	
}
