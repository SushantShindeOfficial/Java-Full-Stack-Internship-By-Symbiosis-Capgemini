package spring.web.app.project.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dept {

    @Id
    private int did;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employee;

    public Dept() {
    }

    public Dept(int did, String name, List<Employee> employee) {
        this.did = did;
        this.name = name;
        this.employee = employee;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}