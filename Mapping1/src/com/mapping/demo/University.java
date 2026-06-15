package com.mapping.demo;

import java.util.List;

public class University {
	private int regNo;
    private String name;

    private Dean dean;

    public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(int regNo, String name, Dean dean, List<College> colleges) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.dean = dean;
		this.colleges = colleges;
	}

	@Override
	public String toString() {
		return "University [regNo=" + regNo + ", name=" + name + ", dean=" + dean + ", colleges=" + colleges + "]";
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dean getDean() {
		return dean;
	}

	public void setDean(Dean dean) {
		this.dean = dean;
	}

	public List<College> getColleges() {
		return colleges;
	}

	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}

	private List<College> colleges;
}
