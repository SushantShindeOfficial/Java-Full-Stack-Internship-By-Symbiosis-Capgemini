package springboot.springboot.demo3.entity4;

public class Address {
	private int flatNo;
	private String area;
	private String town;
	private String city;
	private String pincode;
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
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
		return "Address [flatNo=" + flatNo + ", area=" + area + ", town=" + town + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	public Address(int flatNo, String area, String town, String city, String pincode) {
		super();
		this.flatNo = flatNo;
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
