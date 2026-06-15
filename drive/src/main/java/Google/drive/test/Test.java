package Google.drive.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import Google.drive.Service.Imple.CreateServiceimple;
import Google.drive.Service.Imple.DeleteServiceImple;
import Google.drive.Service.Imple.FetchServiceImple;
import Google.drive.Service.Imple.UpdateServiceImple;
import Google.drive.Services.CreateService;
import Google.drive.Services.DeleteService;
import Google.drive.Services.FetchService;
import Google.drive.Services.UpdateService;

public class Test {
	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		while (true) {
			System.out.println("Student Management System");
			System.out.println("1.Add Student");
			System.out.println("2.Update Student");
			System.out.println("3.Delete Student");
			System.out.println("4.Fetch Student");
			
			System.out.println("Enter Your Choice");

			Scanner s1 = new Scanner(System.in);
			int x = s1.nextInt();
			switch (x) {
			case 1:
				CreateService c1 = new CreateServiceimple();
				c1.addStudent();
				break;
			case 2:
				
				UpdateService u1=new UpdateServiceImple();
				u1.UpdateService();
				break;
			case 3:
				DeleteService d1=new DeleteServiceImple();
				d1.DeleteService();
				break;
			case 4:
				FetchService f1=new FetchServiceImple();
				f1.FetchService();
				break;

			default:
				break;
			}
		}

	}

}
