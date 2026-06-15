package com.sbi.loan;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fILEdEMO { 
	//Only for Developer
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f1=new File("abc.txt");
		try(FileInputStream f2=new FileInputStream(f1)){
			
		}
	}
}
