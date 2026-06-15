package moto.cc2.java.demo.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import moto.cc2.java.demo.serivrceImple.CreateServiceImple;
import moto.cc2.java.demo.serivrceImple.FetchAllServiceImple;
import moto.cc2.java.demo.service.CreateService;
import moto.cc2.java.demo.service.FetchAllService;

public class Test {
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		
		Scanner scanner=new Scanner(System.in);
		
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

//				case 2:
//					UpdateService u1 = new UpdateServiceImple();
//					u1.ChangeData();
//					break;
//
//				case 3:
//					DeleteService d1 = new DeleteServiceImple();
//					d1.removeData();
//					break;

				case 4:
					FetchAllService f1 = new FetchAllServiceImple();
					f1.getAlldata();
					break;

				case 5:
					System.out.println("Program Exited Successfully");
					scanner.close();
					System.exit(0);

				default:
					System.out.println("Invalid Choice");
				}

			} catch (Exception e) {

				System.out.println("Invalid Input");
				e.printStackTrace();
			}
		}
	}
	
}
