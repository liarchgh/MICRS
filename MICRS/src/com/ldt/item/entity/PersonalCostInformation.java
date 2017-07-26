package com.ldt.item.entity;

public class PersonalCostInformation {
	private PersonInformation  user;
	private String  time;
	private int  times;
	private float  expAccumulat;
	private float  remAccumulat;
	private float  paiedPerAccu;
	public PersonInformation getUser() {
		return user;
	}
	public void setUser(PersonInformation user) {
		this.user = user;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public float getExpAccumulat() {
		return expAccumulat;
	}
	public void setExpAccumulat(float expAccumulat) {
		this.expAccumulat = expAccumulat;
	}
	public float getRemAccumulat() {
		return remAccumulat;
	}
	public void setRemAccumulat(float remAccumulat) {
		this.remAccumulat = remAccumulat;
	}
	public float getPaiedPerAccu() {
		return paiedPerAccu;
	}
	public void setPaiedPerAccu(float paiedPerAccu) {
		this.paiedPerAccu = paiedPerAccu;
	}
	@Override
	public String toString() {
		return "PersonalCostInformation [user=" + user + ", time=" + time
				+ ", times=" + times + ", expAccumulat=" + expAccumulat
				+ ", remAccumulat=" + remAccumulat + ", paiedPerAccu="
				+ paiedPerAccu + "]";
	}
	public PersonalCostInformation(PersonInformation user, String time,
			int times, float expAccumulat, float remAccumulat,
			float paiedPerAccu) {
		super();
		this.user = user;
		this.time = time;
		this.times = times;
		this.expAccumulat = expAccumulat;
		this.remAccumulat = remAccumulat;
		this.paiedPerAccu = paiedPerAccu;
	}
	public PersonalCostInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalCostInformation(PersonInformation user, String time) {
		super();
		this.user = user;
		this.time = time;
	}
	
	

}
