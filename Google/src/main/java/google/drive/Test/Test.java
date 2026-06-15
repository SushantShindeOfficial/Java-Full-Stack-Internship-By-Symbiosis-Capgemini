package google.drive.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import google.drive.service.CreateService;
import google.drive.service.DeleteService;
import google.drive.service.FetchEmployee;
import google.drive.service.UpdateService;
import google.drive.serviceImple.CreateServiceImple;
import google.drive.serviceImple.DeleteServiceImple;
import google.drive.serviceImple.FetchEmployeeImple;
import google.drive.serviceImple.UpdateServiceImple;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		while (true) {
			System.out.println("Employee Management System");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.Delete Employee");
			System.out.println("4.Fetch Employee");
			
			System.out.println("Enter Your Choice");

			Scanner s1 = new Scanner(System.in);
			int x = s1.nextInt();
			switch (x) {
			case 1:
				CreateService c1=new CreateServiceImple();
				c1.addEmployee();
				break;
			case 2:
				UpdateService us=new UpdateServiceImple();
				us.UpdateServicee();
				
				break;
			case 3:
				DeleteService d1=new DeleteServiceImple();
				d1.DeleteServicee();
				break;
			case 4:
				FetchEmployee f1=new FetchEmployeeImple();
				f1.FetchEmployeee();
				break;

			default:
				break;
			}
		}

		
	}
}
