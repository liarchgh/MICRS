package com.ldt.item.entity;

public class CapLine {
	private String   id;
	private  MedPers medpers ;
	private float  capLine;
	public String getId() {
		return id;
	}
	public MedPers getMedpers() {
		return medpers;
	}
	public void setMedpers(MedPers medpers) {
		this.medpers = medpers;
	}
	public float getCapLine() {
		return capLine;
	}
	public void setCapLine(float capLine) {
		this.capLine = capLine;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CapLine [id=" + id + ", medpers=" + medpers + ", capLine="
				+ capLine + "]";
	}
	public CapLine(String id, MedPers medpers, float capLine) {
		super();
		this.id = id;
		this.medpers = medpers;
		this.capLine = capLine;
	}
	public CapLine() {
		super();
		// TODO Auto-generated constructor stub
	}
}
