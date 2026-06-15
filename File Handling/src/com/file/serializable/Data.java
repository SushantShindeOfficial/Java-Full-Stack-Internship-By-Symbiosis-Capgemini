package com.file.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Data implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	void getdata() throws IOException, ClassNotFoundException {
		File f1=new File("xyz.txt");
		FileInputStream f2=new FileInputStream(f1);
		try (ObjectInputStream objectInputStream = new ObjectInputStream(f2)) {
			Product p1=(Product)objectInputStream.readObject();
		}
		System.out.println("Object is Generated");
	}

}
