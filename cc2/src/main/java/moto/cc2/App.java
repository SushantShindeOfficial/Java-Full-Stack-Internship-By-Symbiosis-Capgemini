package moto.cc2;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import moto.cc2.java.demo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mysql");
       System.out.println("Table is Created");
        
    }
}
