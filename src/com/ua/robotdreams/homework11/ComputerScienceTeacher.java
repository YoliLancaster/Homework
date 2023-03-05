package com.ua.robotdreams.homework11;

public class ComputerScienceTeacher extends Person{
    private String subjectToTeach;
    private int lessonsPerDay;
    public ComputerScienceTeacher() {
        super();
    }

    public ComputerScienceTeacher(String name, int age, String subjectToTeach, int lessonsPerDay) {
        super(name, age);
        this.subjectToTeach = subjectToTeach;
        this.lessonsPerDay = lessonsPerDay;
    }

    public String getSubjectToTeach() {
        return subjectToTeach;
    }

    public int getLessonsPerDay() {
        return lessonsPerDay;
    }

    public void canDo() {
        System.out.println("Can teach how to program.");
        System.out.println("Can grade assignments.");
    }
}