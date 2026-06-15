package geoghraphy.location.entity;

public class district {
	private int did;
	private String name;
	private float area;
	public district() {
		super();
		// TODO Auto-generated constructor stub
	}
	public district(int did, String name, float area, int sid, String country, String continent) {
		super();
		this.did = did;
		this.name = name;
		this.area = area;
		this.sid = sid;
		this.country = country;
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "district [did=" + did + ", name=" + name + ", area=" + area + ", sid=" + sid + ", country=" + country
				+ ", continent=" + continent + "]";
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
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
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	private int sid;
	private String country;
	private String continent;
}
