package hibernate.company.serviceImple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.company.service.CreateCompanyService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Address;
import hibernate.hibernate.mapping.entity.Company;

public class CreateCompanyServiceImple
        implements CreateCompanyService {

    @Override
    public void addData() {

        EntityManager eManager =
                DBConnection.dbCon().createEntityManager();

        eManager.getTransaction().begin();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Reg no");
        int regid = scanner.nextInt();

        System.out.println("Enter Company name");
        String name = scanner.next();

        /*
         * ADDRESS INPUT
         */

        Address a1 = new Address();

        System.out.println("Enter Flat No");
        a1.setFlatno(scanner.next());

        System.out.println("Enter Area");
        a1.setArea(scanner.next());

        System.out.println("Enter Town");
        a1.setTown(scanner.next());

        System.out.println("Enter City");
        a1.setCity(scanner.next());

        System.out.println("Enter Pincode");
        a1.setPincode(scanner.nextInt());

        System.out.println("Enter State");
        a1.setState(scanner.next());

        System.out.println("Enter Country");
        a1.setCountry(scanner.next());

        /*
         * LIST CREATION
         */

        List<Address> addressList = new ArrayList<>();

        addressList.add(a1);

        /*
         * COMPANY OBJECT
         */

        Company e1 = new Company();

        e1.setRegno(regid);
        e1.setName(name);

        e1.setAddress(addressList);

        eManager.persist(e1);

        eManager.getTransaction().commit();

        System.out.println("Data Inserted");
    }
}