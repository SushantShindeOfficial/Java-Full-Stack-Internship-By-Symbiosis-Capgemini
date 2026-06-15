package hibernate.hibernate.mapping.manytoone;

import hibernate.hibernate.mapping.manytoone.service.CreateService;
import hibernate.hibernate.mapping.manytoone.serviceImple.CreateServiceImple;

public class App 
{
    public static void main( String[] args )
    {
    	CreateService c1=new CreateServiceImple();
    	c1.addData();
        System.out.println( "Hello World!" );
    }
}
