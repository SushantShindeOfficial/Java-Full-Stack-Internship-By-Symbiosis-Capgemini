package geoghraphy.location.entity;

public class town {
	private int townid;
	private String name;
	private float area;
	private String pincode;
	private int tid;
	private int did;
	private String state;
	private String country;
	public int getTownid() {
		return townid;
	}
	public town() {
		super();
		// TODO Auto-generated constructor stub
	}
	public town(int townid, String name, float area, String pincode, int tid, int did, String state, String country,
			String continent) {
		super();
		this.townid = townid;
		this.name = name;
		this.area = area;
		this.pincode = pincode;
		this.tid = tid;
		this.did = did;
		this.state = state;
		this.country = country;
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "town [townid=" + townid + ", name=" + name + ", area=" + area + ", pincode=" + pincode + ", tid=" + tid
				+ ", did=" + did + ", state=" + state + ", country=" + country + ", continent=" + continent + "]";
	}
	public void setTownid(int townid) {
		this.townid = townid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	private String continent;
}
