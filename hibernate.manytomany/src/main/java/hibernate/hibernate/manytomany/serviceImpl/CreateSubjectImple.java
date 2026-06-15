package hibernate.hibernate.manytomany.serviceImpl;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.hibernate.manytomany.dbconnection.DBConnection;
import hibernate.hibernate.manytomany.entity.Subject;
import hibernate.hibernate.manytomany.entity.Teacher;
import hibernate.hibernate.manytomany.service.CreateSubject;

public class CreateSubjectImple implements CreateSubject{

	@Override
	public void AddSubject() {
		// TODO Auto-generated method stub
		EntityManager eManager=DBConnection.dbCon().createEntityManager();
		eManager.getTransaction().begin();
		Subject s1=new Subject();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Subject Name: ");
		String Subname=scanner.next();
		s1.setName(Subname);
		
		System.out.println("Enter Subject ID:");
		int Subid=scanner.nextInt();
		s1.setSubid(Subid);
		
		System.out.println("Enter Auther Name: ");
		String authername=scanner.next();
		s1.setAuthor(authername);
		
		Teacher t1=new Teacher();
		System.out.println("ENter");
		
		
		
		
	}

}
