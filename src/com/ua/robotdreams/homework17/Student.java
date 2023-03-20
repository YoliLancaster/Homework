package com.ua.robotdreams.homework17;

public class Student {
    private String name;
    private int age;
    private String major;
    private double gpa;
    public Student() {
    }

    public Student(String name, int age, String major, double gpa) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getMajor() {
        return major;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}