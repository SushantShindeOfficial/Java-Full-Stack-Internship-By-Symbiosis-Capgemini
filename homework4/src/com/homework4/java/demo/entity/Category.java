package com.homework4.java.demo.entity;

public class Category {

    private int cid;
    private String cname;

    public Category(int cid,
                    String cname) {

        this.cid = cid;
        this.cname = cname;
    }

    @Override
    public String toString() {

        return cid + " " + cname;
    }
}
