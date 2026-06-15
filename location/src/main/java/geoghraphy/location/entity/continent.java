package geoghraphy.location.entity;

public class continent {
	private int cid;
	private String name;
	private float area;
	private String region;
	public continent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public continent(int cid, String name, float area, String region) {
		super();
		this.cid = cid;
		this.name = name;
		this.area = area;
		this.region = region;
	}
	@Override
	public String toString() {
		return "continent [cid=" + cid + ", name=" + name + ", area=" + area + ", region=" + region + "]";
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
}
