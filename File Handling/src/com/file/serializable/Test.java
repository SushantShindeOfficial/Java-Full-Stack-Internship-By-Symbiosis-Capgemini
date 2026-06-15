package com.file.serializable;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Product p1=new Product();
		p1.demo();
		p1.display();
		Data d1=new Data();
		d1.getdata();
	}
}
