package com.ua.robotdreams.homework11;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void canDo();
    public void greet() {
        System.out.println("Hi!\n");
    }
}