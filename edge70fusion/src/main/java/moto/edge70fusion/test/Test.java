package moto.edge70fusion.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		System.out.println("Employee management system");
		System.out.println("1.Add Student");
		System.out.println("2.Delete Student");
		System.out.println("3.Update  Student");
		System.out.println("4.Fetch Student");
		System.out.println("Enter your choice");
		Scanner s1=new Scanner(System.in);
		int x=s1.nextInt();
		switch (x) {
		case 1:
//			CreateService c1=new CreateServiceImple();
//			c1.addEmployee();

			break;
		case 2:
//			DeleteService c2=new DeleteServiceImple();
//			c2.DeleteEmp();
			break;
		case 3:
//			UpdateService c3 = new UpdateServiceImple(); 
//			c3.UpdateServiceEmp();
			break;
		case 4:
//			FetechService c4 = new FetchServiceImple(); 
//			c4.FetchServiceEmp();
			break;

		default: System.out.println("Enter proper input");
			break;
		}
	}
}
