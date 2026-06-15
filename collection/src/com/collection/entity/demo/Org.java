package com.collection.entity.demo;

public class Org {
	private String orgid;
	private String orgname;
	private String orgcity;
	private Address orgaddress;
	private Org orgorg;
	@Override
	public String toString() {
	    return "Org [id=" + orgid + ", name=" + orgname + ", city=" + orgcity + "]";
	}
	public String getOrgid() {
		return orgid;
	}
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgcity() {
		return orgcity;
	}
	public void setOrgcity(String orgcity) {
		this.orgcity = orgcity;
	}
	public Address getOrgaddress() {
		return orgaddress;
	}
	public void setOrgaddress(Address orgaddress) {
		this.orgaddress = orgaddress;
	}
	public Org getOrgorg() {
		return orgorg;
	}
	public void setOrgorg(Org orgorg) {
		this.orgorg = orgorg;
	}
	
}
