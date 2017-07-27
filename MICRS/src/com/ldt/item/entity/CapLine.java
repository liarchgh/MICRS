package com.ldt.item.entity;

public class CapLine {
	private String   id;
	private  MedPers medpers ;
	private double  capLine;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public MedPers getMedpers() {
		return medpers;
	}
	public void setMedpers(MedPers medpers) {
		this.medpers = medpers;
	}
	public double getCapLine() {
		return capLine;
	}
	public void setCapLine(double capLine) {
		this.capLine = capLine;
	}
	@Override
	public String toString() {
		return "CapLine [id=" + id + ", medpers=" + medpers + ", capLine="
				+ capLine + "]";
	}
	public CapLine(String id, MedPers medpers, double capLine) {
		super();
		this.id = id;
		this.medpers = medpers;
		this.capLine = capLine;
	}
	public CapLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CapLine(String id) {
		super();
		this.id = id;
	}
	
}
