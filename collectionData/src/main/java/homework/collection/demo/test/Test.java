package homework.collection.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import homework.collection.demo.entity.Department;
import homework.collection.demo.entity.Employee;
import homework.collection.demo.entity.Organization;

public class Test {
	public static void main(String[] args) throws Exception {

		Employee e1 = new Employee(101, "Amit");

		Employee e2 = new Employee(102, "Rahul");

		Department d1 = new Department(1, "Java");

		d1.addEmployee(e1);
		d1.addEmployee(e2);

		Organization org = new Organization(11, "TCS");

		org.addDepartment(d1);

		Map<Integer, Organization> map = new HashMap<Integer, Organization>();

		map.put(org.getOrgId(), org);

		// SERIALIZATION

		FileOutputStream fos = new FileOutputStream("org.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(map);

		oos.close();
		fos.close();

		System.out.println("Stored");

		// DESERIALIZATION

		FileInputStream fis = new FileInputStream("org.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Map<Integer, Organization> readMap = (Map<Integer, Organization>) ois.readObject();

		for (Map.Entry<Integer, Organization> m : readMap.entrySet()) {

			System.out.println(m.getKey());

			System.out.println(m.getValue());
		}

		ois.close();
		fis.close();
	}
}
