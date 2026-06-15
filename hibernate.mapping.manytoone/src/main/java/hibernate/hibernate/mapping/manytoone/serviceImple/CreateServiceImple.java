package hibernate.hibernate.mapping.manytoone.serviceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.hibernate.mapping.manytoone.dbconnection.DBConnection;
import hibernate.hibernate.mapping.manytoone.entity.Dept;
import hibernate.hibernate.mapping.manytoone.entity.Employee;
import hibernate.hibernate.mapping.manytoone.service.CreateService;

public class CreateServiceImple implements CreateService{

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		EntityManager eManager=DBConnection.dbCon().createEntityManager();
		eManager.getTransaction().begin();
		Scanner scanner=new Scanner(System.in);
		Dept d1=new Dept();
		System.out.println("Enter Dept Details");
		System.out.println("Enter Dept ID");
		int id=scanner.nextInt();
		d1.setId(id);
		
		System.out.println("Enter Dept Name");
		String name=scanner.next();
		d1.setName(name);
		
		System.out.println("Enter Dept Buiding");
		String building=scanner.next();
		d1.setBuilding(building);
		
		Employee e1=new Employee();
		
		System.out.println("Enter Employee Name");
		String empname=scanner.next();
		e1.setName(empname);
		
		System.out.println("Enter Emp id");
		int empid=scanner.nextInt();
		e1.setId(empid);
		
		
		System.out.println("Enter Emp City");
		String city=scanner.next();
		e1.setCity(city);
		
		System.out.println("Enter Emp Salary");
		float salary=scanner.nextFloat();
		e1.setSalary(salary);
		
		e1.setDept(d1);
		eManager.persist(d1);
		eManager.persist(e1);
		
		eManager.getTransaction().commit();
		
	}
	
	
		
	
	
}
