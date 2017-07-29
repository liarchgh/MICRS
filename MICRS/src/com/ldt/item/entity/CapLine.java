package com.ldt.item.entity;

public class CapLine {
	private  MedPers medpers ;
	private double  capLine;
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
		return "CapLine [medpers=" + medpers + ", capLine=" + capLine + "]";
	}
	public CapLine(MedPers medpers, double capLine) {
		super();
		this.medpers = medpers;
		this.capLine = capLine;
	}
	public CapLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
