package springboot.LayerdArchi.demo.entity;

import java.io.Serializable;

public class Address implements Serializable{
	private int AddressID;
	private String pin;
	private String area;
	private String Taluka;
	private String Dist;
	private String Contry;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressID, String pin, String area, String taluka, String dist, String contry) {
		super();
		AddressID = addressID;
		this.pin = pin;
		this.area = area;
		Taluka = taluka;
		Dist = dist;
		Contry = contry;
	}
	@Override
	public String toString() {
		return "Address [AddressID=" + AddressID + ", pin=" + pin + ", area=" + area + ", Taluka=" + Taluka + ", Dist="
				+ Dist + ", Contry=" + Contry + "]";
	}
	public int getAddressID() {
		return AddressID;
	}
	public void setAddressID(int addressID) {
		AddressID = addressID;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTaluka() {
		return Taluka;
	}
	public void setTaluka(String taluka) {
		Taluka = taluka;
	}
	public String getDist() {
		return Dist;
	}
	public void setDist(String dist) {
		Dist = dist;
	}
	public String getContry() {
		return Contry;
	}
	public void setContry(String contry) {
		Contry = contry;
	}
}
