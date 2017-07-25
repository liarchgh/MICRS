package com.ldt.item.entity;

public class IndiSeg {
	private String  indiSegID;
	private String  indiSeg;
	@Override
	public String toString() {
		return "IndiSeg [indiSegID=" + indiSegID + ", indiSeg=" + indiSeg + "]";
	}
	public IndiSeg(String indiSegID, String indiSeg) {
		super();
		this.indiSegID = indiSegID;
		this.indiSeg = indiSeg;
	}
	public IndiSeg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIndiSegID() {
		return indiSegID;
	}
	public void setIndiSegID(String indiSegID) {
		this.indiSegID = indiSegID;
	}
	public String getIndiSeg() {
		return indiSeg;
	}
	public void setIndiSeg(String indiSeg) {
		this.indiSeg = indiSeg;
	}


}
