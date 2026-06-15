package com.sbi.example.demo;

import com.sbi.example.demo.Data.Client;

public class Test {
	public static void main(String[] args) {
		Data d=new Data();
		//Client c1=new Client();
		Client c1=d.new Client();
		c1.display();
	}
}
