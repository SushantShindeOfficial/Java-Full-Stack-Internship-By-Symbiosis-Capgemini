package hibernate.branch.serviceImple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.branch.service.CreateBranchService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Address;
import hibernate.hibernate.mapping.entity.Branch;
import hibernate.hibernate.mapping.entity.Dept;
import hibernate.hibernate.mapping.entity.Manager;

public class CreateBranchServiceImple implements CreateBranchService {

	@Override
	public void addData() {

		EntityManager eManager = DBConnection.dbCon().createEntityManager();

		eManager.getTransaction().begin();

		Scanner scanner = new Scanner(System.in);

		Branch b1 = new Branch();

		System.out.println("Enter Branch Name");

		b1.setName(scanner.next());

		System.out.println("Enter Address Id");

		int addressId = scanner.nextInt();

		Address address = eManager.find(Address.class, addressId);

		b1.setAddress(address);

		System.out.println("Enter Manager Id");

		int managerId = scanner.nextInt();

		Manager manager = eManager.find(Manager.class, managerId);

		b1.setManager(manager);

		List<Dept> deptList = new ArrayList<>();

		System.out.println("How Many Departments");

		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {

			System.out.println("Enter Dept Id");

			int deptId = scanner.nextInt();

			Dept dept = eManager.find(Dept.class, deptId);

			deptList.add(dept);
		}

		b1.setDepts(deptList);

		eManager.persist(b1);

		eManager.getTransaction().commit();

		System.out.println("Branch Inserted");
	}
}