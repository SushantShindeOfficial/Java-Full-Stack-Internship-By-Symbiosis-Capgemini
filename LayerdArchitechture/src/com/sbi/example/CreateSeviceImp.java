package com.sbi.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateSeviceImp implements CreateService {

	@Override
	public void addEmployee() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=DriverManager.getConnection("","","");
		
	}
	void fileDemo()throws IOException {
		
		File f1=new File("ab.txt");
		FileInputStream f2=new FileInputStream(f1);
	}

}
