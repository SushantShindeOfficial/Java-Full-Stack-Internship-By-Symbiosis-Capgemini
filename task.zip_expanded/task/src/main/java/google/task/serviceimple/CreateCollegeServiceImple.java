package google.task.serviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.College;
import google.task.entity.Dept;
import google.task.entity.Principal;
import google.task.service.CreateCollegeService;

public class CreateCollegeServiceImple implements CreateCollegeService{
	FetchPrincipalServiceImple fetchPrincipalServiceImple;
	FetchDeptServiceImple fetchDeptServiceImple;
	
	
	

	public CreateCollegeServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CreateCollegeServiceImple(FetchPrincipalServiceImple fetchPrincipalServiceImple,
			FetchDeptServiceImple fetchDeptServiceImple) {
		super();
		this.fetchPrincipalServiceImple = fetchPrincipalServiceImple;
		this.fetchDeptServiceImple = fetchDeptServiceImple;
	}







	@Override
	public College addCollege() {
		// TODO Auto-generated method stub
		EntityManager em = DbConnection.dbconn().createEntityManager();

		em.getTransaction().begin();

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter College Data");

		System.out.println("Enter College Id");
		int id = s1.nextInt();

		System.out.println("Enter College Name");
		String name = s1.next();

		System.out.println("Enter College City");
		String city = s1.next();
		
		
		College c1 = new College();

		c1.setId(id);
		c1.setName(name);
		c1.setCity(city);
		
		List<Principal> p1 = fetchPrincipalServiceImple.getPrincipal();

		if(p1.size() > 0)
		{
			c1.setPrincipal(p1.get(0));
		}
		else
		{
			System.out.println("No Principal Found");
		}
		
		List<Dept> l1=fetchDeptServiceImple.getDept();
		c1.setDepts(l1);

		em.persist(c1);
		em.getTransaction().commit();
		System.out.println("College Added Successfully");

		return c1;
	}

}
