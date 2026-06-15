package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Dept;
import google.task.entity.Subject;
import google.task.service.UpdateDeptService;

public class UpdateDeptServiceImple implements UpdateDeptService{

	@Override
	public Dept updateDept(int id) {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		
		Dept s2 = em.find(Dept.class, id);
		System.out.println("Enter Dept Data to Update");
		System.out.println("Enter Dept Name");
		String name=s1.next();
		System.out.println("Enter Dept building");
		String building =s1.next();

	
		s2.setName(name);
		s2.setBuilding(building);
		
		em.merge(s2);

		em.getTransaction().commit();
		System.out.println("Dept updated");
		return s2;
	}

}
