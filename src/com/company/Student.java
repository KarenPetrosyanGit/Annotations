package com.company;

public abstract class Student {

    private String name;
    private String surName;
	private int age;

    public Student() {
    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public abstract void countSalary();
}
