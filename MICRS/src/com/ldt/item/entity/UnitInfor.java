package com.ldt.item.entity;

public class UnitInfor {
	private String  unitId;
	private String  unitName;
	private String  unitType;
	private String  unitAddr;
	private String  postcode;
	private String  phone;
	@Override
	public String toString() {
		return "UnitInfor [unitId=" + unitId + ", unitName=" + unitName
				+ ", unitType=" + unitType + ", unitAddr=" + unitAddr
				+ ", postcode=" + postcode + ", phone=" + phone + "]";
	}
	public UnitInfor(String unitId, String unitName, String unitType,
			String unitAddr, String postcode, String phone) {
		super();
		this.unitId = unitId;
		this.unitName = unitName;
		this.unitType = unitType;
		this.unitAddr = unitAddr;
		this.postcode = postcode;
		this.phone = phone;
	}
	public UnitInfor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public String getUnitAddr() {
		return unitAddr;
	}
	public void setUnitAddr(String unitAddr) {
		this.unitAddr = unitAddr;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


}
