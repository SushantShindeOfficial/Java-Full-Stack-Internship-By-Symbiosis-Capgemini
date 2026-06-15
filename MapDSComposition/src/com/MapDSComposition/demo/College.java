package com.MapDSComposition.demo;

import java.util.List;

public class College {
	private int regno;
	private String cName;
	private List<Dept> depts;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	@Override
	public String toString() {
		return "College [regno=" + regno + ", cName=" + cName + ", depts=" + depts + "]";
	}
	public College(int regno, String cName, List<Dept> depts) {
		super();
		this.regno = regno;
		this.cName = cName;
		this.depts = depts;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
