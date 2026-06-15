package com.file.datainputstream.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class HOme implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2080607036227796217L;
	void diplay() throws IOException, ClassNotFoundException {
		File f1=new File("demo.txt");
		FileInputStream f2=new FileInputStream(f1);
		try (ObjectInputStream objectInputStream = new ObjectInputStream(f2)) {
			Datademo d1=(Datademo)objectInputStream.readObject();
			d1.demo();
		}
	}
}
