package google.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import google.spring.entity.Adhress;
import google.spring.entity.Dept;
import google.spring.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept d1 = a.getBean("dept1", Dept.class);
		Dept d2 = a.getBean("dept2", Dept.class);
		
		System.out.println(d1.getId());
		System.out.println(d1.getName());
		System.out.println(d1.getEmployee());
		
		System.out.println(d2.getId());
		System.out.println(d2.getName());
		System.out.println(d2.getEmployee());
		




	}
}
