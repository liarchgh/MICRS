package com.ldt.item.entity;

public class PersonInformation {
	private String   userId;
	private String    certificateType; 
	private String    certificateID;
	private String    name;
	private String    sex;
	private String    nation;
	private String    birthday;
	private String    workDate;
	private String    retire;
	private String    houseType;
	private String    houseLoc;
	private String    medPersNum;
	private String    medPersClass;
	private String    securityNum;
	private String    desiMedInsId;
	private String     unitId;
	@Override
	public String toString() {
		return "PersonInformation [userId=" + userId + ", certificateType="
				+ certificateType + ", certificateID=" + certificateID
				+ ", name=" + name + ", sex=" + sex + ", nation=" + nation
				+ ", birthday=" + birthday + ", workDate=" + workDate
				+ ", retire=" + retire + ", houseType=" + houseType
				+ ", houseLoc=" + houseLoc + ", medPersNum=" + medPersNum
				+ ", medPersClass=" + medPersClass + ", securityNum="
				+ securityNum + ", desiMedInsId=" + desiMedInsId + ", unitId="
				+ unitId + "]";
	}
	public PersonInformation(String userId, String certificateType,
			String certificateID, String name, String sex, String nation,
			String birthday, String workDate, String retire, String houseType,
			String houseLoc, String medPersNum, String medPersClass,
			String securityNum, String desiMedInsId, String unitId) {
		super();
		this.userId = userId;
		this.certificateType = certificateType;
		this.certificateID = certificateID;
		this.name = name;
		this.sex = sex;
		this.nation = nation;
		this.birthday = birthday;
		this.workDate = workDate;
		this.retire = retire;
		this.houseType = houseType;
		this.houseLoc = houseLoc;
		this.medPersNum = medPersNum;
		this.medPersClass = medPersClass;
		this.securityNum = securityNum;
		this.desiMedInsId = desiMedInsId;
		this.unitId = unitId;
	}
	public PersonInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	public String getCertificateID() {
		return certificateID;
	}
	public void setCertificateID(String certificateID) {
		this.certificateID = certificateID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getRetire() {
		return retire;
	}
	public void setRetire(String retire) {
		this.retire = retire;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public String getHouseLoc() {
		return houseLoc;
	}
	public void setHouseLoc(String houseLoc) {
		this.houseLoc = houseLoc;
	}
	public String getMedPersNum() {
		return medPersNum;
	}
	public void setMedPersNum(String medPersNum) {
		this.medPersNum = medPersNum;
	}
	public String getMedPersClass() {
		return medPersClass;
	}
	public void setMedPersClass(String medPersClass) {
		this.medPersClass = medPersClass;
	}
	public String getSecurityNum() {
		return securityNum;
	}
	public void setSecurityNum(String securityNum) {
		this.securityNum = securityNum;
	}
	public String getDesiMedInsId() {
		return desiMedInsId;
	}
	public void setDesiMedInsId(String desiMedInsId) {
		this.desiMedInsId = desiMedInsId;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}


}
