package com.company;

public class Main {

    public static void main(String[] args) {
	    Cat cat = new Cat();
	    Class c1 = cat.getClass();
        System.out.println(cat.getClass());

        Animal an = (Animal) c1.getAnnotation(Animal.class);
        System.out.println(an.mass());

    }
}
