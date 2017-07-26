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
	private MedPers    medPersNum;
	private String    securityNum;
	private DesiMedIns    desiMedIns;
	private UnitInfor     unit;
	@Override
	public String toString() {
		return "PersonInformation [userId=" + userId + ", certificateType="
				+ certificateType + ", certificateID=" + certificateID
				+ ", name=" + name + ", sex=" + sex + ", nation=" + nation
				+ ", birthday=" + birthday + ", workDate=" + workDate
				+ ", retire=" + retire + ", houseType=" + houseType
				+ ", houseLoc=" + houseLoc + ", medPersNum=" + medPersNum
				+ ", securityNum=" + securityNum + ", desiMedIns=" + desiMedIns
				+ ", unit=" + unit + "]";
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
	public MedPers getMedPersNum() {
		return medPersNum;
	}
	public void setMedPersNum(MedPers medPersNum) {
		this.medPersNum = medPersNum;
	}
	public String getSecurityNum() {
		return securityNum;
	}
	public void setSecurityNum(String securityNum) {
		this.securityNum = securityNum;
	}
	public DesiMedIns getDesiMedIns() {
		return desiMedIns;
	}
	public void setDesiMedIns(DesiMedIns desiMedIns) {
		this.desiMedIns = desiMedIns;
	}
	public UnitInfor getUnit() {
		return unit;
	}
	public void setUnit(UnitInfor unit) {
		this.unit = unit;
	}
	public PersonInformation(String userId, String certificateType,
			String certificateID, String name, String sex, String nation,
			String birthday, String workDate, String retire, String houseType,
			String houseLoc, MedPers medPersNum, String securityNum,
			DesiMedIns desiMedIns, UnitInfor unit) {
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
		this.securityNum = securityNum;
		this.desiMedIns = desiMedIns;
		this.unit = unit;
	}
	public PersonInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonInformation(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	
	


}
