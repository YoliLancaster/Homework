package com.ua.robotdreams.homework16;

public class Main {

    public static void main(String[] args) {
        findDay(5);
        findDay(1);
        findDay(7);
        findDay(4);
        findDay(6);
        findDay(3);
        findDay(2);
    }

    public static DayOfWeek findDay(int number) {
        for (DayOfWeek value : DayOfWeek.values()) {
            if (value.getDayNumber() == number) {
                return value;
            }
        }
        return null;
    }
}
