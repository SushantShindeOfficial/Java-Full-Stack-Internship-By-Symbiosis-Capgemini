package com.file.datainputstream.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class colos {
	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("calos.txt");
		try (PrintWriter p1 = new PrintWriter(f1)) {
			p1.write("Lag jaa Gale ki");
			
		}
	}
}
