package com.ua.robotdreams.homework11;

public class ComputerScienceStudent extends Person{
    private final String MAJOR = "Computer Science";
    private double gpa;
    public ComputerScienceStudent() {
        super();
    }
    public ComputerScienceStudent(String name, int age, double gpa)
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
        System.out.println("Can program, but can't paint");
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "MAJOR='" + MAJOR + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}