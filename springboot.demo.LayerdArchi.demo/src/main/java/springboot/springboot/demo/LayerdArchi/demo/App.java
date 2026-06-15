package springboot.springboot.demo.LayerdArchi.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springboot.LayerdArchi.demo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Employee e1=(Employee) applicationContext.getBean("emp");
    	System.out.println(e1.getEmpID());
    	System.out.println(e1.getEmpName());
    	System.out.println(e1.getEmpsalary());
    	System.out.println(e1.getAddress());
    	System.out.println(e1.getEmpCity());
        System.out.println( "Hello World!" );
    }
}
