package com.file.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Testtest {
	public static void main(String[] args) throws IOException {
		File f1=new File("kp.exe");
		try (FileWriter f2 = new FileWriter(f1)) {
			f2.write("Hii Welcome");
			f2.close();
		}
		System.out.println("Done");
		System.out.println(f1.getAbsolutePath());
//		f1.delete();
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		
		
	}
}
