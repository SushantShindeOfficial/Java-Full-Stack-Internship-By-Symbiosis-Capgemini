package com.sbi.test;

import com.sbi.service.CreateService;
import com.sbi.entity.Employee;
import com.sbi.service.Fetchservice;
import com.sbi.service.implem.CreateSeviceImple;
import com.sbi.service.implem.FetchSeviceImple;

public class Test {
	public static void main(String[] args) {
		
		CreateService emp=new CreateSeviceImple();
		Employee emp1=emp.AddEmployee();
		
		Fetchservice f1=new FetchSeviceImple();
		f1.fetchEmployee(emp1);
		
		
	}
}
