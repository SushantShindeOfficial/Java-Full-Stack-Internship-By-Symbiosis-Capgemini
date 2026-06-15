package spring.web.app.project.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

    @Id
    private int id;

    private String name;

    private String city;

    private float salary;

    @ManyToMany(cascade = CascadeType.ALL)

    @JoinTable(
        name = "employee_dept",

        joinColumns =
        @JoinColumn(name = "employee_id"),

        inverseJoinColumns =
        @JoinColumn(name = "dept_id")
    )

    private List<Dept> depts;

    public Employee() {
        super();
    }

    public Employee(List<Dept> depts) {
        super();
        this.depts = depts;
    }

    public Employee(int id,
            String name,
            String city,
            float salary) {

        super();

        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;

    }

    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Employee [id=" + id +
                ", name=" + name +
                ", city=" + city +
                ", salary=" + salary +
                ", depts=" + depts + "]";

    }

}