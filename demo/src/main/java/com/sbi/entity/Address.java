package com.sbi.entity;


public class Address {
	private String pin;
	private String city;
	private String Area;
	private String landmark;
	private Org org;
	@Override
	public String toString() {
	    return "Address [pin=" + pin + ", city=" + city + ", area=" + Area + "]";
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public Org getOrg() {
		return org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}
}
