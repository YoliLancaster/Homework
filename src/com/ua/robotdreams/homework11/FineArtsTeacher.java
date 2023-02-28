package com.ua.robotdreams.homework11;

public class FineArtsTeacher extends Person{
    private String subjectToTeach;
    private int lessonsPerDay;
    public FineArtsTeacher() {
        super();
    }

    public FineArtsTeacher(String name, int age, String subjectToTeach, int lessonsPerDay) {
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
        System.out.println("Can teach how to paint.");
        System.out.println("Can grade assignments.");
    }
}