package com.collection.entity.demo;

import java.util.Vector;

public class Dept {
	private int deptid;
	private String deptname;
	private String deptadd;
	private String deptarea;
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptname=" + deptname + ", deptadd=" + deptadd + ", deptarea=" + deptarea
				+ "]";
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptadd() {
		return deptadd;
	}
	public void setDeptadd(String deptadd) {
		this.deptadd = deptadd;
	}
	public String getDeptarea() {
		return deptarea;
	}
	public void setDeptarea(String deptarea) {
		this.deptarea = deptarea;
	}
	

}
