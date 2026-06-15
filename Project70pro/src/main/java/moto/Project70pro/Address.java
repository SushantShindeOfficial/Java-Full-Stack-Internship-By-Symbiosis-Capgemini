package moto.Project70pro;

import java.util.List;

public class Address {
	private String addressid;
	private String city;
	private String pin;
	
	private List<Employee> list;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String addressid, String city, String pin, List<Employee> list) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.pin = pin;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", city=" + city + ", pin=" + pin + ", list=" + list + "]";
	}

	public String getAddressid() {
		return addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
}
