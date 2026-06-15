package cc1.hpc.demo.serviceImple;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.persistence.EntityManager;

import cc1.hpc.demo.dbconnection.Dbconnection;
import cc1.hpc.demo.entity.Employee;
import cc1.hpc.demo.service.UpdateService;

public class UpdateServiceImple implements UpdateService {

	@Override
	public void ChangeData()
			throws IOException, SQLException, ClassNotFoundException {

		EntityManager eManager = Dbconnection.dbCon().createEntityManager();

		eManager.getTransaction().begin();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Id to Update");

		int id = scanner.nextInt();

		Employee e1 = eManager.find(Employee.class, id);

		if (e1 != null) {

			System.out.println("Enter name to update");
			String name = scanner.next();

			System.out.println("Enter Price");
			float price = scanner.nextFloat();

			System.out.println("Enter Category");
			String category = scanner.next();

			System.out.println("Enter Description");
			String desc = scanner.next();

			e1.setName(name);
			e1.setPrice(price);
			e1.setDesc(desc);
			e1.setCategory(category);

			eManager.merge(e1);

			eManager.getTransaction().commit();

			System.out.println("Data Updated");

		} else {

			System.out.println("Employee Not Found");
		}
	}
}