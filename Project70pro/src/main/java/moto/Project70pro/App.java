package moto.Project70pro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<Integer, Employee> mmMap=new HashMap<Integer, Employee>();
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setId(101);
        e1.setCity("Satara");
        e1.setName("sushant");
        
        List<Employee> l1=new ArrayList<Employee>();
        l1.add(e1);
        
        List<Employee> l2=new ArrayList<Employee>();
        l1.add(e2);
        
//        mmMap.put(1, e1);
//        mmMap.put(2, e2);
        
        
        Address a1=new Address();
        a1.setAddressid("ccs");
        a1.setCity("Satara");
        a1.setPin("234");
        a1.setList(l1);
        
        Address a2=new Address();
        a1.setAddressid("ccs");
        a1.setCity("Satara");
        a1.setPin("234");
        a1.setList(l2);
        
        Map<Integer, Address> mm1=new HashMap<Integer, Address>();
        mm1.put(1, a1);
        
        System.out.println(mm1);
        
        Map<Integer, Address> mm2=new HashMap<Integer, Address>();
        mm2.put(1, a1);
        
        System.out.println(mm2);
        
        
        //System.out.println(mmMap);
        
//        for (Map.Entry<Integer, Employee> x:mmMap.entrySet()) {
//        	System.out.println(x.getKey());
//        	System.out.println(x.getValue());
//        	System.out.println(x.getKey()+" "+x.getValue());
//        }
    }
}
