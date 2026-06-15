package com.file.read.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDemo {
	public static void main (String args[]) throws IOException {
		File f1 = new File("abc.txt");
		FileInputStream f2 = new FileInputStream(f1);
		for (int i=0;i<f1.length();i++) {
			char c = (char) f2.read(); 
			System.out.println(c);
		}
	}
}
