package com.collection.ojectcreation;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Data d1 = new Data(); // Normal Object Creation
		Data d2 = (Data) d1.clone(); // 4th way of creating Object
		d1.setId(101);
		d2.setId(102);
		System.out.println(d2.getId());
	}
}
