package com.homework4.java.demo.entity;

public class Product
implements Comparable<Product> {

    private int pid;
    private String pname;

    private Category category;

    public Product(int pid,
                   String pname,
                   Category category) {

        this.pid = pid;
        this.pname = pname;
        this.category = category;
    }

    @Override
    public int compareTo(Product p) {

        return this.pid - p.pid;
    }

    @Override
    public String toString() {

        return pid + " " +
                pname + " " +
                category;
    }
}