package com.ldt.item.entity;

public class CapLine {
	private String   id;
	private  IndiSeg indiSeg ;
	private float  capLine;
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
	public float getCapLine() {
		return capLine;
	}
	public void setCapLine(float capLine) {
		this.capLine = capLine;
	}
	@Override
	public String toString() {
		return "CapLine [id=" + id + ", indiSeg=" + indiSeg + ", capLine="
				+ capLine + "]";
	}
	public CapLine(String id, IndiSeg indiSeg, float capLine) {
		super();
		this.id = id;
		this.indiSeg = indiSeg;
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
