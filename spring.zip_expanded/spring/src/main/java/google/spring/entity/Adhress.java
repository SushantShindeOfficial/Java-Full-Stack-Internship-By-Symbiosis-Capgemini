package google.spring.entity;

import java.io.Serializable;

public class Adhress implements Serializable{
	private String flatNo;
	private String area;
	private String atPost;
	private String taluka;
	private String distric;
	private String state;
	private String country;
	public Adhress(String flatNo, String area, String atPost, String taluka, String distric, String state,
			String country) {
		super();
		this.flatNo = flatNo;
		this.area = area;
		this.atPost = atPost;
		this.taluka = taluka;
		this.distric = distric;
		this.state = state;
		this.country = country;
	}
	public Adhress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAtPost() {
		return atPost;
	}
	public void setAtPost(String atPost) {
		this.atPost = atPost;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getDistric() {
		return distric;
	}
	public void setDistric(String distric) {
		this.distric = distric;
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
	@Override
	public String toString() {
		return "Adhress [flatNo=" + flatNo + ", area=" + area + ", atPost=" + atPost + ", taluka=" + taluka
				+ ", distric=" + distric + ", state=" + state + ", country=" + country + "]";
	}
}
