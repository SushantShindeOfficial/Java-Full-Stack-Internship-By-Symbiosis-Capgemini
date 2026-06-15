package springboot.springboot.demo.entity;

public class Address {
	private int flatno;
	private String area;
	private String town;
	private String city;
	private String pincode;

	public int getFlatno() {
		return flatno;
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

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + ", town=" + town + ", city=" + city + ", pincode="
				+ pincode + "]";
	}

	public Address(int flatno, String area, String town, String city, String pincode) {
		super();
		this.flatno = flatno;
		this.area = area;
		this.town = town;
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
