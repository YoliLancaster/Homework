package com.ua.robotdreams.homework11;

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent s1 = new ComputerScienceStudent("Vasyl", 19, 3.2);
        System.out.println(s1.getName() + ", " + s1.getAge() + " years old, " + s1.getMAJOR() + " student, GPA: " + s1.getGpa());
        s1.canDo();
        s1.greet();

        FineArtsStudent s2 = new FineArtsStudent("Olga", 20, 4.1);
        System.out.println(s2.getName() + ", " + s2.getAge() + " years old, " + s2.getMAJOR() + " student, GPA: " + s2.getGpa());
        s2.canDo();
        s2.greet();

        ComputerScienceTeacher t1 = new ComputerScienceTeacher("Mr. Brown", 43, "Computer Science", 4);
        System.out.println(t1.getName() + ", " + t1.getAge() + " years old, " + t1.getSubjectToTeach() + " teacher, lessons per day: " + t1.getLessonsPerDay());
        t1.canDo();
        t1.greet();

        FineArtsTeacher t2 = new FineArtsTeacher("Ms. Smith", 38, "Fine Arts", 6);
        System.out.println(t2.getName() + ", " + t2.getAge() + " years old, " + t2.getSubjectToTeach() + " teacher, lessons per day: " + t2.getLessonsPerDay());
        t2.canDo();
        t2.greet();
    }
}