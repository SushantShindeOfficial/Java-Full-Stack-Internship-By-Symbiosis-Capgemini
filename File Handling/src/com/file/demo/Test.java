package com.file.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		File f1=new File("kbp.txt");
		try (FileWriter f2 = new FileWriter(f1)) {
			f2.write("Hii Welcome");
		}
		System.out.println("Done");
		System.out.println(f1.getAbsolutePath());
//		System.out.println(f1.get);
	}
}
