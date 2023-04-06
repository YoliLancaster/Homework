package com.ua.robotdreams.homework20;

public class Student {
    private String lastName;
    private double gpa;

    public Student() {
    }

    public Student(String lastName, double gpa) {
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
