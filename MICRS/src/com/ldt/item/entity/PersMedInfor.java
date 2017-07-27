package com.ldt.item.entity;

public class PersMedInfor {
		private String  outpatientNum;
		private PersonInformation   num;
		private DesiMedIns  desiMedIns;
		private IndiSeg   indiSegId;
		private String   inDate;
		private String   outDate;
		private DiseaseProject   diseaseProject;
		private HospitalClass   hospital;
		private DiseaseInformation   disNum;
		private String   outReason;
		public String getOutpatientNum() {
			return outpatientNum;
		}
		public PersMedInfor() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PersMedInfor(String outpatientNum, PersonInformation num, DesiMedIns desiMedIns, IndiSeg indiSegId,
				String inDate, String outDate, DiseaseProject diseaseProject, HospitalClass hospital,
				DiseaseInformation disNum, String outReason) {
			super();
			this.outpatientNum = outpatientNum;
			this.num = num;
			this.desiMedIns = desiMedIns;
			this.indiSegId = indiSegId;
			this.inDate = inDate;
			this.outDate = outDate;
			this.diseaseProject = diseaseProject;
			this.hospital = hospital;
			this.disNum = disNum;
			this.outReason = outReason;
		}
		@Override
		public String toString() {
			return "PersMedInfor [outpatientNum=" + outpatientNum + ", num=" + num + ", desiMedIns=" + desiMedIns
					+ ", indiSegId=" + indiSegId + ", inDate=" + inDate + ", outDate=" + outDate + ", diseaseProject="
					+ diseaseProject + ", hospital=" + hospital + ", disNum=" + disNum + ", outReason=" + outReason
					+ "]";
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
		public DiseaseProject getDiseaseProject() {
			return diseaseProject;
		}
		public void setDiseaseProject(DiseaseProject diseaseProject) {
			this.diseaseProject = diseaseProject;
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
		public void setOutpatientNum(String outpatientNum) {
			this.outpatientNum = outpatientNum;
		}
}
