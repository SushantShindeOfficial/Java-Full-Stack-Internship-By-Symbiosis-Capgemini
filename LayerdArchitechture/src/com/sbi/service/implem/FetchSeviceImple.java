package com.sbi.service.implem;

import java.util.Scanner;

import com.sbi.entity.Address;
import com.sbi.entity.Employee;
import com.sbi.service.Fetchservice;

public class FetchSeviceImple implements Fetchservice {

	Address a1=new Address();
	Employee e1=new Employee();
	Scanner s1=new Scanner(System.in);
	

	@Override
	public void fetchEmployee(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Emp ID is: "+emp.getId());
		System.out.println("Emp name is: "+emp.getName());
		System.out.println("Emp dept is: "+emp.getDept());
		System.out.println("Emp Address: "+emp.getAddress());
		
	}

}
