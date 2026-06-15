package com.homework3.java.demo.entity;

public class Employee
implements Comparable<Employee> {

    int id;
    String name;

    public Employee(int id,String name) {

        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee e) {

        return this.id - e.id;
    }

    @Override
    public String toString() {

        return id + " " + name;
    }
}
