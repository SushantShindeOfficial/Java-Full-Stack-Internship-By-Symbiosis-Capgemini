package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.College;
import google.task.entity.Subject;
import google.task.service.UpdateCollegeService;

public class UpdateCollegeServiceImple implements UpdateCollegeService{

	@Override
	public College updateCollege(int id) {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		College s2 = em.find(College.class, id);
		System.out.println("Enter College Data to Update");
		System.out.println("Enter College Name");
		String name = s1.next();

		System.out.println("Enter College City");
		String city = s1.next();

	
		s2.setName(name);
		s2.setCity(city);
		
		em.merge(s2);

		em.getTransaction().commit();
		System.out.println("College updated");
		return s2;
	}

}
