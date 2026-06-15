package com.sbi.service.implem;

import java.util.Scanner;

import com.sbi.entity.Address;
import com.sbi.entity.Employee;
import com.sbi.service.CreateService;

public class CreateSeviceImple implements CreateService{
	

	@Override
	public Employee AddEmployee() {
		Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        Address addr = new Address();

        // Employee input
        System.out.print("Enter Employee ID: ");
        emp.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Department: ");
        emp.setDept(sc.nextLine());

        // Address input
        System.out.print("Enter Flat No: ");
        addr.setFlatno(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Area: ");
        addr.setArea(sc.nextLine());

        System.out.print("Enter City: ");
        addr.setCity(sc.nextLine());

        System.out.print("Enter Pin: ");
        addr.setPin(sc.nextInt());

        // Set address
        emp.setAddress(addr);

		return emp;
		
	}

}
