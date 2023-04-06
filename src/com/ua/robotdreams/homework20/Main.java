package com.ua.robotdreams.homework20;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Михайлов", 3.5));
        students.add(new Student("Грищенко", 3.8));
        students.add(new Student("Волошина", 4.7));
        students.add(new Student("Романець", 4.1));
        System.out.println("Original list: \n" + students + "\n");

        Collections.sort(students, (s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));
        System.out.println("Sorted by last name: \n" + students + "\n");

        Collections.sort(students, Comparator.comparing(Student::getGpa));
        System.out.println("Sorted by GPA: \n" + students);
    }
}