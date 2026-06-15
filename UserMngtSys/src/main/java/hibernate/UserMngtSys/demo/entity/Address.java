package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	private int AddressID;
	private String flateNo;
	private String addressArea;
	private int pinCode;
	@ManyToOne
	private Town town;
	@ManyToOne
	private Taluka taluka;
	@ManyToOne
	private District district;
	@ManyToOne
	private Country country;
	public int getAddressID() {
		return AddressID;
	}
	public void setAddressID(int addressID) {
		AddressID = addressID;
	}
	public String getFlateNo() {
		return flateNo;
	}
	public void setFlateNo(String flateNo) {
		this.flateNo = flateNo;
	}
	public String getAddressArea() {
		return addressArea;
	}
	public void setAddressArea(String addressArea) {
		this.addressArea = addressArea;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Town getTown() {
		return town;
	}
	public void setTown(Town town) {
		this.town = town;
	}
	public Taluka getTaluka() {
		return taluka;
	}
	public void setTaluka(Taluka taluka) {
		this.taluka = taluka;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [AddressID=" + AddressID + ", flateNo=" + flateNo + ", addressArea=" + addressArea
				+ ", pinCode=" + pinCode + ", town=" + town + ", taluka=" + taluka + ", district=" + district
				+ ", country=" + country + "]";
	}
	

}
