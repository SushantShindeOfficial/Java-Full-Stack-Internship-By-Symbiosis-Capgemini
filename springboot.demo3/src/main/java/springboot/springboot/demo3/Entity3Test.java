package springboot.springboot.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springboot.springboot.demo3.entity3.Bean1;
import springboot.springboot.demo3.entity3.Bean2;
import springboot.springboot.demo3.entity3.Student;

public class Entity3Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Bean1.class);

		Student s1 = (Student) applicationContext.getBean("abc");
		s1.setId(101);
		s1.setName("Sham");
		s1.setCity("Satara");
		s1.setSalary("234564");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
		System.out.println(s1.getSalary());

		ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(Bean2.class);

		Student s2 = (Student) applicationContext1.getBean("pqr");
		s2.setId(201);
		s2.setName("Sai");
		s2.setCity("Pune");
		s2.setSalary("87654");
		
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getCity());
		System.out.println(s2.getSalary());
	}
}
