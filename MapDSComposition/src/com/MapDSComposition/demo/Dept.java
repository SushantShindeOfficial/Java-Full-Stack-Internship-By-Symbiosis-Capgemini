package com.MapDSComposition.demo;

import java.util.List;

public class Dept {
	private int did;
	private String dname;
	private List<Student> students;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int did, String dname, List<Student> students) {
		super();
		this.did = did;
		this.dname = dname;
		this.students = students;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", students=" + students + "]";
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
