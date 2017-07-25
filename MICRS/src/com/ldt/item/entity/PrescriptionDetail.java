package com.ldt.item.entity;

public class PrescriptionDetail {
	private String  outpatientNum;
	private String   medicineCode;
	private float   price;
	private int    total;
	@Override
	public String toString() {
		return "PrescriptionDetail [outpatientNum=" + outpatientNum
				+ ", medicineCode=" + medicineCode + ", price=" + price
				+ ", total=" + total + ", account=" + account + "]";
	}
	public PrescriptionDetail(String outpatientNum, String medicineCode,
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
	public String getOutpatientNum() {
		return outpatientNum;
	}
	public void setOutpatientNum(String outpatientNum) {
		this.outpatientNum = outpatientNum;
	}
	public String getMedicineCode() {
		return medicineCode;
	}
	public void setMedicineCode(String medicineCode) {
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
	private float    account;

}
