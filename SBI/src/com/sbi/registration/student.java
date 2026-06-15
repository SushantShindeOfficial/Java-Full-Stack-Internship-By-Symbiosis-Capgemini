package com.sbi.registration;

public class student {
	private int rollno;
	private String name;
	private String city;
	private String dept;
	private String mailid;
	private float per;
	
//	public void getData(int rollno,String name) {
//		this.rollno=rollno;
//		this.name=name;
//		
//	}
//	
//	public void display1() {
//		
//		
//		
//	}
	
	public void getData(int rollno,String name,String city,String dept,String mailid,float per)
	{
		this.rollno=rollno;
		this.name=name;
		this.city=city;
		this.dept=dept;
		this.mailid=mailid;
		this.per=per;
		
	}
	
	public void Display() {
		
		System.out.println("Roll no:"+rollno);
		System.out.println("name no:"+name);
		System.out.println("city no:"+rollno);
		System.out.println("dept no:"+rollno);
		System.out.println("mail no:"+mailid);
		System.out.println("per no:"+per);
	}
}
