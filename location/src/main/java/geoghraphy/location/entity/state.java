package geoghraphy.location.entity;

public class state {
	private int sid;
	private String name;
	private float area;
	private String region;
	private int cid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public state() {
		super();
		// TODO Auto-generated constructor stub
	}
	public state(int sid, String name, float area, String region, int cid) {
		super();
		this.sid = sid;
		this.name = name;
		this.area = area;
		this.region = region;
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "state [sid=" + sid + ", name=" + name + ", area=" + area + ", region=" + region + ", cid=" + cid + "]";
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
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
}
