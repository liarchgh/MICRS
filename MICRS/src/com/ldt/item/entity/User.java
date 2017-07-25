package com.ldt.item.entity;

public class User {
	private int ID;
	private String account;
	private String password;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [ID=" + ID + ", account=" + account + ", password="
				+ password + "]";
	}
	public User(int iD, String account, String password) {
		super();
		ID = iD;
		this.account = account;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
