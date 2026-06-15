package google.task.serviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Dept;
import google.task.entity.Student;
import google.task.entity.Teacher;
import google.task.service.CreateDeptService;

public class CreateDeptServiceImple implements CreateDeptService{
	FetchTeacherServiceImple fetchTeacherServiceImple;
	FetchStudentServiceImple fetchStudentServiceImple;

	public CreateDeptServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public CreateDeptServiceImple(FetchTeacherServiceImple fetchTeacherServiceImple,
			FetchStudentServiceImple fetchStudentServiceImple) {
		super();
		this.fetchTeacherServiceImple = fetchTeacherServiceImple;
		this.fetchStudentServiceImple = fetchStudentServiceImple;
	}


	@Override
	public Dept addDept() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Dept Data");
		System.out.println("Enter Dept Id");
		int id=s1.nextInt();
		System.out.println("Enter Dept Name");
		String name=s1.next();
		System.out.println("Enter Dept building");
		String building =s1.next();
		
		List<Teacher> l1=fetchTeacherServiceImple.geTeacher();
		List<Student> l2=fetchStudentServiceImple.getStudent();
		
		
		Dept d1=new Dept();
		d1.setDid(id);
		d1.setName(name);
		d1.setBuilding(building);
		d1.setTeachers(l1);
		d1.setStudents(l2);
		
		em.persist(d1);

		em.getTransaction().commit();
		System.out.println("Dept added");
		return d1;
	}

}
