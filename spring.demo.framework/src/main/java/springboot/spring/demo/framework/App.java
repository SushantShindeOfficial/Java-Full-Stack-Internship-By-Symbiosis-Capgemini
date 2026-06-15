package springboot.spring.demo.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springboot.spring.demo.framework.test.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Getter Injection
		Employee e1 = (Employee) applicationContext.getBean("abc");
		System.out.println(e1);
//			Setter injection
        System.out.println(e1.getId());
        System.out.println(e1.getNameString());
        System.out.println(e1.getCity());
        System.out.println(e1.getNameString());

		System.out.println("Hello World!");
	}
}