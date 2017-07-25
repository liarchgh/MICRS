package com.ldt.item.entity;

public class HospitalOrganization {
	private String   hoId;
	private String   medInsClass;
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
	public HospitalOrganization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HospitalOrganization(String hoId, String medInsClass) {
		super();
		this.hoId = hoId;
		this.medInsClass = medInsClass;
	}
	@Override
	public String toString() {
		return "HospitalOrganization [hoId=" + hoId + ", medInsClass="
				+ medInsClass + "]";
	}


}
