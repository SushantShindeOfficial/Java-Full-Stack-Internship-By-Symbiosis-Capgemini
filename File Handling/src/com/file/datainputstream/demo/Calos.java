package com.file.datainputstream.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Calos {
	public static void main(String[] args) {
		File f1=new File("calos.txt");
		try (FileReader f2 = new FileReader(f1)) {

			int data = f2.read();

			System.out.println("ASCII Value : " + data);

			System.out.print("Character : " + (char) data);
			
			for (int i=0;i<f1.length();i++) {
				char c = (char) f2.read(); 
				System.out.print(c);
			}
			

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
