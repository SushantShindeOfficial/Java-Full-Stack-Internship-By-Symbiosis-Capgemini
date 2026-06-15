package hibernate.hibernate.demo.jpql.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empName;
	private String empaddres;
}
