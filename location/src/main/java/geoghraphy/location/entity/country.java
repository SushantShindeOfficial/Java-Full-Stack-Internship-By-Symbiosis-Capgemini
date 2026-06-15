package geoghraphy.location.entity;

public class country {
	private int cid;
	private String name;
	private float area;
	@Override
	public String toString() {
		return "country [cid=" + cid + ", name=" + name + ", area=" + area + ", contid=" + contid + "]";
	}
	public country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public country(int cid, String name, float area, int contid) {
		super();
		this.cid = cid;
		this.name = name;
		this.area = area;
	this.contid = contid;
	}
	public country(float area) {
		super();
		this.area = area;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public int getContid() {
		return contid;
	}
	public void setContid(int contid) {
		this.contid = contid;
	}
	private int contid;
}
