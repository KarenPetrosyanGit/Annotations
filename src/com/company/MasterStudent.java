package com.company;

public class MasterStudent extends Student {

    public MasterStudent() {
    }

    public MasterStudent(String name, String surName) {
        super(name, surName);
    }

    @Override
    public void countSalary() {
        System.out.println("I am counting Salary");
    }


}
