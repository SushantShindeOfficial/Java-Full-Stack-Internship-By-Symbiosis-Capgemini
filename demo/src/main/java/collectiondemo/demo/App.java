package collectiondemo.demo;

import java.util.Scanner;

import com.sbi.entity.Address;
import com.sbi.entity.Employee;
import com.sbi.entity.Org;
import com.sbi.serviceimple.CreateServiceImple;
import com.sbi.serviceimple.DeleteServiceImple;
import com.sbi.serviceimple.FetchServiceImple;
import com.sbi.servie.CreateService;
import com.sbi.servie.DeleteService;
import com.sbi.servie.FetchService;

public class App 
{
    public static void main( String[] args )
    {
    	Employee emp=new Employee();
    	Org org=new Org();
    	Address adress=new Address();
    	Scanner s1=new Scanner(System.in);
    	
    	System.out.println("1. Create Service ");
    	System.out.println("2. Delete Service ");
    	System.out.println("3. Fetch Service ");
    	
    	System.out.println("Emter Your Choice ");
    	int x=s1.nextInt();
    	
    	switch (x) {
		case 1:
			System.out.println("1. Create Service ");
			CreateService c1=new CreateServiceImple();
			c1.addEmployee();
			break;
			
		case 2:
			System.out.println("2. Delete Service ");
			DeleteService d1=new DeleteServiceImple();
			d1.deleteData();
			break;
			
		case 3:
			System.out.println("3. Fetch Service ");
			FetchService f1=new FetchServiceImple();
			f1.fetchService();
			break;

		default:
			System.out.println("Thak youu ");
			break;
		}
    }
}
