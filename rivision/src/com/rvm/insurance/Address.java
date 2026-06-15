package com.rvm.insurance;

public class Address {
	
	private int flatno;
	private String area;
	private String city;
	private int pin;
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + ", city=" + city + ", pin=" + pin + "]";
	}
	public int getFlatno() {
		return flatno;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
