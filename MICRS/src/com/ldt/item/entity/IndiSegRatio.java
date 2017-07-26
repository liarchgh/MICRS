package com.ldt.item.entity;

public class IndiSegRatio {
	private String   id;
	private IndiSeg  indiSeg;
	private MedPers  medPers;
	private HospitalClass  hospital;
	private float  topMon;
	private float  bootomMon;
	private float  ratio;
	@Override
	public String toString() {
		return "IndiSegRatio [id=" + id + ", indiSeg=" + indiSeg + ", medPers="
				+ medPers + ", hospital=" + hospital + ", topMon=" + topMon
				+ ", bootomMon=" + bootomMon + ", ratio=" + ratio + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IndiSeg getIndiSeg() {
		return indiSeg;
	}
	public void setIndiSeg(IndiSeg indiSeg) {
		this.indiSeg = indiSeg;
	}
	public MedPers getMedPers() {
		return medPers;
	}
	public void setMedPers(MedPers medPers) {
		this.medPers = medPers;
	}
	public HospitalClass getHospital() {
		return hospital;
	}
	public void setHospital(HospitalClass hospital) {
		this.hospital = hospital;
	}
	public float getTopMon() {
		return topMon;
	}
	public void setTopMon(float topMon) {
		this.topMon = topMon;
	}
	public float getBootomMon() {
		return bootomMon;
	}
	public void setBootomMon(float bootomMon) {
		this.bootomMon = bootomMon;
	}
	public float getRatio() {
		return ratio;
	}
	public void setRatio(float ratio) {
		this.ratio = ratio;
	}
	public IndiSegRatio(String id, IndiSeg indiSeg, MedPers medPers,
			HospitalClass hospital, float topMon, float bootomMon, float ratio) {
		super();
		this.id = id;
		this.indiSeg = indiSeg;
		this.medPers = medPers;
		this.hospital = hospital;
		this.topMon = topMon;
		this.bootomMon = bootomMon;
		this.ratio = ratio;
	}
	public IndiSegRatio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IndiSegRatio(String id) {
		super();
		this.id = id;
	}
	
	
	
}
