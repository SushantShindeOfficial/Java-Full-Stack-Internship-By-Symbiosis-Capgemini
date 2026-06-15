package hibernate.hibernate.mapping;

import hibernate.address.service.CreateAddressService;
import hibernate.address.service.FetchAddressService;
import hibernate.address.serviceImple.CreateAddressServiceImple;
import hibernate.address.serviceImple.FetchAddressServiceImple;
import hibernate.branch.service.CreateBranchService;
import hibernate.branch.serviceImple.CreateBranchServiceImple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        CreateAddressService c1=new CreateAddressServiceImple();
//        c1.addData();
//    	CreateBranchService c1=new CreateBranchServiceImple();
//    	c1.addData();
    	FetchAddressService f1=new FetchAddressServiceImple();
    	f1.FetchData();
    }
}
