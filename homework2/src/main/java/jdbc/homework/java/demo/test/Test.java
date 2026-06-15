package jdbc.homework.java.demo.test;

import jdbc.homework.java.demo.entity.Employee;
import jdbc.homework.java.demo.service.EmployeeService;
import jdbc.homework.java.demo.serviceImple.EmployeeServiceImpl;

public class Test {
	 public static void main(String[] args) {

	        EmployeeService service =new EmployeeServiceImpl();

	        Employee e1 =new Employee(1,"Amit",50000);

	        Employee e2 = new Employee(2,"Rahul",60000);

	        Employee e3 = new Employee(1,"Amit",50000);

	        service.addEmployee(e1);
	        service.addEmployee(e2);
	        service.addEmployee(e3);
	    }
}
