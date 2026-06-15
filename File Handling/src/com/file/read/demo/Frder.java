package com.file.read.demo;
import java.io.FileReader;
import java.io.IOException;

public class Frder {
	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("abc.txt");
		System.out.println(fileReader);
		
	}
}
