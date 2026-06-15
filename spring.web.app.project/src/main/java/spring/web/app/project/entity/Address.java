package spring.web.app.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Address {
	@Id
	private int addressid;
	private String area;
	private int flatno;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressid, String area, int flatno) {
		super();
		this.addressid = addressid;
		this.area = area;
		this.flatno = flatno;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", area=" + area + ", flatno=" + flatno + "]";
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
}
