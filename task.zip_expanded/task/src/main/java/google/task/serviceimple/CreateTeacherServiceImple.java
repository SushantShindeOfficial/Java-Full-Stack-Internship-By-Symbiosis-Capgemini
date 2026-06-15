package google.task.serviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Subject;
import google.task.entity.Teacher;
import google.task.service.CreateTeacherService;

public class CreateTeacherServiceImple implements CreateTeacherService{
	FetchSubjectServiceImple fetchSubjectServiceImple;
	

	public CreateTeacherServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CreateTeacherServiceImple(FetchSubjectServiceImple fetchSubjectServiceImple) {
		super();
		this.fetchSubjectServiceImple = fetchSubjectServiceImple;
	}


	@Override
	public Teacher addTeacher() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Teacher Data");
		System.out.println("Enter Teacher Id");
		int id=s1.nextInt();
		System.out.println("Enter Teacher Name");
		String name=s1.next();
		System.out.println("Enter Teacher city");
		String city =s1.next();
		System.out.println("Enter Teacher salary ");
		float salary =s1.nextFloat();
		
		Teacher t1=new Teacher();
		t1.setId(id);
		t1.setName(name);
		t1.setCity(city);
		t1.setSalary(salary);
		List<Subject> l1=fetchSubjectServiceImple.geSubject();
		t1.setSubjects(l1);
		
		em.persist(t1);
		em.getTransaction().commit();
		System.out.println("Teacher added");
		return t1;
	}

}
