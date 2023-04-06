package com.ua.robotdreams.homework21;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Шеремет"),
                new Person("Сенчук"),
                new Person("Бондар"),
                new Person("Василенко"),
                new Person("Мельник"),
                new Person("Сенчук"),
                new Person("Наумов"),
                new Person("Мельник"),
                new Person("Сенчук"),
                new Person("Василенко"),
                new Person("Бондар"),
                new Person("Василенко"),
                new Person("Сидоренко"),
                new Person("Шеремет"),
                new Person("Василенко"),
                new Person("Бондар"),
                new Person("Сенчук"),
                new Person("Мельник"),
                new Person("Сидоренко"),
                new Person("Сидоренко")
        );

        Map<String, Long> peopleCount = people.stream().collect(Collectors.groupingBy(Person::getLastName, Collectors.counting()));
        System.out.println(peopleCount + "\n");

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum is: " + sum);

    }
}