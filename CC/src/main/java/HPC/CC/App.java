package HPC.CC;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cc.hpc.demo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null);
    	
//    	Connection connection=DriverManager.getConnection("");
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("mysql");
    	EntityManager em= emf.createEntityManager();
    	em.getTransaction().begin();
    	Employee e1=new Employee();
    	e1.setId(101);
    	e1.setName("Ram");
    	e1.setCity("SAtara");
    	e1.setSalary(234);
    	em.persist(e1);
    	em.getTransaction().commit();
    	    	
    	
    	System.out.println( "Connection CreaTED and Data Added " );
    }
}
