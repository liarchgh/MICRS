package com.ldt.item.entity;

public class RersMedInfor {
	private String  outpatientNum;
	private PersonInformation   num;
	private DesiMedIns  desiMedIns;
	private IndiSeg   indiSegId;
	private String   inDate;
	private String   outDate;
	private String   distypeNum;
	private HospitalClass   hospital;
	private DiseaseInformation   disNum;
	private String   outReason;
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
	public PersonInformation getNum() {
		return num;
	}
	public void setNum(PersonInformation num) {
		this.num = num;
	}
	public DesiMedIns getDesiMedIns() {
		return desiMedIns;
	}
	public void setDesiMedIns(DesiMedIns desiMedIns) {
		this.desiMedIns = desiMedIns;
	}
	public IndiSeg getIndiSegId() {
		return indiSegId;
	}
	public void setIndiSegId(IndiSeg indiSegId) {
		this.indiSegId = indiSegId;
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
	public HospitalClass getHospital() {
		return hospital;
	}
	public void setHospital(HospitalClass hospital) {
		this.hospital = hospital;
	}
	public DiseaseInformation getDisNum() {
		return disNum;
	}
	public void setDisNum(DiseaseInformation disNum) {
		this.disNum = disNum;
	}
	public String getOutReason() {
		return outReason;
	}
	public void setOutReason(String outReason) {
		this.outReason = outReason;
	}
	public RersMedInfor(String outpatientNum, PersonInformation num,
			DesiMedIns desiMedIns, IndiSeg indiSegId, String inDate,
			String outDate, String distypeNum, HospitalClass hospital,
			DiseaseInformation disNum, String outReason) {
		super();
		this.outpatientNum = outpatientNum;
		this.num = num;
		this.desiMedIns = desiMedIns;
		this.indiSegId = indiSegId;
		this.inDate = inDate;
		this.outDate = outDate;
		this.distypeNum = distypeNum;
		this.hospital = hospital;
		this.disNum = disNum;
		this.outReason = outReason;
	}
	@Override
	public String toString() {
		return "RersMedInfor [outpatientNum=" + outpatientNum + ", num=" + num
				+ ", desiMedIns=" + desiMedIns + ", indiSegId=" + indiSegId
				+ ", inDate=" + inDate + ", outDate=" + outDate
				+ ", distypeNum=" + distypeNum + ", hospital=" + hospital
				+ ", disNum=" + disNum + ", outReason=" + outReason + "]";
	}
	public RersMedInfor(String outpatientNum) {
		super();
		this.outpatientNum = outpatientNum;
	}
	
	


}
