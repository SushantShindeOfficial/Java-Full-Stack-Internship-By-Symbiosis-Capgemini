package com.exceptiondemo.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) throws IOException {
		//Resources
		File f1=new File("C:\\Users\\HP\\eclipse-workspace\\ExceptionDemo\\src\\com\\exceptiondemo\\login\\TestDemo.java");
		FileInputStream f2=f2=new FileInputStream(f1);
		
		try {
			f2.read();
			//Open File	
			Scanner s1=new Scanner(System.in);
			System.out.println("Emp Id: ");
			int id=s1.nextInt();
		} 
		
		catch (Exception e) {
			System.out.println("Error In the Code");
		}
		
		finally {
			f2.close();
			System.out.println("File Closed");
		}
	}
}
