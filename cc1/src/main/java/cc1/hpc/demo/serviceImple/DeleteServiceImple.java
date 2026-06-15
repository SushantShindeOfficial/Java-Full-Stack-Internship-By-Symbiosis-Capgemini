package cc1.hpc.demo.serviceImple;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.persistence.EntityManager;

import cc1.hpc.demo.dbconnection.Dbconnection;
import cc1.hpc.demo.entity.Employee;
import cc1.hpc.demo.service.DeleteService;

public class DeleteServiceImple implements DeleteService {

	@Override
	public void removeData()
			throws IOException, ClassNotFoundException, SQLException {

		EntityManager eManager = Dbconnection.dbCon().createEntityManager();

		eManager.getTransaction().begin();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Id to delete");

		int id = scanner.nextInt();

		Employee e1 = eManager.find(Employee.class, id);

		if (e1 != null) {

			eManager.remove(e1);

			eManager.getTransaction().commit();

			System.out.println("Data Deleted");

		} else {

			System.out.println("Employee Not Found");
		}
	}
}