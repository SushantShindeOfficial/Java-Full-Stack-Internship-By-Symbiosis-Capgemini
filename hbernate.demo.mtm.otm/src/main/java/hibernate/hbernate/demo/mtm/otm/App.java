package hibernate.hbernate.demo.mtm.otm;

import hibernate.hbernate.demo.mtm.otm.service.createservice;
import hibernate.hbernate.demo.mtm.otm.serviceImple.createServiceImple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        createservice c1=new createServiceImple();
        c1.adddata();
    }
}
