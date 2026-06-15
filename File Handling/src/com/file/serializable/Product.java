package com.file.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Product implements Serializable {


	private static final long serialVersionUID = 1L;

	void display() throws ClassNotFoundException,IOException{
		Product p1=new Product();
		File f1=new File("xyz.txt");
		FileOutputStream f2=new FileOutputStream(f1);
		ObjectOutputStream o=new ObjectOutputStream(f2);
		o.writeObject(p1);
		
		
	}

	void demo() {
		System.out.println("Demo method");
	}
}
