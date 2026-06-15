package cc1.hpc.demo.serviceImple;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.persistence.EntityManager;

import cc1.hpc.demo.dbconnection.Dbconnection;
import cc1.hpc.demo.entity.Employee;
import cc1.hpc.demo.service.FetchService;

public class FetchServiceImple implements FetchService {

	@Override
	public void getData()
			throws ClassNotFoundException, IOException, SQLException {

		EntityManager em = Dbconnection.dbCon().createEntityManager();

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter Employee Id");

		int id = s1.nextInt();

		Employee emp = em.find(Employee.class, id);

		if (emp != null) {

			System.out.println(emp);

		} else {

			System.out.println("Employee Not Found");
		}
	}
}