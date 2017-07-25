package com.ldt.item.entity;

public class CapLine {
	private String   id;
	private String  indiSegId;
	private String  medPersClass;
	private float  capLine;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIndiSegId() {
		return indiSegId;
	}
	public void setIndiSegId(String indiSegId) {
		this.indiSegId = indiSegId;
	}
	public String getMedPersClass() {
		return medPersClass;
	}
	public void setMedPersClass(String medPersClass) {
		this.medPersClass = medPersClass;
	}
	public float getCapLine() {
		return capLine;
	}
	public void setCapLine(float capLine) {
		this.capLine = capLine;
	}
	public CapLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CapLine(String id, String indiSegId, String medPersClass,
			float capLine) {
		super();
		this.id = id;
		this.indiSegId = indiSegId;
		this.medPersClass = medPersClass;
		this.capLine = capLine;
	}
	@Override
	public String toString() {
		return "CapLine [id=" + id + ", indiSegId=" + indiSegId
				+ ", medPersClass=" + medPersClass + ", capLine=" + capLine
				+ "]";
	}
	
}
