package jdbc.homework.java.demo.entity;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private double salary;

    public Employee(int id,
                    String name,
                    double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {

        return id;
    }

    @Override
    public boolean equals(Object obj) {

        Employee e = (Employee)obj;

        return this.id == e.id;
    }

    @Override
    public String toString() {

        return id + " " + name + " " + salary;
    }
}