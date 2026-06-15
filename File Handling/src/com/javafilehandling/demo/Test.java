package com.javafilehandling.demo;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		 File f1=new File("abc.txt");
		 
		 File f2=new File("ab.txt");
		 f2.createNewFile();
		 
		 File f3=new File("ac.txt");
		 f3.createNewFile();
		 
		 File f4=new File("ac.txt");
		 f4.createNewFile();
		 
		 File f5=new File("ab.txt");
		 f5.createNewFile();
		 
		 if(!f1.exists()) {
			 f1.createNewFile();
			 System.out.println("New File is Created");
		 }else {
			System.out.println("File is is already Present");
		}
		 
		 
	}
}
