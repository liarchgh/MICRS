package com.ldt.item.entity;

public class PrescriptionDetail {
	private String  outpatientNum;
	private Drug   medicineCode;
	private float   price;
	private int    total;
	private float    account;
	@Override
	public String toString() {
		return "PrescriptionDetail [outpatientNum=" + outpatientNum
				+ ", medicineCode=" + medicineCode + ", price=" + price
				+ ", total=" + total + ", account=" + account + "]";
	}
	public String getOutpatientNum() {
		return outpatientNum;
	}
	public void setOutpatientNum(String outpatientNum) {
		this.outpatientNum = outpatientNum;
	}
	public Drug getMedicineCode() {
		return medicineCode;
	}
	public void setMedicineCode(Drug medicineCode) {
		this.medicineCode = medicineCode;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAccount() {
		return account;
	}
	public void setAccount(float account) {
		this.account = account;
	}
	public PrescriptionDetail(String outpatientNum, Drug medicineCode,
			float price, int total, float account) {
		super();
		this.outpatientNum = outpatientNum;
		this.medicineCode = medicineCode;
		this.price = price;
		this.total = total;
		this.account = account;
	}
	public PrescriptionDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrescriptionDetail(String outpatientNum, Drug medicineCode) {
		super();
		this.outpatientNum = outpatientNum;
		this.medicineCode = medicineCode;
	}
	
	

}
