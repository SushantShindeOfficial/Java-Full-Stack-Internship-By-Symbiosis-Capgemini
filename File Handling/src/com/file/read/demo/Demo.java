package com.file.read.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f1 = new File("kbc.txt");
		FileInputStream f2 = new FileInputStream(f1);
//		f2.read();

		if (!f1.exists()) {
			f1.createNewFile();
			System.out.println("New File is Created");
		} else {
			System.out.println("File is is already Present");
		}
	}
}
