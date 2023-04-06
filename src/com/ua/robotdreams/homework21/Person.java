package com.ua.robotdreams.homework21;

public class Person {
    private String lastName;
    public Person() {
    }

    public Person(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
}