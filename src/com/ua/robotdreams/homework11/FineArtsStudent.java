package com.ua.robotdreams.homework11;

public class FineArtsStudent extends Person{
    private final String MAJOR = "Fine Arts";
    private double gpa;
    public FineArtsStudent() {
        super();
    }
    public FineArtsStudent(String name, int age, double gpa)
    {
        super(name, age);
        this.gpa = gpa;
    }

    public String getMAJOR() {
        return MAJOR;
    }

    public double getGpa() {
        return gpa;
    }

    public void canDo() {
        System.out.println("Can attend classes.");
        System.out.println("Can do homework.");
        System.out.println("Can paint, but can't program");
    }

    @Override
    public String toString() {
        return "FineArtsStudent{" +
                "MAJOR='" + MAJOR + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}