package com.sbi.serviceimple;

import com.sbi.entity.Address;
import com.sbi.entity.Employee;
import com.sbi.entity.Org;
import com.sbi.servie.FetchService;

public class FetchServiceImple implements FetchService {

	@Override
	public void fetchService() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Org org = new Org();
		Address adress = new Address();

		System.out.println("Emp City: " + emp.getCity());
		System.out.println("Emp ID: " + emp.getId());
		System.out.println("Emp Name: " + emp.getName());
		System.out.println("Emp Address: " + emp.getAddress());
		System.out.println("Emp Org: " + emp.getOrg());

	}

}
