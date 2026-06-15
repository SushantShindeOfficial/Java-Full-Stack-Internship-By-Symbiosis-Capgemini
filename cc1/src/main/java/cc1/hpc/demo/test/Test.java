package cc1.hpc.demo.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import cc1.hpc.demo.service.CreateService;
import cc1.hpc.demo.service.DeleteService;
import cc1.hpc.demo.service.FetchService;
import cc1.hpc.demo.service.UpdateService;

import cc1.hpc.demo.serviceImple.CreateServiceImple;
import cc1.hpc.demo.serviceImple.DeleteServiceImple;
import cc1.hpc.demo.serviceImple.FetchServiceImple;
import cc1.hpc.demo.serviceImple.UpdateServiceImple;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("\n_____________ Employee Management System __________");
			System.out.println("1. Add Product");
			System.out.println("2. Update Product");
			System.out.println("3. Delete Product");
			System.out.println("4. Fetch Product");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice:");

			try {

				int x = scanner.nextInt();

				switch (x) {

				case 1:
					CreateService c1 = new CreateServiceImple();
					c1.addData();
					break;

				case 2:
					UpdateService u1 = new UpdateServiceImple();
					u1.ChangeData();
					break;

				case 3:
					DeleteService d1 = new DeleteServiceImple();
					d1.removeData();
					break;

				case 4:
					FetchService f1 = new FetchServiceImple();
					f1.getData();
					break;

				case 5:
					System.out.println("Program Exited Successfully");
					scanner.close();
					System.exit(0);

				default:
					System.out.println("Invalid Choice");
				}

			} catch (ClassNotFoundException e) {

				System.out.println("Driver Class Not Found");
				e.printStackTrace();

			} catch (IOException e) {

				System.out.println("Input Output Exception");
				e.printStackTrace();

			} catch (SQLException e) {

				System.out.println("Database Error");
				e.printStackTrace();

			} catch (Exception e) {

				System.out.println("Invalid Input");
				e.printStackTrace();
			}
		}
	}
}