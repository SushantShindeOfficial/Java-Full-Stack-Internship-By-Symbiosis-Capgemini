package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Dept;
import google.task.service.DeleteDeptService;

public class DeleteDeptServiceImple implements DeleteDeptService{

	@Override
	public int deleteDept() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Delete Dept Data");
		System.out.println("Enter Dept Id to delete");
		int id=s1.nextInt();

		Dept s2 = em.find(Dept.class, id);
		
		em.remove(s2);

		em.getTransaction().commit();
		System.out.println("Dept deleted");
		return 0;
	}

}
